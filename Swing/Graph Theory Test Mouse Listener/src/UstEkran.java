
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JPanel;

public class UstEkran extends JPanel implements MouseListener
{
    ArrayList<RoundedPanel> dugum = new ArrayList<>();
    JPanel p1 = new RoundedPanel(40, Color.CYAN);
    JPanel a = new RoundedPanel(40, Color.GREEN);
    
    private int x1,y1,x2,y2;

    public UstEkran()
    {
        setLayout(null);
        
        
        a.setBounds(300,400,40,40);
        a.addMouseListener(this);
        
        p1.setBounds(50,50,40,40);
        p1.addMouseListener(this);
        add(p1);
        add(a);
    }

    @Override
    public void mouseClicked(MouseEvent e)
    {
        dugum.add(new RoundedPanel(40,Color.BLUE));
        
        for (RoundedPanel r : dugum)
        {
            r.setBounds(250, 250, 40, 40);
            r.addMouseListener(this);
        }
    }

    @Override
    public void mousePressed(MouseEvent e)
    {
        x1 = e.getX(); //Mouse un listenere sahip olan bolgedeki koordinatlari
        y1 = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e)
    {
        x2 = (e.getComponent().getX() - x1) + e.getX();
        y2 = (e.getComponent().getY() - y1) + e.getY();
        e.getComponent().setLocation(x2, y2);
        
    }

    @Override
    public void mouseEntered(MouseEvent e)
    {
    }

    @Override
    public void mouseExited(MouseEvent e)
    {
    }

}
