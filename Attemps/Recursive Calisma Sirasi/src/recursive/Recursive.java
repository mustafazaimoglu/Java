package recursive;

public class Recursive
{

    public static void mkz(int n)
    {
        if (n == 0)
        {
            System.out.println("finito");
        }
        else
        {
            System.out.println(n + "*");
            mkz(n - 2);
            System.out.println(n + "****");
          
        }

    }

    public static void main(String[] args)
    {
        mkz(10);
    }

}
