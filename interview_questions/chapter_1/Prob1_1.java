import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//question: is Unique
// implement an algorithm  to determine if a string has all unique characters . 
// what if you can not use additional data structure
public class Prob1_1 {
    
    void printf(Object object) {
        System.out.print(object);
    }
    boolean isUnique4(String st) {
        int checker = 0;  // Initialize a checker variable with 0
    
        // Iterate through each character in the string
        for (int i = 0; i < st.length(); i++) {
            int val = st.charAt(i) - 'a';  // Calculate the difference to represent the character's position in the alphabet
    
            // Check if the bit at position 'val' in the 'checker' is already set
            // 
            //                                                                              
            if ((checker & (1 << val)) > 0) {
                // If the bit is set, it means the character has occurred before, so the string doesn't have all unique characters
                return false;
            }
    
            // Set the bit at position 'val' in the 'checker'
            checker |= (1 << val);
        }
    
        // If the loop completes, it means all characters are unique
        return true;
    }
    
    // Approach using a HashMap to count occurrences of each character
    // Time complexity: O(n), where n is the length of the input string
    boolean isUnique3(String st) {
        int n = st.length();
        Map<Character, Integer> mp = new HashMap<Character, Integer>();

        // Count occurrences of each character in the string
        for (int i = 0; i < n; i++) {
            char c = st.charAt(i);
            if (mp.containsKey(c)) {
                mp.put(c, mp.get(c) + 1);
            } else {
                mp.put(c, 1);
            }
        }

        // Check if any character occurs more than once
        for (Map.Entry entry : mp.entrySet()) {
            int val = (int) entry.getValue();
            if (val > 1) {
                return false;
            }
        }
        return true;
    }

    // Approach using sorting to detect repeated characters
    // Time complexity: O(n log n), where n is the length of the input string
    boolean isUnique2(String st) {
        int n = st.length();
        List<Character> arr = new ArrayList<Character>();

        // Convert string to a list of characters and sort it
        for (int i = 0; i < n; i++) {
            arr.add(st.charAt(i));
        }
        Collections.sort(arr);

        // Check for consecutive equal characters after sorting
        for (int i = 0; i < n - 1; i++) {
            if (arr.get(i) == arr.get(i + 1))
               return false;
        }
        return true;
    }

    // Approach using an array to track visited characters
    // Time complexity: O(n), where n is the length of the input string
    boolean isUnique1(String st) {
        int n = st.length();
        boolean[] visited = new boolean[256]; // Assuming ASCII characters

        // Check if a character has been visited before
        for (int i = 0; i < n; i++) {
            int ind = st.charAt(i);
            if (visited[ind])
               return false;
            visited[ind] = true;   
        }
        return true;
    }

    public static void main(String[] st) {
        Prob1_1 prob1_1 = new Prob1_1();
        prob1_1.printf(prob1_1.isUnique3("abcdd") + "\n");
    }
}
