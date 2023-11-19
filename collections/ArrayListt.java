import java.util.ArrayList;

public class ArrayListt {
    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        int size = arr.size();
        System.out.println(size);
        for(int i = 0; i < arr.size(); i++)
        {
            System.out.print(arr.get(i) + " ");
        }
    }
    
}
