package com.de.code.basics.algorithms.dp;

public class WCDT {
    public int cover(int dist){
        if(dist<0)
            return 0;
        else if(dist==0)
            return 1;

        return cover(dist-1)+cover(dist-2)+cover(dist-3);

    }

    public int coverDP(int dist){
        int[] L = new int[dist+1];

        L[0] = 1;
        L[1] = 1;
        L[2] = 2;
        for(int i=3; i<=dist; i++)
            L[i] = L[i-1]+L[i-2]+L[i-3];
        return L[dist];
    }
}
