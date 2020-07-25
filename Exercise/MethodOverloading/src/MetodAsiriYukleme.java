public class MetodAsiriYukleme {
    public static void Toplama(int a, int b, int c)
    {
        System.out.println("3'lu Toplama = " + (a+b+c));
    }
    
    public static void Toplama(int a, int b)
    {
        System.out.println("2'li Toplama = " + (a+b));
    }
    
    public static void Toplama(String a,String b)
    {
        System.out.println(a + " " + b);
    }
    
    public static void main(String[] args)
    {
        Toplama(2,3,4);
        Toplama(7,8);
        Toplama("Mustafa","KUZ");
        
    }
}
