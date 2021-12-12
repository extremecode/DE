package com.grokkeking.twopointers;

import org.junit.Test;

import static org.junit.Assert.*;

public class BackspaceCompareTest {

    @Test
    public void isEqual() {
        assertTrue(new BackspaceCompare().isEqual("xy#z","xzz#"));
        assertTrue(new BackspaceCompare().isEqual("xyy##z","xzz#"));
        assertTrue(new BackspaceCompare().isEqual("xy#yy##z","xzz#"));
    }
}