class Solution {
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> ans=new ArrayList<Integer>();
        if(root==null) 
            return ans;
        Queue<Node> q=new LinkedList<>();
        Queue<Integer> wq=new LinkedList<>();
        q.add(root);
        wq.add(0);
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        map.put(0,root.data);
        while(!q.isEmpty()){
            Node temp=q.remove();
            int tw=wq.remove();
            if(!map.containsKey(tw))
            map.put(tw,temp.data);
            if(temp.left!=null){
                q.add(temp.left);
                wq.add(tw-1);
            }
            if(temp.right!=null){
                q.add(temp.right);
                wq.add(tw+1);
            }
        }
        ArrayList<Integer> key=new ArrayList<Integer>(map.keySet());
            Collections.sort(key);
            for(int k:key){
                ans.add(map.get(k));
            }
        return ans;
    }
}
