
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
        Main screen = new Main("Deneme");        
        
        Game game = new Game();

        
        screen.add(game);
        
        screen.setVisible(true);
        
        
    }
    
}
