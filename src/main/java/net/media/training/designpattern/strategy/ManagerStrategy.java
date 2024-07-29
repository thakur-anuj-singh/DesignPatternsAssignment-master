package net.media.training.designpattern.strategy;

public class ManagerStrategy implements Strategy{

    @Override
    public void setSalary(GenericEmployee employee, int salary) {
        employee.setSalary(salary);
    }

    @Override
    public void setMonthsSpent(GenericEmployee employee, int months) {
        employee.setMonthsSpent(months);
    }
}
