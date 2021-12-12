package com.grokkeking.twopointers;

import java.util.*;

public class TripletSum {
    public List<List<Integer>> find(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> triplets = new ArrayList<>(new ArrayList<>());
        for(int i=0; i<arr.length-2; i++){
            searchTriplet(triplets,arr,i+1,-arr[i]);
        }
        return triplets;
    }

    private void searchTriplet(List<List<Integer>> triplets,int[] arr,int left,int targetSum){
        int right = arr.length-1;
        while (left<right){
            int currentSum = arr[left]+arr[right];
            if(currentSum==targetSum){
                triplets.add(Arrays.asList(-targetSum,arr[left],arr[right]));
                left++;
                right--;
                while (left<right && arr[left] == arr[left-1]) // skip all duplicates
                    left++;
                while (left<right &&  arr[right+1] == arr[right])
                    right--;
            }else if(currentSum<targetSum)
                left++;
            else
                right--;
        }
    }
}
