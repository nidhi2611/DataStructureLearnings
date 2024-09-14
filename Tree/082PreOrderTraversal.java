class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> response = new LinkedList<>();
        return preorder(response,root);
    }
    public static List<Integer> preorder(List<Integer> list, TreeNode root){
        if( root != null){
            list.add(root.val);
            preorder(list,root.left);
            preorder(list,root.right);
        }
        return list;
    }
}
