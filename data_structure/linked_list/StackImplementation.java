package LinkedList;
import java.util.EmptyStackException;

// Implementation of a stack with special features
public class StackImplementation {
    int size = 0;
    
    // Class definition for a node in the stack
    static class Node {
        int data;
        Node next;
        
        // Constructor for node creation
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    Node head; // Top of the stack
    
    // Add an element to the stack
    // Time complexity: O(1)
    public void push(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    
    // Peek at the top element of the stack
    // Time complexity: O(1)
    public void peek() {
        if (head == null) {
            System.out.println("Empty stack");
        }
        System.out.println("The top is: " + head.data);
    }
    
    // Pop an element from the stack
    // Time complexity: O(1)
    public void pop() {
        if (head == null) throw new EmptyStackException();
        head = head.next;
        size--;
        System.out.println("Pop successfully");
    }
    
    // Check if the stack is empty
    // Time complexity: O(n)
    public boolean empty() {
        return size == 0 ? true : false;
    }
    
    // Print the elements of the stack
    // Time complexity: O(n)
    public void printStack() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    // Main method to test the stack implementation
    public static void main(String args[]) {
        StackImplementation st = new StackImplementation();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(5);
        System.out.println(st.empty());
        st.printStack();
        //st.peek();
        st.pop();
        st.printStack();
        System.out.println("Size of stack is: " + st.size);
    }
}
