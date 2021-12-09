package com.grokkeking.slidingwindow;

public class ArrayOfSumK {
    public double[] findAverageUnOptimized(int k,int[] nums){
        double[] avg = new double[nums.length -k+1];
        for(int i=0; i<=nums.length - k; i++){
            double sum = 0;
            for (int j = i; j<i+k; j++){
                sum = sum + nums[j];
            }
            avg[i] = sum/k;
        }
        return avg;
    }

    public double[] findOptimizedSlidingWindow(int k,int[] nums){
        double[] windowAvg = new double[nums.length -k+1];
        int windowStart = 0;
        double windowSum = 0;
        for(int windowEnd=0; windowEnd<nums.length; windowEnd++){
            windowSum += nums[windowEnd];
            if(windowEnd>=k-1){
                windowAvg[windowStart]= windowSum/k;
                windowSum -= nums[windowStart];
                windowStart++;
            }
        }
        return windowAvg;
    }
}
