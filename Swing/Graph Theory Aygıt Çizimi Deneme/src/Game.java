
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.Timer;

public class Game extends JPanel implements MouseListener, ActionListener
{
    Timer timer = new Timer(1, this);
    private int X1,X2,Y1,Y2;
    ArrayList<Ayrit> ayritlar = new ArrayList<Ayrit>();
    ArrayList<Polygon> pols = new ArrayList<>();
    private int tolerans = 8;
    JToggleButton button = new JToggleButton();
    
    JPanel a = new JPanel();
    JPanel b = new JPanel();
    public Game()
    {
        timer.start();
        setLayout(null); // Free Desing için
        setBackground(Color.BLACK);
        
        button.setBounds(0, 0, 160, 40);
        button.setText("DUZENLE");
        
        b.setBounds(300, 300, 80, 40);
        a.setBounds(50, 50, 80, 40);
        
        b.addMouseListener(this);
        a.addMouseListener(this);
        
        add(a);
        add(b);
        add(button);
    }

/*
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g); 
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.RED);
        g2.setStroke(new BasicStroke(2.0F));
        Line2D line = new Line2D.Double(15, 50, 150, 350);
        g2.draw(line);
        
        int xPoints[] = { 12, 18, 147, 153 };
        int yPoints[] = { 47, 53, 347, 533 };
       // ab = new Polygon(xPoints, yPoints, yPoints.length);
       
        g.drawLine(X1, Y1, X2, Y2);
    }
*/
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        
        g2.setColor(Color.CYAN);
        g2.setStroke(new BasicStroke(3.0F));
        
        for (Ayrit a : ayritlar)
        {
            g2.drawLine(a.getX1(), a.getY1(), a.getX2(), a.getY2());
        }

    }

    @Override
    public void repaint()
    {
        super.repaint(); 
    }
    
    
    

    @Override
    public void mouseClicked(MouseEvent e)
    {
        for (Polygon p : pols)
        {
            if (p.contains(e.getX(), e.getY()))
            {
                System.out.println("Afvfdgfd");
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e)
    {
        a.setBackground(Color.red);
        X1 = e.getComponent().getX() + e.getX();
        Y1 = e.getComponent().getY() + e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e)
    {
        if (b.contains(e.getX(), e.getY()))
        {
            
        }
        
        b.setBackground(Color.YELLOW);
        X2 = e.getComponent().getX() + e.getX();    
        Y2 = e.getComponent().getY() + e.getY();        

        ayritlar.add(new Ayrit(X1, Y1, X2, Y2));
        int xs[] = {X1-tolerans,X1+tolerans,X2-tolerans,X2+tolerans}; 
        int ys[] = {Y1-tolerans,Y1+tolerans,Y2-tolerans,Y2+tolerans}; 
        pols.add(new Polygon(xs, ys, xs.length));

    }

    @Override
    public void mouseEntered(MouseEvent e)
    {

    }

    @Override
    public void mouseExited(MouseEvent e)
    {
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (button.isSelected())
        {
            addMouseListener(this);
        }
        
        if (!button.isSelected())
        {
            removeMouseListener(this);
        }
        
        
        repaint();
    }

    


}
