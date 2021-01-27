
public class MyClass implements IA , IB
{
    private String isim;

    public MyClass(String isim)
    {
        this.isim = isim;
    }

    @Override
    public void meth1()
    {
        System.out.println(isim + " Kosuyor.");
    }

    @Override
    public void meth2()
    {
        System.out.println(isim + " Su İçiyor.");
    }

    @Override
    public void meth3()
    {
        System.out.println(isim + " Dinleniyor.");
    }

    @Override
    public void meth4()
    {
        System.out.println(isim + " Yemek Yiyor.");
    }
    
}
