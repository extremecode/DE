package com.grokkeking.twopointers;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
    public List<Integer> remove(int[] arr){
        int left =0;
        for(int right=0; right<arr.length; right++){
            if(arr[left]!=arr[right]) {
                left += 1;
                swap(arr,left,right);
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i=0; i<=left; i++){
            result.add(arr[i]);
        }
        return result;
    }

    public void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
