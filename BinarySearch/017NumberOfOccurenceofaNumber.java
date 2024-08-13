//https://www.geeksforgeeks.org/problems/number-of-occurrence2259
class Solution {
    int count(int[] arr, int n, int x) {
        int mid  = 0, low = 0, high = arr.length-1,floor = -1,ceil = -1,res = 0;
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
        if(floor == -1){
            res = 0;
        }
        else if(floor == ceil){
            res = 1;
        }else{
            res = ceil-floor +1;
        }
        return res;
    }
}
