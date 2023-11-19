import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {

    // Function to add an undirected edge to the adjacency list
    // Time Complexity: O(1) - Adding an element to an ArrayList is constant time.
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int src, int dst)
    {
        adj.get(src).add(dst);
        adj.get(dst).add(src);
    }

    // Function to perform Breadth-First Search (BFS) on a graph
    // Time Complexity: O(V + E), where V is the number of vertices and E is the number of edges
    static void BFS(ArrayList<ArrayList<Integer>> adj, int V, int src)
    {
        boolean visited[] = new boolean[V];
        int cost[] = new int[V];

        // Initialize cost array to 0
        for(int i = 0; i < V; i++)
        {
            cost[i] = 0;
        }

        // Initialize visited array to false
        for(int i = 0; i < V; i++)
        {
            visited[i] = false;
        }

        // Create a queue for BFS
        Queue<Integer> queue = new LinkedList<Integer>();

        // Enqueue the source vertex and mark it as visited
        queue.add(src);
        visited[src] = true;

        // BFS loop
        while(!queue.isEmpty())
        {
            // Dequeue a vertex from the queue
            int p = queue.remove();

            // Process the dequeued vertex
            System.out.println(p);

            // Iterate through adjacent vertices of the dequeued vertex
            for(int c: adj.get(p))
            {
                // If the adjacent vertex is not visited, mark it as visited,
                // update the cost, and enqueue it
                if(!visited[c])
                {
                    visited[c] = true;
                    cost[c] = cost[p] + 1;
                    queue.add(c);
                }
            }
        }
    }

    // Function to initialize the adjacency list with empty ArrayLists
    // Time Complexity: O(V), where V is the number of vertices
    static void defineAdjList(ArrayList<ArrayList<Integer>> adj, int V)
    {
        for(int i = 0; i < V; i++)
        {
            adj.add(new ArrayList<Integer>());
        }
    }     

    // Main function to read input and call BFS
    // Overall Time Complexity depends on the input and the BFS function
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Read the number of vertices (V) and edges (E)
        int V = scanner.nextInt();
        int E = scanner.nextInt();

        // Create an adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);

        // Initialize the adjacency list
        defineAdjList(adj, V);

        // Read the edges and add them to the adjacency list
        for(int i = 0; i < E; i++)
        {
            int src = scanner.nextInt();
            int dsc = scanner.nextInt();
            addEdge(adj, src, dsc);
        }

        // Read the source vertex for BFS
        int src = scanner.nextInt();

        // Call BFS function
        BFS(adj, V, src);
    }
}
