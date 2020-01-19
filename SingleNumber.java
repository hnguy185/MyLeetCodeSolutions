/*
	Given a non-empty array of integers, every element appears twice except for one. Find that single one.

	Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

	Example 1:
	Input: [2,2,1]
	Output: 1

	Example 2:
	Input: [4,1,2,1,2]
	Output: 4
	
	This solution is O(n) in time and O(n) in space
*/

import java.util.*;

class Solution {
	public int singleNumber(int[] nums) {
        int result = nums[0];	// default return value
        HashMap<Integer,Integer> numsMap = new HashMap<>();
        for(int i : nums) {	// map every element in nums to a hash table
            if(numsMap.containsKey(i)) {
                Integer j = numsMap.get(i);
                numsMap.put(i, ++j);
            } else {
                numsMap.put(i, 1);
            }
        }

        for(Map.Entry<Integer, Integer>entry : numsMap.entrySet()) {
            if(entry.getValue() == 1) // if there exists an entry where value is 1 then return it
                return entry.getKey();
        }
        return result;
    }
}
