package com.grokkeking.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class CharReplacement {
    public int find(String input,int k){
        int maxSequentialCharafterReplaceinSizeofK =0;
        int maxRepeatingCharCount = 0;
        int windowStart = 0;
        Map<Character,Integer> letterFreaquencyMap = new HashMap<>();
        for(int windowEnd = 0; windowEnd<input.length(); windowEnd++){
            Character endChar = input.charAt(windowEnd);
            letterFreaquencyMap.put(endChar,letterFreaquencyMap.getOrDefault(endChar,0)+1);
            //Consider recursively char which is max repeating
            maxRepeatingCharCount = Math.max(0,letterFreaquencyMap.get(endChar));

            if(windowEnd-windowStart+1-maxRepeatingCharCount>k){
                Character leftChar = input.charAt(windowStart);
                letterFreaquencyMap.put(leftChar,letterFreaquencyMap.get(leftChar)-1);
                windowStart++;
            }
            maxSequentialCharafterReplaceinSizeofK = Math.max(maxSequentialCharafterReplaceinSizeofK,windowEnd-windowStart+1);
        }
        return maxSequentialCharafterReplaceinSizeofK;
    }
}
