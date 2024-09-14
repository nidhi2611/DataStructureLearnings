class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> response = new LinkedList<>();
        return inorder(response,root);
    }
    public static List<Integer> inorder(List<Integer> list, TreeNode root){
        if( root != null){
            inorder(list,root.left);
            list.add(root.val);
            inorder(list,root.right);
        }
        return list;
    }
}
