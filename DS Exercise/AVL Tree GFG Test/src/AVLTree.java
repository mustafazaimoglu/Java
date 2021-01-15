
public class AVLTree
{
    
    Node root;
    
    public AVLTree()
    {
        this.root = null;
    }
    
    void insert(int x)
    {
        this.root = insertRecursive(root, x);
    }
    
    private Node insertRecursive(Node current, int x)
    {
        if (current == null)
        {
            return new Node(x);
        }
        
        if (x > current.key)
        {
            current.right = insertRecursive(current.right, x);
        }
        else if (x < current.key)
        {
            current.left = insertRecursive(current.left, x);
        }
        else
        {
            return current;
        }
        
        current.height = 1 + maximum(getHeight(current.left), getHeight(current.right));
        
//        int balance = getBalance(current);
//        
//        if (balance > 1 && x < current.left.key)
//        {
//            return rightRotation(current);
//        }
//        
//        if (balance < -1 && x > current.right.key)
//        {
//            return leftRotation(current);
//        }
//        
//        if (balance > 1 && x > current.left.key)
//        {
//            current.left = leftRotation(current.left);
//            return rightRotation(current);
//        }
//        
//        if (balance < -1 && x < current.right.key)
//        {
//            current.right = rightRotation(current.right); 
//            return leftRotation(current);
//        }
        
        return current;
    }
    
    int maximum(int x, int y)
    {
        return (x > y) ? x : y;
    }
    
    Node rightRotation(Node x)
    {
        Node y = x.left;
        Node t = y.right;
        
        y.right = x;
        x.left = t;
        
        return y;
    }
    
    Node leftRotation(Node x)
    {
        Node y = x.right;
        Node t = y.left;
        
        y.left = x;
        x.right = t;
        
        return y;
    }
    
    int getHeight(Node x)
    {
        if (x == null)
        {
            return 0;
        }
        
        return x.height;
    }
    
    int getBalance(Node x)
    {
        if (x == null)
        {
            return 0;
        }
        
        return getHeight(x.left) - getHeight(x.right);
    }
    
    void displayTree()
    {
        System.out.println("Tree : ");
        System.out.println(this.root);
    }
}
