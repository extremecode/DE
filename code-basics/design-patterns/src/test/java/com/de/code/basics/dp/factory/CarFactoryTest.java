package com.de.code.basics.dp.factory;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class CarFactoryTest {

    private ByteArrayOutputStream consoleOutput;

    @Before
    public void setUp() throws Exception {
        consoleOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(consoleOutput));
    }

    @After
    public void tearDown() throws Exception {
        consoleOutput = null;
    }

    @Test
    public void basic(){
        CarFactory.BASIC.newInstance().assemble();

        assertEquals(" Basic Car \n",consoleOutput.toString().replace("\r",""));
    }

    @Test
    public void luxary(){
        CarFactory.LUXARY.newInstance().assemble();

        assertEquals(" Luxary Car \n",consoleOutput.toString().replace("\r",""));
    }

}