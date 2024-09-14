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
    public int diameterOfBinaryTree(TreeNode root) {
        int diameter = 0;
        if( root != null ){
            int lst = diameterOfBinaryTree(root.left);
            int rst = diameterOfBinaryTree(root.right);
            diameter = Math.max(getHeight(root.left) + getHeight(root.right),Math.max(lst,rst));
        }

        return diameter;
    }
    public static int getHeight(TreeNode root){
        if( root == null) return 0;
        return Math.max(getHeight(root.left),getHeight(root.right))+1;
    }
}
