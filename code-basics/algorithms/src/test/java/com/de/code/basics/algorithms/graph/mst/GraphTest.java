package com.de.code.basics.algorithms.graph.mst;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GraphTest {


    private Graph graph;
    @Before
    public void setUp() throws Exception {
        graph = new Graph();
    }

    @After
    public void tearDown() throws Exception {
        graph = null;
    }

    @Test
    public void iscycle() {
        graph.init(3,3);

        graph.edge[0].src = 0;
        graph.edge[0].dst = 1;

        graph.edge[1].src = 1;
        graph.edge[1].dst = 2;


        graph.edge[2].src = 0;
        graph.edge[2].dst = 2;

        assertEquals(true,graph.iscycle(graph));


    }

    @Test
    public void iscycleRank() {
        graph.init(3,3);

        graph.edge[0].src = 0;
        graph.edge[0].dst = 1;

        graph.edge[1].src = 1;
        graph.edge[1].dst = 2;


        graph.edge[2].src = 0;
        graph.edge[2].dst = 2;

        assertEquals(true,graph.iscycleRank(graph));

    }
}