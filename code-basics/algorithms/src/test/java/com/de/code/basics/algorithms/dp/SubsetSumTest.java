package com.de.code.basics.algorithms.dp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubsetSumTest {


    private SubsetSum subsetSum;
    @Before
    public void setUp() throws Exception {
        subsetSum = new SubsetSum();
    }

    @After
    public void tearDown() throws Exception {
        subsetSum = null;
    }

    @Test
    public void possible() {
        assertEquals(true,subsetSum.possible(new int[]{3,34,4,12,5,2},6,9));
    }
}