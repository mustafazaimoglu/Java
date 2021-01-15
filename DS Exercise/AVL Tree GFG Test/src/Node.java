
public class Node
{

    int key;
    int height;
    Node left;
    Node right;

    public Node(int key)
    {
        this.key = key;
        this.height = 1;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString()
    {
        return "[" + key + "(" + (getBalance(this)) + "'" + height + ")" + "," + (left == null ? "<>" : "L" + left) + "," + (right == null ? "<>" : "R" + right) + "]";
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
}
