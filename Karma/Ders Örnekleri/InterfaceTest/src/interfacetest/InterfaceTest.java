
package interfacetest;

public class InterfaceTest
{

    public static void main(String[] args)
    {
        Kare kare = new Kare(4,4);
        
        System.out.println(kare.CevreHesapla());
        
        Ucgen ucgen = new Ucgen(5, 7, 10);
        
        System.out.println(ucgen.CevreHesapla());
    }
}
