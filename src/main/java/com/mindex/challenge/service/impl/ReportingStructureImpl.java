package com.mindex.challenge.service.impl;

import com.mindex.challenge.data.Employee;
import com.mindex.challenge.data.ReportingStructure;
import com.mindex.challenge.service.EmployeeService;
import com.mindex.challenge.service.ReportingStructureService;
import org.springframework.beans.factory.annotation.Autowired;

public class ReportingStructureImpl implements ReportingStructureService {

    @Autowired
    public EmployeeService employeeService;

    @Override
    public ReportingStructure read(String employeeId) {
        Employee employee= employeeService.read(employeeId);
        int reports= employeeService.getReports(employeeId);

        ReportingStructure reportingStructure= new ReportingStructure(employee,reports);

        return reportingStructure;
    }
}
