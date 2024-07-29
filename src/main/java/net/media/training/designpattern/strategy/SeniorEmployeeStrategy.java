package net.media.training.designpattern.strategy;

public class SeniorEmployeeStrategy implements Strategy{

    @Override
    public void setSalary(GenericEmployee employee, int salary) {
        employee.atLeast(salary,200);
        employee.atMost(salary,1000);
        employee.setSalary(salary);
    }

    @Override
    public void setMonthsSpent(GenericEmployee employee, int months) {
        employee.atLeast(months, 60);
        employee.setMonthsSpent(months);
    }
}
