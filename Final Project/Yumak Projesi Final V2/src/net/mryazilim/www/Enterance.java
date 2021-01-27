/*
02180201064 - Ramazan KAHRAMAN - 1A 
02180201066 - Mustafa KUZ - 1A
*/

package net.mryazilim.www;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.Timer;

public class Enterance extends JFrame
{
    /*
    Arka plan koyabilmek için aynı frame uzerine iki adet jpanel ekledik ve
    alttaki panelde jlabel ustune eklediğimiz ikonu arka plan olarak kullandık
    sonrasında ust paneli saydam yaptik bu sayade arka paln elde etmiş olduk
    */
    
    JPanel anaPanel = new JPanel();
    JButton startButton = new JButton();
    JProgressBar loading = new JProgressBar();
    JEditorPane talimatlar = new JEditorPane(); 
    JLabel mainTitle = new JLabel();
    JButton showHs = new JButton();
    private int skor;
    private final Icon icon;

    public Enterance(String title) throws HeadlessException
    {
        super(title);

        setSize(563, 520);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(this);

        icon = new ImageIcon("Background.jpg"); // arkadaki panelin ustune koyulan resim.

        JPanel altPanel = new JPanel();
        altPanel.setSize(getSize());
        altPanel.setLayout(null);   // free design    
        JLabel background = new JLabel(icon); // background a icon u koyduk
        background.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight());
        altPanel.add(background);

        anaPanel.setLayout(null);
        anaPanel.setOpaque(false); //ustteki paneli saydam yaptık
        anaPanel.setBounds(0, 0, getWidth(), getHeight());

        String talimat = "Yön tuşları ve W,A,S,D ile Yumak hareket ettirilebilir.\n"
                + "Oyun Boşluk tuşu ile oyun durdurulabilir.\n"
                + "Başlangıçta Yumak 10 saniye ömre sahiptir .\n"
                + "Yumak Yeşil Ok'u (Yukarı doğru olan) yakalarsa Yumağ'ın boyutu büyür.\n"
                + "Yumak Kırmızı Ok'u (Aşağı doğru olan) yakalarsa Yumağ'ın boyutu küçülür.\n"
                + "Her 40 saniyede bir bonus zamanı gelecektir.\n"
                + "Eğer Yumağı öldürmek istemiyorsanız Kuru Kafalar'dan uzak durunuz.\n"
                + "Topların üstünde katsayıları bulunmaktadır.\n"
                + "Küçük sarı toplar daha hızlı olup daha çok Ömür Süresi kazandırır.\n"
                + "Büyük sarı toplar daha yavaştır ve daha az Ömür Süresi kazandırırlar.\n"
                + "En yüksek skor sağ altta, Yumağ'ın kalan ömrü sol alttadır, Geçen Süre ise alt ortadadır.\n";

        talimatlar.setText(talimat);
        talimatlar.setForeground(Color.white);
        talimatlar.setBounds(30, 80, 500, 180);
        talimatlar.setEditable(false); // editorpane nin dişardan editlenmesini kapattık
        talimatlar.setOpaque(false); // opak değil yani saydam yapıyoruz ki yazılarımız gözüksün

        mainTitle.setText("Yumak Oyunu'na Hoş Geldiniz...");
        mainTitle.setBounds(130, 20, 300, 40);
        mainTitle.setForeground(new Color(132, 254, 38));
        Font font = new Font("Arial", Font.ITALIC, 20);
        mainTitle.setFont(font);

        loading.setBounds(30, 300, 500, 30);
        loading.setStringPainted(true);  // progges bar ın üstündeki yazı gözüksün diye
        loading.setForeground(new Color(255, 51, 0));

        showHs.setBounds(30, 380, 200, 40);
        showHs.setText("En Yüksek Skor'u Göster");
        showHs.setBackground(Color.YELLOW);
        showHs.setForeground(Color.blue);

        showHs.addActionListener(new ActionListener() //En yuksek skoru goster butnunun basıldıgında yapacakları
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try (BufferedReader fileReader = new BufferedReader(new FileReader("HighScore.txt"));)
                {
                    skor = Integer.valueOf(fileReader.readLine());
                    JOptionPane.showMessageDialog(null, "En Yüksek Skor  : " + skor, "En Yüksek Skor", 1);
                } catch (FileNotFoundException ex)
                {
                    JOptionPane.showMessageDialog(null, "Dosya Bulunamadi!");
                    ex.printStackTrace();
                    System.exit(0);
                } catch (IOException ex)
                {
                    JOptionPane.showMessageDialog(null, "IO Exception Olustu!");
                    ex.printStackTrace();
                }
            }
        });

        startButton.setBounds(330, 380, 200, 40);
        startButton.setText("Oyuna Başla");
        startButton.setBackground(Color.YELLOW);
        startButton.setForeground(Color.blue);
        startButton.addActionListener(new ActionListener() // Oyna Başla Butonuna basıldıgında olacaklar
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Timer timer = new Timer(20, null);

                timer.start();
                timer.addActionListener(new ActionListener() // ProgressBar ı doldurmak için
                {
                    int counter = 0;

                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        counter++;
                        loading.setValue(counter);
                        if (loading.getValue() == 100)
                        {
                            timer.stop();
                            setVisible(false);
                            MainFrame main = new MainFrame("Yumak Oyunu");
                        }
                    }
                });
            }
        });

        anaPanel.add(mainTitle);
        anaPanel.add(talimatlar);
        anaPanel.add(loading);
        anaPanel.add(startButton);
        anaPanel.add(showHs);

        add(anaPanel);
        add(altPanel);

        setVisible(true);
    }
    
    public static void main(String[] args)
    {
        Enterance giris = new Enterance("Başla");
    }

}
