package com.mindex.challenge.data;

import java.time.Instant;
import java.time.LocalDate;

public class Compensation {

    private Employee employee;
    private String salary;
    private LocalDate effectiveDate;

    public Compensation() {
    }

    public Compensation employee(Employee employee){
        this.employee= employee;
        return this;
    }

    public Compensation salary(String salary){
        this.salary= salary;
        return this;
    }

    public Compensation effectiveDate(LocalDate effectiveDate){
        this.effectiveDate = effectiveDate;
        return this;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    @Override
    public String toString() {
        return "Compensation{" +
                "employee=" + employee +
                ", salary='" + salary + '\'' +
                ", effectiveDate=" + effectiveDate +
                '}';
    }
}
