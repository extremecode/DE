package com.grokkeking.twopointers;

public class SortedArraysSquares {
    public int[] maxSquares(int[] arr){
        int left = 0;
        int right = arr.length-1;
        int[] squareArr = new int[arr.length];
        int populationIndex = right;
        while (left<right){
            int leftSquare = arr[left]*arr[left];
            int rightSquare = arr[right]*arr[right];
            if(leftSquare<rightSquare){
                squareArr[populationIndex] = rightSquare;
                right--;
            }else {
                squareArr[populationIndex] = leftSquare;
                left++;
            }
            populationIndex--;
        }
        return squareArr;
    }


}
