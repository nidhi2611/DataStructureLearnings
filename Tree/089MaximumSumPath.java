class Solution {
    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        getSum(root);
        return maxSum;
    }

    public int getSum(TreeNode root){
        if( root == null){
            return 0;
        }
        int left_sum = Math.max(getSum(root.left),0);
        int right_sum = Math.max(getSum(root.right),0);
        maxSum = Math.max(maxSum,left_sum+right_sum+root.val);
        return Math.max(left_sum,right_sum) + root.val;
    }
}
