package com.grokkeking.slidingwindow;

import com.de.code.basics.algorithms.ConsoleFixture;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class WordConcatenationTest extends ConsoleFixture {

    @Test
    public void find() {
        assertEquals("0,3",commaSeprated(new WordConcatenation().find("catfoxcat", Arrays.asList("fox","cat"))));
        assertEquals("3",commaSeprated(new WordConcatenation().find("catcatfoxfox", Arrays.asList("fox","cat"))));
    }
}