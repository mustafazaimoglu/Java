
public class Main
{
    public static void main(String[] args)
    {
        Shape shape[] = new Shape[3];
        
        shape[0] = new Circle("Daire");
        shape[1] = new Shape("Kare");
        shape[2] = new Triangle("Üçgen");
        
        for (int i = 0; i <  shape.length; i++)
        {
            shape[i].KimimBen();
            shape[i].Draw();
            shape[i].Erase();
            System.out.println();
        }
        
        Circle MKZ = new Circle("Daire1");
        
        System.out.println(MKZ);
        
        MKZ.AlanBul(5);
        
    }
    
}
