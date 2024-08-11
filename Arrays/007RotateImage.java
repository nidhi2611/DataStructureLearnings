//https://leetcode.com/problems/rotate-image/


class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        int new_row = 0;
        int new_column = 0;
        int res[][] = new int[m][m];
        for (int i = 0; i < m; i++){
            new_column = 0;
            for(int j = m-1;j >= 0;j--){
                res[new_row][new_column] = matrix[j][i];
                // System.out.print(new_row+","+new_column);
                new_column = new_column + 1;
            }
            new_row = new_row+1;
        }
        for (int i = 0; i < m; i++){
            for(int j = 0; j<m;j++){
                // System.out.println(res[i][j]);// res[i][j];
                matrix[i][j] = res[i][j];
            }
        }
    }
}

// 00 01 02
// 10 11 12
// 20 21 22

// 20 10 00
// 21 11 01
// 22 12 02
