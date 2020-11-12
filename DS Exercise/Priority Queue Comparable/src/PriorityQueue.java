

public class PriorityQueue 
{
private Araba arr[];
    private int head;
    private int tail;
    private int es;

    public PriorityQueue(int es)
    {
        arr = new Araba[es];
        this.es = 0;
        this.head = 0;
        this.tail = 0;
    }
    
    public void insert(Araba x)
    {
        if (!isFull())
        {
            if (tail == arr.length)
            {
                tail = 0;
            }
            arr[tail] = x;
            tail++;
            es++;
        }
        else
        {
            System.out.println("Queue is Full! " + x.getMarka() + " Eklenemedi!");
        }

    }

    public Araba remove()
    {
        if (!isEmpty())
        {
            Araba temp = arr[head];
            head++;
            if(head == arr.length)
            {
                head = 0;
            }
            es--;
            System.out.print("Remove : ");
            return temp;
        }
        else
        {
            System.out.println("Queue is Empty!");
            return null;
        }
    }
    
    public boolean isFull()
    {
        return es == arr.length;
    }

    public boolean isEmpty()
    {
        return es == 0;
    }

    public Araba peek()
    {
        if (!isEmpty())
        {
            Araba temp = arr[head];
            System.out.print("Peek : ");
            return temp;
        }
        else
        {
            System.out.println("Queue is Empty!");
            return null;
        }
    }

    public void print()
    {
        System.out.print("- [");

        for (int i = head; i < head + es; i++)
        {

            arr[i % arr.length].display();
            if(i != head + es - 1)
            {
                System.out.print(" , ");
            }
            
        }

        System.out.print("]\n");
    }

}
