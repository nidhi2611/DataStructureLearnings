//https://www.geeksforgeeks.org/problems/find-nth-root-of-m5843/
class Solution
{
    public int NthRoot(int n, int m)
    {
        int low = 1,high = m,mid =0, rt = -1;
        while (low <= high){
            mid = (int)(low+high)/2;
            if((int)Math.pow(mid,n) == m){
                rt = mid;
                break;
            }
            else if((int)Math.pow(mid,n) < m){
                low = mid + 1;
            }
            else{
                high = mid-1;
            }
        }
        if(m == 1){
            rt = 1;
        }
        return rt;
    }
}
