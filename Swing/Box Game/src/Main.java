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
        add(dunya);
        dunya.setLayout(null);
        
        for (int i = 0; i < 5; i++)
        {
            JPanel panel = new JPanel();
            panel.setBackground(Color.CYAN);
            panel.setBounds(80+i*100, 400, 50, 50);
            panel.setName("Panel " + (i+1));
            dunya.add(panel);
        }
        dunya.panelVer(dunya.getComponents());
        Hareket h = new Hareket(dunya.getComponents());
        
    }
    
    
    public static void main(String[] args)
    {
        Main screen = new Main("Cube");
        
        
    }
    
}
