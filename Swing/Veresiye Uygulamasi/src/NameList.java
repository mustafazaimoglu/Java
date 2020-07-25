
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class NameList extends javax.swing.JDialog
{

    private int index;

    ArrayList<Users> list;

    DefaultListModel listModel = new DefaultListModel();

    public NameList(java.awt.Frame parent, boolean modal, ArrayList<Users> list)
    {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        listField.setModel(listModel);
        this.list = list;
        addSomeName();
        addElement();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listField = new javax.swing.JList<>();
        addButton = new javax.swing.JButton();
        chooseButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton1 = new javax.swing.JButton();
        messageField = new javax.swing.JLabel();

        setTitle("İsim Listesi");

        jPanel1.setBackground(new java.awt.Color(193, 215, 218));

        listField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        listField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        listField.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(listField);

        addButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addButton.setText("Ekle");
        addButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                addButtonActionPerformed(evt);
            }
        });

        chooseButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chooseButton.setText("Seç");
        chooseButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                chooseButtonActionPerformed(evt);
            }
        });

        editButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        editButton.setText("Düzenle");
        editButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                editButtonActionPerformed(evt);
            }
        });

        deleteButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deleteButton1.setText("Sil");
        deleteButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                deleteButton1ActionPerformed(evt);
            }
        });

        messageField.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        messageField.setForeground(new java.awt.Color(255, 0, 0));
        messageField.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chooseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(messageField, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(deleteButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(messageField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(chooseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_addButtonActionPerformed
    {//GEN-HEADEREND:event_addButtonActionPerformed
        messageField.setText("");
        String name = JOptionPane.showInputDialog(this, "Lutfen Eklenecek İsmi Giriniz :", "İsim Gir", 3);

        if (name != null)
        {
            if (name.trim().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Boş Bir Kullanıcı Adı Girdiniz!", "Uyarı", 0);
            }
            else
            {
                list.add(new Users(name));
                addElement();
                messageField.setText("Başarı İle Eklendi!");
            }
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void chooseButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_chooseButtonActionPerformed
    {//GEN-HEADEREND:event_chooseButtonActionPerformed
        int selectedItem = listField.getSelectedIndex();

        if (selectedItem == -1)
        {
            if (listModel.getSize() == 0)
            {
                JOptionPane.showMessageDialog(this, "Liste Şu Anda Boş!", "Uyarı", 0);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Lutfen Bir Kullanıcı Seçiniz!", "Uyarı", 0);
            }
        }
        else
        {
            index = selectedItem;
            setVisible(false);
        }

    }//GEN-LAST:event_chooseButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_editButtonActionPerformed
    {//GEN-HEADEREND:event_editButtonActionPerformed
        messageField.setText("");
        int selectedItem = listField.getSelectedIndex();

        if (selectedItem == -1)
        {
            if (listModel.getSize() == 0)
            {
                JOptionPane.showMessageDialog(this, "Liste Şu Anda Boş!", "Uyarı", 0);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Lutfen Bir Kullanıcı Seçiniz!", "Uyarı", 0);
            }
        }
        else
        {
            String name = JOptionPane.showInputDialog(this, "Lutfen Yeni İsmi Giriniz :", "İsim Gir", 3);

            if (name != null)
            {
                if (name.trim().equals(""))
                {
                    JOptionPane.showMessageDialog(this, "Boş Bir Kullanıcı Adı Girdiniz!", "Uyarı", 0);
                }
                else
                {
                    Users u = list.get(selectedItem);
                    u.setName(name);
                    list.set(selectedItem, u);
                    addElement();
                    messageField.setText("Başarı İle Düzenlendi!");
                }
            }
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void deleteButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_deleteButton1ActionPerformed
    {//GEN-HEADEREND:event_deleteButton1ActionPerformed
        messageField.setText("");
        int selectedItem = listField.getSelectedIndex();

        if (selectedItem == -1)
        {
            if (listModel.getSize() == 0)
            {
                JOptionPane.showMessageDialog(this, "Liste Şu Anda Boş!", "Uyarı", 0);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Lutfen Bir Kullanıcı Seçiniz!", "Uyarı", 0);
            }
        }
        else
        {
            listModel.removeElementAt(selectedItem);
            list.remove(selectedItem);
            messageField.setText("Başarı İle Silindi!");
        }
    }//GEN-LAST:event_deleteButton1ActionPerformed

    public void addElement()
    {
        listModel.clear();

        if (!list.isEmpty())
        {
            for (Users u : list)
            {
                listModel.addElement(u.getName());
            }
        }

    }

    public int getIndex()
    {
        return index;
    }
    
    public void addSomeName()
    {
        list.add(new Users("Mustafa Zaimoğlu"));
        list.add(new Users("Mehmet Badem"));
        list.add(new Users("Ege Barışan"));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton chooseButton;
    private javax.swing.JButton deleteButton1;
    private javax.swing.JButton editButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listField;
    private javax.swing.JLabel messageField;
    // End of variables declaration//GEN-END:variables
}
