import java.util.LinkedList;


public class Prob4_1 {
    class Graph{
        public Node[] nodes;
        Graph(int V){
            for(int i = 0; i < V; i++){
                nodes[i] = null;
            }
        }
        Node[] getNodes(){
            return nodes;
        }
    }
    class Node{
        public String name;
        public Node[] children;
    }
    enum State {unvisited, visited, visiting};
    bool search(Graph g, Node start, Node end){
        LinkedList<Node> q = new LinkedList<Node>();
        for(Node u: g.getNodes());{
            u.State = State.unvisited;
        }
        start.State = State.visiting;
        q.add(state);
        Node u;
        while(!q.isEmpty()){
            u = q.removeFirst(); // dequeu
            if(u!=null){
                for(Node v: u.getAdjecent()){
                    if(v.state == State.unvisited){
                        if(v == end){
                            return true;
                        }
                        else{
                            v.state = State.visiting;
                            q.add(v);
                        }
                    }
                }
            }
            u.state = State.visited;
        }
        return false;
    }
    public static void main(String[] args){

    }
}
