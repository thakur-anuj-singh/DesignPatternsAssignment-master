package net.media.training.designpattern.strategy;

public class EmployeeStrategy implements Strategy{

    @Override
    public void setSalary(GenericEmployee employee, int salary) {
        employee.atMost(salary,1000);
        employee.setSalary(salary);
    }

    @Override
    public void setMonthsSpent(GenericEmployee employee, int months) {
        employee.setMonthsSpent(months);
    }
}
