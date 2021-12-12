package com.grokkeking.twopointers;

public class DutchFlag {
    public void sort(int[] arr){
        int left = 0;
        int right = arr.length-1;

        int i =0;
        while (i<=right){
            if(arr[i]==0){
                swap(arr,left,i);
                i++;
                left++;
            }else if(arr[i]==1){
                i++;
            }else{
                swap(arr,right,i);
                right--;
            }
        }
    }

//    1, 0, 2, 1, 0
//     iteration = 2  0,1,2,1,0
//     iteration = 3  0,1,0,1,2
//     iteration = 4  0,0,1,1,2

    private void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
