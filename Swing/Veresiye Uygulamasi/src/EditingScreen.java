
import javax.swing.JOptionPane;

public class EditingScreen extends javax.swing.JDialog
{

    private String productName;
    private String price;

    public EditingScreen(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(this);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        productNameField = new javax.swing.JTextField();
        priceField = new javax.swing.JTextField();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        pushButton = new javax.swing.JButton();

        setTitle("Doldur");

        jPanel1.setBackground(new java.awt.Color(193, 215, 218));

        label1.setText("Ürün Adı :");

        label2.setText("Fiyat :");

        pushButton.setText("Tamam");
        pushButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                pushButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pushButton)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label1)
                            .addComponent(label2))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(productNameField)
                            .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2))
                .addGap(48, 48, 48)
                .addComponent(pushButton)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pushButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_pushButtonActionPerformed
    {//GEN-HEADEREND:event_pushButtonActionPerformed

        productName = productNameField.getText();

        price = priceField.getText();

        if (productName.equals("") || price.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Verilen Tüm Alanaları Doldurunuz!", "Uyarı", 0);
        }
        else
        {
            try
            {
                Integer.parseInt(price);
                setVisible(false);
                productNameField.setText("");
                priceField.setText("");
            }
            catch (NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(this, "Fiyat Sadece Sayı Olmalıdır!", "Uyarı", 0);
            }

        }


    }//GEN-LAST:event_pushButtonActionPerformed

    public String getProductName()
    {
        return productName;
    }

    public String getPrice()
    {
        return price;
    }

    public void setProductName(String productName)
    {
        productNameField.setText(productName);
    }

    public void setPrice(String price)
    {
        priceField.setText(price);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JTextField priceField;
    private javax.swing.JTextField productNameField;
    private javax.swing.JButton pushButton;
    // End of variables declaration//GEN-END:variables
}
