package com.grokkeking.twopointers;

import com.de.code.basics.algorithms.ConsoleFixture;
import org.junit.Test;

import static org.junit.Assert.*;

public class TripletSumTest extends ConsoleFixture {

    @Test
    public void find() {
        assertEquals("[\n" +
                "\t[-3,1,2]\n" +
                "\t[-2,0,2]\n" +
                "\t[-2,1,1]\n" +
                "\t[-1,0,1]\n" +
                "]",printAsMatrix(new TripletSum().find(new int[]{-3, 0, 1, 2, -1, 1, -2})));

        assertEquals("[\n" +
                "\t[-5,2,3]\n" +
                "\t[-2,-1,3]\n" +
                "]",printAsMatrix(new TripletSum().find(new int[]{-5, 2, -1, -2, 3})));
    }
}