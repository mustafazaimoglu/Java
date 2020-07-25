
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProducerConsumer
{

    Random r = new Random();
    Object lock = new Object();
    private int limit = 10;
    Queue<Integer> queue = new LinkedList<Integer>();

    // PRODUCE VE CONSUME BİRBİRİNİ BEKLEMEK ZORUNDA!!!
    public void produce()
    {
        while (true)
        {
            try
            {
                Thread.sleep(1000);
            } catch (InterruptedException ex)
            {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }

            synchronized (lock)
            {

                if (queue.size() == limit)
                {
                    try
                    {
                        lock.wait();
                    } catch (InterruptedException ex)
                    {
                        Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                Integer value = r.nextInt(20);

                queue.offer(value);

                System.out.println("Producer " + value + " Uretti...");

                lock.notify(); //herhangi biri beklemede kalmasın diye önlem amaçlı!

            }
        }

    }

    public void consume()
    {
        while (true)
        {

            try
            {
                Thread.sleep(5000);
            } catch (InterruptedException ex)
            {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }

            synchronized (lock)
            {
                if (queue.size() == 0)
                {
                    try
                    {
                        lock.wait();
                    } catch (InterruptedException ex)
                    {
                        Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                Integer value = queue.poll();

                System.out.println("Consumer " + value + " Tuketti...");

                System.out.println("Queue Size : " + queue.size());

                lock.notify(); // YİNE HATAYI ÇÖZME AMAÇLI 
            }
        }

    }

}
