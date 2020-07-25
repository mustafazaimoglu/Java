
public class Tester 
{
    public static void main (String[] Args)
    {
                                      //hesapNo,Bakiye,isim,telNo!
        Account account1 = new Account("154875",188.7117);
        
        Account account2 = account1;
        
        if (account1 == account2)
        {
            System.out.println("Aynı yeri gösteriyolar!");
            
        }
        else
        {
            System.out.println("Farklı yeri gösteriyolar!");
        }
        
        Account account3 = new Account();
        
        account2.bilgileriGoster();
        
        new Account("145878400",10225158).bilgileriGoster();
                
    }
    
    
}
