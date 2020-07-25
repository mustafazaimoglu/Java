
public class Main
{
    public static void main(String Args[])
    {
        Character chardizi[] = {'J','A','V','A'};
        
        Integer intdizi[] = {1,2,3,4,5,6};
        
        String stringdizi[] = {"Python","Java","C"};
        
        Ogrenci ogrencidizi[] = {new Ogrenci("Veli"),new Ogrenci("Ali"),new Ogrenci("Talu")};
        
        /*
        OgrenciYazdir.Yazdir(ogrencidizi);
        System.out.println("****************************************");
        IntegerYazdir.Yazdir(intdizi);
        System.out.println("****************************************");
        StringYazdir.Yazdir(stringdizi);
        System.out.println("****************************************");
        CharacterYazdir.Yazdir(chardizi);
        */
        YazdirmaSinifi<Integer> IY = new YazdirmaSinifi<>();
        YazdirmaSinifi<String> SY = new YazdirmaSinifi<>();
        YazdirmaSinifi<Character> CY = new YazdirmaSinifi<>();
        YazdirmaSinifi<Ogrenci> OY = new YazdirmaSinifi<>();
        
        IY.Yazdir(intdizi);
        System.out.println("****************************************");
        SY.Yazdir(stringdizi);
        System.out.println("****************************************");
        CY.Yazdir(chardizi);
        System.out.println("****************************************");
        OY.Yazdir(ogrencidizi);
                
    
    }
    
}
