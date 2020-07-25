
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class UstEkran extends JPanel
{
    JPanel a = new JPanel();

    public UstEkran()
    {
        setLayout(null);
        a.setBackground(Color.MAGENTA);
        a.setBounds(15, 15, 80, 35);
        
        add(a);
    }
    
    
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        
        g.setColor(Color.GREEN);
        g.fillRect(250, 75, 50, 50);
    }

    @Override
    public void repaint()
    {
        super.repaint(); 
    }
    
    
}
