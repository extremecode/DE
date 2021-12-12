package com.grokkeking.twopointers;

import com.de.code.basics.algorithms.ConsoleFixture;
import org.junit.Test;

import static org.junit.Assert.*;

public class DutchFlagTest extends ConsoleFixture {

    @Test
    public void sort() {
        test(new int[]{1, 0, 2, 1, 0},"0,0,1,1,2");
        test(new int[]{2, 2, 0, 1, 2, 0},"0,0,1,2,2,2");
    }

    private void test(int[] arr,String expected){
        new DutchFlag().sort(arr);
        assertEquals(expected,commaSeperated(arr));
    }
}