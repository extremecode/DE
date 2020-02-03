package com.de.code.basics.algorithms.graph.mst;

import com.de.code.basics.algorithms.ConsoleFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimTest extends ConsoleFixture {

    @Before
    public void setUp() throws Exception {
        super.setUp();
    }

    @After
    public void tearDown() throws Exception {
        super.tearDown();
    }

    @Test
    public void prim() {
        Prim t = new Prim();
        int graph[][] = new int[][] { { 0, 2, 0, 6, 0 },
                { 2, 0, 3, 8, 5 },
                { 0, 3, 0, 0, 7 },
                { 6, 8, 0, 0, 9 },
                { 0, 5, 7, 9, 0 } };

        // Print the solution
        t.init(5);
        t.prim(graph);
        assertEquals("Edge \tWeight\n" +
                "0 - 1\t2\n" +
                "1 - 2\t3\n" +
                "0 - 3\t6\n" +
                "1 - 4\t5\n",console());
    }
}