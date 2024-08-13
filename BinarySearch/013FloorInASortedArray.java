//https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/
class Solution {

    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x) {
        int mid  = 0, low = 0, high = n-1,target = 0;
        while( low <= high){
            mid = (int)(low+high)/2;
            if( arr[mid] == x){
                target = mid;
                break;
            }
            else if(arr[mid] < x){
                target = mid;
                low = mid + 1;
            }
            else if(arr[mid] > x){
                high = mid - 1;
            }
        }
        if (target == 0 && arr[0] > x){
            target = -1;
        }
        return target;
    }
}
