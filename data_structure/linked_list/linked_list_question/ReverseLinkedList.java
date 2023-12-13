package linked_list_question;

class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
}

class LinkedListImplementation{
    Node head;
    public void addNode(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public Node getHead(){
        return head;
    }
}
public class ReverseLinkedList {

    public void printList(Node node){
        while(node!=null){
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public Node reverseLinkedlist(Node node){
        Node prev = null;
        Node next = null;
        while(node!=null){
            next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }
        return prev;
    }

    public static void main(String[] args){
        LinkedListImplementation llp = new LinkedListImplementation();
        llp.addNode(10);
        llp.addNode(20);
        llp.addNode(30);
        Node head = llp.getHead();
        ReverseLinkedList rll = new ReverseLinkedList();
        rll.printList(head);
        head = rll.reverseLinkedlist(head);
        rll.printList(head);
        
    }
}
