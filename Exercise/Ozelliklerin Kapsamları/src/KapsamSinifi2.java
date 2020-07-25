
public class KapsamSinifi2
{
    private int privateDegisken = 30;

    public KapsamSinifi2()
    {
        System.out.println("privateDegisken : " + privateDegisken);        
    }
    
    public void innerClassTest()
    {
        // Inner Class da olsa Kapsam Class2 nin içinde bu sebeple calısır.
        
        DahiliSinif mkz = new DahiliSinif();
        
        System.out.println(mkz.a);
    }
    
    public class DahiliSinif
    {
        private int privateDegisken = 20;
        private int a = 3;
        
        public void onilecarp()
        {
            //fonk içindeki local kullanildi!!
            int privateDegisken = 10;
            for (int i = 1; i < 6; i++)
            {
                System.out.println(i + "*" + privateDegisken + " = " + (i * privateDegisken) );
            }
            System.out.println();
        }
        
        public void onilecarp1()
        {
            //Bir class içindeki en local için this kullanilir!!
            for (int i = 1; i < 6; i++)
            {
                System.out.println(i + "*" + this.privateDegisken + " = " + (i * this.privateDegisken) );
            }
            System.out.println();
        }
        
        public void onilecarp2()
        {
            // Inner class içinde en distaki için class ismi.this kullanılır!!
            for (int i = 1; i < 6; i++)
            {
                System.out.println(i + "*" + KapsamSinifi2.this.privateDegisken + " = " + (i * KapsamSinifi2.this.privateDegisken) );
            }
            System.out.println();
        }
        
    }
    
    
}
