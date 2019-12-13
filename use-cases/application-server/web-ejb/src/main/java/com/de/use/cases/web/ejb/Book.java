package com.de.use.cases.web.ejb;

import java.io.Serializable;

public class Book implements Serializable{

    private int id;
    private String name;

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
