
public class Node
{

    Node leftNode;
    int leftKey;
    boolean leftChange;
    Node middleLeftNode;
    int middleKey;
    boolean middleChange;
    Node middleRightNode;
    int rightKey;
    boolean rightChange;
    Node rightNode;

    public Node(int leftKey)
    {
        this.leftKey = leftKey;
        leftChange = true;
        this.middleKey = 0;
        middleChange = false;
        this.rightKey = 0;
        rightChange = false;
        this.leftNode = this.middleLeftNode = this.middleRightNode = this.rightNode = null;
    }

    public int falseCount()
    {
        int mkz = 0;

        if (!leftChange)
        {
            mkz++;
        }

        if (!middleChange)
        {
            mkz++;
        }

        if (!rightChange)
        {
            mkz++;
        }

        return mkz;
    }

    public boolean isFull()
    {
        return leftChange && middleChange && rightChange;
    }

    public boolean isLeaf()
    {
        return this.leftNode == null && this.middleLeftNode == null && this.middleRightNode == null && this.rightNode == null;
    }

    @Override
    public String toString()
    {
        return "[" + (leftNode == null ? "<>" : "LN= " + leftNode) + ", LK=" + leftKey + ", " + (middleLeftNode == null ? "<>" : "MLN= " + middleLeftNode) + ", ML=" + middleKey + ", " + (middleRightNode == null ? "<>" : "MRN= " + middleRightNode) + ", RK=" + rightKey + ", " + (rightNode == null ? "<>" : "RN= " + rightNode) + "]";
//        return "[" + "LK=" + leftKey + ", " + "ML=" + middleKey + ", " + "RK=" + rightKey + ", " + (leftNode == null ? "<> " : "LN= " + leftNode) + (middleLeftNode == null ? "<> " : "MLN= " + middleLeftNode) + (middleRightNode == null ? "<> " : "MRN= " + middleRightNode) + (rightNode == null ? "<> " : "RN= " + rightNode) + "]";
    }

}
