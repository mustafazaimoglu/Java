
public class Circle extends Shape
{
    public Circle(String isim)
    {
        super(isim);
    }
    
    public void AlanBul(int Yaricap)
    {
        System.out.println(getIsim() + " Alani : " + (Yaricap * Yaricap * 3.14));
    }

    @Override
    public String toString()
    {
        return "Circle{" + '}';
    }
    
    
   
    

}
