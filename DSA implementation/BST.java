public class BST {
    static class Node{
        int data;
        Node left, right;
        Node(int data)
        {
            this.data = data;
        }
    }
    Node root;

    public static Node insert(Node root, int data)
    {
        Node prev = null;
        Node temp = root;
        while(temp!=null)
        {
            prev = temp;
            if(temp.data < data)
                temp = temp.right;
            if(temp.data > data)
                temp = temp.left;       
        }
        Node newNode = new Node(data);
        if(prev.data < data)
        {
            prev.right = newNode;
        }
        else{
            prev.left = newNode;
        }
        return newNode;
    }

    /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
    public static Node insertRec(Node root, int data)
    {
        Node newNode = new Node(data);
        if(root == null){
            return newNode;
        }
        // 10 < 11
        // root.right = 
        if(root.data < data)
            root.right = insertRec(root.right, data);
        else if(root.data > data)
            root.left = insertRec(root.left, data); 
        return newNode;               
    }

    public static void main(String args[])
    {
        System.out.println("hello world..!");
        BST tree = new BST();
        /*[10, 20, 30, 9, 11, ]
         *         10
         *        /  \
         *       9    20
         *           /  \
         *         11    30
         * 
         * 
        */
    
        tree.root = insert(tree.root, 10);
        insert(tree.root, 20);
    }
    
}
