//https://leetcode.com/problems/rearrange-array-elements-by-sign/

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos = 0,neg = 1;
        int result[] = new int[nums.length];
        for(int k = 0; k < nums.length; k++){
            if(nums[k] > 0){
                result[pos] = nums[k];
                pos = pos + 2;
            }else if(nums[k] < 0){
                result[neg] = nums[k];
                neg = neg + 2;
            }
        }
        return result;
    }
}
