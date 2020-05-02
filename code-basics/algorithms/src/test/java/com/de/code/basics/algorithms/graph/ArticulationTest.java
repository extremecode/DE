package com.de.code.basics.algorithms.graph;

import com.de.code.basics.algorithms.ConsoleFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArticulationTest extends ConsoleFixture {


    private Articulation articulation;


    @Before
    public void setUp() throws Exception {
        super.setUp();
        articulation = new Articulation();
    }

    @After
    public void tearDown() throws Exception {
        super.tearDown();
    }

    @Test
    public void AP() {


        Graph g1 = new Graph(5);
        g1.addUnDirectedEdge(1, 0);
        g1.addUnDirectedEdge(0, 2);
        g1.addUnDirectedEdge(2, 1);
        g1.addUnDirectedEdge(0, 3);
        g1.addUnDirectedEdge(3, 4);
        articulation.init(g1).AP();

        assertEquals("0 \n" +
                "3 \n",console());

    }
}