package net.media.training.designpattern.strategy;

public interface Strategy {
    void setSalary(GenericEmployee employee, int salary);
    void setMonthsSpent(GenericEmployee employee, int months);
}
