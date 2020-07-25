//Coded By MKZ
public class RandomEX 
{
    public static void main(String Args[])
    {
       int i,j = 10,k = 20;
       
       for (i = 0;i < 10; i++)
       {
           System.out.println(i+".MKZ from for loop!");
       }
       System.out.println("");
       
       while (j < 20)
       {
           System.out.println(j+".MKZ from while loop!");
           j++;
       }
       System.out.println("");
       
       do
       {
           k++;
           System.out.println(k+".MKZ from do-while loop!");
       }while(k < 30);
        System.out.println("");
       
       
       int Arr[] = {22,33,44,55,66,77,88};
       
       for (int p:Arr)
       {
           System.out.println(p);
       }
        System.out.println("");
       
       
       int a,b;
       
       for (a = 0,b = 10; a <= 10 && b >= 0; a++,b--)
       {
           System.out.println("a = " + a + " b = " + b);
       }
       
    }
    
}
