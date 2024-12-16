class KthLargest {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    int len = 0;
    public KthLargest(int k, int[] nums) {
        this.len = k;
        for(int i = 0; i < nums.length; i++){
            pq.add(nums[i]);
        }
        maintainHeap(k);
    }
    
    public int add(int val) {
        pq.add(val);
        maintainHeap(len);
        return pq.peek();
    }
    public void maintainHeap(int k){
        while(pq.size() > k){
            pq.remove();
        }
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
