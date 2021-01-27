
public class TwoThreeFourTree
{

    Node root;

    public TwoThreeFourTree()
    {
        this.root = null;
    }

    public void insert(int x)
    {
        this.root = insertRecursive(root, null, x);
    }

    public Node insertRecursive(Node current, Node currentParent, int x)
    {
        Node tempParent = null;
//        print(currentParent);
        
        if (current == null)
        {
            Node newNode = null;

            if (currentParent == null)
            {
                newNode = new Node(x);
            }

            return newNode;
        }
        else if (current.isLeaf())
        {
            if (!current.leftChange || !current.middleChange || !current.rightChange)
            {
                int falseCount = current.falseCount();

                if (falseCount == 2)
                {
                    if (current.leftKey > x)
                    {
                        current.middleKey = current.leftKey;
                        current.leftKey = x;
                    }
                    else
                    {
                        current.middleKey = x;
                    }

                    current.middleChange = true;
                }
                else if (falseCount == 1)
                {
                    if (current.leftKey > x)
                    {
                        current.rightKey = current.middleKey;
                        current.middleKey = current.leftKey;
                        current.leftKey = x;
                    }
                    else if (current.middleKey > x)
                    {
                        current.rightKey = current.middleKey;
                        current.middleKey = x;
                    }
                    else
                    {
                        current.rightKey = x;
                    }

                    current.rightChange = true;
                }

                return current;
            }
            else
            {
                if (currentParent == null)
                {
                    tempParent = new Node(current.middleKey);
                    Node right = new Node(current.rightKey);

                    current.middleKey = 0;
                    current.middleChange = false;
                    current.rightKey = 0;
                    current.rightChange = false;

                    tempParent.leftNode = current;
                    tempParent.rightNode = right;

                    tempParent = insertRecursive(tempParent, currentParent, x);
                    return tempParent;
                }
                else
                {
                    int falseCount = currentParent.falseCount();

                    if (falseCount == 2)
                    {
                        Node tempNode;

                        if (currentParent.leftKey > current.middleKey)
                        {
                            currentParent.middleKey = currentParent.leftKey;
                            currentParent.leftKey = current.middleKey;

                            tempNode = new Node(current.rightKey);
                            current.rightKey = 0;
                            current.rightChange = false;
                        }
                        else
                        {
                            currentParent.middleKey = current.middleKey;

                            tempNode = new Node(current.leftKey);

                            current.leftKey = current.rightKey;
                            current.rightKey = 0;
                            current.rightChange = false;
                        }

                        currentParent.middleLeftNode = tempNode;
                        current.middleKey = 0;
                        current.middleChange = false;
                        currentParent.middleChange = true;
                    }
                    else if (falseCount == 1)
                    {
                        Node tempNode;

                        if (currentParent.leftKey > current.middleKey)
                        {
                            currentParent.rightKey = currentParent.middleKey;
                            currentParent.middleKey = currentParent.leftKey;
                            currentParent.leftKey = current.middleKey;

                            tempNode = new Node(current.rightKey);
                            current.rightKey = 0;
                            current.rightChange = false;

                            currentParent.middleRightNode = currentParent.middleLeftNode;
                            currentParent.middleLeftNode = tempNode;
                        }
                        else if (currentParent.middleKey > current.middleKey)
                        {
                            currentParent.rightKey = currentParent.middleKey;
                            currentParent.middleKey = current.middleKey;

                            tempNode = new Node(current.rightKey);
                            current.rightKey = 0;
                            current.rightChange = false;

                            currentParent.middleRightNode = tempNode;
                        }
                        else
                        {
                            currentParent.rightKey = current.middleKey;

                            tempNode = new Node(current.leftKey);
                            current.leftKey = current.rightKey;
                            current.rightKey = 0;
                            current.rightChange = false;

                            currentParent.middleRightNode = tempNode;
                        }

                        current.middleKey = 0;
                        current.middleChange = false;
                        currentParent.rightChange = true;
                    }
                    else
                    {
                        tempParent = new Node(currentParent.middleKey);
                        Node right = new Node(currentParent.rightKey);
                        right.leftNode = currentParent.middleRightNode;
                        right.rightNode = currentParent.rightNode;
                        currentParent.rightNode = currentParent.middleLeftNode;

                        currentParent.middleLeftNode = currentParent.middleRightNode = null;
                        currentParent.middleKey = 0;
                        currentParent.middleChange = false;
                        currentParent.rightKey = 0;
                        currentParent.rightChange = false;

                        tempParent.leftNode = currentParent;
                        tempParent.rightNode = right;
                        tempParent = insertRecursive(tempParent, tempParent, x);

                        System.out.println("asdasdohasdoısadıosandgıoasndısaas");
                        print(tempParent);
                        System.out.println("ahoıgnaoınganugnhdsdfsdfsfsdfsdffg");

//                        currentParent = tempParent;
//                        return tempParent;
                    }

                    insert(x);
//                    currentParent = insertRecursive(currentParent, currentParent, x);
                }
            }
        }

        if (current.leftKey > x)
        {
            current.leftNode = insertRecursive(current.leftNode, current, x);
        }
        else if (current.leftKey < x && current.middleKey > x)
        {
            current.middleLeftNode = insertRecursive(current.middleLeftNode, current, x);
        }
        else if (current.middleKey < x && current.rightKey > x)
        {
            current.middleRightNode = insertRecursive(current.middleRightNode, current, x);
        }
        else if (current.rightKey < x)
        {
            current.rightNode = insertRecursive(current.rightNode, current, x);
        }
        
        if(current.isFull())
        {
            System.out.println("4SS4S4SS4S4S5S5SADSASA5DADS4SA4AS4DAS4DAS45DSA45DSA4");
        }


//        System.out.println("PARENT ");
//        print(currentParent);
//        System.out.println("CURRENT");
//        print(current);
//        System.out.println("X");
//        System.out.println(x);
//        System.out.println("FINITOOOOOOOOOO");
//        
        return current;
    }
    


    public boolean isEmpty()
    {
        return root == null;
    }

    public void print(Node x)
    {
        System.out.println("Tree : ");
        System.out.println(x);
    }

    public void print()
    {
        System.out.println("Tree : ");
        System.out.println(root);
    }

}
