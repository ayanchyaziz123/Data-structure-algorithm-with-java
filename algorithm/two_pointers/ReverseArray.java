import java.util.Arrays;

public class ReverseArray {

    void reverse(int[] arr, int length){
        int left = 0;
        int right = length - 1;
        while(left < right){
            int temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }
    public static void main(String[] args){
        ReverseArray reverseArray = new ReverseArray();
        int[] arr = new int[]{1, 2, 3, 4, 5};
        reverseArray.reverse(arr, arr.length);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }   
}
