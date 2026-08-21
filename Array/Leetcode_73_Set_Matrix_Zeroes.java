
import java.util.*;

public class Leetcode_73_Set_Matrix_Zeroes {

    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        // setZeroes(matrix);
        // for (int[] row : matrix) {
        //     System.out.println(Arrays.toString(row));
        // }

        // Better Solution 
        Solutionn_better obj_2 = new Solutionn_better();
        obj_2.Set_zero(matrix);
        for (int[] row2 : matrix) {
            System.out.println(Arrays.toString(row2));
        }

        //Optimal Solution of SetZero MAtrix
        Optimal_Solution obj3 = new Optimal_Solution();
        obj3.Set_zero(matrix);
        for(int [] row3: matrix){
            System.out.println(Arrays.toString(row3));
        }

    }

    public static void setZeroes(int[][] matrix) {
        //get number of rows
        int m = matrix.length;
        // Get number of columns
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    // make row
                    for (int col = 0; col < n; col++) {
                        if (matrix[i][col] != 0) {

                            matrix[i][col] = -1;
                        }
                    }
                    for (int row = 0; row < m; row++) {
                        if (matrix[row][j] != 0) {

                            matrix[row][j] = -1;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }

            }
        }

    }
}

class Solutionn_better {

    public static void Set_zero(int[][] matrix) {
        int n = matrix[0].length;
        int m = matrix.length;

        int[] row_checker = new int[m];
        int[] col_checker = new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row_checker[i] = 1;
                    col_checker[j] = 1;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row_checker[i] == 1 || col_checker[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}

class Optimal_Solution {

    public static int[][] Set_zero(int[][] matrix) {
        int n = matrix[0].length; //For length of Row
        int m = matrix.length;  //For length of COl

        int col0 = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;  // For First Column
                    if (j != 0) {
                        matrix[0][j] = 0;  //for First Row

                    } else {
                        col0 = 0;
                    }
                }

            }
        }
        //Print All Zeroes
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] != 0) {
                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }

                }
            }
        }
        if(matrix[0][0]==0){
            for(int col =0; col<n;col++){
                matrix[0][col]=0;
            }
        }
        if(col0==0){
            for(int row =0; row<m ; row++){
                matrix[row][0]=0;
            }
        }

        return  matrix;
    }

}

