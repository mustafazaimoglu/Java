
package net.mkz.thread1;

public class Printer extends Thread
{
    private String name;

    public Printer(String name)
    {
        this.name = name;
    }

    @Override
    public void run()
    {
        System.out.println(name + " Başladı...");
        for (int i = 1; i <= 10; i++)
        {
            try
            {
                System.out.println(name + " yaziyor : " + i);
                Thread.sleep(1000);
            } 
            catch (InterruptedException ex)
            {
                System.out.println("Sleep Kesildi...");
                ex.printStackTrace();
            }
        }
        System.out.println(name + " Bitti...");
    }
    
    
}
