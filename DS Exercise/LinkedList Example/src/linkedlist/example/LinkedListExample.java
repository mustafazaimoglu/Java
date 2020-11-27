
package linkedlist.example;

public class LinkedListExample
{

    public static void main(String[] args)
    {
        LinkedList mkz = new LinkedList();
        mkz.add(new Plane("Antonov", 1980));
        mkz.display();
        mkz.add(new Plane("TUSAŞ", 2015));
        mkz.display();
        mkz.add(new Plane("Boeing", 2001));
        mkz.display();
        mkz.add(new Plane("Airbus", 2011));
        mkz.display();
        mkz.add(new Plane("Embraer", 1969));
        mkz.display();
    }
    
}
