public class GenericClass<T> {
    class Node{
        T data;
        public Node(T data)
        {
            this.data = data;
        }
    }

    public static void main(String[] args)
    {
        GenericClass<Integer> gc = new GenericClass<Integer>();


    }
    
}
