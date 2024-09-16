class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if( root == null){
            return result;
        }
        Deque<TreeNode> de = new LinkedList<>();
        de.offer(root);
        boolean even = false;
        while( de.isEmpty() == false){
            int size =  de.size();
            List<Integer> level = new ArrayList<>(size);
            for( int i = 0; i < size ; i ++) {
                if( even == false){
                    TreeNode curr = de.pollFirst();
                    level.add(curr.val);
                    if(curr.left != null){
                        de.addLast(curr.left);
                    }
                    if(curr.right != null){
                        de.addLast(curr.right);
                    }
                }
                else{
                    TreeNode curr = de.pollLast();
                    level.add(curr.val);
                    if(curr.right != null){
                        de.addFirst(curr.right);
                    }
                    if(curr.left != null){
                        de.addFirst(curr.left);
                    }
                }
            }
            even = !even;
            result.add(level);
        }
        return result;
    }
}
