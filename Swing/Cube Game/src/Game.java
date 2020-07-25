
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Game extends JPanel implements ActionListener, KeyListener
{
    private final int PANEL_DIMENSIONS = 600;
    private final int YEM_DIMENSIONS = 15; 
    private final int SNAKE_DIMENSION = 30;
    private final int snakeDegisim = 15;
    private int speed = 120;
    private int yemX = 150;
    private int yemY = 150;
    private int snakeX = 400;
    private int snakeY = 400;
    private int skor = 0;    
    private String yon = "up";
    JLabel skorTabelasi = new JLabel();
    JLabel start = new JLabel();
    Timer timer = new Timer(speed, this);
    Random r = new Random();
    
        
    public Game()
    {
        setLayout(null); // Free Desing için
        setBackground(Color.BLACK);
        add(skorTabelasi); 
        add(start);
          
        start.setForeground(Color.WHITE);
        start.setText("Press Enter to Start");
        start.setFont(new Font("Tohama", 1, 25));
        start.setBounds(170, 250, 300, 50);
        
        
        
    }

    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
                
        g.setColor(Color.CYAN);
        g.fillOval(yemX, yemY, YEM_DIMENSIONS, YEM_DIMENSIONS);
        
        g.setColor(Color.YELLOW);
        g.fillRect(snakeX, snakeY, SNAKE_DIMENSION, SNAKE_DIMENSION);
       
        g.setColor(Color.red);
        g.drawLine(0, 0, 600, 0);
        g.drawLine(0, 0, 0, 570);
        g.drawLine(0, 570, 600, 570);
        g.drawLine(593, 0, 593, 570);
    }

    @Override
    public void repaint()
    {
        super.repaint();      
    }
    
    public boolean isOver()
    {
        if (snakeX <= 0)
        {
            return true;
        }
        else if (snakeX >= 565)
        {
            return true;
        }
        else if (snakeY <= 0)
        {
            return true;
        }
        else if (snakeY >= 540)
        {
            return true;
        }
        
        return false;
    
    }
    
    public boolean feed()
    {
        Rectangle yem = new Rectangle(yemX, yemY, YEM_DIMENSIONS, YEM_DIMENSIONS);
        Rectangle snake = new Rectangle(snakeX, snakeY, SNAKE_DIMENSION, SNAKE_DIMENSION);
        
        return yem.intersects(snake);
    }

    @Override
    public void keyTyped(KeyEvent e)
    {
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        int c = e.getKeyCode();
        
        switch (c)
        {
            case KeyEvent.VK_A:
            case KeyEvent.VK_LEFT:
                yon = "left";
                break;
            case KeyEvent.VK_D:
            case KeyEvent.VK_RIGHT:
                yon = "right";
                break;
            case KeyEvent.VK_W:
            case KeyEvent.VK_UP:
                yon = "up";
                break;
            case KeyEvent.VK_S:
            case KeyEvent.VK_DOWN:
                yon = "down";
                break;
            default:
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
        int c = e.getKeyCode();
        
        if (c == KeyEvent.VK_Q)
        {
            System.exit(0);
        }
        
        
        if (c == KeyEvent.VK_ENTER)
        {
            timer.start();
            start.setVisible(false);
        }

    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (isOver() == true)
        {
            JOptionPane.showMessageDialog(this, "Skor :" + skor, "Game Over",0);
            System.exit(0);
        }
        
        if (feed() == true)
        {
            skor += 10;
            yemX = (int) (10 + r.nextDouble() * (PANEL_DIMENSIONS-45));
            yemY = (int) (10 + r.nextDouble() * (PANEL_DIMENSIONS-70));
            
            if (skor % 60 == 0)
            {
                speed -= 7;
                timer.setDelay(speed);
            }   
        }
        
        switch (yon)
        {
            case "up":
                snakeY -= snakeDegisim;
                break;
            case "down":
                snakeY += snakeDegisim;
                break;
            case "right":
                snakeX += snakeDegisim;
                break;
            case "left":
                snakeX -= snakeDegisim;
                break;
        }       

        skorTabelasi.setForeground(Color.WHITE);
        skorTabelasi.setText("Skor : " + skor);
        skorTabelasi.setBounds(2, 1, 80, 18);

        repaint();
    }
    
}
