//https://www.geeksforgeeks.org/problems/fruit-into-baskets-1663137462/1
class Solution {
    public static int totalFruits(Integer[] arr) {
        int left = 0, right = 0, maxLen = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(right < arr.length){
            map.put(arr[right],map.getOrDefault(arr[right],0)+1);
            while(map.size() > 2){
                map.put(arr[left],map.get(arr[left]) - 1);
                if(map.get(arr[left]) == 0){
                    map.remove(arr[left]);
                }
                left++;
            }
            maxLen = Math.max(maxLen,right-left+1);
            right++;
        }
        return maxLen;
    }
}

