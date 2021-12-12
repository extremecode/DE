package com.grokkeking.twopointers;

import org.junit.Test;

import static org.junit.Assert.*;

public class TripletWithClosestSumTest {

    @Test
    public void find() {
        assertEquals(1,new TripletWithClosestSum().find(new int[]{-2, 0, 1, 2},2));
        assertEquals(0,new TripletWithClosestSum().find(new int[]{-3, -1, 1, 2},1));
        assertEquals(3,new TripletWithClosestSum().find(new int[]{1, 0, 1, 1},100));
    }
}