
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Baglanti
{
    private String kullaniciAdi = "root";
    private String parola = "";
    
    private String host = "localhost";
    
    private String port = "3306";
    
    private String dbIsmi = "javaDeneme";
    
    private Connection con = null;
    
    public Baglanti()
    {
        // jdbc:mysql://localhost:3306/javaDeneme
        String url = "jdbc:mysql://" + host + ":" + port + "/" + dbIsmi;
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
        } 
        catch (ClassNotFoundException ex)
        {
            System.out.println("Driver Bulunamadı!");
            ex.printStackTrace();
        }
        
        try
        {
            con = (Connection) DriverManager.getConnection(url, kullaniciAdi, parola);
            System.out.println("Baglantı Basarili....");
        } 
        catch (SQLException ex)
        {
            System.out.println("Baglantı Basarisiz....");
        }
    }
    
    public static void main(String[] args)
    {
        Baglanti baglanti = new Baglanti();
    }
}
