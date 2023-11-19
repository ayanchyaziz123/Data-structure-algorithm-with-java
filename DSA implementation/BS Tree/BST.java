// Implementation of a Binary Search Tree (BST)
public class BST {
    
    // Node class to represent a node in the BST
    static class Node {
        int data;
        Node left, right;
        
        // Constructor to initialize the node with data
        Node(int data) {
            this.data = data;
        }
    }

    Node root; // Root of the BST

    // Method to insert a node iteratively into the BST
    // Time Complexity: O(log n) in average case, O(n) in the worst case (unbalanced tree)
    public static Node insert(Node root, int data) {
        Node prev = null;
        Node temp = root;
        while (temp != null) {
            prev = temp;
            if (temp.data < data)
                temp = temp.right;
            if (temp.data > data)
                temp = temp.left;
        }
        Node newNode = new Node(data);
        if (prev.data < data) {
            prev.right = newNode;
        } else {
            prev.left = newNode;
        }
        return newNode;
    }

    // Method to insert a node recursively into the BST
    // Time Complexity: O(log n) in average case, O(n) in the worst case (unbalanced tree)
    public static Node insertRec(Node root, int data) {
        Node newNode = new Node(data);
        if (root == null) {
            return newNode;
        }
        if (root.data < data)
            root.right = insertRec(root.right, data);
        else if (root.data > data)
            root.left = insertRec(root.left, data);
        return newNode;
    }

    // Main method to test the BST implementation
    public static void main(String args[]) {
        System.out.println("hello world..!");
        BST tree = new BST();

        // Insert nodes into the BST
        tree.root = insert(tree.root, 10);
        insert(tree.root, 20);
        insert(tree.root, 30);
        insert(tree.root, 9);
        insert(tree.root, 11);
    }
}
