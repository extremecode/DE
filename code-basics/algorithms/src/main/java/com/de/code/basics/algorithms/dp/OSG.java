package com.de.code.basics.algorithms.dp;

public class OSG {
    public int OSRec(int[] arr,int i,int j,int[][] L,int sum){
        if(j==i+1)
            return Math.max(arr[i],arr[j]);

        if(L[i][j]!=-1)
            return L[i][j];

        L[i][j] = Math.max((sum-OSRec(arr,i+1,j,L,sum-arr[i])),(sum-OSRec(arr,i,j-1,L,sum-arr[j])));

        return L[i][j];

    }
    public int optimalStraegyOfGame(int[] arr,int n){
        int sum=0;
        int[][] L = new int[n][n];

        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++)
                L[i][j] = -1;

        for(int i=0; i<n; i++)
            sum +=arr[i];

        return OSRec(arr,0,n-1,L,sum);


    }
}
