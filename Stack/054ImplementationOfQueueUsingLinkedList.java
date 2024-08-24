//https://www.geeksforgeeks.org/problems/implement-queue-using-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=implement-queue-using-linked-list
class MyQueue
{
    QueueNode front, rear;
    
    //Function to push an element into the queue.
	void push(int a)
	{
	    QueueNode newData = new QueueNode(a);
	    if(rear == null){
	        front = newData;
	        rear = newData;
	    }else{
	        rear.next = newData;
	        rear = newData;
	    }
	}
	
    //Function to pop front element from the queue.
	int pop()
	{
	    int ans =0;
	    if(front == null && rear == null){
	        return -1;
	    }
	    if(front == rear){
    	      ans = front.data;
              rear=null;
              front = null;
              return ans;
        }
        ans = front.data;
        front = front.next;
        return ans;
	}
}




