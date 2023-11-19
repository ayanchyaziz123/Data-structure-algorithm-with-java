package Stack;

public class ArrayStack {
    static int top = -1;
    static int SIZE = 20;
    public static void push(int arr[], int val)
    {
        if(top+1 == SIZE)
        {
            System.out.println("Stack overflow");
            return;
        }
        top++;
        arr[top] = val;
    }
    public static int peek()
    {
        return top;
    }
    public static void pop()
    {
        top--;
    }
    public static boolean empty(int arr[])
    {
        return top==-1 ? true : false;
    }
    public static void printList(int arr[])
    {
        for(int i = top; i >= 0; i--)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args)
    {
        int arr[] = new int[SIZE];
        push(arr, 10);
        push(arr, 20);
        push(arr, 99);
        pop();

        printList(arr);
    }
}
