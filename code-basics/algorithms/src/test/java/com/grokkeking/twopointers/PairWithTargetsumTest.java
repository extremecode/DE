package com.grokkeking.twopointers;

import org.junit.Test;

import static org.junit.Assert.*;

public class PairWithTargetsumTest {

    @Test
    public void find(){
        assertEquals("1,3",new PairWithTargetsum().find(new int[]{1, 2, 3, 4, 6},6));
        assertEquals("0,2",new PairWithTargetsum().find(new int[]{2, 5, 9, 11},11));
    }

    @Test
    public void findInUnsorted(){
        assertEquals("1,3",new PairWithTargetsum().findInUnsorted(new int[]{1, 2, 6, 4, 3},6));
        assertEquals("0,3",new PairWithTargetsum().findInUnsorted(new int[]{2, 5,11, 9},11));
    }

}