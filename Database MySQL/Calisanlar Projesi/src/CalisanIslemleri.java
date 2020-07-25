
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CalisanIslemleri
{
    private Connection con = null;

    private Statement statement = null;

    private PreparedStatement preparedStatement = null;

    public CalisanIslemleri()
    {
        String url = "jdbc:mysql://" + Database.host + ":" + Database.port + "/" + Database.dbIsmi + "?useUnicode=true&characterEncoding=utf8";

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
            con = (com.mysql.jdbc.Connection) DriverManager.getConnection(url, Database.kullaniciAdi, Database.parola);
            System.out.println("Baglantı Basarili....");
        } 
        catch (SQLException ex)
        {
            System.out.println("Baglantı Basarisiz....");
        }
    }
    
    public boolean girisYap(String username,String password)
    {
        String sorgu = "SELECT * FROM adminler WHERE username = ? AND password = ?";
                
        try
        {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            return rs.next();
            
        } 
        catch (SQLException ex)
        {
            ex.printStackTrace();
            return false;
        }
               
    }
    
    /* Prepared Statement Kullanmadan Yapılmak İstenirse -->
    public boolean giris(String u,String p)
    {
        String sorgu = "SELECT * FROM adminler";
        
        try
        {
            statement = con.createStatement();
            
            ResultSet rs = statement.executeQuery(sorgu);
            
            
            while (rs.next())
            {
                if (rs.getString("username").equals(u) && rs.getString("password").equals(p))
                {
                    return true;
                }
            }
        } 
        catch (SQLException ex)
        {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
          
        }
        
        return false;
    }
    */
    
    public void kayitYap(String username,String password)
    {
        String sorgu = "INSERT INTO adminler (username,password) VALUES (?,?)";
        
        try
        {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            
            preparedStatement.executeUpdate();
        } 
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        
    }
    
    public ArrayList<Calisan> calisanlariGetir()
    {
        String sorgu = "SELECT * FROM calisanlar";
        ArrayList<Calisan> cikti = new ArrayList<>();
        
        try
        {
            statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sorgu);
            
            while (rs.next())
            {               
                int id = rs.getInt("id");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String departman = rs.getString("departman");
                String maas = rs.getString("maas");
                
                cikti.add(new Calisan(id, ad, soyad, departman, maas));
                
            }
            return cikti;
        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
            return null;
        }        
    }
    
    public void calisanEkle(String ad,String soyad,String departman,String maas)
    {
        String sorgu = "INSERT INTO calisanlar (ad,soyad,departman,maas) VALUES (?,?,?,?)";        
        
        try
        {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, departman);
            preparedStatement.setString(4, maas);
                
            preparedStatement.executeUpdate();
        } 
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        
    }
    
    public void calisanGuncelle(int id,String yeniAd,String yeniSoyad,String yeniDepartman,String yeniMaas)
    {
        String sorgu = "UPDATE calisanlar SET ad = ?,soyad = ?,departman = ?,maas = ? WHERE id = ?";
        
        try
        {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, yeniAd);
            preparedStatement.setString(2, yeniSoyad);
            preparedStatement.setString(3, yeniDepartman);
            preparedStatement.setString(4, yeniMaas);
            preparedStatement.setInt(5, id);
            
            preparedStatement.executeUpdate();
        } 
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }  
        
    }
    
    public void calisanSil(int id)
    {
        String sorgu = "DELETE FROM calisanlar WHERE id = ?";
        
        try
        {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
        } 
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        
        
    }
}
