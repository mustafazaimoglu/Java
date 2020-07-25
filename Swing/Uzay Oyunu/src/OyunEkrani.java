
import java.awt.HeadlessException;
import javax.swing.JFrame;


public class OyunEkrani extends JFrame
{
    private static final int GENISLIK = 800;
    private static final int YUKSEKLIK = 600;
    public OyunEkrani(String title) throws HeadlessException
    {
        super(title);
        
        
    }
    
    public static void main(String[] args)
    {
        OyunEkrani oyunEkrani = new OyunEkrani("Uzay Oyunu");
        
        oyunEkrani.setResizable(false);
        oyunEkrani.setFocusable(false);
        oyunEkrani.setSize(GENISLIK, YUKSEKLIK);
        oyunEkrani.setLocationRelativeTo(null);
        oyunEkrani.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        Oyun oyun = new Oyun();
        oyun.requestFocus();
        oyun.addKeyListener(oyun);
        oyun.setFocusable(true);
        oyun.setFocusTraversalKeysEnabled(false);
        
        oyunEkrani.add(oyun);
        
        oyunEkrani.setVisible(true);
    }

    
}
