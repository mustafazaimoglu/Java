
public class Tester
{
    public static void main(String[] args)
    {
        Seyirci seyirci1 = new Seyirci("Mustafa");
        Seyirci seyirci2 = new Seyirci("Mehmet");
        Seyirci seyirci3 = new Seyirci("Batuhan");
        
        System.out.println("Toplam Izleyici : " + Seyirci.getSeyirciSayisi()); //Bunun calısması için method static olmalı!!!
        System.out.println("Toplam Izleyici : " + seyirci1.getSeyirciSayisi());
        
        seyirci1.calis();
        
    }
    
}
