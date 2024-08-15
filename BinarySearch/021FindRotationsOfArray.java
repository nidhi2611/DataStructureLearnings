//https://www.geeksforgeeks.org/problems/rotation4723/

class Solution {
    public int findKRotation(List<Integer> arr) {
        int low = 0, high = arr.size()-1, mid = 0,minimum =Integer.MAX_VALUE,index =-1;
        while(low <= high){
            // System.out.println(index);
            mid = (int)(low+high)/2;
            if(arr.get(low) <= arr.get(high)){
                if(minimum > arr.get(low)){
                    minimum = arr.get(low);
                    index = low;
                }
                break;
            }
            else if(arr.get(low) <= arr.get(mid)){
                if(minimum > arr.get(low)){
                    minimum = arr.get(low);
                    index = low;
                }
                low = mid + 1;
            }else{
                if(minimum > arr.get(mid)){
                    minimum = arr.get(mid);
                    index = mid;
                }
                high = mid -1;
            }
        }
        return index;
    }
}
