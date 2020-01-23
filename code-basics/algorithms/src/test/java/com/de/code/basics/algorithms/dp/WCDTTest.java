package com.de.code.basics.algorithms.dp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WCDTTest {

    private WCDT wcdt;

    @Before
    public void setUp() throws Exception {
        wcdt = new WCDT();
    }

    @After
    public void tearDown() throws Exception {
        wcdt = null;
    }

    @Test
    public void cover() {
        assertEquals(7,wcdt.cover(4));
    }

    @Test
    public void coverDP() {
        assertEquals(13,wcdt.coverDP(5));
    }
}