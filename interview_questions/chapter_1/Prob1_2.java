import java.util.Arrays;

public class Prob1_2 {
    void printf(Object object) {
        System.out.print(object);
    }

    // Approach using character frequency arrays
    // Time complexity: O(n), where n is the length of the input strings
    boolean checkPermutation3(String st1, String st2) {
        if (st1.length() != st2.length())
            return false;

        int[] letters = new int[128]; // Assuming ASCII characters
        Arrays.fill(letters, 0);

        // Count character frequencies in the first string
        for (int i = 0; i < st1.length(); i++) {
            letters[st1.charAt(i)]++;
        }

        // Check character frequencies in the second string
        for (int i = 0; i < st2.length(); i++) {
            letters[st2.charAt(i)]--;

            // If a character frequency becomes negative, strings are not permutations
            if (letters[st2.charAt(i)] < 0) {
                return false;
            }
        }
        return true;
    }

    // Approach using two separate arrays to count character frequencies
    // Time complexity: O(n), where n is the length of the input strings
    boolean checkPermutation2(String st1, String st2) {
        if (st1.length() != st2.length())
            return false;

        int[] cnt1 = new int[128]; // Assuming ASCII characters
        int[] cnt2 = new int[128]; // Assuming ASCII characters
        Arrays.fill(cnt1, 0);
        Arrays.fill(cnt2, 0);

        // Count character frequencies in both strings
        for (int i = 0; i < st1.length(); i++) {
            int ind1 = st1.charAt(i) - 'a';
            int ind2 = st2.charAt(i) - 'a';
            cnt1[ind1]++;
            cnt2[ind2]++;
        }

        // Check if character frequencies are equal
        for (int i = 0; i < st1.length(); i++) {
            if (cnt1[st1.charAt(i) - 'a'] != cnt2[st2.charAt(i) - 'a'])
                return false;
        }
        return true;
    }

    // Approach using sorting
    // Time complexity: O(n log n), where n is the length of the input strings
    boolean checkPermutation(String st1, String st2) {
        if (st1.length() != st2.length())
            return false;

        char[] arr1 = new char[st1.length()];
        char[] arr2 = new char[st2.length()];

        // Convert strings to char arrays and sort them
        for (int i = 0; i < st1.length(); i++) {
            arr1[i] = st1.charAt(i);
            arr2[i] = st2.charAt(i);
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Check if the sorted char arrays are equal
        for (int i = 0; i < st1.length(); i++) {
            if (arr1[i] != arr2[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String st1 = "hello";
        String st2 = "hello";
        Prob1_2 prob1_2 = new Prob1_2();
        prob1_2.printf(prob1_2.checkPermutation2(st1, st2) + "\n");
    }
}
