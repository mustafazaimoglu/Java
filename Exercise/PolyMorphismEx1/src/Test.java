class Hayvan //Superclass
{
    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }
    
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    public String Konus()
    {
        return "Hayvan Konusuyur...";
    }
    
}

class Kedi extends Hayvan //Subclass
{
    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String Konus() {
        return (super.getIsim() + " Miyavliyor...");
    }
        
}

class Kopek extends Hayvan
{
    public Kopek(String isim)
    {
        super(isim);
    }
    
    @Override
    public String Konus()
    {
        return (super.getIsim() + " Havliyor...");
    }
}

class At extends Hayvan
{
    public At(String isim)
    {
        super(isim);
    }

    @Override
    public String Konus() {
        return (super.getIsim() + " Kişniyor...");
    }    
}


public class Test 
{
    public static void konustur(Hayvan hayvan)
    {
        System.out.println(hayvan.Konus());
    }
    
    public static void instancekonustur(Object object)
    {
        if (object instanceof Kedi)
        {
            Kedi kedi;
            kedi = (Kedi) object;
            
            System.out.println(kedi.Konus());
        }
        else if (object instanceof Kopek)
        {
            Kopek kopek = (Kopek) object;
            
            System.out.println(kopek.Konus());
        }
        else if (object instanceof At)
        {
            At at;
            at = (At) object;
            
            System.out.println(at.Konus());
        }
        else
        {
            Hayvan hayvan = (Hayvan) object;
            
            System.out.println(hayvan.Konus());
        }
    }
    
    public static void main(String[] Args)
    {
        
        Hayvan hayvan1 = new Kedi("Movik");
        
        System.out.println(hayvan1.Konus());
        
        Hayvan hayvan2 = new Kopek("Karabaş");
        
        System.out.println(hayvan2.Konus());
        
        Hayvan hayvan3 = new At("Grace's Secret");
        
        System.out.println(hayvan3.Konus());
        Hayvan hayvan = new Hayvan("Lee");
        System.out.println();
        
        
        System.out.println(hayvan.Konus());
        System.out.println();
        
        konustur(new Kedi("Movik"));
        konustur(new Kopek("Karabaş"));
        konustur(new At("Şahbatur"));
        konustur(hayvan3);
        
        System.out.println();
        
        instancekonustur(hayvan1);
        instancekonustur(hayvan);
        instancekonustur(hayvan2);
        instancekonustur(new Kedi("Temur"));
    }
    
}
