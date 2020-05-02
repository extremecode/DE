package com.de.code.basics.algorithms.graph;

import com.de.code.basics.algorithms.ConsoleFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BridgeTest extends ConsoleFixture {

    private Bridge bridge;

    @Before
    public void setUp() throws Exception {
        super.setUp();
        bridge = new Bridge();
    }

    @After
    public void tearDown() throws Exception {
        bridge = null;
        super.tearDown();
    }

    @Test
    public void bridge() {
        Graph graph = new Graph(5);
        graph.addUnDirectedEdge(1, 0);
        graph.addUnDirectedEdge(0, 2);
        graph.addUnDirectedEdge(2, 1);
        graph.addUnDirectedEdge(0, 3);
        graph.addUnDirectedEdge(3, 4);
        bridge.init(graph).bridge();
        assertEquals(" Bridgres in the graph\n" +
                "3--4\n" +
                "0--3\n",console());
    }
}