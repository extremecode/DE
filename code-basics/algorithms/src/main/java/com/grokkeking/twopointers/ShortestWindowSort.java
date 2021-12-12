package com.grokkeking.twopointers;

public class ShortestWindowSort {


    public int getMinWindowSize(int[] arr){
        int left = 0;
        int right =arr.length-1;
        while (left<arr.length-1 && arr[left]<=arr[left+1])
            left++;

        if(left==arr.length-1)
            return 0;

        while (right>0 && arr[right]>=arr[right-1])
            right--;

        int subArrayMin = Integer.MAX_VALUE;
        int subArrayMax = Integer.MIN_VALUE;

        for(int i=left; i<=right; i++){
            subArrayMin = Math.min(arr[i],subArrayMin);
            subArrayMax = Math.max(arr[i],subArrayMax);
        }

        while (left>0 && arr[left-1]>subArrayMin)
            left--;

        while (right<arr.length-1 && arr[right+1]<subArrayMax)
            right++;

        return right-left+1;
    }

    private void updateMinIndex(int currValue){

    }
}
