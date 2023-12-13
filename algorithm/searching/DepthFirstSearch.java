import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DepthFirstSearch {
    int VERTEX;
    List<Integer>[] adj;
    boolean[] visited;
    int[] cost;
    List<Integer> ans;
    public DepthFirstSearch(int VERTEX){
        this.VERTEX = VERTEX;
        visited = new boolean[VERTEX];
        cost = new int[VERTEX];
        ans = new ArrayList<Integer>();
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
        for(int x: adj[src]){
            if(!visited[x]){
                System.out.println(x);
                visited[x] = true;
                graphTraversal(x);
            }
        }
    }
    public static void main(String[] args){
        int VERTEX = 5;
        DepthFirstSearch dfs = new DepthFirstSearch(VERTEX);
        dfs.addEdge(0, 1);
        dfs.addEdge(0, 2);
        dfs.addEdge(2, 3);
        dfs.addEdge(1, 3);
        dfs.addEdge(3, 4);
        dfs.graphTraversal(0);
    }
}
