
public class Matematik
{
    private static double PI = Math.PI;
    
    public static class Alan
    {
        public static void daireAlan(int Yaricap)
        {
            System.out.println("Daire Alanı : " + (PI * Yaricap * Yaricap));
        }
        
        public void daireCevre(int Yaricap)
        {
            System.out.println("Daire Cevre : " + (2 * PI * Yaricap));
        }
        
    }
    
    public static class KareAlan
    {
        public void karealan(int Kenar)
        {
            System.out.println("Kare Alan : " + (Kenar * Kenar));
        }
        
        public static void karecevre(int Kenar)
        {
            System.out.println("Kare Cevre : " + (4 * Kenar));
        }
    }
    
}
