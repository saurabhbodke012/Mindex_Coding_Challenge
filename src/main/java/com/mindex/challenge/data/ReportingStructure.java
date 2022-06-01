package com.mindex.challenge.data;

public class ReportingStructure {

    private Employee employee;
    private int noOfReports;

    public ReportingStructure(Employee employee, int noOfReports) {
        this.employee = employee;
        this.noOfReports = noOfReports;
    }

    public ReportingStructure employee(Employee employee){
        this.employee= employee;
        return this;
    }

    public ReportingStructure noOfReports(int noOfReports){
        this.noOfReports= noOfReports;
        return this;
    }


    /**
     * Getters and Setters
     */
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public int getNoOfReports() {
        return noOfReports;
    }

    public void setNoOfReports(int noOfReports) {
        this.noOfReports = noOfReports;
    }

    @Override
    public String toString() {
        return "ReportingStructure{" +
                "employee=" + employee +
                ", noOfReports=" + noOfReports +
                '}';
    }
}
