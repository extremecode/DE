package com.de.code.basics.ds.reportee;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public class Manager {

    Set<Employee> getAllReporteeEmployee(final Employee mgr,final Set<Employee> allEmployees) {
        final Set<Employee> allReporteeEmployee = new HashSet<>();
        final Set<Employee> firstLevelReporteeEmployess = new HashSet<>();
        allEmployees.forEach(employee -> {
            if (employee.getManager()!=null && employee.getManager().equals(mgr)) {
                firstLevelReporteeEmployess.add(employee);
            }
        });
        if(firstLevelReporteeEmployess.isEmpty())
            return firstLevelReporteeEmployess;
        firstLevelReporteeEmployess.forEach(employee -> {
            allReporteeEmployee.addAll(getAllReporteeEmployee(employee, allEmployees));
        });
        allReporteeEmployee.addAll(firstLevelReporteeEmployess);
        return allReporteeEmployee;
    }

}
