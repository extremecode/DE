package com.de.code.basics.algorithms.dp;

public class PSSum {
    public void recursion() {

    }

    public int DP(int arr[], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += arr[i];

        boolean L[][] = new boolean[n + 1][sum + 1];

        for (int i = 0; i <= n; i++)
            L[i][0] = true;

        for (int i = 1; i <= sum; i++)
            L[0][i] = false;


        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= sum; j++) {
                L[i][j] = L[i - 1][j];
                if (arr[i - 1] <= j)
                    L[i][j] = L[i - 1][j - arr[i - 1]];
            }

        int diff = Integer.MAX_VALUE;
        for (int j = sum / 2; j > 0; j--) {
            if (L[n][j] == true) {
                diff = sum - 2 * j;
                break;
            }
        }

        return diff;


    }
}
