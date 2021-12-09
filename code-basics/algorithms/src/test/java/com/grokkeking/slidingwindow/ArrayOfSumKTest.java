package com.grokkeking.slidingwindow;

import com.de.code.basics.algorithms.ConsoleFixture;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrayOfSumKTest extends ConsoleFixture {

    @Test
    public void findAverageUnOptimized() {
        double[] arr = new ArrayOfSumK().findAverageUnOptimized(5,new int[]{1, 3, 2, 6, -1, 4, 1, 8, 2});
        for (int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        assertEquals("2.2\n" +
                "2.8\n" +
                "2.4\n" +
                "3.6\n" +
                "2.8\n",console());
    }

    @Test
    public void findOptimizedSlidingWindow() {
        double[] arr = new ArrayOfSumK().findOptimizedSlidingWindow(5,new int[]{1, 3, 2, 6, -1, 4, 1, 8, 2});
        for (int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        assertEquals("2.2\n" +
                "2.8\n" +
                "2.4\n" +
                "3.6\n" +
                "2.8\n",console());
    }
}