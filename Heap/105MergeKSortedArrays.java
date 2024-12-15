class Solution
{
    //Function to merge k sorted arrays.
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int k) 
    {
        ArrayList<Integer> res = new ArrayList<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i = 0; i < k ; i ++){
            for(int j = 0; j < k ; j ++){
                minHeap.add(arr[i][j]);
            }
        }
        int length = minHeap.size();
        for( int i  = 0; i < length; i++){
            res.add(minHeap.remove());
        }
        return res;
        
        
    }
}
