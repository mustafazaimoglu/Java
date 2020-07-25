
import java.awt.HeadlessException;
import javax.swing.JFrame;

public class Main extends JFrame
{
    private final int ScreenX = 600;
    private final int ScreenY = 600;

    public Main(String title) throws HeadlessException
    {
        super(title);
        setResizable(false);
        setFocusable(false);
        setSize(ScreenX, ScreenY);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
   
    public static void main(String[] args)
    {
        Main screen = new Main("Cube");        
        
        Game game = new Game();
        game.requestFocus();
        game.addKeyListener(game);
        game.setFocusable(true);
        game.setFocusTraversalKeysEnabled(false);
        
        screen.add(game);
        
        screen.setVisible(true);
        
        
    }
    
}
