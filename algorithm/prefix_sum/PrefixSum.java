public class PrefixSum {
    // Helper method to print objects
    public void printf(Object object) {
        System.out.println(object);
    }

    // Helper method to calculate prefix sum array
    // Time Complexity: O(n), where n is the length of the input array
    public int[] getPrefixSum(int[] arr, int length) {
        int[] prefixSum = new int[length];
        prefixSum[0] = arr[0];
        for (int index = 1; index < length; index++) {
            prefixSum[index] = prefixSum[index - 1] + arr[index];
        }
        return prefixSum;
    }

    // Efficient solution using prefix sum
    // Time Complexity: O(1) for each query after building the prefix sum array
    public int optimalSolution(int[] arr, int left, int right) {
        int[] prefixSum = getPrefixSum(arr, arr.length);
        if (left == 0) return prefixSum[right];
        return prefixSum[right] - prefixSum[left - 1];
    }

    // Brute force solution to calculate range sum
    // Time Complexity: O(right - left + 1), where 'left' and 'right' are the range boundaries
    public int bruteForce(int[] arr, int left, int right) {
        int totalSum = 0;
        for (int index = left; index <= right; index++) {
            totalSum += arr[index];
        }
        return totalSum;
    }

    public static void main(String[] args) {
        PrefixSum prefixSum = new PrefixSum();
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};

        // Print results for the brute force and optimal solutions
        prefixSum.printf("Brute Force: " + prefixSum.bruteForce(arr, 2, 3));
        prefixSum.printf("Optimal Solution: " + prefixSum.optimalSolution(arr, 2, 3));
    }
}
