
// Example: Given an array of integers of size ‘n’, 
//Our aim is to calculate the maximum sum of ‘k’ consecutive elements in the array.

public class SlidingWindow {

    public int maxSumBruteForce(int[] arr, int k){
        int max_sum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length + 1; i++){
            int current_sum = 0;
            for(int j = 0; j < k; j++){
                current_sum += arr[j+i];
            }
            max_sum = Math.max(max_sum, current_sum);
        }
        return max_sum;
    }
    public static void main(String[] args){
        SlidingWindow slidingWindow = new SlidingWindow();
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        int ans = slidingWindow.maxSumBruteForce(arr, 2);
        System.out.println(ans);
    }
    
}
