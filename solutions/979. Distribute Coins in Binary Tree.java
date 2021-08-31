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
    public int distributeCoins(TreeNode root) {
        int count[] = new int [1];
        helper(root, count);
        return count[0];
    }
    
    public static int helper (TreeNode root, int []c){
        if(root == null) return 0;
        int leftSteps = helper(root.left, c);
        int rightSteps = helper(root.right, c);
        c[0] += Math.abs(leftSteps)+Math.abs(rightSteps);
        return root.val+leftSteps+rightSteps-1;
        
    }
}
