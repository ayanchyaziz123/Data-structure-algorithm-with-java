package collection;
import java.util.ArrayList;

public class ArrayListt {
    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        for(int i = 0; i < arr.size(); i++)
        {
            System.out.print(arr.get(i) + " ");
        }
    }
    
}