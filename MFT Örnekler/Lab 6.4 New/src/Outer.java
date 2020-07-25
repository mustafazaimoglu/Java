
public class Outer
{
    private final String so = "This is Outer Class";
    
    public void display()
    {
        System.out.println(so);
    }
    
    public void test()
    {
        Inner mkz = new Inner();
        
        mkz.display();
    }
    
    class Inner 
    {
        public void display()
        {
            System.out.println("This is Inner Class");
        }
    }       
}
