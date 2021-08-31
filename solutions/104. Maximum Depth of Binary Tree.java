/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        return getHeight(root);
    }
    
    public static int getHeight(TreeNode root){
        if(root==null) return 0;
        int left = root.left!=null?getHeight(root.left):0;
        int right = root.right!=null?getHeight(root.right):0;
        return Math.max(left,right)+1;
    }
}
