package net.media.training.designpattern.adapter;

import net.media.training.designpattern.adapter.thirdparty.ThirdPartyLeaveRecord;

public class LeaveRecordAdapter implements LeaveRecord{

    private final ThirdPartyLeaveRecord thirdPartyLeaveRecord;
    LeaveRecordAdapter(ThirdPartyLeaveRecord thirdPartyLeaveRecord){
        this.thirdPartyLeaveRecord = thirdPartyLeaveRecord;
    }

    @Override
    public String getMostAbsentEmployee() {
        String name = thirdPartyLeaveRecord.getMostAbsentEmployee().getName();
        return decode(name);
    }
    public String decode(String name){
        String[] fullName = name.split(",");
        return fullName[1].trim() + " " + fullName[0];
    }
    public String encode(String name){
        int idx = name.lastIndexOf(" ");
        String firstName = name.substring(idx+1);
        String lastName = name.substring(0,idx);
        return firstName + ", " + lastName;
    }
    @Override
    public int getEmployeeAbsences(String employeeName) {
        employeeName = encode(employeeName);
        return thirdPartyLeaveRecord.getEmployeeAbsences(new Employee(employeeName));
    }
}
