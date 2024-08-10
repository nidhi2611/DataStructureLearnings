// https://www.geeksforgeeks.org/problems/max-sum-in-sub-arrays0824/0?category&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=max-sum-in-sub-arrays

class Solution {
    // Function to find pair with maximum sum
    public int pairWithMaxSum(List<Integer> arr) {
        int maxSum = 0;
        for (int i = 0; i < arr.size()-1 ; i++){
            maxSum = Math.max(maxSum,arr.get(i)+arr.get(i+1));
        }
        return maxSum;
    }
}
