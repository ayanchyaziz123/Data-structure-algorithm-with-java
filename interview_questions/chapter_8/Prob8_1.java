// Question: Triple Step
//A child is running up a staircase with n steps and can hp either 1 step
// 2 steps pr 3 steps at a time. Implement a ment how many way the child can
// run up the stairs

import java.util.Arrays;

public class Prob8_1 {

    public int countWays(int n, int[] memo){
        if(n < 0) return 0;
        if(n==0) return 1;
        if(memo[n] > -1){
            return memo[n];
        } 
        else{
            memo[n] = countWays(n - 1, memo) + countWays(n - 2, memo) + countWays(n - 3, memo);
            return memo[n];
        }
    }

    public int tripleStep(int n){
        if(n < 0) return 0;
        if(n==0) return 1;
        return tripleStep(n-1) + tripleStep(n-2) + tripleStep(n-3);
    }
    public static void main(String[] args){
        Prob8_1 prob8_1 = new Prob8_1();
        int n = 3;
        System.out.println(prob8_1.tripleStep(3));
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        System.out.println(prob8_1.countWays(n, memo));
    }
}
