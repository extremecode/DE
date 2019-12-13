package com.de.code.basics.algorithms.graph;

import com.de.code.basics.algorithms.ConsoleFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DFSTest extends ConsoleFixture {

    private DFS dfs;

    @Before
    public void setUp() throws Exception {
        super.setUp();
    }

    @After
    public void tearDown() throws Exception {
        super.tearDown();
    }

    @Test
    public void traverse() {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        dfs = new DFS();
        dfs.init(g).traverse(2);
        assertEquals("2 \n" +
                "0 \n" +
                "1 \n" +
                "3 \n", console());
    }

}