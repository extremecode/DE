package com.de.code.basics.ds.reportee;

import com.de.code.basics.ds.ConsoleFixture;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class ManagerTest extends ConsoleFixture {

    @Test
    public void getAllReporteeEmployee() {
        Employee jagan = new Employee("jagan", null);
        Employee sagar = new Employee("sagar", jagan);

        Employee karen = new Employee("karen", null);

        Employee tusar = new Employee("tusar", karen);
        Employee vinod = new Employee("vinod", karen);

        Employee imran = new Employee("imran", vinod);
        Employee akash = new Employee("akash", tusar);

        Set<Employee> allEmployess = new HashSet<>();
        allEmployess.add(jagan);
        allEmployess.add(sagar);
        allEmployess.add(karen);
        allEmployess.add(tusar);
        allEmployess.add(vinod);
        allEmployess.add(imran);
        allEmployess.add(akash);
        printEmployees(new Manager().getAllReporteeEmployee(karen, allEmployess));
        assertEquals("tusar\n" +
                "vinod\n" +
                "akash\n" +
                "imran\n",console());
    }

    private void printEmployees(Set<Employee> employees){
        employees.forEach(employee -> {
            System.out.println(employee.getName());
        });
    }

}