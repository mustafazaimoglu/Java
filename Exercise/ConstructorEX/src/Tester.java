
public class Tester 
{
    public static void main (String[] Args)
    {
                                      //hesapNo,Bakiye,isim,telNo!
        Account account1 = new Account("154875",18.7,"Mustafa","0553548758");
        
        
        account1.bilgileriGoster();
        
        account1.paraYatirma(1544);
        
        account1.paraCekme(898);
        
        
        Account account2 = new Account();
        
        account2.bilgileriGoster();
        
        Account account3 = new Account("1548785",5778);
        
        account3.bilgileriGoster();
                
    }
    
    
}
