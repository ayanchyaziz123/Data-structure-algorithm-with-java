import java.util.ArrayList;

public class Tries {
    static int SIZE = 26;

    static class Node{
        Node[] children = new Node[SIZE];
        boolean isEndOfWord;
        
        Node()
        {
            for(int i = 0; i < SIZE; i++)
                children[i] = null;
            isEndOfWord = false;
        }
    }
    static Node root = new Node();
    public static void insert(String st)
    {
        Node cur = root;
        for(int i = 0; i < st.length(); i++)
        {
            int ind = st.charAt(i) - 'a';
            
            if(cur.children[ind]== null)
                cur.children[ind] = new Node();
            
            cur = cur.children[ind];
        }
        
        cur.isEndOfWord = true;
    }
    public static boolean search(String st)
    {
        Node cur = root;
        for(int i = 0; i < st.length(); i++)
        {
            int ind = st.charAt(i) - 'a';
            if(cur.children[ind] == null)
                return false;
            if(root.isEndOfWord)
                return true;
            
            cur = cur.children[ind];
              
        }
        return true;
    }
    
    public static void main(String args[])
    {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("ayan");
        arr.add("nakib");
        arr.add("nakibuddin");
        arr.add("ayanchy");
        arr.add("tamima");
        for(int i = 0; i < arr.size(); i++)
        {
            insert(arr.get(i));
        }

        // System.out.println(search("ayan"));
        // System.out.println(search("nakib"));
        System.out.println(search("nakibuddin"));
    }
}
