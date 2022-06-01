package com.mindex.challenge.controller;

import com.mindex.challenge.data.ReportingStructure;
import com.mindex.challenge.service.ReportingStructureService;
import com.mindex.challenge.service.impl.EmployeeServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Past;

@RestController
public class ReportingStructureController {

    @Autowired
    private ReportingStructureService reportingStructureService;
    private static final Logger LOG= LoggerFactory.getLogger(EmployeeServiceImpl.class);

    @GetMapping("/reportingStructure/{employeeId}")
    public ReportingStructure read(@PathVariable String employeeId) {

        LOG.debug("API call in Controller Read.");
        return reportingStructureService.read(employeeId);

    }

}
