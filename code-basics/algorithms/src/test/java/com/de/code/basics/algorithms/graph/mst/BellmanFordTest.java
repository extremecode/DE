package com.de.code.basics.algorithms.graph.mst;

import com.de.code.basics.algorithms.ConsoleFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BellmanFordTest extends ConsoleFixture {

    private BellmanFord graph;

    @Before
    public void setUp() throws Exception {
        super.setUp();
        graph = new BellmanFord();
    }

    @After
    public void tearDown() throws Exception {
        graph = null;
        super.tearDown();
    }

    @Test
    public void calculate() {

        graph.init(5,8);

        // add edge 0-1 (or A-B in above figure)
        graph.edge[0].src = 0;
        graph.edge[0].dst = 1;
        graph.edge[0].weight = -1;

        // add edge 0-2 (or A-C in above figure)
        graph.edge[1].src = 0;
        graph.edge[1].dst = 2;
        graph.edge[1].weight = 4;

        // add edge 1-2 (or B-C in above figure)
        graph.edge[2].src = 1;
        graph.edge[2].dst = 2;
        graph.edge[2].weight = 3;

        // add edge 1-3 (or B-D in above figure)
        graph.edge[3].src = 1;
        graph.edge[3].dst = 3;
        graph.edge[3].weight = 2;

        // add edge 1-4 (or A-E in above figure)
        graph.edge[4].src = 1;
        graph.edge[4].dst = 4;
        graph.edge[4].weight = 2;

        // add edge 3-2 (or D-C in above figure)
        graph.edge[5].src = 3;
        graph.edge[5].dst = 2;
        graph.edge[5].weight = 5;

        // add edge 3-1 (or D-B in above figure)
        graph.edge[6].src = 3;
        graph.edge[6].dst = 1;
        graph.edge[6].weight = 1;

        // add edge 4-3 (or E-D in above figure)
        graph.edge[7].src = 4;
        graph.edge[7].dst = 3;
        graph.edge[7].weight = -3;

        graph.calculate();

        assertEquals("Vertex Distance from Source\n" +
                "0\t\t0\n" +
                "1\t\t-1\n" +
                "2\t\t2\n" +
                "3\t\t1\n" +
                "4\t\t1\n",console());

    }
}