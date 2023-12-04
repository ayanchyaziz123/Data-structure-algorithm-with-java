public class EquDirectional {
    void eqaDircApproach(int[] arr, int length){
        // 1 0 0 3 4 0
        int left = 0;
        int right = 0;
        while(right < length){
            if(arr[right] == 0){
                right++;
            }
            else{
                int temp = arr[left];
                arr[left++] = arr[right];
                arr[right++] = temp;
            }
        } 
    }

    public static void main(String[] args){
        EquDirectional equDirectional = new EquDirectional();
        int[] arr = new int[]{0, 1, 3, 4, 0};
        int length = arr.length;
        equDirectional.eqaDircApproach(arr, length);
        for(int i = 0; i < length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
}
