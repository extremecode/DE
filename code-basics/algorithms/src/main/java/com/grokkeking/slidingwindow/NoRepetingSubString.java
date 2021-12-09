package com.grokkeking.slidingwindow;

import java.util.HashMap;

import java.util.Map;


public class NoRepetingSubString {
    public int find(String input){
        int maxUniqueSequentialChars = 0;
        int windowStart = 0;
        Map<Character,Integer> previousCharLookup = new HashMap<>();
        for(int windowEnd = 0; windowEnd<input.length(); windowEnd++){
            Character currChar = input.charAt(windowEnd);
            if (previousCharLookup.containsKey(currChar)){
                windowStart = previousCharLookup.get(currChar)+1;
                previousCharLookup.remove(currChar);
            }
            previousCharLookup.put(currChar,windowEnd);
            maxUniqueSequentialChars = Math.max(maxUniqueSequentialChars,windowEnd-windowStart+1);
        }
        return maxUniqueSequentialChars;
    }
}
