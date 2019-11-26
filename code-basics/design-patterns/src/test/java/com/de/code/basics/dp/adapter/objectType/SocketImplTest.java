package com.de.code.basics.dp.adapter.objectType;

import com.de.code.basics.dp.adapter.SocketAdapter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SocketImplTest {

    private SocketAdapter socketAdapter;

    @Before
    public void setUp() throws Exception {
        socketAdapter = new SocketImpl();
    }

    @After
    public void tearDown() throws Exception {
        socketAdapter = null;
    }

    @Test
    public void get120Volts() {
        assertEquals(120,socketAdapter.get120Volts().getVolts());
    }

    @Test
    public void get12Volts() {
        assertEquals(12,socketAdapter.get12Volts().getVolts());
    }

    @Test
    public void get3Volts() {
        assertEquals(3,socketAdapter.get3Volts().getVolts());
    }
}