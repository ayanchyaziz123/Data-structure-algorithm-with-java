import java.util.Arrays;

public class OppositeDirectional {
    boolean oppositeDirectional(int[] arr, int length, int targetSum){
        // 1 0 0 3 4 0
        int head = 0;
        int tail = length -1;
        while(head < tail){
            if(arr[head] + arr[tail] == targetSum) return true;
            else if(arr[head] + arr[tail] < targetSum) head++;
            else tail--;
        } 
        return false;
    }

    void moveZero(int[] arr, int length){
        if(length == 0) return;
        int nonZeroIndex = 0;
        for(int i = 0; i < length; i++){
            if(arr[i] != 0){
                arr[nonZeroIndex++] = arr[i];
            }
        }
        while (nonZeroIndex < length) {
            arr[nonZeroIndex++] = 0;
        }
    }
    public static void main(String[] args){
        OppositeDirectional oppositeDirectional = new OppositeDirectional();
        int[] arr = new int[]{1, 2, 4, 6, 5};
        Arrays.sort(arr);
        int length = arr.length;
        int targetSum = 10;
        System.out.println(oppositeDirectional.oppositeDirectional(arr, length, targetSum));
    }
    
}
