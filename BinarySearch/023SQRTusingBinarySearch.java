//https://www.geeksforgeeks.org/problems/square-root/
class Solution {
    long floorSqrt(long n) {
        long low = 1, high = n-1, mid = 0,sq = 1;
        while ( low <= high){
            mid = (int)(low+high)/2;
            if( mid*mid == n){
                sq = mid;
                break;
            }else if(mid*mid < n){
                sq = mid;
                low = mid +1;
            }else{
                high = mid -1;
            }
        }
        return sq;
    }
}
