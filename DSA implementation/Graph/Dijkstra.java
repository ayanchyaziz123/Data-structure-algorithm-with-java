import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dijkstra {
    static int V, E;
    static Map <Integer, Integer>adj[] = new HashMap[V];

    public  void addEdge(int src, int dst, int cost)
    {
        adj[src].put(dst, cost);
        adj[dst].put(src, cost);
    }
    public void dijkstraAlgo()
    {
        
    }
    public void defineAdjList()
    {
        for(int i = 0; i < V; i++)
        {
            adj[i] = new HashMap<>();
        }
    }


    public static void main(String[] args)
    {
        Dijkstra dijkstra = new Dijkstra();
        Scanner scanner = new Scanner(System.in);
        V = scanner.nextInt();
        E = scanner.nextInt();
        dijkstra.defineAdjList();
        for(int i = 0; i < E; i++)
        {
            int src, dst, cost;
            src = scanner.nextInt();
            dst = scanner.nextInt();
            cost = scanner.nextInt();
            dijkstra.addEdge(src, dst, cost);
        }

    }
}
