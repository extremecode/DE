package com.grokkeking.slidingwindow;

public class ContigousSumOfArrayofSizeK {
    public int find(int k,int[] nums){
        int maxSum=0;
        int windowStart = 0;
        int windowSum = 0;
        for(int windowEnd=0; windowEnd<nums.length; windowEnd++){
            windowSum += nums[windowEnd];
            if(windowEnd>=k-1){
                maxSum = Math.max(maxSum,windowSum);
                windowSum -= nums[windowStart];
                windowStart++;
            }
        }
        return maxSum;
    }
}
