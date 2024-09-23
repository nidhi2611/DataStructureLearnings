class Solution {
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        rootToLeafPath(root,new ArrayList<>(),res);
        return res;
    }
    
    public static void rootToLeafPath(Node root, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> list){
        if(root==null){
            return;
        }
        path.add(root.data);
        
        if(root.left==null && root.right==null){
            list.add(new ArrayList<>(path));
        }
        rootToLeafPath(root.left,new ArrayList<>(path),list);
        rootToLeafPath(root.right,new ArrayList<>(path),list);
        path.remove(path.size()-1);
    }
}
