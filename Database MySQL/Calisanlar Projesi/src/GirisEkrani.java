
import javax.swing.JOptionPane;

public class GirisEkrani extends javax.swing.JFrame
{

    CalisanIslemleri islemler = new CalisanIslemleri();

    public GirisEkrani()
    {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        messageField = new javax.swing.JLabel();
        girisButton = new javax.swing.JButton();
        kayitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main");
        setLocation(new java.awt.Point(450, 180));

        jLabel1.setText("Kulanıcı Adı :");

        jLabel2.setText("Parola :");

        messageField.setForeground(new java.awt.Color(255, 0, 0));
        messageField.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        girisButton.setText("Giriş");
        girisButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                girisButtonActionPerformed(evt);
            }
        });

        kayitButton.setText("Kayıt");
        kayitButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                kayitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(kayitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(girisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(messageField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(usernameField)
                                .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(messageField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(girisButton)
                    .addComponent(kayitButton))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void girisButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_girisButtonActionPerformed
    {//GEN-HEADEREND:event_girisButtonActionPerformed
        messageField.setText("");

        String username = usernameField.getText();
        String password = String.valueOf(passwordField.getPassword());

        boolean result = islemler.girisYap(username, password);

        if (result)
        {
            CalisanEkrani calisanEkrani = new CalisanEkrani(this, true);
            setVisible(false);

            calisanEkrani.setVisible(true);

            System.exit(0);
        }
        else
        {
            messageField.setText("Giris Basarisiz....");
        }

    }//GEN-LAST:event_girisButtonActionPerformed

    private void kayitButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_kayitButtonActionPerformed
    {//GEN-HEADEREND:event_kayitButtonActionPerformed
        String username = usernameField.getText();
        String password = String.valueOf(passwordField.getPassword());

        if (!username.equals("") && !password.equals(""))
        {
            String againPassword = JOptionPane.showInputDialog(this, "Şifre Tekrar Giriniz :", "Şifre Tekrar", 1);

            if (againPassword != null)
            {
                if (password.equals(againPassword))
                {
                    islemler.kayitYap(username, password);
                    messageField.setText("İşlem Başarı İle Tamamlandı!");
                }
                else
                {
                    messageField.setText("Girilen Şifreler Uyuşmuyor!!!");
                }
            }
            else
            {
                messageField.setText("İşlem Kullanici Tarafından İptal Edildi...");
            }
        }
        else
        {
            messageField.setText("Verilen Alanlar Boş Bırakılamaz!");
        }

    }//GEN-LAST:event_kayitButtonActionPerformed

    // <editor-fold defaultstate="collapsed" desc="Main Part">
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
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new GirisEkrani().setVisible(true);
            }
        });
    }// </editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton girisButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton kayitButton;
    private javax.swing.JLabel messageField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables

}
