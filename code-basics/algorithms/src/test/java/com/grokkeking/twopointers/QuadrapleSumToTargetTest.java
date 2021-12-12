package com.grokkeking.twopointers;

import com.de.code.basics.algorithms.ConsoleFixture;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuadrapleSumToTargetTest extends ConsoleFixture {

    @Test
    public void find() {
        assertEquals("[\n" +
                "\t[-3,-1,1,4]\n" +
                "\t[-3,1,1,2]\n" +
                "]",printAsMatrix(new QuadrapleSumToTarget().find(new int[]{4, 1, 2, -1, 1, -3},1)));

        assertEquals("[\n" +
                "\t[-2,0,2,2]\n" +
                "\t[-1,0,1,2]\n" +
                "]",printAsMatrix(new QuadrapleSumToTarget().find(new int[]{2, 0, -1, 1, -2, 2},2)));
    }
}