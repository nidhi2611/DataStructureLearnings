//https://leetcode.com/problems/set-matrix-zeroes/

class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length; // rows length
        int n = matrix[0].length; //column length
        int row_check[] = new int[m];
        int column_check[] = new int[n];

        for( int i = 0; i < m ; i++){
            for(int j = 0; j < n ; j++){
                if(matrix[i][j] == 0){
                    row_check[i] = -1;
                    column_check[j] = -1;
                }
            }
        }
        for( int i = 0; i < m ; i++){
            for(int j = 0; j < n ; j++){
                if(row_check[i] == -1 || column_check[j] == -1){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
