
public class Test
{
    public static void main(String[] args)
    {
        Daire daire1 = new Daire(3, "Daire");
        Kare kare1 = new Kare("Kare", 5);
        
        kare1.AlanHesapla();
        daire1.AlanHesapla();
        
        // Sekil sekil = new Sekil("Sekil"); Bozuktur Cunku Abstract Class da Govdesiz Method Vardir ve Calismaz.
        
        Sekil kare2 = new Kare("Yeni Kare", 6); //Baska Bir Kullanım Turudur. fakat hatalı olabılır kendı classını kullan!!!
        
        kare2.AlanHesapla();
        kare1.CevreHesapla(); //Burda Tanımlama yuzunden cevre hesabı kullanılabılır.
        // kare2.CevreHesapla(); Kullanılamıyor!!!!
        

    }
    
}
