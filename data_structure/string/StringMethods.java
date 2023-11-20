package String;

public class StringMethods {

    public static void printf(Object object)
    {
        System.out.print(object);
    }
    public static void main(String[] args)
    {
        String st = "hellow world";
        for(int i = 0; i < st.length(); i++)
        {
            char c = st.charAt(i);
            printf(c + "\n");
        }
        printf(st.codePointAt(0));
        
    }
}
