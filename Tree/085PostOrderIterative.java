class Tree {
    ArrayList<Integer> postOrder(Node node) {
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        st1.push(node);
        while(!st1.isEmpty()){
            node = st1.pop();
            st2.add(node);
            if(node.left!= null) st1.push(node.left);
            if(node.right != null) st1.push(node.right);
            
        }
        while(!st2.isEmpty()){
            ans.add(st2.pop().data);
        }
        return ans;
    }
}

//levelordertraversal -- reverse
