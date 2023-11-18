package LinkedList;

public class SinglyLinkedList {
    // define a class for node
    static class Node{
        String data;
        Node next;
        Node(String data)
        {
            this.data = data;
            next = null;
        }
    }
    //0(n)
    public static Node deleteTailNode(Node head)
    {
        if(head==null)
        {
            System.out.println("List is empty..!");
            return head;
        }
        Node cur = head;
        Node prev = null;
        while (cur.next!=null) {
            prev = cur;
            cur = cur.next;
        }
        prev.next = null;
        return head;
        
    }
    //0(1)
    public static Node deleteHeadNode(Node head)
    {
        if(head==null){
            System.out.println("List is empty..!");
            return head;
        }
        return head.next;
    }

    // 0(n)
    public static Node insertInTail(String data, Node head)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            return newNode;
        }
        Node cur = head;
        while(cur.next != null)
        {
            cur = cur.next;
        }
        cur.next = newNode;
        return head;
    }

    //0(1)
    public static Node insertInHead(String data, Node head)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            return newNode;
        }
        // 1  |  2 next 1
        newNode.next = head;
        head = newNode;
        return head;
    }
    // 0(n)
    public static void printList(Node head)
    {
        if(head == null)
        {
            System.out.println("List is empty..!");
        }
        Node cur = head;
        while(cur!=null)
        {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }
    public static void main(String[] args)
    {
        Node node = null;
        node = insertInHead("Me", node);
        node = insertInHead("is", node);
        node = insertInHead("this", node);
        node = insertInTail("hello", node);
        node = deleteHeadNode(node);
        node = deleteTailNode(node);
        printList(node);
    }
}
