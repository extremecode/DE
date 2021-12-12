package com.grokkeking.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletWithSumLessThanTarget {
    public List<List<Integer>> find(int[] arr,int targetSum){
        if(arr == null || arr.length<2 )
            throw new IllegalArgumentException("");

        List<List<Integer>> triplets = new ArrayList<>(new ArrayList<>());
        Arrays.sort(arr);
        for(int i=0; i<arr.length-2; i++){
            searchPair(triplets,i,targetSum-arr[i],arr);
        }
        return triplets;
    }

    private void searchPair(List<List<Integer>> triplets,int firstIndex,int targetSum,int[] arr){
        int left = firstIndex+1;
        int right = arr.length-1;
        while (left<right){
            if(arr[left]+arr[right]<targetSum){
                for(int j= right; j>left; j--)
                    triplets.add(Arrays.asList(arr[firstIndex],arr[left],arr[j]));
                left++;
            }else {
                right--;
            }
        }
    }
}
