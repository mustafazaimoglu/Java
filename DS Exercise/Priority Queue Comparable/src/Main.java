
public class Main
{
    public static void main(String[] args)
    {
        PriorityQueue q = new PriorityQueue(4);
        
        q.peek();
        q.print();
        q.insert(new Araba("Renault", "Kangoo", 2012));
        q.print();
        q.insert(new Araba("Mazda", "RX - 7", 2004));
        q.print();
        q.insert(new Araba("Porsche", "911 Turbo S", 2020));
        q.print();
        q.insert(new Araba("Tesla", "Model S", 2020));
        q.print();
        q.remove().display();
        System.out.println();
        q.print();
        q.insert(new Araba("Nissan", "R34 Skyline", 2000));
        q.print();
        q.peek().display();
        System.out.println();
        q.print();
        q.insert(new Araba("Toyota", "Supra", 2002));
        q.print();
    }
}
