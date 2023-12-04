public class Prob1_7 {
    void rotedMatrix(int[][] mat){
        for(int i = 0; i < mat.length; i++){
            for(int j = i; j < mat[i].length; j++){
                if(i==j)continue;
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        // traspose matrix = col-> row
        for(int i = 0; i < mat.length; i++){
            int left = 0;
            int right = mat[i].length - 1;
            while(left < right){
            int temp = mat[i][left];
            mat[i][left] = mat[i][right];
            mat[i][right] = temp;
            left++;
            right--;
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
        Prob1_7 prob1_7 = new Prob1_7();
        int[][] arr = {
            {5, 1, 9, 11},
            {2, 4, 8, 10},
            {13, 3, 6, 7},
            {15, 14, 12, 16}
        };
        prob1_7.rotedMatrix(arr);
        
    }
}
