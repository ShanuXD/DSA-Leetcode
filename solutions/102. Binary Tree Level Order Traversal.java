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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> res = new ArrayList();
        helper(root, res, 0);
        return res;
    }
    
    public static void helper(TreeNode root, List<List<Integer>>res, int c){
        if(root == null) return;
        
        if(res.size()<c+1){
            res.add(new ArrayList<>());
        }
        res.get(c).add(root.val);
        helper(root.left, res, c+1);
        helper(root.right, res, c+1);
        
