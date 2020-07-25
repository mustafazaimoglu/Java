
import java.util.ArrayList;
import java.util.Random;

public class ListWorker
{
    /*
    LOCKLAR CLASSLARA OZGUDUR BU SEBEPLE ELLE LOCK'U COGALTMADIKCA TEK LOCK VARDIR
    BU SEBEPLE SYNCHRONIZED KEYWORD UNU BİLE KULLANMIS OLSAK PROGRAM SURE OLARAK 
    YAVAS KALABILIR
    
    JOIN KEYWORD KODUN O KISMININ BITMESINI BEKLEMESI DEMEK!!!
    ASAGIDAKILERE INMEDEN ONCE THREADLARIN BITMESİ DEMEK!!!
    */

    Random r = new Random();
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();

    Object lock1 = new Object();
    Object lock2 = new Object();

    public void list1Doldur()
    {
        synchronized (lock1)
        {
            try
            {
                Thread.sleep(1);
            } catch (InterruptedException ex)
            {
                ex.printStackTrace();
            }
            list1.add(r.nextInt());
        }
    }

    public void list2Doldur()
    {
        synchronized (lock2)
        {
            try
            {
                Thread.sleep(1);
            } catch (InterruptedException ex)
            {
                ex.printStackTrace();
            }
            list2.add(r.nextInt());
        }
    }

    public void listeleriDoldur()
    {
        for (int i = 0; i < 1000; i++)
        {
            list1Doldur();
            list2Doldur();
        }
    }

    public void calistir()
    {
        Thread t1 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                listeleriDoldur();
            }
        });
        Thread t2 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                listeleriDoldur();
            }
        });

        long basla = System.currentTimeMillis();

        t1.start();
        t2.start();

        try
        {
            t1.join();
            t2.join();
        } catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }

        System.out.println("List 1 : " + list1.size() + "  List 2 : " + list2.size());

        long bitis = System.currentTimeMillis();

        System.out.println("Gecen Zaman : " + (bitis - basla));

    }
}
