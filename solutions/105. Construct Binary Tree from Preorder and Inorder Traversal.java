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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        //Pre-Start, leftStart, rightEnd         
        return helper(0, 0, preorder.length-1, preorder, inorder);
    }
    
    public static TreeNode helper(int preStart, int start, int end, int[]pre_order, int []in_order){
        if(preStart>pre_order.length || start>end) return null;
        
        int val = pre_order[preStart];
        int midIndex=0; 
        TreeNode node = new TreeNode(val);
        for (int i=start; i<=end; i++)
            if(in_order[i]==val) midIndex = i; 
        
        
        node.left = helper(preStart+1, start, midIndex-1, pre_order, in_order);
