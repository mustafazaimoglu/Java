
public class Test
{
    public static void main(String[] args)
    {
        Outer.Inner mkz = new Outer().new Inner();
        
        mkz.display();
              
        Outer mkz1 = new Outer();
        
        mkz1.display();
        mkz1.oooo();
    }
    
}
