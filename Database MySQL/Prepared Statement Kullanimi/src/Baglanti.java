
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Baglanti
{

    private String kullaniciAdi = "root";
    private String parola = "";

    private String host = "localhost";

    private String port = "3306";

    private String dbIsmi = "javaDeneme";

    private Connection con = null;

    private Statement statement = null;

    private PreparedStatement preparedStatement = null;
    
    public Baglanti()
    {
        // jdbc:mysql://localhost:3306/javaDeneme
        String url = "jdbc:mysql://" + host + ":" + port + "/" + dbIsmi + "?useUnicode=true&characterEncoding=utf8";

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
    
    public void preparedCalisanGetir(int x, String y)
    {
        /*
        String sorgu = "SELECT * FROM calisanlar WHERE name LIKE 'M%'";
        
        try
        {
            statement = con.createStatement();
            
            ResultSet rs = statement.executeQuery(sorgu);
            
            while (rs.next())
            {
                String ad = rs.getString("name");
                String soyad = rs.getString("surname");
                
                System.out.println("Ad : " + ad + "   Soyad : " + soyad);
            }
            
        } 
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        */
        
        
        String sorgu = "SELECT * FROM calisanlar WHERE id > ? AND name LIKE ? ";
        
        try
        {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, x);
            preparedStatement.setString(2, y);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            while (rs.next())
            {
                String ad = rs.getString("name");
                String soyad = rs.getString("surname");
                
                System.out.println("Ad : " + ad + "   Soyad : " + soyad);
            }
            
        } 
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
    }

    public void calisanlariGetir()
    {
        String sorgu = "SELECT * FROM calisanlar";

        try
        {
            statement = con.createStatement();

            ResultSet rs = statement.executeQuery(sorgu);

            while (rs.next())
            {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String email = rs.getString("email");

                System.out.println("id : " + id + "\nName : " + name + "\nSurname : " + surname + "\nEmail : " + email);
            }
        } 
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
    }

    public void calisanEkle(String name, String surname, String email)
    {

        String sorgu = "INSERT INTO calisanlar (name,surname,email) VALUES (\"" + name + "\",\"" + surname + "\",\"" + email + "\")";

        try
        {
            statement = con.createStatement();

            statement.executeUpdate(sorgu);

        } 
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }

    }

    public void calisanGuncelle()
    {
        
        String sorgu = "UPDATE calisanlar SET email = 'mkzBoss@gmail.com' WHERE id = 8";
        String sorgu2 = "UPDATE calisanlar SET email = 'example@gmail.com' WHERE id > 9";
        
        try
        {
            statement = con.createStatement();
            
            statement.executeUpdate(sorgu2);
        } 
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
    }
    
    public void calisanSil()
    {
        String sorgu = "DELETE FROM calisanlar WHERE id > 10";
        
        try
        {
            statement = con.createStatement();
            
            int etkileşim = statement.executeUpdate(sorgu);
            
            System.out.println(etkileşim + " Tane Değer Etkilendi!");
        } 
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        
        
    }

    public static void main(String[] args)
    {
        Baglanti baglanti = new Baglanti();

        System.out.println("***********************************");

        baglanti.preparedCalisanGetir(8,"M%");

        System.out.println("************************************");
        
        
    }
}
