package com.de.code.basics.dp.decorator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class CarDecoratorTest {

    private Car car;
    private ByteArrayOutputStream consoleOutput;

    @Before
    public void setUp() throws Exception {
        consoleOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(consoleOutput));
    }

    @After
    public void tearDown() throws Exception {
        consoleOutput = null;
        car = null;
    }

    @Test
    public void assemble() {

        car = new LuxaryCar(new SportsCar(new BasicCar()));
        car.assemble();

        assertEquals(" Basic Car \n" +
                " adding features of sports Car \n" +
                " adding features of luxary Car \n",consoleOutput.toString().replace("\r",""));
    }

}
