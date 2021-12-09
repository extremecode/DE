package com.grokkeking.slidingwindow;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestContigousSubArrayOnesTest {

    @Test
    public void find() {
        assertEquals(6,new LongestContigousSubArrayOnes().find(new int[]{0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1},2));
        assertEquals(9,new LongestContigousSubArrayOnes().find(new int[]{0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1},3));

        assertEquals(6,new LongestContigousSubArrayOnes().findWithLeavey(new int[]{0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1},2));
        assertEquals(9,new LongestContigousSubArrayOnes().findWithLeavey(new int[]{0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1},3));

    }
}