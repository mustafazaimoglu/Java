
public class Main
{
    public static void main(String[] args)
    {
        FinalTest mkz = new FinalTest("Obje1");
        FinalTest mkz1 = new FinalTest("Obje2");
        
        System.out.println(mkz.getObjeSayisi());
        System.out.println(mkz1.getObjeSayisi());
        
        System.out.println(Database.databaseIsmi);
        System.out.println(Database.userName);
        System.out.println(Database.password);
    }
    
}
