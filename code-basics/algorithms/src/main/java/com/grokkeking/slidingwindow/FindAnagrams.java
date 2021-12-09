package com.grokkeking.slidingwindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAnagrams {
    public List<Integer> find(String input, String pattern){
        Map<Character,Integer> characterFrequencyMap = new HashMap<>();
        for(Character c:pattern.toCharArray())
            characterFrequencyMap.put(c,characterFrequencyMap.getOrDefault(c,0)+1);

        int noOfCharMatched = 0;
        int windowStart = 0;
        int noOfAnagrams = 0;
        List<Integer> anagramIndexes = new ArrayList<>();
        for(int windowEnd = 0; windowEnd<input.length(); windowEnd++){
            Character endChar= input.charAt(windowEnd);
            if(characterFrequencyMap.containsKey(endChar)){
                characterFrequencyMap.put(endChar,characterFrequencyMap.get(endChar)-1);
                if(characterFrequencyMap.get(endChar) == 0)
                    noOfCharMatched++;
            }

            if(noOfCharMatched == characterFrequencyMap.size()) {
                anagramIndexes.add(windowStart);
                noOfAnagrams++;
            }

            if(windowEnd>=pattern.length()-1){
                Character startChar = input.charAt(windowStart++);
                if(characterFrequencyMap.containsKey(startChar)){
                    if(characterFrequencyMap.get(startChar)==0)
                        noOfCharMatched--;
                    characterFrequencyMap.put(startChar,characterFrequencyMap.get(startChar)+1);
                }
            }
        }
        return anagramIndexes;
    }
}
