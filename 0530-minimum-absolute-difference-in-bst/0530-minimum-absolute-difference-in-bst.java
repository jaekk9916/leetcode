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
    int minDifference = Integer.MAX_VALUE;
    TreeNode prevNode;
    
    public void checkDifference(TreeNode node){
        if(node == null) return;
        
        checkDifference(node.left);
        
        if(prevNode != null){
            minDifference = Math.min(minDifference, node.val - prevNode.val);
        }
        
        prevNode = node;
        checkDifference(node.right);
    }
    
    public int getMinimumDifference(TreeNode root) {
        checkDifference(root);
        return minDifference;
    }
}