//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/

class Solution {
    public boolean search(int[] arr, int target) {
        int low = 0, high = arr.length-1, mid = 0;
        boolean present =  false;
        while (low<=high){
            mid  = (int)(low+high)/2;
            if(arr[mid] == target){
                present = true;
                break;
            }
            if(arr[low] == arr[mid] && arr[mid] == arr[high]){
                low = low + 1;
                high = high - 1;
                continue;
            }
            if(arr[low] <= arr[mid]){
                if( arr[low] <= target && target < arr[mid]){
                    high = mid -1;
                }else{
                    low = mid +1;
                }
            }else{
                if(arr[mid] < target && target <= arr[high]){
                    low = mid +1;
                }else{
                    high = mid -1;
                }
            }
        }
        return present;
    }
}
