package collection;
import java.util.LinkedList;
import java.util.Queue;

public class Queuee {
    public static void main(String[] args)
    {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println(queue.peek()); // for printing top
        System.out.println(queue.size());
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
    
}
