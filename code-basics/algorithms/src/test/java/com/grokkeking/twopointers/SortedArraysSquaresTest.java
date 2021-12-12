package com.grokkeking.twopointers;

import com.de.code.basics.algorithms.ConsoleFixture;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SortedArraysSquaresTest extends ConsoleFixture {

    @Test
    public void maxSquares() {
        assertEquals("0,1,4,4,9",commaSeperated(new SortedArraysSquares().maxSquares(new int[]{-2, -1, 0, 2, 3})));
        assertEquals("0,1,1,4,9",commaSeperated(new SortedArraysSquares().maxSquares(new int[]{-3, -1, 0, 1, 2})));
    }
}