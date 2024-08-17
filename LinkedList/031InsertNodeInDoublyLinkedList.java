//https://www.geeksforgeeks.org/problems/insert-a-node-in-doubly-linked-list/1
    //Function to insert a new node at given position in doubly linked list.
    void addNode(Node head_ref, int pos, int data)
	{
		// Your code here
		Node current = head_ref;
		int index = -1;
		while(current.next !=null){
		    index++;
		    if( index == pos){
		        Node newData = new Node(data);
		        newData.next = current.next;
		        newData.prev = current;
		        current.next = newData;
		        break;
		    }
		    current = current.next;
		}
		if((index+1) == pos){
		    Node newData = new Node(data);
		    newData.next = null;
		    newData.prev = current;
		    current.next = newData;
		}
	}
}
