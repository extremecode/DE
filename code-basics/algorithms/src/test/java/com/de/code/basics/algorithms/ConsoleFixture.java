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

    public String commaSeperated(int[] items){
        StringBuilder result =  new StringBuilder(items[0]+"");
        for(int i=1; i<items.length; i++){
            result.append(","+items[i]);
        }
        return result.toString();
    }

    public <T> String printAsMatrix(List<List<T>> items){
        StringBuilder result = new StringBuilder("").append("[").append("\n");
        for (List<T> item:items){
            result.append("\t").append("[").append(this.commaSeprated(item)).append("]").append("\n");
        }
        return result.append("]").toString();
    }



}
