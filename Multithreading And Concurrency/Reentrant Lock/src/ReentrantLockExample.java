
import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReentrantLockExample
{

    private int say = 0;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void increase()
    {
        for (int i = 0; i < 10000; i++)
        {
            say++;
        }
    }

    public void func1()
    {
        lock.lock();

        System.out.println("Thread 1 Calışıyor...");
        System.out.println("Thread 1 beklemede Thread 2 Tarafından Tetiklenmeyi bekliyor...");

        try
        {
            condition.await();
        } catch (InterruptedException ex)
        {
            Logger.getLogger(ReentrantLockExample.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Thread 1 Tetiklendi Calimaya devam ediyor.");

        increase();

        lock.unlock();

    }

    public void func2()
    {
        Scanner scanner = new Scanner(System.in);

        try
        {
            Thread.sleep(1000);
        } catch (InterruptedException ex)
        {
            Logger.getLogger(ReentrantLockExample.class.getName()).log(Level.SEVERE, null, ex);
        }

        lock.lock();

        System.out.println("Thread 2 Calisiyor...");

        increase();

        System.out.println("Şefim yatacak yer varsa entere bas da thread 1 i tetikleyeyim...");

        scanner.nextLine();

        condition.signal();

        System.out.println("Şefim ben o işi hallettim gerisi sende!");

        lock.unlock();

    }

    public void finito()
    {
        System.out.println("Son Hali : " + say);

        System.out.println("Mustafa Zaimoğlu");
        System.out.println("Mustafa Zaimoğlu");
    }

}
