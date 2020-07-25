
public class KapsamSinifi
{
    // Ayni isimli değiskenlerde en locali kullanılır!!!
    private int privateDegisken = 30;

    public KapsamSinifi()
    {
        System.out.println("privateDegisken : " + privateDegisken);
    }
    
    public void onilecarp()
    {
       // int privateDegisken = 10;
        
        for (int i = 1; i < 6; i++)
        {
            System.out.println(i + "*" + privateDegisken + " = " + (i * privateDegisken) );
        }
    }
    
    
}
