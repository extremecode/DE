package com.grokkeking.slidingwindow;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindPermutationTest {

    @Test
    public void find() {
        assertTrue(new FindPermutation().find("oidbcaf","abc"));
        assertFalse(new FindPermutation().find("odicf","dc"));
        assertTrue(new FindPermutation().find("bcdxabcdy","bcdyabcdx"));
        assertTrue(new FindPermutation().find("aaacb","abc"));
    }
}