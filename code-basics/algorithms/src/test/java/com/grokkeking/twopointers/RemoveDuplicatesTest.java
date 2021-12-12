package com.grokkeking.twopointers;

import com.de.code.basics.algorithms.ConsoleFixture;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicatesTest extends ConsoleFixture {

    @Test
    public void remove() {
     assertEquals("2,3,6,9",commaSeprated(new RemoveDuplicates().remove(new int[]{2, 3, 3, 3, 6, 9, 9})));
     assertEquals("2,11",commaSeprated(new RemoveDuplicates().remove(new int[]{2, 2,2,11})));
    }



}