
public interface YurtDisiKurallari
{
    void harcKontrol() throws HarcException;
    void vizeKontrol() throws VizeException;
    void siyasiYasakKontrol() throws SiyasiException;
}



class HarcException extends Exception
{

    @Override
    public void printStackTrace()
    {
        System.out.println("Harc Bedelini Tam Yatırmaniz Gerekmektedir...");
    }
    
}

class VizeException extends Exception
{

    @Override
    public void printStackTrace()
    {
        System.out.println("Vizeniz Bulunmamaktadir...");
    }
    
}

class SiyasiException extends Exception
{

    @Override
    public void printStackTrace()
    {
        System.out.println("Siyasi Yasağınız Bulunmaktadır...");
    }
    
}
