package String;

public class StringMethods {
    // String most used built n function
    // Lets definre a variable st = "hello world..!"
    // 1. st.length()
    // 2. st.charAt(index) return the value of index
    // 3. st.toCharArray()
    // char[] arr = st.toCharArray();
    // for(char c: st.toCharArray())
    public static void printf(Object object){
        System.out.print(object);
    }
    public static void main(String[] args){
        String st = "hellow world";
        for(int i = 0; i < st.length(); i++)
        {
            char c = st.charAt(i);
            printf(c + "\n");
        }
        printf(st.codePointAt(0));
    }
}
