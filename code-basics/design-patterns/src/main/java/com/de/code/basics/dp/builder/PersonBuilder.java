package com.de.code.basics.dp.builder;

import java.util.ArrayList;
import java.util.List;

public class PersonBuilder implements Builder<Person> {

    private List<Person> personList;
    private List<Person> personFinalList;

    public PersonBuilder(List<Person> personFinalList) {
        this.personFinalList = personFinalList;
        init();
    }

    public void init() {
        personList = new ArrayList<Person>();
    }

    public Builder add(Person obj) {
        if(obj!=null)
            personList.add(obj);
        return this;
    }

    public Builder remove(Person obj) {
        if(obj!=null)
            personList.remove(obj);
        return this;
    }

    public void build() {
        personList.forEach(p->{
            personFinalList.add(p);
        });
    }

}
