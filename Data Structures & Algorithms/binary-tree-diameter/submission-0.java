/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        int count=1;
        if(root==null) return 0;
        maxDepth(root);
        return diameter;


    }
    public int maxDepth(TreeNode root){
        int count=1;
        if(root==null) return 0;
        int leftDepth=maxDepth(root.left);
        int rightDepth=maxDepth(root.right);
        count=1+Math.max(leftDepth,rightDepth);
        diameter=Math.max(diameter,leftDepth+rightDepth);
        return count;

    }
}
