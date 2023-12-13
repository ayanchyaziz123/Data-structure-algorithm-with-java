import java.util.List;
import java.util.Queue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;


public class BreadthFirstSearch {
    int VERTEX;
    List<Integer>[] adj;
    boolean[] visited;
    int[] cost;
    public BreadthFirstSearch(int VERTEX){
        this.VERTEX = VERTEX;
        visited = new boolean[VERTEX];
        cost = new int[VERTEX];
        adj = new ArrayList[VERTEX];
        for(int i = 0; i < VERTEX; i++){
            adj[i] = new ArrayList<Integer>();
        }
        Arrays.fill(visited, false);
        Arrays.fill(cost, 0);
    }
    public void addEdge(int src, int dst){
        adj[src].add(dst);
        adj[dst].add(src);
    }

    public void graphTraversal(int src){
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(src);
        visited[src] = true;
        while(!q.isEmpty()){
            int pr = q.remove();
            System.out.println(pr);
            for(int x: adj[pr]){
                if(!visited[x]){
                    q.add(x);
                    visited[x] = true;
                    cost[x] = cost[pr] + 1;
                }
            }
        }
    }

    public static void main(String[] args){
        int VERTEX = 5;
        BreadthFirstSearch bfs = new BreadthFirstSearch(VERTEX);
        bfs.addEdge(0, 1);
        bfs.addEdge(0, 2);
        bfs.addEdge(2, 3);
        bfs.addEdge(1, 3);
        bfs.addEdge(3, 4);
        bfs.graphTraversal(0);
    }
}
