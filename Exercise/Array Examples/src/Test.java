public class Test
{
    public static double Ortalama(int X[])
    {
        double top = 0;
        for (int i = 0; i < X.length; i++)
        {
            top += X[i];
        }
        
        return top/X.length;
        
    }
    
    public static void Yazdir(int X[])
    {
        for (int i = 0; i < X.length; i++)
        {
            System.out.println((i+1) + ". Element : " + X[i]);
        }
        System.out.println();
    }
    
    public static void main(String args[]) 
    {
        int a[] = {1,2,3,6,4,5,8,7};
        
        System.out.println("Array Boyutu : " + a.length);
        
        Yazdir(a);
        
        System.out.println("Ortalama : " + Ortalama(a) + "\n");
        
        int b[] = new int[10];
        
        for (int i = 0; i < b.length; i++)
        {
            b[i] = i * 2;
        }
        
        Yazdir(b);
        
        System.out.println("Ortlama : " + Ortalama(b));
        
   

    }
    
}
