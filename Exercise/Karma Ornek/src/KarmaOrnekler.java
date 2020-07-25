public class KarmaOrnekler 
{
    public static void main (String [] Args)
    {
        System.out.print("-- ");
            
        System.out.println(10<<4);
    
        int a = 10;
        int b = 10;
    
        System.out.println(a++ + ++a);
        System.out.println(b++ + --b + b++);
        System.out.println("b = " + b);
    
        boolean x = false;
        boolean y = true;
        
        System.out.println("Y is "+ y +"  -_-");
        System.out.println("X is "+ x +" -_-");
        System.out.println("This is reverse of X = " + !x + " (Made By Using !)");
    
        System.out.println(~b); //toplam degerin 0 dan başlayarak sayılması ve negatif hali
        
        int t = 5;
        int k = 8;
        
        boolean p;
        
        p = t > k && k > t;
        
        System.out.println(p);
        System.out.println(k += 4);
        System.out.println(t += 10);
        
    }
    
}
