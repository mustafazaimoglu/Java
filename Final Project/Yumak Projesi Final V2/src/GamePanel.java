
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class GamePanel extends JPanel implements KeyListener, ActionListener
{

    private int delay = 100; // Timer in yenilenme sıklığı
    Timer timer = new Timer(delay, this);

    private BufferedImage yumak;
    private BufferedImage kuruKafa;
    private BufferedImage up;
    private BufferedImage down;

    private int yumakKatsayi = 1; // başlangıç ta 1 
    private int yumakBoyutCarpani = 10;   // her katsayı artışında veya düşüşünde 10 10 olarak yani 100 pixel 100 pixel değişyior
    private int yumakX = 50; //başlangıç
    private int yumakY = 180; //başlangıç
    private int yumakDegisim = 12;  //hareket pixel değişimi
    private int yumakKalanOmur = 10; // başlangıç Ömrü

    private int yumakTotalSure = 1; // 1 den başlamasının sebebi bonus süre mizi oyun başında almamak
    private int enYuksekSkor = 0;

    private int yakalananSariTopKatsayisi; //Yakalanan sari top üstündeki kat sayı

    private int saniyeSayaci = 0; //saniye miz
    private int sariTopUretimSayaci = 0;
    private int kuruKafaUretimSayaci = 0;
    private int yukariOkUretimSayaci = 0;
    private int asagiOkUretimSayaci = 0;
    private int bonusSayac = 0;

    JLabel gecenSure = new JLabel();
    JLabel yumakOmur = new JLabel();
    JLabel highScore = new JLabel();
    JLabel bonus = new JLabel();

    // nesnelerimizi depolamak için farklı Array Listler kullandık 
    ArrayList<RoundedPanel> toplar = new ArrayList<>();
    ArrayList<KuruKafa> kurukafalar = new ArrayList<>();
    ArrayList<Up> yukariOk = new ArrayList<>();
    ArrayList<Down> asagiOk = new ArrayList<>();

    public GamePanel()
    {
        try
        {
            //İnput Output ile resimlerimizi okuduk ...
            yumak = ImageIO.read(new File("yumak.png"));
            kuruKafa = ImageIO.read(new File("kuruKafa.png"));
            up = ImageIO.read(new File("up.png"));
            down = ImageIO.read(new File("down.png"));
        } catch (IOException ex)
        {
            JOptionPane.showMessageDialog(this, "Resim Dosyaları Bulunamadi!");
            System.exit(0);
        }

        labelYerlestir();  // Label larımız kod da düzensizlik yartmaması için böyle bir çözüm düşündük

        sariTopUret();       // başlangıç için hemen ölmesin diye 1 kereliğe mahsus 

        timer.start();
    }

    public void labelYerlestir()
    {
        yumakOmur.setOpaque(true);
        yumakOmur.setBackground(Color.DARK_GRAY);
        yumakOmur.setBounds(0, 501, 150, 25);
        yumakOmur.setForeground(Color.WHITE);
        yumakOmur.setHorizontalAlignment(SwingConstants.CENTER);
        yumakOmur.setText("Kalan Ömür : " + yumakKalanOmur);

        gecenSure.setOpaque(true);
        gecenSure.setBackground(Color.DARK_GRAY);
        gecenSure.setBounds(150, 501, 650, 25);
        gecenSure.setForeground(Color.WHITE);
        gecenSure.setHorizontalAlignment(SwingConstants.CENTER);
        gecenSure.setText("Toplam Gecen Süre : " + yumakTotalSure);

        readHS(); // high scoru okuduk ve enYuksekSkor adlı değişkenimize attık gösterebilmek için

        highScore.setOpaque(true); // background kullandığımız için opaklığını açtık 
        highScore.setBackground(Color.DARK_GRAY);
        highScore.setBounds(800, 501, 200, 25);
        highScore.setForeground(Color.WHITE);
        highScore.setHorizontalAlignment(SwingConstants.CENTER);  // yazımız belirledğimiz sınırlarda ortalansın diye setHorizantalAlignment dikey hizalama fonk 
        //kullandık ve dikey hizalamamızı SwingConstants ile CEnter seçtik
        highScore.setText("En Yuksek Skor : " + enYuksekSkor);

        bonus.setBounds(400, 20, 200, 35);
        bonus.setForeground(new Color(204, 102, 255));
        bonus.setFont(new Font("Arial", 0, 25));
        bonus.setHorizontalAlignment(SwingConstants.CENTER);
        bonus.setText("  Bonus Zamanı  ");
        bonus.setVisible(false); // bonus zamanı true layacağız 

        add(bonus);
        add(yumakOmur);
        add(gecenSure);
        add(highScore);
    }

    public void readHS()
    {
        try (BufferedReader fileReader = new BufferedReader(new FileReader("HighScore.txt"));)
        {
            enYuksekSkor = Integer.valueOf(fileReader.readLine()); //aslında byte byte okuyoruz onu bize string döndürdüğü için biz integer olarak depolamak istediğimiz
            //için value of methodunu kullanıyorum
        } catch (FileNotFoundException ex)
        {
            JOptionPane.showMessageDialog(this, "Dosya Bulunamadi!");
            ex.printStackTrace();
            System.exit(0);
        } catch (IOException ex)
        {
            JOptionPane.showMessageDialog(this, "IO Exception Olustu!");
            ex.printStackTrace();
        }
    }

    public void writeHS()
    {
        //try-withresource yapısını kullandık dosyamızı yazdırdıktan ve kapattıktan sonra otomatikmen close olacak 
        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter("HighScore.txt"));)
        {
            fileWriter.write(String.valueOf(yumakTotalSure));  // gelen integer değeri txt dosyasına string olarak yazıyoruz
        } 
        catch (FileNotFoundException ex)
        {
            JOptionPane.showMessageDialog(this, "Dosya Bulunamadi!");
            ex.printStackTrace();
            System.exit(0);
        } 
        catch (IOException ex)
        {
            JOptionPane.showMessageDialog(this, "IO Exception Olustu!");
            ex.printStackTrace();
        }
    }

    @Override
    public void paint(Graphics g)
    {
        super.paint(g);

        g.setColor(Color.CYAN);
        g.drawRect(0, 0, 993, 500);  // oyun sınırlarını daha güzel görmek için bir dikdörtgen çiziyoruz 

        /*
        yumak.getWidth() + yumakKatsayi * yumakBoyutCarpani, yumak.getHeight() + yumakKatsayi * yumakBoyutCarpani
        Kullanılma sebebi yakalanan oklara göre boyut değisikliği için 
        */
        
        g.drawImage(yumak, yumakX, yumakY, yumak.getWidth() + yumakKatsayi * yumakBoyutCarpani, yumak.getHeight() + yumakKatsayi * yumakBoyutCarpani, this);

        for (KuruKafa k : kurukafalar) //For each dongüsü kullanarak komponentlerimizi konumlandırıyoruz.
        {
            g.drawImage(kuruKafa, k.getX(), k.getY(), kuruKafa.getWidth(), kuruKafa.getHeight(), this);
        }

        for (Up u : yukariOk)
        {
            g.drawImage(up, u.getX(), u.getY(), up.getWidth(), up.getHeight(), this);
        }

        for (Down d : asagiOk)
        {
            g.drawImage(down, d.getX(), d.getY(), down.getWidth(), down.getHeight(), this);
        }

    }

    @Override
    public void repaint()
    {
        super.repaint();

    }

    public boolean catchYellowBall() //Sarı Top Yakalnadı Bilgisi veren fonksiyon
    {
        Rectangle yumakR = new Rectangle(yumakX, yumakY, yumak.getWidth() + yumakKatsayi * yumakBoyutCarpani, yumak.getHeight() + yumakKatsayi * yumakBoyutCarpani);

        for (RoundedPanel r : toplar)
        {
            Rectangle topR = new Rectangle(r.getX(), r.getY(), r.getBoyut(), r.getBoyut());

            if (yumakR.intersects(topR))
            {
                yakalananSariTopKatsayisi = r.getKatsayi();
                remove(r);
                toplar.remove(r);
                return true;
            }
        }

        return false;
    }

    public boolean isOver() //Oyun Bitti mi bilgisi veren fonksiyon
    {
        if (yumakKalanOmur <= 0)
        {
            return true;
        }

        Rectangle yumakR = new Rectangle(yumakX, yumakY, yumak.getWidth() - 17 + yumakKatsayi * yumakBoyutCarpani, yumak.getHeight() - 17 + yumakKatsayi * yumakBoyutCarpani);

        for (KuruKafa k : kurukafalar)
        {
            Rectangle kuruKafaR = new Rectangle(k.getX(), k.getY(), kuruKafa.getWidth(), kuruKafa.getHeight());

            if (yumakR.intersects(kuruKafaR))
            {
                return true;
            }
        }

        return false;
    }

    public boolean catchUpArrow() //Yeşil Yukarı Yönlü ok yakalama bilgisi methodu
    {
        Rectangle yumakR = new Rectangle(yumakX, yumakY, yumak.getWidth() + yumakKatsayi * yumakBoyutCarpani, yumak.getHeight() + yumakKatsayi * yumakBoyutCarpani);

        for (Up u : yukariOk)
        {
            Rectangle upR = new Rectangle(u.getX(), u.getY(), up.getWidth(), up.getHeight());

            if (yumakR.intersects(upR))
            {
                yukariOk.remove(u);
                return true;
            }
        }

        return false;
    }

    public boolean catchDownArrow() //Kırmızı Aşağı yönlü ok yakalama methodu
    {
        Rectangle yumakR = new Rectangle(yumakX, yumakY, yumak.getWidth() + yumakKatsayi * yumakBoyutCarpani, yumak.getHeight() + yumakKatsayi * yumakBoyutCarpani);

        for (Down d : asagiOk)
        {
            Rectangle downR = new Rectangle(d.getX(), d.getY(), down.getWidth(), down.getHeight());

            if (yumakR.intersects(downR))
            {
                asagiOk.remove(d);
                return true;
            }
        }

        return false;
    }

    public void sariTopUret()
    {
        SariTop s = new SariTop(); // SariTop ve RoundedPanel class larımızı inceleyelim
        RoundedPanel p = new RoundedPanel(s.getX(), s.getY(), s.getBoyut(), s.getDegisim(), s.getKatsayi());

        toplar.add(p); //ArrayListe ekleme yapmak için
        add(p); // Panele ekleme yapmak için
    }

    @Override
    public void keyTyped(KeyEvent e)
    {
    }

    @Override
    public void keyPressed(KeyEvent e) // WASD ve Yon Tuslari ile oynamak için
    {
        int c = e.getKeyCode();

        switch (c)
        {
            case KeyEvent.VK_UP:
            case KeyEvent.VK_W:
                if (yumakY > 0)
                {
                    yumakY -= yumakDegisim;
                }
                break;
            case KeyEvent.VK_DOWN:
            case KeyEvent.VK_S:
                if (yumakY < 365)
                {
                    yumakY += yumakDegisim;
                }
                break;
            case KeyEvent.VK_RIGHT:
            case KeyEvent.VK_D:
                if (yumakX < 860)
                {
                    yumakX += yumakDegisim;
                }
                break;
            case KeyEvent.VK_LEFT:
            case KeyEvent.VK_A:
                if (yumakX > 10)
                {
                    yumakX -= yumakDegisim;
                }
                break;
            case KeyEvent.VK_SPACE: //Oyunu Durdurma Butonu! - Bonus zamanı yazı alanını oyun durdurma anında farklı amaçla kullandık
                if (timer.isRunning())
                {
                    bonus.setText("Oyun Durdu!");
                    bonus.setVisible(true);
                    timer.stop();
                }
                else
                {
                    timer.start();
                    bonus.setVisible(false);
                    bonus.setText("  Bonus Zamanı  ");
                }
                break;      
            default:
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        saniyeSayaci += delay;
        sariTopUretimSayaci += delay;
        kuruKafaUretimSayaci += delay;
        asagiOkUretimSayaci += delay;
        yukariOkUretimSayaci += delay;

        if (saniyeSayaci >= 1000)
        {
            bonusSayac--; // her 1 saniyede sayac 1 azalcak böylece bonus Zamanı yazısı 5 saniye ekranda gözükecek
            yumakTotalSure++;
            gecenSure.setText("Toplam Gecen Süre : " + yumakTotalSure);

            yumakKalanOmur--;
            yumakOmur.setText("Kalan Ömür : " + yumakKalanOmur);
            saniyeSayaci = 0;
        }
        
        // Bonus zamani
        if (yumakTotalSure % 40 == 0) // 40 Saniyede bi bonus zamanı gelmesi için 
        {
            bonusSayac = 5; // Bonus Zamani yazisini kalacağı süredir
            sariTopUret();
        }

        if (bonusSayac > 0) // Bonus zamani yazısının görünürlüküğü için.
        {
            bonus.setVisible(true);
        }
        else
        {
            bonus.setVisible(false);
        }

        //üretim sürelerine çok uğraştık
        if (sariTopUretimSayaci >= 4000) //4 saniyede bir yeni sari tap üretimi için
        {
            sariTopUret();

            sariTopUretimSayaci = 0;
        }     
        
        if (kuruKafaUretimSayaci >= 5800) // 5,8 sn de bir yeni kuru kafa için
        {
            kurukafalar.add(new KuruKafa());

            kuruKafaUretimSayaci = 0;
        }

        if (yukariOkUretimSayaci >= 5400) // 5,4 sn de bir yeni yukari ok için
        {
            yukariOk.add(new Up());

            yukariOkUretimSayaci = 0;
        }

        if (asagiOkUretimSayaci >= 6400) // 6,4 sn de bir yeni asaği ok için
        {
            asagiOk.add(new Down());

            asagiOkUretimSayaci = 0;
        }

        if (catchUpArrow())
        {
            if (yumakKatsayi < 5) // 5 den küçük olduğu sürece büyüme için
            {
                yumakKatsayi++;

            }
        }

        if (catchDownArrow())
        {
            if (yumakKatsayi > 1) // 1 den Büyük olduğu sürece küçülmesi için
            {
                yumakKatsayi--;

            }
        }

        if (catchYellowBall())
        {
            yumakKalanOmur += yumakKatsayi * yakalananSariTopKatsayisi; // böylece kat sayısı büyük olan top yani küçük ve hızlı toplar daha fazla ömür kazandırıyor
        }

        //timer boyunca bir cizgi gibi nesnelerin akması için Sarmalama dan yararlandık 
        for (RoundedPanel r : toplar) //Nesnelerin Hareketi için alttaki 4 method
        {
            r.setX(r.getX() - r.getDegisim());
        }

        for (KuruKafa k : kurukafalar)
        {
            k.setX(k.getX() - k.getDegisim());
        }

        for (Up u : yukariOk)
        {
            u.setX(u.getX() - u.getDegisim());
        }

        for (Down d : asagiOk)
        {
            d.setX(d.getX() - d.getDegisim());
        }

        if (isOver())
        {
            if (enYuksekSkor < yumakTotalSure)
            {
                JOptionPane.showMessageDialog(this, "Hayatta Kalınan Süre : " + yumakTotalSure, "Yeni En Yüksek Skor!", 0);
                writeHS();
                System.exit(0);
            }

            JOptionPane.showMessageDialog(this, "Hayatta Kalınan Süre : " + yumakTotalSure, "Oyun Bitti!", 0);
            System.exit(0);
        }

        repaint();
    }

}
