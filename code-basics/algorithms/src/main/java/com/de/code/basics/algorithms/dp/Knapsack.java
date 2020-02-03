package com.de.code.basics.algorithms.dp;

public class Knapsack {
    public int optimal(int[] w ,int[] v, int n,int wt){
        int[][] L = new int[n+1][wt+1];
        for(int i=0; i<=n; i++)
            for(int j=0; j<=wt; j++){
                if(i==0 || j==0)
                    L[i][j] = 0;
                else if(j>=w[i-1])
                    L[i][j] = Math.max(L[i-1][j],L[i-1][j-w[i-1]]+v[i-1]);
                else
                    L[i][j] = L[i-1][j];
            }
        return L[n][wt];
    }
}
