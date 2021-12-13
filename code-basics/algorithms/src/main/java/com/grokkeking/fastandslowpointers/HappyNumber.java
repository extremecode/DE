package com.grokkeking.fastandslowpointers;

public class HappyNumber {
    public boolean find(int num){
        int slow = num,fast=num;
        do{
            slow = calculateSquareatUnitPlaces(slow);
            fast = calculateSquareatUnitPlaces(calculateSquareatUnitPlaces(fast)) ;
        }while (slow!=fast);
        return slow==1;
    }

    private int calculateSquareatUnitPlaces(int num){
        int sum = 0;

        while (num>0){
            int digit = num%10;
            sum +=digit*digit;
            num /=10;
        }
        return sum;
    }
}
