import java.util.*;
public class Prob1_8{
    
    void nullifyRow(int[][] mat, int row){
       for(int i = 0; i < mat[0].lenght(); i++){
            mat[row][i] == 0;
       }
    }
    void nullifyCol(int[][] mat, int col){
       for(int i = 0; i < mat[0].lenght(); i++){
            mat[i][col] == 0;
       }
    }
    
    void zeroMatrix(int[][] mat){
       int n = mat.length;
       int m = n;
       boolean col0 = false;
       boolean row0 = false;
       for(int i = 0; i < n; i++){
          if(mat[0][i] == 0){
             row0 = true;
          }
          if(mat[i][0]){
            col0 = true;
          }
       }
       for(int i = 1; i < n; i++){
         for(int j = 1; j < m; j++){
            if(mat[i][j] == 0){
              mat[i][0] = 0;
              mat[0][j] = 0;
            }
         }
       }
       for(int i = 1; i < n; i++){
          if(mat[i][0] == 0){
            nullifyRow(mat, i);
          }
       }
       for(int i = 1; i < n; i++){
          if(mat[0][i] == 0){
            nullifCol(mat, i);
          }
       }
       for(int i = 0; i < mat.length; i++){
          for(int j = 0; j < mat[i].length; j++){
          System.out.print(mat[i][j] + " ");
        }
        System.out.println();
       }
    }
public static void main(String[] args){
     Prob1_8 prob1_8 = new Prob1_8();
     int[][] arr = {
       {1, 1, 0},
       {1, 1, 0},
       {0, 1, 1} 
     };
     prob1_8.zeroMatrix(arr);
  }
}
