//https://leetcode.com/problems/search-insert-position/
class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length-1, mid = 0, index = 0;
        while( low <= high ){
            mid = (int)(low+high)/2;
            if (nums[mid] == target){
                index = mid;
                break;
            }else if(nums[mid] < target){
                low = mid +1;
            }
            else if(nums[mid] > target){
                index = mid;
                high = mid-1 ;
            }
        }
        if(target > nums[nums.length-1]){
            index = nums.length;
        }
        return index;
    }
}
