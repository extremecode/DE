package com.grokkeking.twopointers;

import com.de.code.basics.algorithms.ConsoleFixture;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubArrayProductLessThanKTest extends ConsoleFixture {

    @Test
    public void find() {
        assertEquals("[\n" +
                "\t[2]\n" +
                "\t[5]\n" +
                "\t[5,2]\n" +
                "\t[3]\n" +
                "\t[3,5]\n" +
                "\t[10]\n" +
                "]",printAsMatrix(new SubArrayProductLessThanK().find(new int[]{2, 5, 3, 10},30)));

        assertEquals("[\n" +
                "\t[8]\n" +
                "\t[2]\n" +
                "\t[2,8]\n" +
                "\t[6]\n" +
                "\t[6,2]\n" +
                "\t[5]\n" +
                "\t[5,6]\n" +
                "]",printAsMatrix(new SubArrayProductLessThanK().find(new int[]{8, 2, 6, 5},50)));

    }
}