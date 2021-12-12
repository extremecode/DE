package com.grokkeking.twopointers;

import java.util.HashMap;
import java.util.Map;

public class PairWithTargetsum {
    public String find(int[] arr,int targetSum){
        int left = 0;
        int right = arr.length-1;
        while (left<right){
            int currPointerSum = arr[left]+arr[right];
            if(currPointerSum == targetSum)
                return left+","+right;
            else if(currPointerSum>targetSum)
                right = right-1;
            else
                left = left+1;
        }
        return "";
    }

    public String findInUnsorted(int[] arr,int targetSum){
        Map<Integer,Integer> numberIndexMap = new HashMap<>();
        for (int i=0; i<arr.length; i++){
            if(numberIndexMap.containsKey(targetSum -arr[i]))
                return numberIndexMap.get(targetSum-arr[i])+","+i;
            else
                numberIndexMap.put(arr[i],i);
        }
        return "";
    }
}

