package com.grokkeking.slidingwindow;

import com.de.code.basics.algorithms.ConsoleFixture;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindAnagramsTest extends ConsoleFixture {

    @Test
    public void find() {
        assertEquals("1,2",commaSeprated(new FindAnagrams().find("ppqp","pq")));
        assertEquals("2,3,4",commaSeprated(new FindAnagrams().find("abbcabc","abc")));
    }


}