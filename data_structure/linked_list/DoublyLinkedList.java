public class DoublyLinkedList<T>{
    public class Node{
        T val;
        Node prev, next;
        Node(T val){
            this.val = val;
            this.prev = this.next = null;
        }
    }
    Node head, tail;
    void addNodeInFront(T val){
        Node newNode= new Node(val);
        if(head==null && tail == null){
            head = newNode;
            tail = newNode;
            return;
        }
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }
    void addNodeInBack(T val){
        Node newNode= new Node(val);
        if(head==null && tail == null){
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.prev = tail;
        tail = newNode;
    }
    void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args){
        DoublyLinkedList<Integer> root = new DoublyLinkedList<Integer>();
        root.addNodeInFront(10);
        root.addNodeInFront(20);
        System.out.println("Print List : ");
    }
}