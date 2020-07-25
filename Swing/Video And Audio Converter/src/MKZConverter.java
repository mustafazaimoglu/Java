
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class MKZConverter extends javax.swing.JFrame
{
    Charset CHARTSET = Charset.forName("IBM857");
    private String inPath = "";
    private String outPath;
    
    public MKZConverter()
    {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        group1 = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        mkv = new javax.swing.JRadioButton();
        mp4 = new javax.swing.JRadioButton();
        avi = new javax.swing.JRadioButton();
        mov = new javax.swing.JRadioButton();
        flv = new javax.swing.JRadioButton();
        wmv = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        mp3 = new javax.swing.JRadioButton();
        wav = new javax.swing.JRadioButton();
        aac = new javax.swing.JRadioButton();
        flac = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        chooseFile = new javax.swing.JButton();
        dosyaYoluText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        convert = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MKZ Converter");
        setBounds(new java.awt.Rectangle(500, 200, 0, 0));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        jLabel2.setText("VIDEO");

        mkv.setBackground(new java.awt.Color(51, 204, 255));
        group1.add(mkv);
        mkv.setText("MKV");

        mp4.setBackground(new java.awt.Color(51, 204, 255));
        group1.add(mp4);
        mp4.setText("MP4");

        avi.setBackground(new java.awt.Color(51, 204, 255));
        group1.add(avi);
        avi.setText("AVI");

        mov.setBackground(new java.awt.Color(51, 204, 255));
        group1.add(mov);
        mov.setText("MOV");

        flv.setBackground(new java.awt.Color(51, 204, 255));
        group1.add(flv);
        flv.setText("FLV");

        wmv.setBackground(new java.awt.Color(51, 204, 255));
        group1.add(wmv);
        wmv.setText("WMV");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(flv)
                        .addGap(39, 39, 39)
                        .addComponent(wmv))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(avi)
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(mkv)
                                .addGap(37, 37, 37)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mp4)
                            .addComponent(mov))
                        .addGap(2, 2, 2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mkv)
                    .addComponent(mp4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(avi)
                    .addComponent(mov))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(flv)
                    .addComponent(wmv))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));

        mp3.setBackground(new java.awt.Color(255, 255, 102));
        group1.add(mp3);
        mp3.setText("MP3");

        wav.setBackground(new java.awt.Color(255, 255, 102));
        group1.add(wav);
        wav.setText("WAV");

        aac.setBackground(new java.awt.Color(255, 255, 102));
        group1.add(aac);
        aac.setText("AAC");

        flac.setBackground(new java.awt.Color(255, 255, 102));
        group1.add(flac);
        flac.setText("FLAC");

        jLabel3.setText("AUDIO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aac)
                    .addComponent(mp3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(wav)
                    .addComponent(flac))
                .addGap(18, 18, 18))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mp3)
                    .addComponent(wav))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aac)
                    .addComponent(flac))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));

        chooseFile.setText("Dosya Seç");
        chooseFile.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                chooseFileActionPerformed(evt);
            }
        });

        dosyaYoluText.setEditable(false);

        jLabel1.setText("Dosya Konumu :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chooseFile)
                .addGap(140, 140, 140))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dosyaYoluText, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dosyaYoluText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(chooseFile)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        convert.setText("Dönüştür");
        convert.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                convertActionPerformed(evt);
            }
        });

        jLabel4.setText("Coded By MKZ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(convert, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jLabel4)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(convert)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chooseFileActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_chooseFileActionPerformed
    {//GEN-HEADEREND:event_chooseFileActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        
        int i = fileChooser.showOpenDialog(this);
        
        if (i == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = fileChooser.getSelectedFile();
            
            inPath = "\"" + selectedFile.getPath() + "\"";

            dosyaYoluText.setForeground(Color.BLACK);
            dosyaYoluText.setText(inPath);
              
        }
        else if (i == JFileChooser.CANCEL_OPTION)
        {
            dosyaYoluText.setForeground(Color.RED);
            dosyaYoluText.setText("Herhangi Bir Dosya Seçilmedi!");
        }

    }//GEN-LAST:event_chooseFileActionPerformed

    private void convertActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_convertActionPerformed
    {//GEN-HEADEREND:event_convertActionPerformed
        if (inPath.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Herhangi Bir Dosya Seçilmedi!");
            return;
        }
        
        String ffmpeg = "Color B\n"
            + "cls\n"
            + "ffmpeg.exe -i ";
        int i;
        
        for (i = inPath.length()-1; i > 0; i--)
        {
            if (inPath.charAt(i) == '.')
            { 
                break;
            }
        }
        i++;
        
        outPath = inPath.substring(0, i); //Noktaya Kadar gelmek için....
        
        if (aac.isSelected())
        {
            outPath += "acc\"";
        }
        else if (avi.isSelected())
        {
            outPath += "avi\"";
        }
        else if (flac.isSelected())
        {
            outPath += "flac\"";
        }
        else if (flv.isSelected())
        {
            outPath += "flv\"";
        }
        else if (mkv.isSelected())
        {
            outPath += "mkv\"";
        }
        else if (mov.isSelected())
        {
            outPath += "mov\"";
        }
        else if (mp3.isSelected())
        {
            outPath += "mp3\"";
        }
        else if (mp4.isSelected())
        {
            outPath += "mp4\"";
        }
        else if (wav.isSelected())
        {
            outPath += "wav\"";
        }
        else if (wmv.isSelected())
        {
            outPath += "wmv\"";
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Herhangi Bir Format Seçilmedi!");
            return;
        }
        
        if (mp3.isSelected())
        {
            ffmpeg = ffmpeg + inPath + " -b:a 320K " + outPath;
        }
        else
        {
            ffmpeg = ffmpeg + inPath + " " + outPath;
        }
 
        
        FileOutputStream fileOutpuStream = null;
        
        try
        {
            fileOutpuStream = new FileOutputStream("Temp.bat");
            
            byte arr[] = ffmpeg.getBytes(CHARTSET);
            
            fileOutpuStream.write(arr);
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("Dosya Bulunamadı!!!");
        }
        catch (IOException ex)
        {
            System.out.println("IO Exception Oluştu!!!");
        }
        finally
        {
            try
            {
                fileOutpuStream.close();
            } 
            catch (IOException ex)
            {
                System.out.println("IO Exception Oluştu!!!");
            }
        }
        
        File temp = new File("Temp.bat");
        
        Desktop run = Desktop.getDesktop();
        
        try
        {
            run.open(temp);
        } 
        catch (IOException ex)
        {
            System.out.println("IO Exception Oluştu!!!");
        }

        temp.deleteOnExit();
    }//GEN-LAST:event_convertActionPerformed

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
            java.util.logging.Logger.getLogger(MKZConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(MKZConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(MKZConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(MKZConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new MKZConverter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton aac;
    private javax.swing.JRadioButton avi;
    private javax.swing.JButton chooseFile;
    private javax.swing.JButton convert;
    private javax.swing.JTextField dosyaYoluText;
    private javax.swing.JRadioButton flac;
    private javax.swing.JRadioButton flv;
    private javax.swing.ButtonGroup group1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton mkv;
    private javax.swing.JRadioButton mov;
    private javax.swing.JRadioButton mp3;
    private javax.swing.JRadioButton mp4;
    private javax.swing.JRadioButton wav;
    private javax.swing.JRadioButton wmv;
    // End of variables declaration//GEN-END:variables
}
