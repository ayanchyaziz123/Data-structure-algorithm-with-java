import java.util.Arrays;

public class Prob1_4 {

    // ...
    void printf(Object object){
        System.out.print(object);
    }

    // Toggle the specified bit in the bit vector
    int toggleBit(int bitVector, int index) {
        if (index < 0) return bitVector;
        int mask = 1 << index;
        bitVector ^= mask;
        return bitVector;
    }

    // Check if at most one bit is set in the bit vector
    // Time Complexity: O(1) - constant time operation
    boolean checkAtMostOneBitSet(int bitVector) {
        return (bitVector & (bitVector - 1)) == 0;
    }

    // Create a bit vector representing the character frequencies
    // Time Complexity: O(n), where n is the length of the input string
    int createBitVector(String parse) {
        int bitVector = 0;
        for (char c : parse.toCharArray()) {
            int asciiVal = c - 'a';
            bitVector = toggleBit(bitVector, asciiVal);
        }
        return bitVector;
    }

    // Check if a permutation of the given string is a palindrome using a bit vector
    // Time Complexity: O(n), where n is the length of the input string
    boolean isPermutationPalindrome4(String parse) {
        int bitVector = createBitVector(parse);
        return checkAtMostOneBitSet(bitVector);
    }

    // Check if a permutation of the given string is a palindrome using character frequencies
    // Time Complexity: O(n), where n is the length of the input string
    boolean isPermutationPalindrome3(String parse) {
        int[] freqTable = new int[26];
        Arrays.fill(freqTable, 0);
        int oddCount = 0;
        for (char c : parse.toCharArray()) {
            int asciiVal = c - 'a';
            if (c > -1) {
                freqTable[asciiVal]++;
                if (freqTable[asciiVal] % 2 == 1) {
                    oddCount++;
                } else {
                    oddCount--;
                }
            }
        }
        return oddCount > 1 ? false : true;
    }

    // Check if at most one character frequency is odd
    // Time Complexity: O(1) - constant time operation
    boolean checkMaxOneOdd(int[] frequencies) {
        boolean foundOdd = false;
        for (int frequency : frequencies) {
            if (frequency % 2 == 1) {
                if (foundOdd)
                    return false;
                foundOdd = true;
            }
        }
        return true;
    }

    // Build a character frequency table for the given string
    // Time Complexity: O(n), where n is the length of the input string
    int[] buildCharFrequencyTable(String parse) {
        int[] frequencies = new int[26];
        Arrays.fill(frequencies, 0);
        for (int index = 0; index < parse.length(); index++) {
            int asciiValue = parse.charAt(index) - 'a';
            frequencies[asciiValue]++;
        }
        return frequencies;
    }

    // Check if a permutation of the given string is a palindrome using character frequencies
    // Time Complexity: O(n), where n is the length of the input string
    boolean isPermutationPalindrome2(String phrase) {
        int[] table = buildCharFrequencyTable(phrase);
        return checkMaxOneOdd(table);
    }

    // Check if a permutation of the given string is a palindrome using character frequencies
    // Time Complexity: O(n), where n is the length of the input string
    boolean isPermutationPalindrome(String st) {
        int[] frequencies = new int[26];
        Arrays.fill(frequencies, 0);
        for (int index = 0; index < st.length(); index++) {
            int asciiValue = st.charAt(index) - 'a';
            frequencies[asciiValue]++;
        }
        int oddCount = 0;
        for (int i = 0; i < st.length(); i++) {
            int ind = st.charAt(i) - 'a';
            if (frequencies[ind] % 2 == 1)
                oddCount++; 
        }
        return oddCount > 1 ? false : true;
    }

    public static void main(String[] args) {
        Prob1_4 prob1_4 = new Prob1_4();
        prob1_4.printf(prob1_4.isPermutationPalindrome2("aba") + "\n");
    }
}
