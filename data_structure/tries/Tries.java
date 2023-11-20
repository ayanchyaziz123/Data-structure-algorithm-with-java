import java.util.ArrayList;

// Implementation of a Trie data structure
public class Tries {
    static int SIZE = 26;

    // Node class for Trie
    static class Node {
        Node[] children = new Node[SIZE];
        boolean isEndOfWord;

        // Constructor to initialize the node
        Node() {
            for (int i = 0; i < SIZE; i++)
                children[i] = null;
            isEndOfWord = false;
        }
    }

    static Node root = new Node();

    // Method to insert a word into the Trie
    // Time Complexity: O(m), where m is the length of the word being inserted
    public static void insert(String st) {
        Node cur = root;
        for (int i = 0; i < st.length(); i++) {
            int ind = st.charAt(i) - 'a';

            if (cur.children[ind] == null)
                cur.children[ind] = new Node();

            cur = cur.children[ind];
        }

        cur.isEndOfWord = true;
    }

    // Method to search for a word in the Trie
    // Time Complexity: O(m), where m is the length of the word being searched
    public static boolean search(String st) {
        Node cur = root;
        for (int i = 0; i < st.length(); i++) {
            int ind = st.charAt(i) - 'a';
            if (cur.children[ind] == null)
                return false;
            if (cur.isEndOfWord)
                return true;

            cur = cur.children[ind];
        }
        return true;
    }

    public static void main(String args[]) {
        // ArrayList of words to insert into the Trie
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("ayan");
        arr.add("nakib");
        arr.add("nakibuddin");
        arr.add("ayanchy");
        arr.add("tamima");

        // Insert each word into the Trie
        for (int i = 0; i < arr.size(); i++) {
            insert(arr.get(i));
        }

        // Uncomment the lines below to test the search functionality
        // System.out.println(search("ayan"));
        // System.out.println(search("nakib"));
        System.out.println(search("nakibuddin"));
    }
}
