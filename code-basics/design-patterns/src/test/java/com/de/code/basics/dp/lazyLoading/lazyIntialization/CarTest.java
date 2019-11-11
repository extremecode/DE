package com.de.code.basics.dp.lazyLoading.lazyIntialization;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class CarTest {



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
    public void getCarByType() {
        Car.getCarByType(CarType.BMW);
        Car.getCarByType(CarType.Audi);
        Car.getCarByType(CarType.None);

        Car.showAll();

        assertTrue(consoleOutput.toString().contains(CarType.Audi.toString()));
        assertTrue(consoleOutput.toString().contains(CarType.None.toString()));
        assertTrue(consoleOutput.toString().contains(CarType.BMW.toString()));
    }

    @Test
    public void getCarByTypeThreaedSafe() {
        Car.getCarByTypeThreaedSafe(CarType.BMW);
        Car.getCarByTypeThreaedSafe(CarType.Audi);
        Car.getCarByTypeThreaedSafe(CarType.None);

        Car.showAll();

        assertTrue(consoleOutput.toString().contains(CarType.Audi.toString()));
        assertTrue(consoleOutput.toString().contains(CarType.None.toString()));
        assertTrue(consoleOutput.toString().contains(CarType.BMW.toString()));
    }
}
