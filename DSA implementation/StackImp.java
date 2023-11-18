import java.util.EmptyStackException;
public class StackImp {
    int size = 0;
    static class Node
    {
        int data;
        Node next;
        // constructor
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    // 0(1)
    public void push(int data)
    {
        Node newNode = new Node(data);
        size++;
        if(head == null)
        {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    //0(1)
    public void peek()
    {
        if(head == null)
        {
            System.out.println("Empty stack");
        }
        System.out.println("The top is : " + head.data);
    }
    //0(1)
    public void pop()
    {
        if(head == null) throw new EmptyStackException();
        head = head.next;
        size--;
        System.out.println("Pop successfully");
    }
    //0(n)
    public boolean  empty()
    {
        return size == 0 ? true : false;
    }
    // 0(n)
    public  void printStack(){
        Node temp = head;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String args[])
    {
        StackImp st = new StackImp();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(5);
        System.out.println(st.empty());
        st.printStack();
        //st.peek();
        st.pop();
        st.printStack();
        System.out.println("size of stack is : " + st.size);
    }
}
