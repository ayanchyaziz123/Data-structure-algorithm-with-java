// One way : There are three types of edits that can be performed on string s:
// insert a character, remove a character, or replace a character. Given two strings,
// write a function to check if they are one edit (or zero edit) away.

public class Prob1_5 {

    // Check if two strings are one (or zero) edit away by comparing characters.
    // Time Complexity: O(n), where n is the length of the shorter string.
    boolean oneEditAway2(String first, String second) {
        if (Math.abs(first.length() - second.length()) > 1) {
            return false;
        }
        String s1 = first.length() < second.length() ? first : second;
        String s2 = second.length() < first.length() ? second : first;
        int index1 = 0;
        int index2 = 0;
        boolean foundDifference = false;
        while (index2 < s2.length() && index1 < s1.length()) {
            if (s1.charAt(index1) != s2.charAt(index2)) {
                if (foundDifference) {
                    return false;
                }
                foundDifference = true;
                if (s1.length() == s2.length()) {
                    index1++;
                }
            } else {
                index1++;
            }
            index2++;
        }
        return true;
    }

    // Check if two strings are one edit away by allowing insertion of a character.
    // Time Complexity: O(n), where n is the length of the shorter string.
    boolean oneEditInsert(String s1, String s2) {
        int index1 = 0;
        int index2 = 0;
        while (index2 < s2.length() && index1 < s1.length()) {
            if (s1.charAt(index1) != s2.charAt(index2)) {
                if (index1 != index2) {
                    return false;
                }
                index2++;
            } else {
                index1++;
                index2++;
            }
        }
        return true;
    }

    // Check if two strings are one edit away by allowing replacement of a character.
    // Time Complexity: O(n), where n is the length of the strings.
    boolean oneEditReplace(String s1, String s2) {
        boolean foundDifference = false;
        for (int index = 0; index < s1.length(); index++) {
            if (s1.charAt(index) != s2.charAt(index)) {
                if (foundDifference) {
                    return false;
                }
                foundDifference = true;
            }
        }
        return true;
    }

    // Check if two strings are one (or zero) edit away.
    // Time Complexity: O(n), where n is the length of the shorter string.
    boolean oneEditAway(String first, String second) {
        if (first.length() == second.length()) {
            return oneEditReplace(first, second);
        } else if (first.length() + 1 == second.length()) {
            return oneEditInsert(first, second);
        } else if (first.length() - 1 == second.length()) {
            return oneEditInsert(first, second);
        }
        return false;
    }

    public static void main(String[] args) {
        Prob1_5 prob1_5 = new Prob1_5();
        System.out.println(prob1_5.oneEditAway2("pale", "ple"));
    }
}
