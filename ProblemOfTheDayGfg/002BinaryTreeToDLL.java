class Solution
{
    //Function to convert binary tree to doubly linked list and return it.
    Node head = null;
    Node prev = null;
    
    Node bToDLL(Node root)
    {
	    convertBinaryTree(root);
	    return head;
    }
    
    public void convertBinaryTree(Node root){
        if(root == null){
            return;
        }
        convertBinaryTree(root.left);
        if(prev == null){
            head = root;
        }else{
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        convertBinaryTree(root.right);
    }
}
