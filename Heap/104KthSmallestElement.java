class Solution {
    public static int kthSmallest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for( int i = 0; i < nums.length; i++){
            queue.add(nums[i]);
            if(queue.size() > k){
                queue.remove();
            }
        }
        return queue.remove();
    }
}
