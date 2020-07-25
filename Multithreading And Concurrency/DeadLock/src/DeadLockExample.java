
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class DeadLockExample
{
    /*
    DEADLOCK BULUNAN İKİ ANAHTARDAN HER THREAD BİR ADETİNİ ALIP DİĞERİNİN VERMESİNİ BEKLEMESİ
    BU SEBEPLE IKISI BİRİBİRİNİ SONSUZA KADAR BEKLİYOR.
    */
    
    private Hesap h1 = new Hesap();
    private Hesap h2 = new Hesap();
    Random r = new Random();
    
    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();
    
    
    public void lockKontrol(Lock a,Lock b)
    {
        boolean acheck = false;
        boolean bcheck = false;
        
        while (true)
        {
            acheck = a.tryLock();
            bcheck = b.tryLock();
            
            if (acheck == true && bcheck == true)
            {
                return;
            }
            if (acheck == true)
            {
                a.unlock();
            }
            if (bcheck == true)
            {
                b.unlock();
            }
            
        }
        
    }
    
    public void func1()
    {
        lockKontrol(lock1, lock2);
        
        for (int i = 0; i < 5000; i++)
        {
            Hesap.paraTransferi(h1, h2, r.nextInt(100));
       }
        
        lock1.unlock();
        lock2.unlock();
    }
    
    public void func2()
    {
        lockKontrol(lock2, lock1);
        
        for (int i = 0; i < 5000; i++)
        {
            Hesap.paraTransferi(h2, h1, r.nextInt(100));
        }
        
        lock2.unlock();
        lock1.unlock();
    }
    
    public void finalFunc()
    {
        System.out.println("Hesap 1 Bakiye : " + h1.getBakiye() + " -- Hesap 2 Bakiye : " + h2.getBakiye());
        
        System.out.println("Toplam Bakiye : " + (h1.getBakiye() + h2.getBakiye()));
    }
}
