package com.de.code.basics.algorithms.dp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EdistTest {

    private Edist edist;

    @Before
    public void setUp() throws Exception {
        edist = new Edist();
    }

    @After
    public void tearDown() throws Exception {
        edist = null;
    }

    @Test
    public void recursion() {
        String X = "sunday";
        String Y = "saturday";
        assertEquals(3,edist.recursion(X,Y,X.length(),Y.length()));
    }

    @Test
    public void DP() {
        String X = "sunday";
        String Y = "saturday";
        assertEquals(3,edist.DP(X,Y,X.length(),Y.length()));
    }
}