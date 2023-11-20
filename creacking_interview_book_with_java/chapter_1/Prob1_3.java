public class Prob1_3 {
    void printf(Object object) {
        System.out.print(object);
    }

    // Helper method to count occurrences of a character in the array
    // Time complexity: O(n), where n is the true length of the array
    int charCount(char[] st, char target, int trueLength) {
        int count = 0;
        for (int i = 0; i < trueLength; i++) {
            if (st[i] == target)
                count++;
        }
        return count;
    }

    // Main method to replace spaces in a character array with '%20'
    // Time complexity: O(n), where n is the true length of the array
    void replaceSpaces(char[] str, int trueLength) {
        int numberOfSpaces = charCount(str, ' ', trueLength);
        int newIndex = trueLength - 1 + numberOfSpaces * 2;

        // Ensure the array has sufficient space for the modified string
        if (newIndex + 1 < str.length) str[newIndex + 1] = '\0';

        // Iterate through the array in reverse order and replace spaces
        for (int oldIndex = trueLength - 1; oldIndex >= 0; oldIndex--) {
            if (str[oldIndex] == ' ') {
                str[newIndex] = '0';
                str[newIndex - 1] = '2';
                str[newIndex - 2] = '%';
                newIndex -= 3;
            } else {
                str[newIndex] = str[oldIndex];
                newIndex--;
            }
        }

        // Print the modified array
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]);
        }
    }

    public static void main(String[] args) {
        Prob1_3 prob1_3 = new Prob1_3();
        String st = "mr john smith ";
        char[] str = new char[100];

        // Copy characters from the input string to the character array
        for (int i = 0; i < st.length(); i++) {
            str[i] = st.charAt(i);
        }

        // Call the method to replace spaces and print the result
        prob1_3.replaceSpaces(str, st.length());
    }
}
