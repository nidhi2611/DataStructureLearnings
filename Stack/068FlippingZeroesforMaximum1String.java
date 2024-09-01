// https://leetcode.com/problems/max-consecutive-ones-iii/
class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0 , right = 0;
        int zeroes = 0;
        int maxLen = 0;
        while(right < nums.length){
            if(nums[right] == 0){
                zeroes = zeroes + 1;
            }
            if(zeroes > k){
                if(nums[left] == 0){
                    zeroes--;
                }
                left++;
            }
            if(zeroes <= k){
                maxLen = Math.max(maxLen,right - left + 1);
            }
            right = right + 1;
        }
        return maxLen;
    }
}
