import java.util.TreeMap;
public class TreeMapp {
    public static void main(String[] args){
        TreeMap<Integer, Character> treeMap = new TreeMap<Integer, Character>();
        treeMap.put(10, 'A');
        treeMap.put(2, 'B');
        treeMap.put(15, 'D');
        treeMap.forEach(((k, v)->{
            if(k==10){
                System.out.println(v);
            }
        }
        ) );
    }
}
