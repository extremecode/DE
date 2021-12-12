#Problem Cateogary
In problems where we deal with sorted arrays (or LinkedLists) and need to find a set of elements that fulfill certain constraints, the Two Pointers approach becomes quite useful. The set of elements could be a pair, a triplet or even a subarray. For example, take a look at the following problem:

* PairWithTargetsum
Given an array of sorted numbers and a target sum, find a pair in the array whose sum is equal to the given target.
For Sorted use 2 pointer to resolve one fron and other and back 
search space O(N)
for unsorted have a hash table targetSum-A = B


* RemoveDuplicates
Given an array of sorted numbers, remove all duplicates from it. You should not use any extra space; after removing the duplicates in-place return the new length of the array.
have two pointer left Pointer holds the unique character on left every time we encounterd a non diffrent item in a sorted array swap


* SortedArraysSquares
Given a sorted array, create a new array containing squares of all the number of the input array in the sorted order.
squares will always be positive since array is sorted populate square array from right to left based on higher square value
   - T - O(N)
   - S - O(N) 



* TripletSum
  Given an array of unsorted numbers, find all unique triplets in it that add up to zero.
  sort so we can apply tow pointer and reduce processing of duplicates
  X+Y = -Z  Z = i   X,Y = i+1...,...n-1
  skip all duplicates so we dont have a duplicate.
  - T - O(N∗logN+N^2)
  - S - O(N) required for sorting


* TripletWithClosestSum
  Given an array of unsorted numbers, find all unique triplets in it that add up to zero.
  sort so we can apply tow pointer and reduce processing of duplicates
  X+Y = -Z  Z = i   X,Y = i+1...,...n-1
  calalculate min diff and if diff get negative take the positive one 
  - T - O(N∗logN+N^2)
  - S - O(N) required for sorting

* TripletWithSumLessThanTarget
  Given an array arr of unsorted numbers and a target sum, count all triplets in it such that arr[i] + arr[j] + arr[k] < target where i, j, and k are three different indices. Write a function to return the count of such triplets.
  sort so we can apply tow pointer and reduce processing of duplicates
  X+Y = -Z  Z = i   X,Y = i+1...,...n-1
 find in targetSum is less tahn the range left and right and then conside all from left-to right because if true for right highest should be true for all lower ones
  - T - O(N∗logN+N^2)
  - S - O(N) required for sorting


* SubArrayProductLessThanK
  Given an array with positive numbers and a target number, find all of its contiguous subarrays whose product is less than the target number.
  have a sliding window to calculate product
  when product increase greate than k increase left pointer post every elemnt mulitplication.

  O(n^2)
  T(c)
  If there are a total of n elements in the array, here is how we can count all the contiguous subarrays:
  
  When i = 0, j can have any value from ‘0’ to ‘n-1’, giving a total of ‘n’ choices.
  When i = 1, j can have any value from ‘1’ to ‘n-1’, giving a total of ‘n-1’ choices.
  Similarly, when i = 2, j can have ‘n-2’ choices.
  …
  …
  When i = n-1, j can only have ‘1’ choice.
  Let’s combine all the choices:
  
      n + (n-1) + (n-2) + ... 3 + 2 + 1
  Which gives us a total of: n*(n+1)/2n∗(n+1)/2
  
  So, at the most, we need a space of O(n^2)
  for all the output lists.

* DutchFlag
  Given an array containing 0s, 1s and 2s, sort the array in-place. You should treat numbers of the array as objects, hence, we can’t count 0s, 1s, and 2s to recreate the array.
  segrate all zeros to left and all 2s to right and for 1 just skip the iteration.
  - T - O(N)
  - S - O(1)

* QuadrapleSumToTarget
  Given an array of unsorted numbers, find all unique triplets in it that add up to zero.
  sort so we can apply tow pointer and reduce processing of duplicates
  X+Y = T -Z-W  Z = i   X,Y = i+1...,...n-1
  skip all duplicates so we dont have a duplicate.
  - T - O(N∗logN+N^3)
  - S - O(N) required for sorting + O(N*4) for tuples

* BackspaceCompare
  Given two strings containing backspaces (identified by the character ‘#’), check if the two strings are equal.
  skip backspace index have at each iteration skip whatever char# char#charchar## char - [A-Za-z]
  The time complexity of the above algorithm will be O(M+N)O(M+N) where ‘M’ and ‘N’ are the lengths of the two input strings respectively.

  Space complexity #
  The algorithm runs in constant space O(1)O(1).

* ShortestWindowSort
  Given an array, find the length of the smallest subarray in it which when sorted will sort the whole array.
  Go Forward in increasing order and backtrack till we find the minimum

  The time complexity of the above algorithm will be O(N)O(N).
  
  Space complexity #
  The algorithm runs in constant space O(1)O(1).