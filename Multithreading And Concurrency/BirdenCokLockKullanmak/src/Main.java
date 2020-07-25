
public class Main
{
    public static void main(String[] args)
    {
        ListWorker worker = new ListWorker();
        
        
        
        /*
        long basla = System.currentTimeMillis();
        worker.listeleriDoldur();
        long bitis = System.currentTimeMillis();
        
        System.out.println("Gecen Zaman : " + (bitis - basla));
        */
        
        worker.calistir();
        
    }
    
}
