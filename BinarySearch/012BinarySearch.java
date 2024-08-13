//https://leetcode.com/problems/binary-search/
class Solution {
    public int search(int[] nums, int target) {
        int mid = 0, low = 0, high = nums.length-1,index = 0;
        while(low<=high){
            mid = (int)(low+high)/2;
            if(nums[mid] == target){
                index = mid;
                break;
            }else if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        if(nums[index] != target){
            index = -1;
        }
        return index;
    }
}
