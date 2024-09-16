class Solution {
    public static int count = 0;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean res = false;
        if( p == null && q == null){
            return true;
        }
        if( p == null || q == null){
            return false;
        }
        return (p.val == q.val) && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
