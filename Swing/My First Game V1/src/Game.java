
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

class Obstacle
{
    private int x,y;

    public Obstacle(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }
    
}

public class Game extends JPanel implements KeyListener,ActionListener
{
    private int speed = 40;
    JLabel skorLabel = new JLabel();
    JLabel start = new JLabel("Enter");
    Timer timer = new Timer(speed, this);
    ArrayList<Obstacle> obstacles = new ArrayList<>();
    Random r = new Random();
    
    private int obstacleSure = 0;
    private int skor;
    private int ConstantY = 15;
    private final int obstacleDegisim = 20;
    private final int obsXs[] = {15,165,315};
    private final int Width = 120;
    private final int Height = 100;
    private int carX = 165;
    private final int carDegisim = 150;
    private final int carY = 505; 
    
    public Game()
    {
        add(skorLabel);
        setBackground(Color.BLACK);
        skorLabel.setFont(new Font("Tohama", 0, 15));
        start.setForeground(Color.white);
        start.setFont(new Font("Tohama", 1, 25));
        start.setText("Press Enter to Start");
        add(start);
        
    }
    
    public boolean isOver()
    {
       for (Obstacle o : obstacles)
       {
           Rectangle car = new Rectangle(carX, carY, Width, Height);
           Rectangle obs = new Rectangle(o.getX(), o.getY(), Width, Height);
           
           if (car.intersects(obs))
           {
               return true;
           }
       }
       return false;
    }

    @Override
    public void paint(Graphics g)
    {
        skor++;
        super.paint(g); 
        g.setColor(Color.cyan);
        g.drawLine(150, 0, 150, 650);
        g.drawLine(300, 0, 300, 650);
        
        
        g.setColor(Color.green);

        for (Obstacle o : obstacles)
        {
            if (o.getY() > 650)
            {
                obstacles.remove(o);
            }
        }
        
        for (Obstacle o : obstacles)
        {
            g.fillRect(o.getX(), o.getY(), Width, Height);
        }
        
        g.setColor(Color.MAGENTA);
        g.fillRect(carX, carY, Width, Height); //araba
       
        
    }

    @Override
    public void repaint()
    {
        super.repaint(); 
    }

    @Override
    public void keyTyped(KeyEvent e)
    {
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        int c = e.getKeyCode();
        
        if (c == KeyEvent.VK_ENTER)
        {
            timer.start();
            start.setVisible(false);
        }
        else if (c == KeyEvent.VK_LEFT || c == KeyEvent.VK_A)
        {
            if (carX >= 16)
            {
                carX -= carDegisim;  
            }

        }
        else if (c == KeyEvent.VK_RIGHT || c == KeyEvent.VK_D)
        {
            if (carX <= 314)
            {
                carX += carDegisim;
            }

        }
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
        int k = e.getKeyCode();
        
        if (k == KeyEvent.VK_Q)
        {
            System.exit(0);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        skorLabel.setForeground(Color.WHITE);
        skorLabel.setText("Skor : " + skor);
        obstacleSure++;
        
        if (isOver())
        {
            repaint();
            timer.stop();
            
            String message = "Skorunuz : " + skor;
            JOptionPane.showMessageDialog(null, message, "Game Over", 0);
            System.exit(0);
        }
        
        if (skor % 200 == 0)
        {
            speed--;
            timer.setDelay(speed);
        }
        
        if ( obstacleSure % 16 == 0)
        {
            int i = r.nextInt(3);
            obstacles.add(new Obstacle(obsXs[i], ConstantY));
        }
        
        for (Obstacle o : obstacles)
        {
            o.setY(o.getY() + obstacleDegisim);
        }
        
        repaint();
    }
    
      
}
