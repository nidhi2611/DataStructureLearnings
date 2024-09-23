class Solution {
    public boolean isSymmetric(TreeNode root) {
        if ( root == null){
            return true;
        }
        return compare(root.left, root.right);
    }
    public boolean compare( TreeNode left, TreeNode right){
        if ( left == null && right == null)
            return true;
        if( (left == null && right != null) || (right == null && left != null))
            return false;
        return (left.val == right.val) && compare(left.right,right.left) && compare(right.right,left.left);
    }
}
