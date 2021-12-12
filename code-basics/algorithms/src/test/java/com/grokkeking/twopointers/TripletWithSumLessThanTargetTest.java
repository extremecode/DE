package com.grokkeking.twopointers;

import com.de.code.basics.algorithms.ConsoleFixture;
import org.junit.Test;

import static org.junit.Assert.*;

public class TripletWithSumLessThanTargetTest extends ConsoleFixture {

    @Test
    public void find() {
        assertEquals("[\n" +
                "\t[-1,0,3]\n" +
                "\t[-1,0,2]\n" +
                "]",printAsMatrix(new TripletWithSumLessThanTarget().find(new int[]{-1, 0, 2, 3},3)));
        assertEquals("[\n" +
                "\t[-1,1,4]\n" +
                "\t[-1,1,3]\n" +
                "\t[-1,1,2]\n" +
                "\t[-1,2,3]\n" +
                "]",printAsMatrix(new TripletWithSumLessThanTarget().find(new int[]{-1, 4, 2, 1, 3},5)));
    }
}