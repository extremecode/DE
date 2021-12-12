package com.grokkeking.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuadrapleSumToTarget {
    public List<List<Integer>> find(int[] arr,int target){
        Arrays.sort(arr);
        List<List<Integer>> quadraples = new ArrayList<>(new ArrayList<>());
        for (int i=0; i<arr.length-3; i++){
            if(i>0 && arr[i]==arr[i-1])
                continue;
            for (int j=i+1; j<arr.length-2; j++) {
                if(j>i+1 && arr[j]==arr[j-1])
                    continue;
                searchPair(quadraples, i, j, j+1, arr, target);
            }
        }

        return quadraples;
    }

    private void searchPair(List<List<Integer>> quadraples,int firstIndex,int secondIndex,int left,int[] arr,int targetSum){
        int right = arr.length-1;
        while (left<right){
            int currentSum = arr[firstIndex]+arr[secondIndex]+ arr[left]+arr[right];
            if(currentSum==targetSum){
                quadraples.add(Arrays.asList(arr[firstIndex],arr[secondIndex],arr[left],arr[right]));
                left++;
                right--;
                while (arr[left-1]==arr[left]&& left<arr.length-1)
                    left++;
                while (arr[right+1]==arr[right]&& right<arr.length-1)
                    right--;
            }else if(currentSum<targetSum){
                left++;
            }else {
                right--;
            }
        }
    }
}
