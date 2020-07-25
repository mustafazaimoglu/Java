
import javax.swing.JOptionPane;


public class CoronaTest extends javax.swing.JFrame
{
    private static String sehirler[] = {"İstanbul","İzmir","Konya","Kocaeli","Ankara","Sakarya","Bursa","Trabzon","Zonguldak"};
    private static int testSonucu = 0;

    public CoronaTest()
    {
        initComponents();
    }
    
    public void sehirBulucu(String a)
    {
        for (String s : sehirler)
        {
            if (s.equalsIgnoreCase(a.trim()))
            {
                testSonucu += 8;
                return;
            }
        }
        
        testSonucu += 4;          
    }

    public void sonucBul()
    {
        if (testSonucu < 19)
        {
            JOptionPane.showMessageDialog(this, "Enfekte Olma Olasılığınız Düşüktür.");
        }
        else if (testSonucu < 26)
        {
            JOptionPane.showMessageDialog(this, "Enfekte Olma Olasılığınız Ortadır.");
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Enfekte Olma Olasılığınız Yüksektir.");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        cinsiyet = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        yas = new javax.swing.JTextField();
        memleket = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        sehirDisi = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        yuksekAtes = new javax.swing.JCheckBox();
        basagrisi = new javax.swing.JCheckBox();
        kusma = new javax.swing.JCheckBox();
        sikisma = new javax.swing.JCheckBox();
        nefesDarligi = new javax.swing.JCheckBox();
        halsizlik = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        erkek = new javax.swing.JRadioButton();
        kadın = new javax.swing.JRadioButton();
        kontrol = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Corona Test Application");
        setBounds(new java.awt.Rectangle(500, 200, 0, 0));

        jLabel1.setText("Yaşınız : ");

        memleket.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                memleketActionPerformed(evt);
            }
        });

        jLabel2.setText("Yaşadığınız Şehir : ");

        sehirDisi.setText("Evet");

        jLabel3.setText("Son 14 Gün İçinde Şehir dışına çıktınız mı?");

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel4.setText("Semptomlar");

        yuksekAtes.setText("Yuksek Ateş");

        basagrisi.setText("Şiddetli Baş Ağrısı");

        kusma.setText("Kusma");
        kusma.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                kusmaActionPerformed(evt);
            }
        });

        sikisma.setText("Gögüs Bölgesinde Sıkışma");

        nefesDarligi.setText("Nefes Darlığı");

        halsizlik.setText("Halsizlik");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(basagrisi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(halsizlik))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(sikisma)
                                    .addGap(18, 18, 18)
                                    .addComponent(kusma))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(yuksekAtes)
                                    .addGap(54, 54, 54)
                                    .addComponent(nefesDarligi))))))
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yuksekAtes)
                    .addComponent(nefesDarligi))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sikisma)
                    .addComponent(kusma))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(halsizlik)
                    .addComponent(basagrisi))
                .addGap(0, 25, Short.MAX_VALUE))
        );

        jLabel5.setText("Cinsiyet : ");

        cinsiyet.add(erkek);
        erkek.setText("Erkek");

        cinsiyet.add(kadın);
        kadın.setText("Kadın");
        kadın.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                kadınActionPerformed(evt);
            }
        });

        kontrol.setText("Kontrol Et");
        kontrol.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                kontrolActionPerformed(evt);
            }
        });

        jLabel6.setText("Coded By MKZ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(kontrol)
                            .addGap(39, 39, 39)
                            .addComponent(jLabel6))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(sehirDisi))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(erkek, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(kadın))
                                    .addComponent(memleket, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                    .addComponent(yas))))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(yas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(erkek)
                    .addComponent(kadın))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memleket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sehirDisi))
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kontrol)
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void memleketActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_memleketActionPerformed
    {//GEN-HEADEREND:event_memleketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_memleketActionPerformed

    private void kusmaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_kusmaActionPerformed
    {//GEN-HEADEREND:event_kusmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kusmaActionPerformed

    private void kadınActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_kadınActionPerformed
    {//GEN-HEADEREND:event_kadınActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kadınActionPerformed

    private void kontrolActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_kontrolActionPerformed
    {//GEN-HEADEREND:event_kontrolActionPerformed
        testSonucu = 0;
        
        try
        {
            if (Integer.valueOf(yas.getText()) > 65)
            {
                testSonucu += 5;
            }
            else if (Integer.valueOf(yas.getText()) > 18)
            {
                testSonucu += 3;
            }
            else
            {
                testSonucu += 1;
            }
        }
        catch (NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(this, "Lutfen Alana Rakamlardan Başka karakter Girmeyiniz!");
            return;
        }
        
        if (erkek.isSelected())
        {
            testSonucu += 3;
        }
        else
        {
            testSonucu += 2;
        }
            
        sehirBulucu(memleket.getText());
        
        if (sehirDisi.isSelected())
        {
            String temp = JOptionPane.showInputDialog("Lutfen Çıktığınız Şehri Giriniz :");
            
            sehirBulucu(temp);
        }
        
        if (yuksekAtes.isSelected())
        {
            testSonucu += 6;
        }
        
        if (nefesDarligi.isSelected())
        {
            testSonucu += 6;
        }
        
        if (sikisma.isSelected())
        {
            testSonucu += 4;
        }
        
        if (kusma.isSelected())
        {
            testSonucu += 3;
        }
        
        if (basagrisi.isSelected())
        {
            testSonucu += 4;
        }
        
        if (halsizlik.isSelected())
        {
            testSonucu += 4;
        }
        
        sonucBul();
        
    }//GEN-LAST:event_kontrolActionPerformed

  
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
            java.util.logging.Logger.getLogger(CoronaTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(CoronaTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(CoronaTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(CoronaTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new CoronaTest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox basagrisi;
    private javax.swing.ButtonGroup cinsiyet;
    private javax.swing.JRadioButton erkek;
    private javax.swing.JCheckBox halsizlik;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton kadın;
    private javax.swing.JButton kontrol;
    private javax.swing.JCheckBox kusma;
    private javax.swing.JTextField memleket;
    private javax.swing.JCheckBox nefesDarligi;
    private javax.swing.JCheckBox sehirDisi;
    private javax.swing.JCheckBox sikisma;
    private javax.swing.JTextField yas;
    private javax.swing.JCheckBox yuksekAtes;
    // End of variables declaration//GEN-END:variables
}
