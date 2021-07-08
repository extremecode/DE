package com.akash;

public class Person {
    private String name;
    private String id;
    private boolean employee;

    public Person() {
        this.name = "akash";
        this.id = "1";
        this.employee = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isEmployee() {
        return employee;
    }

    public void setEmployee(boolean employee) {
        this.employee = employee;
    }
}
