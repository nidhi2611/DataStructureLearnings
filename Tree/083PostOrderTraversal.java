class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> response = new LinkedList<>();
        return postorder(response,root);
    }
    public static List<Integer> postorder(List<Integer> list, TreeNode root){
        if( root != null){
            postorder(list,root.left);
            postorder(list,root.right);
            list.add(root.val);
        }
        return list;
    }
}
