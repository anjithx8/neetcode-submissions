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
    public boolean isBalanced(TreeNode root) {
        if(maxDepth(root)==-1) return false;
        else return true;
        

    }
    public int maxDepth(TreeNode root){
        int count=1;
        if(root==null) return 0;
        int leftDepth=maxDepth(root.left);
        int rightDepth=maxDepth(root.right);
        if(rightDepth==-1||leftDepth==-1) return -1;
        count=1+Math.max(leftDepth,rightDepth);
        int difference=Math.abs(leftDepth-rightDepth);
        if(difference>1) return -1;
        return count;
    }
}
