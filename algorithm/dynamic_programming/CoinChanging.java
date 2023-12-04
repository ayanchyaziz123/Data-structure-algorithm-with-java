// You have 

import java.util.Arrays;

public class CoinChanging {
    public int bruthForce(int n, int[] arr){
        if(n == 0) return 1;
        if(n < 0) return 0;
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            ans = Math.min(ans, bruthForce(n - arr[i], arr) + 1);
        }
        return ans;
    }
    public static void main(String[] args){
        CoinChanging coinChanging = new CoinChanging();
        int[] arr = new int[]{2, 3, 4};
        int n = 7;
        int[] dp = new int[arr.length  + 1];
        Arrays.fill(dp, -1);
        System.out.println(coinChanging.bruthForce(n, arr));
    }
}
