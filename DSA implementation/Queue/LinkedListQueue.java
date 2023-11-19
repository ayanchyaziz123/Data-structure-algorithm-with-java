package Queue;

// Define a class for a linked list-based queue
public class LinkedListQueue {
    
    // Define a static nested class for a node in the linked list
    static class Node {
        int data;  // Data of the node
        Node next; // Reference to the next node in the list

        // Constructor to initialize a node with given data
        Node(int data) {
            this.data = data;
        }
    }

    static Node front, rear; // Static references to the front and rear of the queue

    // Method to check if the queue is empty
    public static Boolean empty() {
        // Queue is empty if both front and rear are null
        return front == null && rear == null ? true : false;
    }

    // Method to get the front node of the queue
    public static Node front() {
        // If front is null, the queue is empty
        if (front == null) {
            System.out.println("Queue is empty..!");
            return null;
        }
        return front;
    }

    // Method to get the rear node of the queue
    public static Node rear() {
        // If rear is null, the queue is empty
        if (rear == null) {
            System.out.println("Queue is Empty");
            return null;
        }
        return rear;
    }

    // Method to push a new element to the rear of the queue
    public static void push(int data) {
        Node newNode = new Node(data);

        // If rear is null, the queue is empty, set front and rear to the new node
        if (rear == null) {
            front = newNode;
            rear = newNode;
            return;
        }

        // Otherwise, add the new node to the rear of the queue
        rear.next = newNode;
        rear = newNode;
    }

    // Method to print the elements of the queue
    public static void printList() {
        Node cur = front;
        // Traverse the queue and print each element
        while (cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }

    // Main method to test the LinkedListQueue
    public static void main(String[] args) {
        // Push some elements to the queue
        push(10);
        push(20);
        push(30);
        push(40);

        // Print the elements of the queue
        printList();
    }
}
