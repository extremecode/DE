package com.grokkeking.twopointers;

import java.util.Arrays;

public class TripletWithClosestSum {
    public int find(int[] arr,int targetSum){
        if(arr == null || arr.length<2 )
            throw new IllegalArgumentException("");

        int smallestDiff = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=0; i<arr.length-2; i++){
            int left = i+1;
            int right = arr.length-1;
            while (left<right){
                int currDiff = targetSum-arr[i]-arr[left]-arr[right];
                if(currDiff == 0)
                    return targetSum;

                if(Math.abs(currDiff)<Math.abs(smallestDiff)
                   ||( Math.abs(currDiff)==Math.abs(smallestDiff) && currDiff>smallestDiff))
                    smallestDiff = currDiff;

                if(currDiff >0){
                    left++;
                }else {
                    right--;
                }
            }
        }
        return targetSum-smallestDiff;
    }
}
