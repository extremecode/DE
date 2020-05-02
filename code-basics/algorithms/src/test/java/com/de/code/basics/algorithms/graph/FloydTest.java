package com.de.code.basics.algorithms.graph;

import com.de.code.basics.algorithms.ConsoleFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FloydTest extends ConsoleFixture {

    private Floyd floyd;
    private int INF = Floyd.INF;

    @Before
    public void setUp() throws Exception {
        super.setUp();
        floyd = new Floyd();
    }

    @After
    public void tearDown() throws Exception {
        floyd = null;
        super.tearDown();
    }

    @Test
    public void shortest() {
        int graph[][] = { {0,   5,  INF, 10},
                {INF, 0,   3, INF},
                {INF, INF, 0,   1},
                {INF, INF, INF, 0}
        };
        floyd.init(4);
        floyd.printSolution(floyd.shortest(graph,4));
        assertEquals("The following matrix shows the shortest distances between every pair of vertices\n" +
                "0   5   8   9   \n" +
                "INF 0   3   4   \n" +
                "INF INF 0   1   \n" +
                "INF INF INF 0   \n",console());

    }
}