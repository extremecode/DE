package com.grokkeking.slidingwindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordConcatenation {
    public List<Integer> find(String str,List<String> words){
        Map<String,Integer> wordFrequencyMap = new HashMap<>();
        for(String word:words)
            wordFrequencyMap.put(word,wordFrequencyMap.getOrDefault(word,0)+1);
        final int wordsCount = words.size();
        final int wordLength = words.get(0).length();
        List<Integer> wordConcatIndexes = new ArrayList<>();
        for(int i=0; i<=str.length()-wordsCount*wordLength; i++){
            Map<String,Integer> wordSeen = new HashMap<>();
            for(int j=0; j<wordsCount; j++){
                int nextWordIndex = i+j*wordLength;
                String word = str.substring(nextWordIndex,nextWordIndex+wordLength);
                if(!wordFrequencyMap.containsKey(word))
                    break;

                wordSeen.put(word,wordSeen.getOrDefault(word,0)+1);

                if(wordSeen.get(word)>wordFrequencyMap.getOrDefault(word,0))
                    break;

                if(j+1 == wordsCount)
                    wordConcatIndexes.add(i);
            }
        }
        return wordConcatIndexes;
    }
}
