package com.de.code.basics.algorithms.dp;

public class LPMatrix {

    private int findLongestFromACeLL(int i, int j,int[][] mat,int[][] dp,int n){

        if(i<0 || i>=n || j<0 || j>=n)
            return 0;

        if(dp[i][j]!=-1)
            return dp[i][j];

        int x,y,z,w;
        x = y =z =w =Integer.MIN_VALUE;

        if(j<n-1 && ((mat[i][j] +1) == mat[i][j+1] ))
            x = 1+findLongestFromACeLL(i,j+1,mat,dp,n);

        if(j>0 && ((mat[i][j] +1) == mat[i][j-1] ))
            y = 1+findLongestFromACeLL(i,j-1,mat,dp,n);

        if(i<n-1 && ( (mat[i][j] +1) == mat[i+1][j]) )
            z = 1+findLongestFromACeLL(i+1,j,mat,dp,n);

        if(i>0 && ((mat[i][j] +1) == mat[i-1][j]) )
            w = 1+findLongestFromACeLL(i-1,j,mat,dp,n);

        dp[i][j]=Math.max(x,Math.max(y,Math.max(z,Math.max(w,1))));
        return dp[i][j];
    }

    public int maxDistance(int[][] mat,int n){
        int result = 0;
        int[][] dp = new int[n][n];
        for(int i=0; i< n; i++)
            for(int j=0; j< n; j++)
                dp[i][j] = -1;

        for(int i=0; i< n; i++)
            for(int j=0; j< n; j++){
                if(dp[i][j] ==-1)
                    findLongestFromACeLL(i,j,mat,dp,n);

                result = Math.max(result,dp[i][j]);
            }

        return result;

    }
}
