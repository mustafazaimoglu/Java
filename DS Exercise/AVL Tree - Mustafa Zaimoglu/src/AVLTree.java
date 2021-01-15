
public class AVLTree
{

    Node root;

    public AVLTree()
    {
        this.root = null;
    }

    public void insert(Expression e)
    {
        this.root = insertRecursive(this.root, e);
    }

    private Node insertRecursive(Node current, Expression e)
    {
        if (current == null)
        {
            return new Node(e);
        }

        switch (current.key.compareTo(e))
        {
            case 1:
                current.left = insertRecursive(current.left, e);
                break;
            case -1:
                current.right = insertRecursive(current.right, e);
                break;
            default:
                return current;
        }

        current.degree = updateDegree(current);
        current = checkBalance(current);

        return current;
    }

    public void delete(Expression e)
    {
        this.root = deleteRecursive(this.root, e);
    }

    private Node deleteRecursive(Node current, Expression e)
    {
        if (current == null)
        {
            return null;
        }

        if (current.key.compareTo(e) == 1)
        {
            current.left = deleteRecursive(current.left, e);
        }
        else if (current.key.compareTo(e) == -1)
        {
            current.right = deleteRecursive(current.right, e);
        }
        else if (current.key.isSame(e))
        {
            if (current.left == null && current.right == null)
            {
                return null;
            }
            else if (current.left == null)
            {
                return current.right;
            }
            else if (current.right == null)
            {
                return current.left;
            }
            else
            {
                Node lowest = findMinimumNode(current.right);
                current.key = lowest.key;
                current.right = deleteRecursive(current.right, current.key);
            }
        }

        current.degree = updateDegree(current);
        current = checkBalance(current);

        return current;
    }

    public void update(Expression antique, Expression fresh)
    {
        delete(antique);
        insert(fresh);
    }

    private Node checkBalance(Node current)
    {
        int balance = getBalance(current);

        if (balance > 1)
        {
            int subBalance = getBalance(current.left);
            if (subBalance >= 0)
            {
                return rightRotate(current);
            }
            else
            {
                current.left = leftRotate(current.left);
                return rightRotate(current);
            }
        }
        else if (balance < -1)
        {
            int subBalance = getBalance(current.right);
            if (subBalance <= 0)
            {
                return leftRotate(current);
            }
            else
            {
                current.right = rightRotate(current.right);
                return leftRotate(current);
            }
        }

        return current;
    }

    private Node leftRotate(Node current)
    {
        Node rightSide = current.right;
        Node backup = rightSide.left;

        rightSide.left = current;
        current.right = backup;

        current.degree = updateDegree(current);
        rightSide.degree = updateDegree(rightSide);

        return rightSide;
    }

    private Node rightRotate(Node current)
    {
        Node leftSide = current.left;
        Node backup = leftSide.right;

        leftSide.right = current;
        current.left = backup;

        current.degree = updateDegree(current);
        leftSide.degree = updateDegree(leftSide);

        return leftSide;
    }

    private Node findMinimumNode(Node x)
    {
        while (x.left != null)
        {
            x = x.left;
        }

        return x;
    }

    private int getDegree(Node x)
    {
        if (x == null)
        {
            return 0;
        }

        return x.degree;
    }

    private int getBalance(Node x)
    {
        if (x == null)
        {
            return 0;
        }

        return getDegree(x.left) - getDegree(x.right);
    }

    private int getMaximumDegree(Node x)
    {
        int left = getDegree(x.left);
        int right = getDegree(x.right);
        return (left > right) ? left : right;
    }

    private int updateDegree(Node x)
    {
        return 1 + getMaximumDegree(x);
    }

    public void printTree()
    {
        System.out.println("Tree : ");
        System.out.println(this.root);
        System.out.println();
    }

}
