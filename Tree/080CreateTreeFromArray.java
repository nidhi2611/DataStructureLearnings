class Solution{
    public static void createTree(Node root, ArrayList<Integer> v ){
        if(v.size() == 0){
            return;
        }
        root.left = createChild(v,1);
        root.right = createChild(v,2);
    }
    public static Node createChild(ArrayList<Integer> v, int root){
        
        if(root >= v.size()){
            return null;
        }
        
        Node new_root = new Node(v.get(root));
        new_root.left = createChild(v,(root*2)+1);
        new_root.right = createChild(v,(root*2)+2);
        return new_root;
    }
}
