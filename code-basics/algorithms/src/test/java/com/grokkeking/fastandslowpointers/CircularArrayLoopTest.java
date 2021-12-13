package com.grokkeking.fastandslowpointers;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircularArrayLoopTest {

    @Test
    public void loopExist() {
        assertTrue(new CircularArrayLoop().loopExist(new int[]{1,2,-1,2,2}));
        assertTrue(new CircularArrayLoop().loopExist(new int[]{2,2,-1,2}));
        assertFalse(new CircularArrayLoop().loopExist(new int[]{2,1,-1,-2}));
    }
}