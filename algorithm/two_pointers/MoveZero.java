public class MoveZero {


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
        MoveZero moveZero = new MoveZero();
        int[] arr = new int[]{0, 1, 3, 4, 0};
        int length = arr.length;
        moveZero.moveZero(arr, length);
        for(int i = 0; i < length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
