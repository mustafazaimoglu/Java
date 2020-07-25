public class Tester 
{
    // INHERITANCE BİR İS-A DİR!!
    public static void main(String[] Args)
    {
        Yonetici yonetici1 = new Yonetici("Mustafa KUZ", 10000, "IT", 15);
        Calisan calisan1 = new Calisan("Mustafa Zack KUZ", 3000, "IT");
        
        yonetici1.BilgileriGoster();
        System.out.println();
        calisan1.BilgileriGoster();
        
        yonetici1.DepartmanDegistir("Management");
        
        System.out.println();
        yonetici1.BilgileriGoster();
        
        yonetici1.SorumluSayısıDegistir(18);
        
        System.out.println();
        yonetici1.BilgileriGoster();
        
        System.out.println();
        calisan1.ZamYap(580);
        
        System.out.println();
        calisan1.BilgileriGoster();
        
    }
    
}
