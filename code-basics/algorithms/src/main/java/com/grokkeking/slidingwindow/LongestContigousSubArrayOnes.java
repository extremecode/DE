package com.grokkeking.slidingwindow;

public class LongestContigousSubArrayOnes {
    public int find(int[] arr,int k){
        int maxSequentialCharafterReplaceinSizeofK =0;
        int zeroCharCount = 0;
        int windowStart = 0;
        for(int windowEnd = 0; windowEnd<arr.length; windowEnd++){
            int endNo = arr[windowEnd];
            if(endNo == 0)
                zeroCharCount +=1;

            if (zeroCharCount>k ){
                int startNo = arr[windowStart];
                if(startNo == 0)
                    zeroCharCount -=1;
                windowStart++;
            }
            maxSequentialCharafterReplaceinSizeofK = Math.max(maxSequentialCharafterReplaceinSizeofK,windowEnd-windowStart+1);
        }
        return maxSequentialCharafterReplaceinSizeofK;
    }

    public int findWithLeavey(int[] arr,int k){
        int maxSequentialCharafterReplaceinSizeofK =0;
        int onesCharCount = 0;
        int windowStart = 0;
        for(int windowEnd = 0; windowEnd<arr.length; windowEnd++){
            int endNo = arr[windowEnd];
            if(endNo == 1)
                onesCharCount +=1;

            if (windowEnd-windowStart+1-onesCharCount>k ){
                int startNo = arr[windowStart];
                if(startNo == 1)
                    onesCharCount -=1;
                windowStart++;
            }
            maxSequentialCharafterReplaceinSizeofK = Math.max(maxSequentialCharafterReplaceinSizeofK,windowEnd-windowStart+1);
        }
        return maxSequentialCharafterReplaceinSizeofK;
    }
}
