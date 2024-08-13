//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

class Solution {
    public int[] searchRange(int[] arr, int x) {
        int mid  = 0, low = 0, high = arr.length-1,floor = -1,ceil = -1,found = 0;
        while(low<=high){
            mid = (int)(low+high)/2;
            if(arr[mid] == x){
                ceil = mid;
                low = mid +1;
            }else if(arr[mid] > x ){
                high = mid - 1;
            }else if(arr[mid] < x){
                low = mid + 1;
            }
        }
        mid  = 0; low = 0; high = arr.length-1;
        while(low<=high){
            mid = (int)(low+high)/2;
            if(arr[mid] == x){
                floor = mid;
                high = mid -1;
            }else if(arr[mid] > x ){
                high = mid - 1;
            }else if(arr[mid] < x){
                low = mid + 1;
            }
        }
        int res[] = new int[2];
        res[0] = floor;
        res[1] = ceil;
        return res;
    }
}
