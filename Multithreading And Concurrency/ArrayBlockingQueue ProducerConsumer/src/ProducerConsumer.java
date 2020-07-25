
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProducerConsumer
{

    Random r = new Random();

    ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10); //10 Boyuttur

    // PRODUCE VE CONSUME BİRBİRİNİ BEKLEMEK ZORUNDA!!!
    public void produce()
    {

        try
        {
            Thread.sleep(1000);
        } catch (InterruptedException ex)
        {
            Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
        }

        try
        {
            Integer value = r.nextInt(20);

            queue.put(value);

            System.out.println("Producer " + value + " Uretti...");
        } catch (InterruptedException ex)
        {
            Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
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

            try
            {
                Integer value = queue.take();

                System.out.println("Consumer " + value + " Tuketti...");

                System.out.println("Queue Size : " + queue.size());
            } catch (InterruptedException ex)
            {
                ex.printStackTrace();
            }

        }
    }

}
