//https://leetcode.com/problems/binary-subarrays-with-sum/
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int left = 0 , right = 0, sum = 0, count_goal = 0;
        if(goal < 0) return 0;
        while(right < nums.length){
            sum = sum + nums[right];
            if(sum > goal){
                sum = sum - nums[left];
                left = left + 1;
            }
            count_goal = count_goal + (right-left+1);
            right = right + 1;
        }
        return count_goal;
    }
}
