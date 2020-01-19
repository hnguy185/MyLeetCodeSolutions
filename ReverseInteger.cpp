/*
  Given a 32-bit signed integer, reverse digits of an integer.

  Example 1:
  Input: 123
  Output: 321

  Example 2:
  Input: -123
  Output: -321

  Example 3:
  Input: 120
  Output: 21

  Note:
  Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range:
  [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
  
  Solved in O(log_10(x)) where there are log_10(x) digits in x
*/

#include <limits.h>

class Solution {
public:
    int reverse(int x) {
        if(x <= INT_MIN || x >= INT_MAX)
            return 0;
        return reverseDigit(x);
    }

    int reverseDigit(int x) {
        int result = 0;
        while(x != 0) {
            int i = x % 10;
            x /= 10;
            if (result > INT_MAX / 10 || result < INT_MIN / 10)
                return 0;
            result = result * 10 + i;
        }
        return result;
    }
};
