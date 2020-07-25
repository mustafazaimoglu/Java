
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Game extends JPanel implements ActionListener, MouseListener, MouseMotionListener
{
    private int delay = 35;
    Random r = new Random();
    Timer timer = new Timer(delay, this);
    JLabel ball = new JLabel();
    private int X,Y,BallX = 220,BallY = 550;
    ArrayList<Obstacle> obstacles = new ArrayList<>();
    private int obstacleDegisim = 5;
    private int uretim = 0;
    private int skor = 0;

    public Game()
    {
        obstacles.add(new Obstacle());
        setLayout(null);
        ball.setOpaque(true);
        ball.setBackground(Color.CYAN);
        ball.setBounds(BallX, BallY, 50, 50);
        ball.addMouseListener(this);
        ball.addMouseMotionListener(this);

        add(ball);
        
        timer.start();
        
    }

    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        
        for (Obstacle o : obstacles)
        {
            if (o.getY() > 650)
            {
                obstacles.remove(o);
                skor += 10;
            }              
        }
        
        g.setColor(new Color(204, 0, 153));
        for (Obstacle o : obstacles)
        {
            g.fillRect(o.getLeftX(), o.getY(), o.getLetfWidth(), o.getHeight());
            g.fillRect(o.getRightX(), o.getY(), o.getRightWidth(), o.getHeight());
        }
        
    }

    @Override
    public void repaint()
    {
        super.repaint(); 
    }
    
    public boolean isOver()
    {
        Rectangle ball = new Rectangle(BallX, BallY, 50, 50);
        
        if (BallX > 443)
        {
            return true;
        }
        else if (BallX < 0)
        {
            return true;
        }
        
        for (Obstacle o : obstacles)
        {
            Rectangle sol = new Rectangle(o.getLeftX(), o.getY(), o.getLetfWidth(), o.getHeight());
            Rectangle sag = new Rectangle(o.getRightX(), o.getY(), o.getRightWidth(), o.getHeight());
            
            
            if (ball.intersects(sag) || ball.intersects(sol))
            {
                return true;
            }
        }
        
        return false;
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        uretim += delay;
        
        if (isOver())
        {
            JOptionPane.showMessageDialog(this, "Skor : " + skor, "Game Over", 0);
            System.exit(0);
        }
        
        if (uretim > 2000)
        {
            obstacles.add(new Obstacle());
            uretim = 0;
        }    
        
        
        for (Obstacle o : obstacles)
        {
            o.setY(o.getY() + obstacleDegisim);
        }
        
        repaint();
    }


    @Override
    public void mousePressed(MouseEvent e)
    {
        e.getComponent().setBackground(Color.WHITE);
        X = e.getX(); //Mouse un listenere sahip olan bolgedeki koordinatlari
        Y = e.getY();
        // e.getComponent().getX() listenere sahip olan componentin ana koordinatlari       
    }
    
    @Override
    public void mouseDragged(MouseEvent e)
    {
        BallX = (e.getComponent().getX() - X) + e.getX();
        BallY = (e.getComponent().getY() - Y) + e.getY();
        e.getComponent().setLocation(BallX, BallY);
    }


    
    @Override
    public void mouseReleased(MouseEvent e)
    {
        ball.setBackground(Color.CYAN);
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
    public void mouseClicked(MouseEvent e)
    {
    }    

    @Override
    public void mouseMoved(MouseEvent e)
    {
    }  
}
