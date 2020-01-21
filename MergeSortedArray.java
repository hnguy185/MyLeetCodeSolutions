/*
	Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

	Note:
		The number of elements initialized in nums1 and nums2 are m and n respectively.
		You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.

	Example:
	Input:
	nums1 = [1,2,3,0,0,0], m = 3
	nums2 = [2,5,6],       n = 3

	Output: [1,2,2,3,5,6]
*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0)
            return;
        int size = m+n;
        int[] temp = new int[size];
        int j = 0; // nums2 index
        int k = 0; // temp index
        for(int i = 0; i < size; i++) {
            if(k == size)
                break;
            if(i > m-1) {
                copyRest(nums2, temp, k, j);
                break;
            }
            if(j > n-1) {
                copyRest(nums1, temp, k, i);
                break;
            }
            if(nums1[i] < nums2[j]) {
                temp[k++] = nums1[i];
                continue;
            }
            if(nums1[i] == nums2[j]) {
                temp[k++] = nums1[i];
                temp[k++] = nums2[j++];
                continue;
            }
            if(nums1[i] > nums2[j]) {
                temp[k++] = nums2[j++];
                i--;
            }
        }
        for(int i = 0; i < size; i++)
            nums1[i] = temp[i];
    }
    public void copyRest(int[] src, int[] dest, int k, int n) {
        for(int i = k; i < dest.length; i++)
            dest[i] = src[n++];
    }
}
