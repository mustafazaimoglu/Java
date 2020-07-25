
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Main extends javax.swing.JFrame
{
    private int index = -1;

    ArrayList<Users> list = new ArrayList<>();
    ArrayList<ProductList> pl;

    NameList nl = new NameList(this, true, list); //True cuz programın beklemesini istiyoruz

    EditingScreen es = new EditingScreen(this, true);

    DefaultTableModel model;

    public Main()
    {
        initComponents();
        setLocationRelativeTo(null);
        model = (DefaultTableModel) table.getModel();
        isUsable();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        panel1 = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        clearButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        totalMoneyField = new javax.swing.JTextField();
        nameArea = new javax.swing.JLabel();
        changeButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Veresiye Defteri");

        panel1.setBackground(new java.awt.Color(193, 215, 218));

        addButton.setText("Ekle");
        addButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                addButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Sil");
        deleteButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                deleteButtonActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Ürün Adı", "Tarih", "Fiyat"
            }
        ));
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0)
        {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
        }

        clearButton.setText("Temizle");
        clearButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                clearButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Toplam Borç");

        totalMoneyField.setEditable(false);
        totalMoneyField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        totalMoneyField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        nameArea.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        nameArea.setForeground(new java.awt.Color(51, 0, 51));
        nameArea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        changeButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        changeButton.setText("Seç");
        changeButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                changeButtonActionPerformed(evt);
            }
        });

        editButton.setText("Düzenle");
        editButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                editButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameArea, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(changeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(totalMoneyField, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(editButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(33, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(46, 46, 46))))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(changeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(nameArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalMoneyField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_deleteButtonActionPerformed
    {//GEN-HEADEREND:event_deleteButtonActionPerformed
        int selectedRow = table.getSelectedRow();
        
        if (selectedRow == -1)
        {
            if (model.getRowCount() == 0)
            {
                JOptionPane.showMessageDialog(this, "Tablo Şu Anda Boş!", "Uyarı", 0);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Lutfen Bir Satır Seçiniz!", "Uyarı", 0);
            }
        }
        else
        {
            model.removeRow(selectedRow);
            list.get(index).urunCikar(selectedRow);
            
            fillTable();
        }   
    }//GEN-LAST:event_deleteButtonActionPerformed
 
    private void editButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_editButtonActionPerformed
    {//GEN-HEADEREND:event_editButtonActionPerformed
        int selectedRow = table.getSelectedRow();
        
        if (selectedRow == -1)
        {
            if (model.getRowCount() == 0)
            {
                JOptionPane.showMessageDialog(this, "Tablo Şu Anda Boş!", "Uyarı", 0);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Lutfen Bir Satır Seçiniz!", "Uyarı", 0);
            }
        }
        else
        {
            String product = model.getValueAt(selectedRow, 0).toString();
            String price = model.getValueAt(selectedRow, 2).toString();
            
            es.setProductName(product);
            es.setPrice(price);
            
            es.setVisible(true);
            
            list.get(index).urunDuzenle(selectedRow, es.getProductName(), es.getPrice());
            
            fillTable();            
            
        }
              
    }//GEN-LAST:event_editButtonActionPerformed

    private void changeButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_changeButtonActionPerformed
    {//GEN-HEADEREND:event_changeButtonActionPerformed

        nl.setVisible(true);

        index = nl.getIndex();

        if (!list.isEmpty())
        {
            nameArea.setText(list.get(index).getName());
            pl = list.get(index).getProductList();
            isUsable();
            fillTable();
        }
       
    }//GEN-LAST:event_changeButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_addButtonActionPerformed
    {//GEN-HEADEREND:event_addButtonActionPerformed

        es.setVisible(true);

        String productName = es.getProductName();

        String price = es.getPrice();
        
        list.get(index).urunEkle(productName, price);

        fillTable();
    }//GEN-LAST:event_addButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_clearButtonActionPerformed
    {//GEN-HEADEREND:event_clearButtonActionPerformed
        model.setRowCount(0);
        pl.clear();
        totalMoneyField.setText("0");
    }//GEN-LAST:event_clearButtonActionPerformed

    public void isUsable()
    {
        boolean b = false;
        
        if (index != -1)
        {
            b = true;
        }       
        
        addButton.setEnabled(b);
        deleteButton.setEnabled(b);
        editButton.setEnabled(b);
        clearButton.setEnabled(b);
    }
    
    public void fillTable ()
    {
        model.setRowCount(0);
        int total = 0;
        
        if (!pl.isEmpty())
        {
            for (ProductList p : pl)
            {
                Object[] toAdd = {p.getProductName(),p.getDate(),p.getPrice()};
                total += Integer.parseInt(p.getPrice());
                
                model.addRow(toAdd);
            }
        }
        
        totalMoneyField.setText(String.valueOf(total));
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton changeButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameArea;
    private javax.swing.JPanel panel1;
    private javax.swing.JTable table;
    private javax.swing.JTextField totalMoneyField;
    // End of variables declaration//GEN-END:variables
}
