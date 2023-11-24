public class BubbleSort {

    // Implementation of Bubble Sort algorithm
    // Time Complexity: O(n^2) in the worst case
    // - n is the number of elements in the array
    // - This is because we have nested loops, and in the worst case, we may need to perform n comparisons for each of the n elements.
    // - Despite its simplicity, Bubble Sort is not efficient for large datasets.
    public int[] bubbleSort(int[] arr, int length){
        for(int i = 0; i < length; i++){
            for(int j = 0; j < length - i - 1; j++){
                // If the current element is greater than the next element, swap them
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args){
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = new int[]{10, 5, 1, 2, 9};

        // Sorting the array using Bubble Sort
        int[] sortedArray = bubbleSort.bubbleSort(arr, arr.length);

        // Print the sorted array
        System.out.println("Sorted Array:");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.print(sortedArray[i] + " ");
        }
    }
}
