import java.util.*;

public class Leetcode_48_Rotate_Image {
    public static void main(String[] args) {
        int [][] matrix ={{1,2,3},{4,5,6},{7,8,9}};

        for (int[] row1 : matrix) {
            System.out.println(Arrays.toString(row1));
        }

        Rotate_Matrix(matrix);
        for (int[] row2 : matrix) {
            System.out.println(Arrays.toString(row2));
        }
    }
    public static void Rotate_Matrix(int [][]matrix){
        int n = matrix[0].length;
        int m = matrix.length;

        //Transposiing the maini Matrix
        //outer Loop
        for(int i=0; i<n; i++){
        // Inner Loop
            for(int j =i; j<m; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }
        }
        //Reverse the entire Matrix by one by one
        for(int col =0; col<m/2 ; col++){
            for(int row =0; row <n ; row ++){
                int temp = matrix[row][col];
                matrix[row][col] = matrix[row][m-1-col];
                matrix[row][m-1-col] = temp;
               
            }
        }

    }
    
    

    
    
}
