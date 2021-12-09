package com.de.code.basics.algorithms;

import org.junit.After;
import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.stream.Collectors;

public class ConsoleFixture {
    protected ByteArrayOutputStream consoleOutput;

    @Before
    public void setUp() throws Exception {
        consoleOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(consoleOutput));
    }

    @After
    public void tearDown() throws Exception {
        consoleOutput = null;
    }

    public String console(){
        return this.consoleOutput.toString().replace("\r","");
    }

    public <T> String commaSeprated(List<T> items){
        return items.stream().map(x->x.toString()).collect(Collectors.joining(","));
    }
}
