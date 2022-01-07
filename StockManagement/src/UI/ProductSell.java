/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;
import java.sql.Driver;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author Rutheim
 */

public class ProductSell extends javax.swing.JFrame {

    public ProductSell() {
        initComponents();
        GetCustomer();
        GetProduct();
        SelectProd();

    }
Connection Con=null;
Statement St=null;
ResultSet Rs=null;
PreparedStatement preparedStatement=null;
CallableStatement Cs=null;
public void SetNull()
{
ProductNo.setSelectedItem(null);
InvoiceNo.setText(null);
ProductAmount.setText(null);
ProdName.setText(null);
CustName.setText(null);
CustomerNo.setSelectedItem(null);
}
public void SelectProd()
{
    try {
        Con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XEPDB1","root","123456789");
        St=Con.createStatement();
        Rs=St.executeQuery("Select * from SellTbl");
        SellTable.setModel(DbUtils.resultSetToTableModel(Rs));
    } catch (Exception e) {
    }
}
private void GetCustomer(){
    try {
        Con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XEPDB1","root","123456789");
        St=Con.createStatement();
        String Query="SELECT * FROM root.CUSTOMERTBL ";
        Rs=St.executeQuery(Query);
        while(Rs.next()){
        String CCat=Rs.getString("CUSTOMERNO");
        CustomerNo.addItem(CCat);
        }
    } catch (Exception e) {
    }
}
private void GetProduct(){
    try {
        Con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XEPDB1","root","123456789");
        St=Con.createStatement();
        String Query="SELECT * FROM root.PRODUCTTBL ";
        Rs=St.executeQuery(Query);
        while(Rs.next()){
        String PCat=Rs.getString("URUNNO");
        ProductNo.addItem(PCat);
        }
    } catch (Exception e) {
    }
}

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        SellTable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        ProductAmount = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CustName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ProductNo = new javax.swing.JComboBox<>();
        CustomerNo = new javax.swing.JComboBox<>();
        InvoiceNo = new javax.swing.JTextField();
        ProdName = new javax.swing.JTextField();

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setText("X");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(900, 550));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 550));

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-sell-stock-90.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-arrow-pointing-left-30.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(53, 53, 53))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(199, 199, 199)
                .addComponent(jLabel1)
                .addContainerGap(231, Short.MAX_VALUE))
        );

        jButton2.setText("Sil");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        SellTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Müşteri No", "Müşteri Adı", "Fatura No", "Ürün Adı", "Ürün Adedi", "Ürün No"
            }
        ));
        SellTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SellTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(SellTable);

        jButton3.setText("Güncelle");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setText("Ürün Adedi");

        jLabel7.setText("Ürün No");

        CustName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustNameActionPerformed(evt);
            }
        });

        jLabel8.setText("Fatura No");

        jLabel9.setText("Müşteri Adı");

        jLabel10.setText("Müşteri No");

        jButton4.setText("Ekle");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setText("X");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel16.setText("-");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jLabel11.setText("Ürün Adı");

        ProductNo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        ProductNo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ProductNoİtemStateChanged(evt);
            }
        });
        ProductNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductNoActionPerformed(evt);
            }
        });

        CustomerNo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        CustomerNo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CustomerNoİtemStateChanged(evt);
            }
        });
        CustomerNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerNoMouseClicked(evt);
            }
        });
        CustomerNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerNoActionPerformed(evt);
            }
        });

        InvoiceNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvoiceNoActionPerformed(evt);
            }
        });

        ProdName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addComponent(CustName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CustomerNo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InvoiceNo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(113, 113, 113)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(ProductAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton2))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(153, 153, 153)))
                            .addComponent(ProductNo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProdName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel16))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InvoiceNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ProductNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CustomerNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProdName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ProductAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton3)
                            .addComponent(jButton2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(CustName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 114, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       if(InvoiceNo.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Lütfen Silinecek Faturayı Giriniz.");
        }
        else
        {
            try {
                Con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XEPDB1","root","123456789");
                String no=InvoiceNo.getText();
                String Query="DELETE FROM root.SELLTBL WHERE INVOICENO="+no;
                Statement Add= Con.createStatement();
                Add.execute(Query);
                SelectProd();
                SetNull();
                JOptionPane.showMessageDialog(this,"Fatura Başarıyla Silinmiştir.");
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void CustNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustNameActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
                System.exit(0);

    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked

      this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void ProductNoİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ProductNoİtemStateChanged
    String proN="";
            try {
        Con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XEPDB1","root","123456789");
        String no=ProductNo.getSelectedItem().toString();
        String Query="SELECT * FROM root.PRODUCTTBL WHERE URUNNO="+no;
        Rs=St.executeQuery(Query);
        while (Rs.next()) {
        proN=Rs.getString("UrunAdı");
       }
        ProdName.setText(proN);
        }   
       catch (Exception e) {
        }
    }//GEN-LAST:event_ProductNoİtemStateChanged

    private void ProductNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductNoActionPerformed

    private void CustomerNoİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CustomerNoİtemStateChanged
        String custN="";
            try {
        Con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XEPDB1","root","123456789");
        String no=CustomerNo.getSelectedItem().toString();
        String Query="SELECT * FROM root.CUSTOMERTBL WHERE CUSTOMERNO="+no;
        Rs=St.executeQuery(Query);
        while (Rs.next()) {
        custN=Rs.getString("CustomerName");
       }
        CustName.setText(custN);
        }   
       catch (Exception e) {
        }
    }//GEN-LAST:event_CustomerNoİtemStateChanged
    
    private void CustomerNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerNoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomerNoMouseClicked

    private void CustomerNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomerNoActionPerformed

    private void InvoiceNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvoiceNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InvoiceNoActionPerformed

    private void ProdNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProdNameActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(CustName.getText().isEmpty() || InvoiceNo.getText().isEmpty() || ProductAmount.getText().isEmpty() || ProdName.getText().isEmpty())
        {
        JOptionPane.showMessageDialog(this,"Bilgi Eksik.");
        }
        else
        {
            try {
                Con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XEPDB1","root","123456789");
                String UpdateQuery="UPDATE root.SELLTBL SET CUSTOMERNAME='"+CustName.getText()+"'"+",PRODUCTAMOUNT='"+ProductAmount.getText()+"'"+",PRODUCTNAME='"+ProdName.getText()+"'"+",PRODUCTNO='"+ProductNo.getSelectedItem().toString()+"'"+",CUSTOMERNO='"+CustomerNo.getSelectedItem().toString()+"'"+"WHERE INVOICENO="+InvoiceNo.getText();
                Statement Add=Con.createStatement();
                Add.execute(UpdateQuery);
                JOptionPane.showMessageDialog(this,"Fatura Başarıyla Güncellendi.");
                SelectProd();
                SetNull();
            }catch (Exception e) {
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         try {
            int sellamount;
            int urunno;
            Con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XEPDB1","root","123456789");
                PreparedStatement add=Con.prepareStatement("INSERT INTO SELLTBL VALUES(?,?,?,?,?,?)");
                add.setInt(1,Integer.valueOf(CustomerNo.getSelectedItem().toString()));
                add.setString(2,CustName.getText());        
                add.setInt(3,Integer.valueOf(InvoiceNo.getText()));
                add.setString(4,ProdName.getText());
                add.setInt(5,Integer.valueOf(ProductAmount.getText()));
                add.setInt(6,Integer.valueOf(ProductNo.getSelectedItem().toString()));
                int row =add.executeUpdate();
                sellamount=Integer.valueOf(ProductAmount.getText());
                urunno=Integer.valueOf(ProductNo.getSelectedItem().toString());
                JOptionPane.showMessageDialog(this,"Fatura Başarıyla Oluşturuldu.");
                String query = "{call sellproduct(?,?)}"; 
                Cs = Con.prepareCall(query);  
                Cs.setInt(1,urunno); 
                Cs.setInt(2, sellamount);  
                Cs.execute(); 
                Con.close();
                SetNull();
                SelectProd();
                
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void SellTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SellTableMouseClicked
    DefaultTableModel model=(DefaultTableModel)SellTable.getModel();
    int index=SellTable.getSelectedRow();
    InvoiceNo.setText(model.getValueAt(index,2).toString());
    CustName.setText(model.getValueAt(index,1).toString());
    ProdName.setText(model.getValueAt(index,3).toString());
    ProductAmount.setText(model.getValueAt(index,4).toString());
    
    }//GEN-LAST:event_SellTableMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductSell().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CustName;
    private javax.swing.JComboBox<String> CustomerNo;
    private javax.swing.JTextField InvoiceNo;
    private javax.swing.JTextField ProdName;
    private javax.swing.JTextField ProductAmount;
    private javax.swing.JComboBox<String> ProductNo;
    private javax.swing.JTable SellTable;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
