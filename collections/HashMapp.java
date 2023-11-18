package collection;
import java.util.HashMap;
import java.util.Map;

public class HashMapp {
    public static void main(String[] args)
    {
        HashMap<Integer, String> hp = new HashMap<Integer, String>();
        hp.put(1, "USA");
        hp.put(2, "Bangladesh");
        for(Map.Entry<Integer, String> entry: hp.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
