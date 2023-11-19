import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int src, int dst)
    {
        adj.get(src).add(dst);
        adj.get(dst).add(src);
    }
    static void BFS(ArrayList<ArrayList<Integer>> adj, int V, int src)
    {
        boolean visited[] = new boolean[V];
        int cost[] = new int[V];
        for(int i = 0; i < V; i++)
        {
            cost[i] = 0;
        }
        for(int i = 0; i < V; i++)
        {
            visited[i] = false;
        }
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(src);
        while(!queue.isEmpty())
        {
            int p = queue.remove();
            visited[p] = true;
            System.out.println(p);
            for(int c: adj.get(p))
            {
                if(!visited[c])
                {
                    visited[c] = true;
                    cost[c] = cost[p] + 1;
                    queue.add(c);
                }
            }
        }
    }

    static void defineAdjList(ArrayList<ArrayList<Integer>> adj, int V)
    {
        for(int i = 0; i < V; i++)
        {
            adj.add(new ArrayList<Integer>());
        }
    }     
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int V = scanner.nextInt();
        int E = scanner.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);
        defineAdjList(adj, V);
        for(int i = 0; i < E; i++)
        {
            int src = scanner.nextInt();
            int dsc = scanner.nextInt();
            addEdge(adj, src, dsc);
        }
        int src = scanner.nextInt();
        BFS(adj, V, src);

    }
}
