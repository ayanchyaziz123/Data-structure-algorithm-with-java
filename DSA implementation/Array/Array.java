package Array;

public class Array {
    public static void main(String[] args)
    {
        int[] arr; //declaring array
        arr = new int[5]; // allocating memory to array
        for(int i = 0; i < 5; i++)
        {
            arr[i] = i + 1;
        }
        int len = arr.length; // size of array;
        int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };  // Declaring array literal
        int[] intArray2 = new int[20]; // combining both statements in one
        // for(int i = 0; i < 5; i++)
        // {
        //     System.out.print(arr[i] + " ");
        // }
        int[][] mat = new int[3][3];  // 3 row and 3 column
         // declaring and initializing 2D array
         int mat2[][]
         = { { 2, 7, 9 }, { 3, 6, 1 }, { 7, 4, 2 } };

    }
}
