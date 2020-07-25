
import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JFrame;


public class MainFrame extends JFrame
{
    private final int DIMENSIONS = 600;

    public MainFrame(String title) throws HeadlessException
    {
        super(title);
        
        setSize(DIMENSIONS,DIMENSIONS);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setFocusable(false);
        setVisible(true);
        
        GameField gameField = new GameField();
        
        gameField.setBackground(Color.BLACK);
        gameField.setSize(getSize());
        gameField.setLayout(null);
        gameField.requestFocus();
        gameField.addKeyListener(gameField);
        gameField.setFocusable(true);
        gameField.setFocusTraversalKeysEnabled(false);
        
        add(gameField);
    }
    
    
    public static void main(String[] args)
    {
        MainFrame mainFrame = new MainFrame("Snake");
    }
    
}
