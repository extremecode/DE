package com.de.code.basics.algorithms.dp;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class LCSTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void lcsRecursion() {
        LCS lcs = new LCS();
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        char[] X=s1.toCharArray();
        char[] Y=s2.toCharArray();
        int m = X.length;
        int n = Y.length;

        assertEquals(4,lcs.lcsRecursion(X,m,Y,n));
    }

    @Test
    public void lcsDp() {
        LCS lcs = new LCS();
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        char[] X=s1.toCharArray();
        char[] Y=s2.toCharArray();
        int m = X.length;
        int n = Y.length;

        assertEquals(4,lcs.lcsDp(X,m,Y,n));
    }
}
