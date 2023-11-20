import java.lang.reflect.Array;
import java.util.ArrayList;

public class AdjacencyList {
    static int V = 5; // Number of vertices in the graph

    // Method to add an edge to the adjacency list
    // Time Complexity: O(1)
    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int src, int dst) {
        adj.get(src).add(dst);
        adj.get(dst).add(src);
    }

    // Method to initialize the adjacency list for each vertex
    // Time Complexity: O(V), where V is the number of vertices
    public static void defineAdjList(ArrayList<ArrayList<Integer>> adj) {
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>()); // Create an empty ArrayList for each vertex
        }
        System.out.println(adj.size() + " ---->"); // Print the size of the adjacency list (for debugging)
    }

    // Method to print the adjacency list
    // Time Complexity: O(V + E), where V is the number of vertices and E is the number of edges
    public static void printAdjList(ArrayList<ArrayList<Integer>> adj) {
        for (int i = 0; i < adj.size(); i++) {
            System.out.print(i + " - > ");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    // Main method, entry point of the program
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);
        defineAdjList(adj); // Initialize the adjacency list
        addEdge(adj, 0, 1); // Add edges to the graph
        addEdge(adj, 1, 2);
        addEdge(adj, 2, 3);
        printAdjList(adj); // Print the adjacency list
    }
}
