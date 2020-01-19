/*
	Given an array of integers, find if the array contains any duplicates.

	Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

	Example 1:
	Input: [1,2,3,1]
	Output: true

	Example 2:
	Input: [1,2,3,4]
	Output: false

	Example 3:
	Input: [1,1,1,3,3,4,3,2,4,2]
	Output: true
	
	This solution is O(n) in time and O(n) in space
*/

import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length == 0)
            return false;
        Set<Integer> numsSet = new HashSet<Integer>();
        for(int i : nums)   // loop through original array add to the set -> O(n)
            numsSet.add(i);
        // set contains no duplicates -> if set size is not the same than original size -> there are duplicates
        if(numsSet.size() == nums.length) 
            return false;
        else
            return true;
    }
}
