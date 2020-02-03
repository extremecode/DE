package com.de.code.basics.algorithms.dp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OSGTest {

    private OSG osg;
    @Before
    public void setUp() throws Exception {
        osg = new OSG();

    }

    @After
    public void tearDown() throws Exception {
        osg = null;
    }

    @Test
    public void optimalStraegyOfGame() {
        assertEquals(15,osg.optimalStraegyOfGame(new int[]{5,3,7,10},4));
    }
}