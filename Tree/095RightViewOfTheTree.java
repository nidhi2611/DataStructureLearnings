class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        if( root == null ){
            return res;
        }
        Queue<TreeNode> q =  new LinkedList<>();
        q.add(root);
        while(q.size() > 0){
            int levelSize = q.size();
            Stack<Integer> list = new Stack<>();
            for( int i = 0; i < levelSize; i ++){
                TreeNode curr = q.poll();
                list.push(curr.val);
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
            res.add(list.pop());
        }
        return res;
    }
}
