import java.util.ArrayList;
import java.util.TreeMap;
import java.util.List;
import java.util.PriorityQueue;


public class Dijkstra {
    class Node{
    int dst;
    int cst;
    int src;
    public Node(int src, int dst, int cst){
        this.src = src;
        this.dst = dst;
        this.cst = cst;
    }
}
   public Dijkstra(List<Node> adj[], int VERTEX){
        for(int i = 0; i < VERTEX; i++){
            adj[i] = new ArrayList<Node>();
        }
    }

    public void addEdge(List<Node> adj[], int src, int dst, int cst){
        adj[src].add(new Node(src, dst, cst));
        adj[dst].add(new Node(src,dst, cst));
    }
    public void traversalDj(List<Node> adj[], int src, int VERTEX){
        PriorityQueuee<Integer> pq = new PriorityQueuee<Integer>();
    }
    public static void main(String[] args){
        int VERTEX = 5;
        List<Node> adj[] = new ArrayList[VERTEX]; 
        Dijkstra dijkstra = new Dijkstra(adj, VERTEX);
         dijkstra.addEdge(adj, 0, 1, 8);
        dijkstra.addEdge(adj, 0, 2, 10);
        dijkstra.addEdge(adj, 2, 3, 15);
        dijkstra.addEdge(adj, 3, 4, 5);
        dijkstra.traversalDj(adj, 0, VERTEX);
    }
}
