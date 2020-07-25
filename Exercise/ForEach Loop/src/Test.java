public class Test
{
    public static void main(String Args[])
    {
        
        Deneme mkz3[] = {new Deneme("Armut"),new Deneme("Elma"),new Deneme("Kiraz")};
        
        
        String mkz[] = {"Mustafa","Hasan","Mehmet"};
        
        int mkz1[] = {1,2,3,4,5,6,7,8};
        
        for (int i : mkz1) //İKİ NOKTA!!!!!! 
        {
            System.out.println(i);
        }
        
        System.out.println();
        
        for (String a : mkz)
        {
            System.out.println(a);            
        }
        
        System.out.println();
        
        for (Deneme b : mkz3)
        {
            System.out.println(b.getIsim());
        }
        
    }
    
}
