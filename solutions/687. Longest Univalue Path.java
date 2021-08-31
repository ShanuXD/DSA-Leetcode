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
    public int longestUnivaluePath(TreeNode root) {
        int []sum = new int[1];
        helper(root, sum);
        return sum[0];
    }
    public static int helper(TreeNode root, int[]sum){
        if(root==null) return 0;
        int leftLeg = root.left==null?0:helper(root.left, sum);
        int rightLeg = root.right==null?0:helper(root.right, sum);
        int leftSum =  root.left!=null && root.left.val == root.val ?leftLeg+1:0;
        int rightSum = root.right!=null && root.right.val == root.val ?rightLeg+1:0;
        sum[0] = Math.max(sum[0], leftSum+rightSum);
        return Math.max(leftSum, rightSum);
    }
}
