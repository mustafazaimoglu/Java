public class BeybladeFabrikasi 
{
    public Beyblade BeybladeÜret(String BeybladeTürü)
    {
        if (BeybladeTürü.equals("Dragon"))
        {
            return new Dragon("Tai", 1500, 1250, "Shadow Hit", "Talking Master");
        }
        else if (BeybladeTürü.equals("Dranza"))
        {
            return new Dranza("Mei", 1900, 850, "Black Widow");
        }
        else if (BeybladeTürü.equals("Draciel"))
        {
            return new Draciel("Rai", 1000, 1500, "Dark Knight");
        }
        else
        {
            return null;
        }
    }
    
}
