/*
	Given a binary tree, find its maximum depth.
	The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

	Note: A leaf is a node with no children.

	Example:
	Given binary tree [3,9,20,null,null,15,7],

		3
	   / \
	  9  20
		/  \
	   15   7

	return its depth = 3.
*/

/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */

#include <iostream>
#include <cmath>
using namespace std;

class Solution {
public:
    int maxDepth(TreeNode* root) {
        if(root == nullptr) // base case
            return 0;
        int leftDepth = maxDepth(root->left); // recursively call maxDepth on the left subtrees
        int rightDepth = maxDepth(root->right); // recursively call maxDepth on the right subtrees

        if (leftDepth > rightDepth) // find the max depth of subtres and add 1 for the root of the subtree
            return leftDepth + 1;
        else
            return rightDepth + 1;
    }

};
