package com.de.code.basics.algorithms.dp;

public class LCS {

    /*
                             lcs("AXYT", "AYZX")
                       /
         lcs("AXY", "AYZX")            lcs("AXYT", "AYZ")
         /                              /
lcs("AX", "AYZX") lcs("AXY", "AYZ")   lcs("AXY", "AYZ") lcs("AXYT", "AY")
     */

    public int lcsRecursion(char[] x, int m,char[] y, int n){
        if(m == 0 || n==0){
            return 0;
        }else if(x[m-1] == y[n-1]){
            return 1+lcsRecursion(x,m-1,y,n-1);
        }else {
            return max(lcsRecursion(x,m,y,n-1),lcsRecursion(x,m-1,y,n));
        }
    }

    public int lcsDp(char[] X, int m,char[] Y, int n){
        int L[][] = new int[m+1][n+1];
        for(int i=0; i<=m; i++){
            for(int j=0; j<=n; j++){
                if(i==0 || j==0)
                    L[i][j] = 0;
                else if(X[i-1] == Y[j-1])
                    L[i][j] = 1 + L[i-1][j-1];
                else
                    L[i][j] = max(L[i-1][j],L[i][j-1]);
            }
        }
        return L[m][n];
    }

    public int max(int a, int b){
        return (a>b)?a:b;
    }
}
