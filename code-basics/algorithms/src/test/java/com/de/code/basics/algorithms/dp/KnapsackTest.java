package com.de.code.basics.algorithms.dp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KnapsackTest {

    private Knapsack knapsack;

    @Before
    public void setUp() throws Exception {
        knapsack = new Knapsack();
    }

    @After
    public void tearDown() throws Exception {
        knapsack = null;
    }

    @Test
    public void optimal() {
        int[] w ={10,20,30};
        int[] val ={60,100,120};
        assertEquals(220,knapsack.optimal(w,val,w.length,50));
    }
}