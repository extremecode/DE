package com.de.code.basics.algorithms.graph.mst;

import com.de.code.basics.algorithms.ConsoleFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KruskalTest extends ConsoleFixture {

    @Before
    public void setUp() throws Exception {
        super.setUp();
    }

    @After
    public void tearDown() throws Exception {
        super.tearDown();
    }

    @Test
    public void kruskal() {
        int V = 4;  // Number of vertices in graph
        int E = 5;  // Number of edges in graph
        Kruskal graph = new Kruskal();

        graph.init(V,E);

        // add edge 0-1
        graph.edge[0].src = 0;
        graph.edge[0].dst = 1;
        graph.edge[0].weight = 10;

        // add edge 0-2
        graph.edge[1].src = 0;
        graph.edge[1].dst = 2;
        graph.edge[1].weight = 6;

        // add edge 0-3
        graph.edge[2].src = 0;
        graph.edge[2].dst = 3;
        graph.edge[2].weight = 5;

        // add edge 1-3
        graph.edge[3].src = 1;
        graph.edge[3].dst = 3;
        graph.edge[3].weight = 15;

        // add edge 2-3
        graph.edge[4].src = 2;
        graph.edge[4].dst = 3;
        graph.edge[4].weight = 4;

        graph.kruskal();
        assertEquals("Following are the edges in the constructed MST\n" +
                "2 -- 3 == 4\n" +
                "0 -- 3 == 5\n" +
                "0 -- 1 == 10\n",console());
    }
}