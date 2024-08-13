//https://www.geeksforgeeks.org/problems/ceil-the-floor2802/
class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        int mid  = 0, low = 0, high = arr.length-1,floor = -1,ceil = -1;
        Arrays.sort(arr);
        while( low <= high){
            mid = (int)(low+high)/2;
            if( arr[mid] == x){
                floor = arr[mid];
                break;
            }
            else if(arr[mid] < x){
                floor = arr[mid];
                low = mid + 1;
            }
            else if(arr[mid] > x){
                high = mid - 1;
            }
        }
        low=0;
        high=arr.length-1;
        mid=0;
        while( low <= high){
            mid = (int)(low+high)/2;
            if( arr[mid] == x){
                ceil = arr[mid];
                break;
            }
            else if(arr[mid] < x){
                
                low = mid + 1;
            }
            else if(arr[mid] > x){
                ceil = arr[mid];
                high = mid - 1;
            }
        }
        int result[] = new int[2];
        result[0] = floor; 
        result[1] = ceil;
        return result;
    }
}
