public class LinearSearch {
    public boolean isItemContains(int[] arr, int target){
        for(int i = 0; i < arr.length; i++)
             if(arr[i] == target) return true;
        return false;     
    }
    public static void main(String[] args){
        int[] arr = new int[]{1,2, 3, 4, 5};
        LinearSearch linearSearch = new LinearSearch();
        System.out.println(linearSearch.isItemContains(arr, 4));

    }
}
