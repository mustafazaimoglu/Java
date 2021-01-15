
public class Node
{

    Expression key;
    int degree;
    Node left;
    Node right;

    public Node(Expression key)
    {
        this.key = key;
        this.degree = 1;
        this.left = this.right = null;
    }

    @Override
    public String toString()
    {
        return "[" + key.result + "," + (left == null ? "<>" : "L" + left) + "," + (right == null ? "<>" : "R" + right) + "]";
//        return "[" + key + "(" + (getBalance(this)) +"b" + "'" + degree + "d" + ")" + "," + (left == null ? "<>" : "L" + left) + "," + (right == null ? "<>" : "R" + right) + "]";
    }

    private int getBalance(Node x)
    {
        if (x == null)
        {
            return 0;
        }

        return getDegree(x.left) - getDegree(x.right);
    }

    private int getDegree(Node x)
    {
        if (x == null)
        {
            return 0;
        }

        return x.degree;
    }

}
