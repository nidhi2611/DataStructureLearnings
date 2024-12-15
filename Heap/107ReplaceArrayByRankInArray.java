class Solution {
    static int[] replaceWithRank(int arr[], int N) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for( int i = 0 ; i < N; i++){
            pq.add(arr[i]);
        }
        int counter = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(pq.size() > 0){
            if(map.containsKey(pq.peek())){
                pq.remove();
            }else{
                map.put(pq.remove(),counter+1);
                counter = counter + 1;
            }
        }
        for( int i = 0 ; i < N; i++){
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}
     
