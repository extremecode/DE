package com.de.code.basics.algorithms.dp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LPMatrixTest {

    private LPMatrix lpMatrix;

    @Before
    public void setUp() throws Exception {
        lpMatrix = new LPMatrix();
    }

    @After
    public void tearDown() throws Exception {
        lpMatrix = null;
    }

    @Test
    public void maxDistance() {
        int mat[][] = { { 1, 2, 9 },
                { 5, 3, 8 },
                { 4, 6, 7 } };
        assertEquals(4,lpMatrix.maxDistance(mat,3));
    }
}