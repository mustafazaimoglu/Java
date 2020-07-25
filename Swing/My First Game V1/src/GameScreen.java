
import java.awt.HeadlessException;
import javax.swing.JFrame;

public class GameScreen extends JFrame
{
    private static final int gameScreenX = 455;
    private static final int gameScreenY = 650;

    public GameScreen(String title) throws HeadlessException
    {
        super(title);   
    }
   
    public static void main(String[] args)
    {
        GameScreen gm = new GameScreen("Car Game");
        
        gm.setResizable(false);
        gm.setFocusable(false);
        gm.setSize(gameScreenX, gameScreenY);
        gm.setLocationRelativeTo(null); // ekranı ortalamak için
        gm.setDefaultCloseOperation(EXIT_ON_CLOSE);
  
        Game game = new Game();
        game.requestFocus();
        game.addKeyListener(game);
        game.setFocusable(true);
        game.setFocusTraversalKeysEnabled(false);
        
        gm.add(game);
        
        gm.setVisible(true);
        
        
    }
}
