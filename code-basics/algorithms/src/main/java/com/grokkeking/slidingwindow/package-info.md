# Sliding Window 
* Avearage calculation
for intial k sum have a check. till it reach the sum. 
use previous calculated sum in size of k  - sum - arr[start] + arr[end]

* ContigousSumOfArrayofSizeK
Given an array of positive numbers and a positive number ‘S’, find the length of the smallest contiguous subarray whose sum is greater than or equal to ‘S’. Return 0, if no such subarray exists.
  - Approach Type - Fixed Window Size k
    for intial k sum have a check. till it reach the sum.
    use previous calculated sum in size of k  - Math.max(sum - arr[start] + arr[end],oldmax)
    O(N+K)

* MinSizeSubArray 
  Given a string, find the length of the longest substring in it with no more than K distinct characters.
  - Approach Type - Variable Window Size find minimum window size with max output 
    for intial k sum have a check. till it reach the sum.
    use previous calculated sum in size of k  - Math.max(end-start+1,oldmax) keep reducing untill we have sum
    O(N+N)

* LongestSubstringKdistinct
  Given an array of characters where each character represents a fruit tree, you are given two baskets and your goal is to put maximum number of fruits in each basket. The only restriction is that each basket can have only one type of fruit.
  - Approach Type - Variable Window Size find minimum window size with max output
    have a hashset lookup table untill max window size is hit.
    use previous calculated lookup and recusrsively remove characters form front untill
  Math.max(end-start+1,oldmax) keep reducing untill we have sum
    O(N*log(n)(hashmap serarch space))

* CharReplacement
  Given a string, find the length of the longest substring which has no repeating characters.
  - Approach Type - Variable Window Size find maximum window size with max leavey 
    have a hashmap lookup table for character freaquency max frequency char represent 
    use previous calculated lookup and if current window can't fit with levey shift left side of window skipping the char
    keep track Math.max(end-start+1,oldmax)
    O(N*2log(n)(hashmap search space))

* LongestContigousSubArrayOnes
  Given an array containing 0s and 1s, if you are allowed to replace no more than ‘k’ 0s with 1s, find the length of the longest contiguous subarray having all 1s.
  - Approach Type - Variable Window Size find maximum window size with max leavey
    have a zero or one counter 
    use previous calculated counter and if current window can't fit with levey shift left side of window skipping the char
    keep track Math.max(end-start+1,oldmax)
    O(N)

    
* FindPermutation
  Given a string and a pattern, find out if the string contains any permutation of the pattern.
  Permutation is defined as the re-arranging of the characters of the string. For example, “abc” has the following six permutations:
  abc
  acb
  bac
  bca
  cab
  cba
- Approach Type - Variable Window Size find minimum window size with max output
  have a patternCharfrequnecyMap
- if char appear in window matching pattern decrease frequnecy and recue pattern char count if frequency is zero 
   if window became bigger than pattern size then shift window start and update frequency and char match appropiately
  Math.max(end-start+1,oldmax) keep reducing untill we have sum
  O(N*log(n)(hashmap search space))


* FindAnagrams
  Same as permuations 
- Approach Type - Variable Window Size find minimum window size with max output
  have a patternCharfrequnecyMap
- if char appear in window matching pattern decrease frequnecy and recue pattern char count if frequency is zero
  if window became bigger than pattern size then shift window start and update frequency and char match appropiately
  keep track of all start window index when an permuation has formed noofMatched == frequency.size
  Math.max(end-start+1,oldmax) keep reducing untill we have sum
  O(N*log(n)(hashmap search space))
    
* SmallestSubStringPattern
  Similar as permuations but window size can increase here pattern count needs to match
- Approach Type - Variable Window Size find minimum window size with min output
  have a patternCharfrequnecyMap
- if char appear in window matching pattern decrease frequnecy and recue pattern char count if frequency is zero
  if no of char matches equals to pattern size we have found a match in a window
- check if its a smaller window and update recursively
  keep track of all start window index when an permuation has formed noofMatched == frequency.size
  Math.max(end-start+1,oldmax) keep reducing untill we have sum
  O(N*log(n)(hashmap search space))
    

* WordConcatenation
  Given a string and a list of words, find all the starting indices of substrings in the given string that are a concatenation of all the given words exactly once without any overlapping of words. It is given that all words are of the same length.
  This problem follows the Sliding Window pattern and has a lot of similarities with Maximum Sum Subarray of Size K. We will keep track of all the words in a HashMap and try to match them in the given string. Here are the set of steps for our algorithm:
  Store in  a hashmap the words as a lookup for 
  have a window WindowSize-sum(all words size)
  check if a valid substring is encounted , have a in line processing seen hash map if more frequency of a given work happen break 
  if all words processed stored the window index
  O(N * M * Len)O(N∗M∗Len) 


