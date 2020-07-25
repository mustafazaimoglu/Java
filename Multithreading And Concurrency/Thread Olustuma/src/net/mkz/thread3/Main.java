package net.mkz.thread3;

public class Main
{

    public static void main(String[] args)
    {
        /* IKI SEKİLDE KULLANILABILIR BU DURUMDA... ALTTAKI BİR KERELİKTİR
        Thread printer = new Thread(new Runnable()
        {
            String name = "printer";
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
                    } catch (InterruptedException ex)
                    {
                        System.out.println("Sleep Kesildi...");
                        ex.printStackTrace();
                    }
                }
                System.out.println(name + " Bitti...");
            }
        });
        printer.start(); */
        
        new Thread(new Runnable()
        {
            String name = "printer";
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
                    } catch (InterruptedException ex)
                    {
                        System.out.println("Sleep Kesildi...");
                        ex.printStackTrace();
                    }
                }
                System.out.println(name + " Bitti...");
            }
        }).start();

        System.out.println("Main Thread Çalışıyor...3");

    }
}
