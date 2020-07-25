
import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class NotePad extends javax.swing.JFrame
{

    public NotePad()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        open = new javax.swing.JMenuItem();
        save = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        yaziRenkDegistir = new javax.swing.JMenuItem();
        arkaPlanRenkDegistir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        arial = new javax.swing.JMenuItem();
        tohama = new javax.swing.JMenuItem();
        comicSans = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NotePad");
        setBounds(new java.awt.Rectangle(500, 200, 0, 0));

        text.setBackground(new java.awt.Color(102, 102, 102));
        text.setColumns(20);
        text.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        text.setForeground(new java.awt.Color(255, 255, 255));
        text.setRows(5);
        text.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        text.setDoubleBuffered(true);
        jScrollPane1.setViewportView(text);

        jLabel1.setText("Coded By MKZ");

        jMenu3.setText("Dosya");

        open.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        open.setText("Aç");
        open.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                openActionPerformed(evt);
            }
        });
        jMenu3.add(open);

        save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        save.setText("Kaydet");
        save.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                saveActionPerformed(evt);
            }
        });
        jMenu3.add(save);

        exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        exit.setText("Çıkış");
        exit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                exitActionPerformed(evt);
            }
        });
        jMenu3.add(exit);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Düzen");
        jMenu4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenu1.setText("Renk");

        yaziRenkDegistir.setText("Yazı Rengi Değiştir");
        yaziRenkDegistir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                yaziRenkDegistirActionPerformed(evt);
            }
        });
        jMenu1.add(yaziRenkDegistir);

        arkaPlanRenkDegistir.setText("Arka Plan Renk Değiştir");
        arkaPlanRenkDegistir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                arkaPlanRenkDegistirActionPerformed(evt);
            }
        });
        jMenu1.add(arkaPlanRenkDegistir);

        jMenu4.add(jMenu1);

        jMenu2.setText("Yazı Tipi");

        arial.setText("Arial");
        arial.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                arialActionPerformed(evt);
            }
        });
        jMenu2.add(arial);

        tohama.setText("Tohama");
        tohama.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                tohamaActionPerformed(evt);
            }
        });
        jMenu2.add(tohama);

        comicSans.setText("Comic Sans MS");
        comicSans.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                comicSansActionPerformed(evt);
            }
        });
        jMenu2.add(comicSans);

        jMenu4.add(jMenu2);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_saveActionPerformed
    {//GEN-HEADEREND:event_saveActionPerformed
        JFileChooser fc = new JFileChooser();
        
        int i = fc.showSaveDialog(this);
        
        if (i == JFileChooser.APPROVE_OPTION)
        {
            String path = fc.getSelectedFile().getPath();
            
            try (FileWriter fw = new FileWriter(path))
            {
                fw.write(text.getText());   
            } 
            catch (IOException ex)
            {
                Logger.getLogger(NotePad.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_saveActionPerformed

    private void yaziRenkDegistirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_yaziRenkDegistirActionPerformed
    {//GEN-HEADEREND:event_yaziRenkDegistirActionPerformed
        Color color = JColorChooser.showDialog(this, "Lutfen Bir Renk Seçiniz", Color.black);
        
        text.setForeground(color);
    }//GEN-LAST:event_yaziRenkDegistirActionPerformed

    private void openActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_openActionPerformed
    {//GEN-HEADEREND:event_openActionPerformed
        JFileChooser fc = new JFileChooser();
        
        int i = fc.showOpenDialog(this);
        
        if (i == JFileChooser.APPROVE_OPTION)
        {
            File file = fc.getSelectedFile();
            
            try(Scanner scanner = new Scanner(new BufferedReader(new FileReader(file))))
            {
               String icerik = "";
               
               while (scanner.hasNextLine())
               {
                   icerik += scanner.nextLine() + "\n";
               }
               
               text.setText(icerik);
            } 
            catch (FileNotFoundException ex)
            {
                JOptionPane.showMessageDialog(this, "Dosya Bulunamadı!");           
            }
        }
    }//GEN-LAST:event_openActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_exitActionPerformed
    {//GEN-HEADEREND:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void arialActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_arialActionPerformed
    {//GEN-HEADEREND:event_arialActionPerformed
        Font font = new Font("Arial", 0, 14);
        
        text.setFont(font);
    }//GEN-LAST:event_arialActionPerformed

    private void tohamaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_tohamaActionPerformed
    {//GEN-HEADEREND:event_tohamaActionPerformed
        Font font = new Font("Tohama", 0, 14);
        
        text.setFont(font);
    }//GEN-LAST:event_tohamaActionPerformed

    private void comicSansActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_comicSansActionPerformed
    {//GEN-HEADEREND:event_comicSansActionPerformed
        Font font = new Font("Comic Sans MS", 0, 14);
        
        text.setFont(font);
    }//GEN-LAST:event_comicSansActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenu4ActionPerformed
    {//GEN-HEADEREND:event_jMenu4ActionPerformed
        
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void arkaPlanRenkDegistirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_arkaPlanRenkDegistirActionPerformed
    {//GEN-HEADEREND:event_arkaPlanRenkDegistirActionPerformed
        Color color = JColorChooser.showDialog(this, "Lutfen Bir Renk Seçiniz", Color.LIGHT_GRAY);
        
        text.setBackground(color);
    }//GEN-LAST:event_arkaPlanRenkDegistirActionPerformed

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
            java.util.logging.Logger.getLogger(NotePad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(NotePad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(NotePad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(NotePad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new NotePad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem arial;
    private javax.swing.JMenuItem arkaPlanRenkDegistir;
    private javax.swing.JMenuItem comicSans;
    private javax.swing.JMenuItem exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem open;
    private javax.swing.JMenuItem save;
    private javax.swing.JTextArea text;
    private javax.swing.JMenuItem tohama;
    private javax.swing.JMenuItem yaziRenkDegistir;
    // End of variables declaration//GEN-END:variables
}
