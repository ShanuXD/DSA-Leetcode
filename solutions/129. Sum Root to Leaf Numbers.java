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
    public int sumNumbers(TreeNode root) {
        if(root==null) return 0;
        ArrayList<String> allString = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        getNumbers(root, allString, sb);
        int sum = 0;
        for (String str: allString) {
            // System.out.print(str+" ");
            sum+=Integer.parseInt(str);
        }
        return sum;
    }
    
    public static void getNumbers(TreeNode root, ArrayList<String> allString, StringBuilder sb ){
        
        if(root.left==null && root.right==null){
            sb.append(root.val);
