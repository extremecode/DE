package com.grokkeking.twopointers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SubArrayProductLessThanK {
    public List<List<Integer>> find(int arr[],int k){
        int left = 0;
        int product = 1;
        List<List<Integer>> subarrays = new ArrayList<>(new ArrayList<>());
        for(int right=0; right<arr.length; right++){
            product *= arr[right];
            while (product>=k && left<arr.length) {
                product /=arr[left];
                left++;
            }

            List<Integer> tempList = new LinkedList<>();
            for(int i=right; i>=left; i--){
                tempList.add(arr[i]);
                subarrays.add(new ArrayList<>(tempList));
            }
        }
        return subarrays;
    }
}
