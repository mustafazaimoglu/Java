
import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class MainFrame extends JFrame
{
    private final int FRAMEX = 800;
    private final int FRAMEY = 600;

    public MainFrame(String title) throws HeadlessException
    {
        super(title);
        
        setSize(FRAMEX, FRAMEY);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setFocusable(false);
        setLocationRelativeTo(null);

        
        Game game = new Game();

        game.setBackground(Color.BLACK);
        game.requestFocus();
        game.addKeyListener(game);
        game.setFocusable(true);
        game.setFocusTraversalKeysEnabled(false);
        
        add(game);

        setVisible(true);        
    }
    
    
    public static void main(String[] args)
    {
        int x = JOptionPane.showConfirmDialog(null, "Başlamak İçin Hazır mısınız?","Başla",0);
        
        if (x == JOptionPane.NO_OPTION)
        {
            System.exit(0);
        }
        
        MainFrame frame = new MainFrame("Emoji");
        
    }
    
}
