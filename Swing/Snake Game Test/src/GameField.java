
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;


public class GameField extends JPanel implements ActionListener, KeyListener
{
    Timer timer = new Timer(100, this);
    Random r = new Random();
    JLabel food = new JLabel();
    JLabel lines[] = new JLabel[4];
    JLabel snake[] = new JLabel[7];
    private final int snakeDegisim = 15;
    private final int snakeAndFoodDimension = 15;
    private String yon = "up";
    private int foodX = 150;
    private int foodY = 150;
 //   private int snakeX = 350;
 //   private int snakeY = 350;
    private int x[] = new int[7];
    private int y[] = new int[7];
    

    public GameField()
    {    
        for (int i = 0; i < 7; i++)
        {
            x[i] = 350;
            y[i] = 350 + (i * 16);
        }
        
        setBorders();
        setSnake();

        food.setOpaque(true);
        food.setBackground(Color.red);
        food.setSize(snakeAndFoodDimension, snakeAndFoodDimension);
        food.setLocation(foodX, foodY);
        add(food);
                
        timer.start();
    }

    public void reCreate()
    {
        food.setLocation(foodX, foodY);   
        snake[0].setLocation(x[0], y[0]); 
               
//        for(int i = 0; i < 7; i++)
//        {
//            snake[i].setLocation(x[i], y[i]);                 
//        }        
        
    }
    
    public boolean isFeeded()
    {
        Rectangle food = new Rectangle(foodX, foodY, snakeAndFoodDimension, snakeAndFoodDimension);
        Rectangle snakeHead = new Rectangle(snake[0].getX(), snake[0].getY(), snakeAndFoodDimension, snakeAndFoodDimension);
        
        return food.intersects(snakeHead);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (isFeeded())
        {
           foodX = (int) (20 + r.nextDouble() * (600-40));
           foodY = (int) (20 + r.nextDouble() * (600-70));                       
        }

        
        switch (yon)
        {
            case "up":
                for (int i = 0; i < 7; i++)
                {
                    y[i] -= snakeDegisim;
                }
               // snakeY -= snakeDegisim;
                break;
            case "down":
                for (int i = 0; i < 7; i++)
                {
                    y[i] += snakeDegisim;
                }
                //snakeY += snakeDegisim;
                break;
            case "right":
                for (int i = 0; i < 7; i++)
                {
                    x[i] += snakeDegisim;                 
                }
               // snakeX += snakeDegisim;
                break;
            case "left":
                for (int i = 0; i < 7; i++)
                {
                    x[i] -= snakeDegisim;                 
                }
               // snakeX -= snakeDegisim;
                break;
        }  
        
        
        reCreate();
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

      
    public void setBorders()
    {
        for (int i = 0; i < 4; i++)
        {
            lines[i] = new JLabel();
            lines[i].setOpaque(true);
            lines[i].setBackground(Color.cyan);
            add(lines[i]);
        }
        
        lines[0].setSize(1, 600);
        lines[0].setLocation(0, 0);
        
        lines[1].setSize(600, 1);
        lines[1].setLocation(0, 0);
        
        lines[2].setSize(1, 600);
        lines[2].setLocation(593, 0);
        
        lines[3].setSize(600, 1);
        lines[3].setLocation(0, 570);
    }

    public void setSnake()
    {
        for(int i = 0; i < 7; i++)
        {
            snake[i] = new JLabel();
            add(snake[i]);
            if (i == 0)
            {
                snake[i].setOpaque(true);
                snake[i].setBackground(Color.green);
                snake[i].setSize(snakeAndFoodDimension, snakeAndFoodDimension);
                snake[i].setLocation(x[i], y[i]);
            }
            else
            {
                snake[i].setOpaque(true);
                snake[i].setBackground(Color.yellow);
                snake[i].setSize(snakeAndFoodDimension, snakeAndFoodDimension);
                snake[i].setLocation(x[i], y[i]);
            }
            
        }
    }    
       
    @Override
    public void keyReleased(KeyEvent e)
    {       
    }       
    
    @Override
    public void keyTyped(KeyEvent e)
    {       
    }

}
