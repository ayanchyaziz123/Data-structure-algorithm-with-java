import java.util.ArrayList;

public class AdjacencyMatrix {
    public static void main(String[] args) {
        // Create an ArrayList to represent an adjacency matrix
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        // Loop to initialize the adjacency matrix
        for (int i = 0; i < 5; i++) {
            // Create a temporary ArrayList to represent a row in the matrix
            ArrayList<Integer> temp = new ArrayList<Integer>();

            // Nested loop to populate each element in the row
            for (int j = 0; j < 5; j++) {
                temp.add(i + j); // Populate each element with the sum of row index and column index
            }

            // Add the row (temp) to the adjacency matrix (adj)
            adj.add(temp);
        }

        // Print the adjacency matrix
        System.out.println(adj);
    }
}
