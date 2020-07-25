public class Switch 
{
    public static void main (String... args)
    {
       int Month = 3;
       String NameMonth; 
       
       switch (Month)
       {
           case 1 : NameMonth = "1 - January";
                break;
           case 2 : NameMonth = "2 - February";
                break;
           case 3 : NameMonth = "3 - March";
                break;
           case 4 : NameMonth = "4 - April";
                break;
           case 5 : NameMonth = "5 - May";
                break;
           case 6 : NameMonth = "6 - June";
                break;
           case 7 : NameMonth = "7 - July";
                break;
           case 8 : NameMonth = "8 - August";
                break;
           case 9 : NameMonth = "9 - September";
                break;
           case 10 : NameMonth = "10 - October";
                break;
           case 11 : NameMonth = "11 - November";
                break;
           case 12 : NameMonth = "12 - December";
                break;    
           default : NameMonth = "Invalid Month";    
       }
       
       System.out.println(NameMonth);
    }
    
}
