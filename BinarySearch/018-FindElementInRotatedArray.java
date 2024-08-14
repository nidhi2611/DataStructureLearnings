//https://leetcode.com/problems/search-in-rotated-sorted-array/
class Solution {
    public int search(int[] arr, int target) {
        int low  = 0,high = arr.length-1,mid = 0,index = -1;
        while(low<=high){
            mid = (int)(low+high)/2;
            if(arr[mid] == target){
                index = mid;
                break;
            }else if(arr[low]<=arr[mid]){
                if(arr[low]<= target && target < arr[mid]){
                    high = mid -1;
                }
                else{
                    low = mid + 1;
                }
            }else{
                if(arr[mid] <= target && target <= arr[high]){
                    low = mid +1;
                }else{
                    high = mid -1;
                }
            }
        }
        return index;
    }
}
