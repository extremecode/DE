package com.de.code.basics.algorithms.dp;

public class Edist {
    private int min(int x,int y, int z){
        if(x<=y && x<=z)
            return x;
        else if(y<=x &&y<=z)
            return y;
        return z;
    }
    public int recursion(String X, String Y,int m, int n){
        if(m==0)
            return n;
        if(n==0)
            return m;
        if(X.charAt(m-1) == Y.charAt(n-1))
            return recursion(X,Y,m-1,n-1);

        return 1+min(recursion(X,Y,m,n-1), //insert
                recursion(X,Y,m-1,n) //  remove
                ,recursion(X,Y,m-1,n-1)); // replace
    }

    public int DP(String X, String Y,int m, int n){
        int L[][] = new int[m+1][n+1];
        for(int i=0; i<=m; i++)
            for(int j =0; j<=n; j++){
                if(i==0)
                    L[i][j] = j;
                else if(j==0)
                    L[i][j] = i;
                else if(X.charAt(i-1) == Y.charAt(j-1))
                    L[i][j] = L[i-1][j-1];
                else
                    L[i][j] = 1+min(L[i][j-1],L[i-1][j],L[i-1][j-1]);

            }

        return L[m][n];
    }
}
