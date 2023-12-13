import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node{
        int src;
        int dst;
        public Node(int src, int dst){
            this.src = src;
            this.dst = dst;
        }
}

public class BreadthFirstSearch {
    public BreadthFirstSearch(List<Node> adj[], int VERTEX){
        for(int i = 0; i < VERTEX; i++){
            adj[i] = new ArrayList<Node>();
        }
    }
    void addNode(List<Node> adj[], int src, int dst){
        adj[src].add(new Node(src, dst));
        adj[dst].add(new Node(src, dst));
    }
    void graphTraversal(List<Node> adj[], int VERTEX, int src){
        int[] visited = new int[VERTEX];
        int [] parent = new int[VERTEX];
        Arrays.fill(visited, 0);
        Arrays.fill(parent, 0);
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(src);
        while(q.size() != 0){
            int p = q.remove();
            visited[p] = 1;
            System.out.println(p);
            for(Node node: adj[p]){
                if(visited[node.dst] == 0){
                    q.add(node.dst);
                    visited[node.dst] = 1;
                    parent[node.dst] = parent[p] + 1;
                }
            }
        }
    }
    public static void main(String[] args){
        int VERTEX = 6;
        List<Node> adj[] = new ArrayList[VERTEX];
        BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch(adj, VERTEX);
        breadthFirstSearch.addNode(adj, 0, 1);
        breadthFirstSearch.addNode(adj, 0, 3);
        breadthFirstSearch.addNode(adj, 1, 2);
        breadthFirstSearch.addNode(adj, 2, 4);
        breadthFirstSearch.addNode(adj, 3, 5);
        breadthFirstSearch.graphTraversal(adj, VERTEX, 0);
    }
}
