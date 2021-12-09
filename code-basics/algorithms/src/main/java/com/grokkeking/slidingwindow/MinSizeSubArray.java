package com.grokkeking.slidingwindow;

public class MinSizeSubArray {
    public int find(int[] arr,int S){
        int windowSum = 0;
        int windowStart = 0;
        int minSize = Integer.MAX_VALUE;


        for(int windowEnd = 0; windowEnd<arr.length; windowEnd++){
            windowSum += arr[windowEnd];

            if(windowSum>=S){
                while (windowSum>=S) {
                    minSize = Math.min(minSize, windowEnd-windowStart+1);
                    windowSum -= arr[windowStart];
                    windowStart++;
                }
            }
        }
        return minSize;
    }
}
