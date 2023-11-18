package collection;
import java.util.Stack;

public class Stackk {
    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<Integer>();
        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);
        System.out.println(stack.peek());
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
    
}
