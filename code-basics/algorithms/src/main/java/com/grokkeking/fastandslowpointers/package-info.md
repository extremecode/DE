# Fast and slow pointers
The Fast & Slow pointer approach, also known as the Hare & Tortoise algorithm, is a pointer algorithm that uses two pointers which move through the array (or sequence/LinkedList) at different speeds. This approach is quite useful when dealing with cyclic LinkedLists or arrays.

By moving at different speeds (say, in a cyclic LinkedList), the algorithm proves that the two pointers are bound to meet. The fast pointer should catch the slow pointer once both the pointers are in a cyclic loop.

One of the famous problems solved using this technique was Finding a cycle in a LinkedList. Let’s jump onto this problem to understand the Fast & Slow pattern.

* LinkedListChecker
  Given the head of a Singly LinkedList, write a function to determine if the LinkedList has a cycle in it or not.

  If cycle start start at k1 lenght(L) = n k1+k2 = n
  hasCycle - check if cycle
  getCycleLength - check the cycle length
  getCycleStartNode - 2 reach start node k1 + cycleLength  forward pointer 1 forward by cycle length and the progress both at the same time. they will  meet at start of the node.

* HappyNumber
  Any number will be called a happy number if, after repeatedly replacing it with a number equal to the sum of the square of all of its digits, leads us to number ‘1’. All other (not-happy) numbers will never reach ‘1’. Instead, they will be stuck in a cycle of numbers which does not include ‘1’.
  The time complexity of the algorithm is difficult to determine. However we know the fact that all unhappy numbers eventually get stuck in the cycle: 4 -> 16 -> 37 -> 58 -> 89 -> 145 -> 42 -> 20 -> 4

  This sequence behavior tells us two things:
  
  If the number NN is less than or equal to 1000, then we reach the cycle or ‘1’ in at most 1001 steps.
  For N > 1000N>1000, suppose the number has ‘M’ digits and the next number is ‘N1’. From the above Wikipedia link, we know that the sum of the squares of the digits of ‘N’ is at most 9^2M9
  ​2
  ​​ M, or 81M81M (this will happen when all digits of ‘N’ are ‘9’).
  This means:
  
  N1 < 81MN1<81M
  As we know M = log(N+1)M=log(N+1)
  Therefore: N1 < 81 * log(N+1)N1<81∗log(N+1) => N1 = O(logN)N1=O(logN)
  This concludes that the above algorithm will have a time complexity of O(logN)O(logN).
  
  Space Complexity #
  The algorithm runs in constant space O(1)O(1).

* MiddleOfLinkedList
  Given the head of a Singly LinkedList, write a method to return the middle node of the LinkedList.
  two pointer when till fast reach end. (n+1)/2 is the index of middle element
  Time complexity #
  The above algorithm will have a time complexity of O(N)O(N) where ‘N’ is the number of nodes in the LinkedList.
  
  Space complexity #
  The algorithm runs in constant space O(1)O(1).

* PalindromeLinkedList
  Given the head of a Singly LinkedList, write a method to check if the LinkedList is a palindrome or not.

Your algorithm should use constant space and the input LinkedList should be in the original form once the algorithm is finished. The algorithm should have O(N)O(N) time complexity where ‘N’ is the number of nodes in the LinkedList.
  find middle then reverse second half
   then compare all elemnt are equal till one become empty

  Time Complexity #
  The above algorithm will have a time complexity of O(N)O(N) where ‘N’ is the number of nodes in the LinkedList.
  
  Space Complexity #
  The algorithm runs in constant space O(1)O(1).

* RearrangeLinkedList
  Given the head of a Singly LinkedList, write a method to modify the LinkedList such that the nodes from the second half of the LinkedList are inserted alternately to the nodes from the first half in reverse order. So if the LinkedList has nodes 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null, your method should return 1 -> 6 -> 2 -> 5 -> 3 -> 4 -> null.
  find middle then reverse second half
  then do inplace joining
  2->4->6->8<-10-<12
  2->12->4->6->8<-10
  2->12->4->10->6->8

  Time Complexity #
  The above algorithm will have a time complexity of O(N)O(N) where ‘N’ is the number of nodes in the LinkedList.
  
  Space Complexity #
  The algorithm runs in constant space O(1)O(1).


* CircularArrayLoop
  We are given an array containing positive and negative numbers. Suppose the array contains a number ‘M’ at a particular index. Now, if ‘M’ is positive we will move forward ‘M’ indices and if ‘M’ is negative move backwards ‘M’ indices. You should assume that the array is circular which means two things:

  If, while moving forward, we reach the end of the array, we will jump to the first element to continue the movement.
  If, while moving backward, we reach the beginning of the array, we will jump to the last element to continue the movement.
  Write a method to determine if the array has a cycle. The cycle should have more than one element and should follow one direction which means the cycle should not contain both forward and backward movements.
  This problem involves finding a cycle in the array and, as we know, the Fast & Slow pointer method is an efficient way to do that. We can start from each index of the array to find the cycle. If a number does not have a cycle we will move forward to the next element. There are a couple of additional things we need to take care of:

  As mentioned in the problem, the cycle should have more than one element. This means that when we move a pointer forward, if the pointer points to the same element after the move, we have a one-element cycle. Therefore, we can finish our cycle search for the current element.
  
  The other requirement mentioned in the problem is that the cycle should not contain both forward and backward movements. We will handle this by remembering the direction of each element while searching for the cycle. If the number is positive, the direction will be forward and if the number is negative, the direction will be backward. So whenever we move a pointer forward, if there is a change in the direction, we will finish our cycle search right there for the current element.

  Time Complexity #
  The above algorithm will have a time complexity of O(N^2)O(N
  ​2
  ​​ ) where ‘N’ is the number of elements in the array. This complexity is due to the fact that we are iterating all elements of the array and trying to find a cycle for each element.

  Space Complexity #
  The algorithm runs in constant space O(1)O(1).
  
  An Alternate Approach #
