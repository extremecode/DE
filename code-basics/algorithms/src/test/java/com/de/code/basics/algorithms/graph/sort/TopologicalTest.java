package com.de.code.basics.algorithms.graph.sort;

import com.de.code.basics.algorithms.ConsoleFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TopologicalTest extends ConsoleFixture {

    private Topological topological;

    @Before
    public void setUp() throws Exception {
        super.setUp();
        topological = new Topological();
    }

    @After
    public void tearDown() throws Exception {
        topological = null;
        super.tearDown();
    }

    @Test
    public void sort() {
        topological.init(6);
        topological.addEdge(2,3);
        topological.addEdge(3,1);
        topological.addEdge(4,0);
        topological.addEdge(4,1);
        topological.addEdge(5,0);
        topological.addEdge(5,2);
        topological.sort();
        assertEquals("5 4 2 3 1 0 ",console());

    }
}