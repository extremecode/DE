package com.grokkeking.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringKdistinct {
    public int find(String input,int k) throws IllegalAccessException {
        if(input == null || input.length()<k )
            throw new IllegalArgumentException("");
        Set<Character> previousCharLookup = new HashSet<>();
        int windowStart = 0;
        int longestSubStringLength = 0;
        for(int windowEnd = 0; windowEnd<input.length(); windowEnd++){
            previousCharLookup.add(input.charAt(windowEnd));
            while (previousCharLookup.size()>k){
                previousCharLookup.remove(input.charAt(windowStart));
                windowStart++;
            }
            longestSubStringLength = Math.max(longestSubStringLength,windowEnd-windowStart+1);
        }
        return longestSubStringLength;
    }
}
