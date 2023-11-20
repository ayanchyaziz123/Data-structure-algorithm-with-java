package Stack;

public class LinkedListStack {
    static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            next = null;
        }
    }
    static Node head;

    public static Boolean empty(){
        return head == null ? true : false;
    }

    public static Node peek()
    {
        if(head==null)
        {
            System.out.println("Stack is empty..!");
        }
        return head;
    }

    public static void pop()
    {
        if(head==null)
        {
            System.out.println("Stack is empty..!");
            return;
        }
        head = head.next;
    }

    public static void push(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public static void printList()
    {
        Node cur = head;
        while(cur!=null)
        {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }
    
    
    public static void main(String[] args)
    {
        push(10);
        push(20);
        push(30);
        Node head = peek();
        System.out.println(head.data);
        printList();
    }
    
}
