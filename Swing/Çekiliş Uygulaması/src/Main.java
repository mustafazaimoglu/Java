
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class Main extends javax.swing.JFrame
{
    String filePath;
    ArrayList<String> isimler = new ArrayList<>();
    ArrayList<String> kazananlar = new ArrayList<>();
    DefaultListModel model = new DefaultListModel();
    
    
    public Main()
    {
        initComponents();
        kazananListesi.setModel(model);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        filePathField = new javax.swing.JTextField();
        gozat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        kazananListesi = new javax.swing.JList<>();
        cekilisYapButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Çekiliş");
        setLocation(new java.awt.Point(400, 200));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        filePathField.setEditable(false);

        gozat.setText("Gözat");
        gozat.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                gozatActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(kazananListesi);

        cekilisYapButton.setText("Çekiliş Yap");
        cekilisYapButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cekilisYapButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("KAZANANLAR ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(filePathField, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(gozat, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cekilisYapButton)
                .addGap(196, 196, 196))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filePathField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gozat))
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(cekilisYapButton)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void dosyaOku()
    {        
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath),"UTF-8")))
        {
            String isim;
            
            while ((isim = reader.readLine()) != null)
            {
                isimler.add(isim);
            }
            
            cekilisYap();
        } 
        catch (FileNotFoundException ex)
        {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex)
        {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex)
        {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cekilisYap()
    {
        Random r = new Random();
         
        
        main:
        while (kazananlar.size() != 5)
        {
            int kazananIndex = r.nextInt(isimler.size());
            
            String kazanan = isimler.get(kazananIndex);
            
            for (String s : kazananlar)
            {
                if (s.equals(kazanan))
                {
                    continue main;
                }
            }
            
            kazananlar.add(kazanan);
        }
      
    }
    
    public void alkisla()
    {
        try
        {
            AudioInputStream ais = AudioSystem.getAudioInputStream(new File("alkış.wav"));
            
            Clip clip = AudioSystem.getClip();
            
            clip.open(ais);
            
            clip.start();
            
        } catch (UnsupportedAudioFileException ex)
        {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex)
        {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex)
        {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void gozatActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_gozatActionPerformed
    {//GEN-HEADEREND:event_gozatActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        
        int i = fileChooser.showOpenDialog(this);
        
        if (i == JFileChooser.APPROVE_OPTION)
        {
            filePath =  fileChooser.getSelectedFile().getPath();
            
            filePathField.setText(filePath);
        }
        
    }//GEN-LAST:event_gozatActionPerformed

    private void cekilisYapButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cekilisYapButtonActionPerformed
    {//GEN-HEADEREND:event_cekilisYapButtonActionPerformed
       if (filePath == null)
       {
           JOptionPane.showMessageDialog(this, "Lutfen Bir Çekiliş Dosyasi Seçin!");
       }
       else
       {
           kazananlar.clear();
           
           dosyaOku();
           
           model.removeAllElements();
           for (String s : kazananlar)
           {
               model.addElement(s);
           }
           
           alkisla();
       }
    }//GEN-LAST:event_cekilisYapButtonActionPerformed


    public static void main(String args[])
    {
        
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Windows".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
  
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cekilisYapButton;
    private javax.swing.JTextField filePathField;
    private javax.swing.JButton gozat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> kazananListesi;
    // End of variables declaration//GEN-END:variables
}
