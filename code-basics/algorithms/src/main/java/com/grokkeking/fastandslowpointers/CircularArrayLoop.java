package com.grokkeking.fastandslowpointers;

public class CircularArrayLoop {
    public boolean loopExist(int[] arr){
        for(int i=0; i<arr.length; i++){
            boolean isForward = arr[i]>=0;
            int slow = i,fast=i;
            do{
                slow = findNextIndex(arr,isForward,slow);
                fast = findNextIndex(arr,isForward,fast);
                if(fast!=-1)
                    fast = findNextIndex(arr,isForward,fast);
            }while (slow !=-1 && fast!=-1 && slow==fast);

            if(fast!=-1 && slow!=-1)
                return true;
        }
        return false;
    }

//    1 2 -1 2 2
//iteration 1:
//    slow=1
//    fast=3
//iteration 2:
//    slow=3
//    fast=1 3
//    cycle found 3==3


    private int findNextIndex(int[] arr,boolean isForward,int currentIndex){
        boolean direction = arr[currentIndex]>0;
        if(direction!=isForward)
            return -1;

        int nextIndex = (currentIndex+arr[currentIndex])%arr.length;
        if(nextIndex<0)
            nextIndex +=arr.length;

        if(currentIndex == nextIndex)
            return -1;

        return nextIndex;
    }
}
