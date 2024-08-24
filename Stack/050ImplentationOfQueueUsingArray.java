//https://www.geeksforgeeks.org/problems/implement-queue-using-array/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=implement-queue-using-array
class MyQueue {

    int front, rear;
	int arr[] = new int[100005];

    MyQueue()
	{
		front=0;
		rear=0;
	}
	
	//Function to push an element x in a queue.
	void push(int x)
	{
	    // Your code here
	    arr[rear] = x;
	    rear++;
	    
	} 

    //Function to pop an element from queue and return that element.
	int pop()
	{
	    if(rear <= front){
	        return -1;
	    }
	    int ans = arr[front];
	    front++;
	    return ans;
		// Your code here
	} 
}
