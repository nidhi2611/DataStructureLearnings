class Solution {
    // Returns count buildings that can see sunlight
    public int countBuildings(int[] height) {
        // code here
        int max = 0;
        int count = 0;
        for( int i = 0; i< height.length; i ++){
            if( max < height[i]){
                max = height[i];
                count = count + 1;
            }
        }
        return count;
    }
}
