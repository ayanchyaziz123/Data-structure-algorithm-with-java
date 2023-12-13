import java.util.Arrays;

public class BinarySearch {

    // Method to print an object without newline
    void printf(Object object) {
        System.out.print(object);
    }

    // Binary search method to find the target in a sorted array
    boolean binarySearch(int[] arr, int n, int target) {
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            // Calculate mid using (left + right) / 2 to avoid overflow
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                // Target found, return true
                return true;
            } else {
                // Adjust the search space based on comparison with the target
                if (arr[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        // Target not found, return false
        return false;
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();

        // Example array
        int[] arr = new int[]{4, 5, 1, 2, 3};

        // Sorting the array before binary search
        Arrays.sort(arr);

        // Performing binary search and printing the result
        binarySearch.printf(binarySearch.binarySearch(arr, arr.length, 4) + "\n");
    }
}
