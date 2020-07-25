public class RandomEX 
{
    public static void main (String... Args)
    {
        String LevelName = "Senior";
        int Level;
        
        
        switch (LevelName)
        {
            case "Rookie" : Level = 1;
                break;
            case "Junior" : Level = 2;
                break;
            case "Senior" : Level = 3;
                break;
            default : Level = 0;
        }
        
        if (Level == 0)
        {
            System.out.println("You are not eligible to take any level or You Wrote Your level Wrong!");
        }
        else
        {
            System.out.println(Level);
        }
        
    }
    
}
