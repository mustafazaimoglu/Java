
import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MainFrame extends JFrame
{
    private final int FRAMEX = 1000;
    private final int FRAMEY = 610;
    
    public MainFrame(String title) throws HeadlessException
    {
        super(title);
        
        setSize(FRAMEX, FRAMEY);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setFocusable(false);
        
        Game game = new Game();

        game.setBackground(new Color(0, 170, 255));
        game.requestFocus();
        game.addKeyListener(game);
        game.setFocusable(true);
        game.setFocusTraversalKeysEnabled(false);

        add(game); 
        
        setVisible(true);
        
    }
    
    
    public static void main(String[] args)
    {
        int x = JOptionPane.showConfirmDialog(null, "Başlamak İçin Hazır mısınız?", "Başla", 0);
        
        if (x == JOptionPane.NO_OPTION)
        {
            System.exit(0);
        }
        
        new MainFrame("Flappy Bird");
    }
    
}
