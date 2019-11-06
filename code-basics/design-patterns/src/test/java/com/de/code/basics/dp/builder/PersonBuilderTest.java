package com.de.code.basics.dp.builder;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class PersonBuilderTest {

    private Builder builder;
    private List<Person> personList;

    @Before
    public void setUp() throws Exception {
        personList = new ArrayList<>();
        builder = new PersonBuilder(personList);
    }

    @After
    public void tearDown() throws Exception {
        builder = null;
        personList = null;
    }

    @Test
    public void add() {
        Person person1 = new Person("jon Doe","12");
        Person person2 = new Person("John Wick","21");
        Object[] objs = {person1,person2};
        this.builder.add(person1)
                .add(person2)
                .add(new Person("aka","12"))
                .build();
        assertArrayEquals(objs,personList.toArray());

    }
}
