import java.util.PriorityQueue;;

public class PriorityQueuee {
    public static void main(String[] args)
    {
        PriorityQueue<Integer> pQueuee = new PriorityQueue<Integer>();
        pQueuee.add(10);
        pQueuee.add(20);
        pQueuee.add(200);
        pQueuee.add(100);
        while (!pQueuee.isEmpty()) {
            System.out.println(pQueuee.remove());
        }
    }
}
