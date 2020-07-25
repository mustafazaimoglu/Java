//Coded By MKZ
import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.*;


public class Main extends JFrame
{
    private final int BOYUT = 600;
    
    public Main(String title) throws HeadlessException
    {
        super(title);
        
        setSize(BOYUT,BOYUT);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        Dunya dunya = new Dunya();
        dunya.setBackground(Color.BLACK);
        dunya.setSize(getSize());
        dunya.setLayout(null);
        add(dunya);

        
    }
    
    
    public static void main(String[] args)
    {
        Main screen = new Main("Cube");    
    }
    
}
