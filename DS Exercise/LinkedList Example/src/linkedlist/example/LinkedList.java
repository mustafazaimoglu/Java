package linkedlist.example;

public class LinkedList
{

    Node first;

    public LinkedList()
    {
        this.first = null;
    }

    public void add(Plane p)
    {
        Node newNode = new Node(p);
        if (this.first == null)
        {
            this.first = newNode;
        }
        else
        {
            Node temp = this.first;
            if (temp.plane.getYear() > newNode.plane.getYear())
            {
                newNode.next = temp;
                this.first = newNode;
            }
            else
            {
                while (temp.next != null && temp.next.plane.getYear() < newNode.plane.getYear())
                {
                    temp = temp.next;
                }

                newNode.next = temp.next;
                temp.next = newNode;
                
            }

        }
    }

    public void display()
    {
        Node temp = this.first;
        int i = 0;
        System.out.println("Display : ");
        while (temp != null)
        {
            i++;
            System.out.println(i + ". " + temp.plane);
            temp = temp.next;
        }
    }

}
