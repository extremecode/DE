package com.de.code.basics.algorithms.dp;

public class SubsetSum {
    public boolean possible(int[] set,int n,int sum){
        boolean[][] L = new boolean[n+1][sum+1];
        for(int i=0; i<=n; i++)
            L[i][0] = true;

        for(int j=0; j<=sum; j++)
            L[0][j] = false;

        for(int i=1; i<=n; i++)
            for(int j=1; j<=sum; j++){
                if(j<set[i-1])
                    L[i][j] = L[i-1][j];
                else if (j>=set[i-1])
                    L[i][j] = L[i-1][j] || L[i-1][j-set[i-1]];
            }
        return L[n][sum];
    }
}
