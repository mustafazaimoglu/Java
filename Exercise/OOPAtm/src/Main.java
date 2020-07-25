
public class Main {
    
    public static void main (String[] args) {
        
        ATM atm = new ATM();
        
        Hesap hesap1 = new Hesap("Mustafa KUZ", "123456", 1548.25);
        
        
        atm.calis(hesap1);
        System.out.println("Programdan Cikiliyor...");
        
    }
    
}
