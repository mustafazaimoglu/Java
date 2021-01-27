
public class Arithmetic implements ITest
{
    private int a;

    public Arithmetic(int a)
    {
        this.a = a;
    }
    
    @Override
    public void square()
    {
        System.out.println("Kare Alan : " + (a*a));
    }

    @Override
    public void triangle()
    {
        System.out.println("Ucgen Alan : " + (a*a*Math.PI));
    }
    
}
