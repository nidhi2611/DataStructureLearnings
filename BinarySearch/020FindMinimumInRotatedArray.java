//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

class Solution {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length-1, mid = 0,minimum =Integer.MAX_VALUE;
            while(low <= high){
                
                mid = (int)(low+high)/2;

                if(nums[low] <= nums[high]){
                    minimum = Math.min(minimum,nums[low]);
                    break;
                }
                else if(nums[low] <= nums[mid]){
                    minimum = Math.min(minimum,nums[low]);
                    low = mid + 1;
                }else{
                    minimum = Math.min(minimum,nums[mid]);
                    high = mid -1;
                }
            }
        return minimum;
    }
}
