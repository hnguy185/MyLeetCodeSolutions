/*
	Given an array, rotate the array to the right by k steps, where k is non-negative.

	Example 1:
	Input: [1,2,3,4,5,6,7] and k = 3
	Output: [5,6,7,1,2,3,4]
	Explanation:
	rotate 1 steps to the right: [7,1,2,3,4,5,6]
	rotate 2 steps to the right: [6,7,1,2,3,4,5]
	rotate 3 steps to the right: [5,6,7,1,2,3,4]

	Example 2:
	Input: [-1,-100,3,99] and k = 2
	Output: [3,99,-1,-100]
	Explanation: 
	rotate 1 steps to the right: [99,-1,-100,3]
	rotate 2 steps to the right: [3,99,-1,-100]

	Note:
		- Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
		- Could you do it in-place with O(1) extra space?

	Solved in O(k*n) time and O(1) space
*/

// This solution is O(k*n)

class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length == 0)
            return;
        if(nums.length == k)
            return;
        while(k > 0) {  // do this k times
            int last = nums[nums.length-1]; // get the last element and move it to the front
            for(int i = nums.length-1; i > 0; i--)
                nums[i] = nums[i-1]; //starting from the left, replace previous element with current element
            nums[0] = last;
            k--;
        }
    }
}
