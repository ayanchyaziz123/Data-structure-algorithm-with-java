package LinkedList;

// Define a class for a singly linked list
public class SinglyLinkedList {
    
    // Define a static nested class for a node in the linked list
    static class Node {
        String data; // Data of the node
        Node next;   // Connection to the next node in the list

        // Constructor to create a node with data
        Node(String data) {
            this.data = data;
            next = null;
        }
    }

    // Method to delete the tail node of the linked list
    // Time complexity: O(n)
    public static Node deleteTailNode(Node head) {
        if (head == null) {
            System.out.println("List is empty..!");
            return head;
        }
        Node cur = head;
        Node prev = null;
        while (cur.next != null) {
            prev = cur;
            cur = cur.next;
        }
        prev.next = null;
        return head;
    }

    // Method to delete the head node of the linked list
    // Time complexity: O(1)
    public static Node deleteHeadNode(Node head) {
        if (head == null) {
            System.out.println("List is empty..!");
            return head;
        }
        return head.next;
    }

    // Method to insert a new node at the tail of the linked list
    // Time complexity: O(n)
    public static Node insertInTail(String data, Node head) {
        Node newNode = new Node(data);
        if (head == null) {
            return newNode;
        }
        Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = newNode;
        return head;
    }

    // Method to insert a new node at the head of the linked list
    // Time complexity: O(1)
    public static Node insertInHead(String data, Node head) {
        Node newNode = new Node(data);
        if (head == null) {
            return newNode;
        }
        newNode.next = head;
        head = newNode;
        return head;
    }

    // Method to print the elements of the linked list
    // Time complexity: O(n)
    public static void printList(Node head) {
        if (head == null) {
            System.out.println("List is empty..!");
        }
        Node cur = head;
        while (cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }

    // Main method to test the singly linked list
    public static void main(String[] args) {
        // Create an empty linked list
        Node node = null;

        // Add nodes at the head
        node = insertInHead("I", node);
        node = insertInHead("am", node);
        node = insertInHead("this", node);

        // Add a node at the tail
        node = insertInTail("hello", node);

        // Delete head and tail nodes
        node = deleteHeadNode(node);
        node = deleteTailNode(node);

        // Print the elements of the linked list
        printList(node);
    }
}
