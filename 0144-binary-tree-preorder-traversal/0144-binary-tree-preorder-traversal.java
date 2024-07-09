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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> output = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        
        if(root == null) return output;
        
        while(!stack.isEmpty()){
            TreeNode treeNode = stack.pop();
            output.add(treeNode.val);
            
            if(treeNode.right != null) stack.push(treeNode.right);
            if(treeNode.left != null) stack.push(treeNode.left);
            
        }
        
        return output;
    }
}