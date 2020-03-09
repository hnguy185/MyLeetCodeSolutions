/*
    Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
    
    Example 1:
    Input: [3,0,1]
    Output: 2
    
    Example 2:
    Input: [9,6,4,2,3,5,7,0,1]
    Output: 8
    
*/

#include <algorithm>
#include <iostream>
class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int n = nums.size();
        int i = 0;
        std::sort(nums.begin(), nums.begin() + n);
        while(n >= 0){
            //base case: [0] => size = 1
            if(i == nums.size())
                return i;
            else{
                if(i == nums[i]) 
                    i++;
                else
                    return i;
            }
            n--;
        }
        return 0;
    }
};
