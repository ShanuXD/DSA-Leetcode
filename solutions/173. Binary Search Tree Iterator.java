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
public class BSTIterator {
    Stack<TreeNode> stack;
    public BSTIterator(TreeNode root) {
        stack = new Stack<TreeNode>(); 
        add(root); 
    }    
    public boolean hasNext() {
        return !stack.isEmpty();
    }
​
    public int next() {
        TreeNode node = stack.pop();
        add(node.right);
        return node.val;
    }
    
    private void add(TreeNode node) {
        while (node != null) {
