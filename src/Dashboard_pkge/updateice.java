/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Dashboard_pkge;

import java.util.ArrayList;
import java.util.List;
import Dashboard_pkge.dbconnection;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author User1
 */
public class updateice extends javax.swing.JFrame {

    /**
     * Creates new form updateice
     */
    public updateice() {
        initComponents();
    }
public void data1(){
    int itemid = Integer.parseInt(itemidtxt.getText());
       
        try {
             String sql = "Select * from icecream where itemid = '"+itemid+"'";
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    
    ResultSet rs = ste.executeQuery();
//    ste.setInt(11, empid);
    if(rs.next()){
    String pname = rs.getString(1);
    int pprice = rs.getInt(2);
    String ptype = rs.getString(3);
    String psupplier = rs.getString(4);
    String pdescription = rs.getString(5);
    String pid = rs.getString(7);

 
    
    
    InputStream in = rs.getBinaryStream(6);
    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            imageicons.setIcon(imageIcon);
    
    productname.setText(pname);
    productid.setText(String.valueOf(pid));
    pricetxt.setText(String.valueOf(pprice));
    typetxt.setText(ptype);
    suppliertxt.setText(String.valueOf(psupplier));
    descriptiontxt.setText(pdescription); 
        
           
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        productid = new javax.swing.JTextField();
        pductnme1 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        signinbtn1 = new javax.swing.JButton();
        productname = new javax.swing.JTextField();
        typetxt = new javax.swing.JTextField();
        pricetxt = new javax.swing.JTextField();
        suppliertxt = new javax.swing.JTextField();
        descriptiontxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        imageicons = new javax.swing.JLabel();
        signinbtn2 = new javax.swing.JButton();
        signinbtn3 = new javax.swing.JButton();
        signinbtn4 = new javax.swing.JButton();
        pductnme = new javax.swing.JLabel();
        errormsg3 = new javax.swing.JLabel();
        errormsg5 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        pductnme2 = new javax.swing.JLabel();
        itemidtxt = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        pricetxt1 = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        productid.setBorder(null);
        productid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productidActionPerformed(evt);
            }
        });
        jPanel1.add(productid, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 320, 360, 30));

        pductnme1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        pductnme1.setText("Product ID");
        jPanel1.add(pductnme1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 280, -1, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginpkage/register text field.png"))); // NOI18N
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 310, -1, -1));

        signinbtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginpkage/editbtnn.png"))); // NOI18N
        signinbtn1.setBorderPainted(false);
        signinbtn1.setContentAreaFilled(false);
        signinbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinbtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(signinbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 920, -1, -1));

        productname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        productname.setBorder(null);
        productname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productnameActionPerformed(evt);
            }
        });
        jPanel1.add(productname, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 220, 360, 30));

        typetxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        typetxt.setBorder(null);
        jPanel1.add(typetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 510, 360, 30));

        pricetxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pricetxt.setBorder(null);
        jPanel1.add(pricetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 410, 360, 30));

        suppliertxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        suppliertxt.setBorder(null);
        jPanel1.add(suppliertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 660, 360, 30));

        descriptiontxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        descriptiontxt.setBorder(null);
        jPanel1.add(descriptiontxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 800, 400, 70));

        jLabel6.setFont(new java.awt.Font("Goudy Old Style", 1, 43)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("UPDATE ICE - CREAM ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginpkage/register text field.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 500, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginpkage/register text field.png"))); // NOI18N
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 400, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginpkage/register text field.png"))); // NOI18N
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 650, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginpkage/long txt firld.png"))); // NOI18N
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 790, -1, 90));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginpkage/register text field.png"))); // NOI18N
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 210, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel9.setText("Supplier");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 610, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel10.setText("Description");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 750, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel14.setText("Price");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 370, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel16.setText("Type");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 460, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel18.setText("Product Picture");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, -1, -1));

        imageicons.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(imageicons, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 240, 290));

        signinbtn2.setIcon(new javax.swing.ImageIcon("G:\\huice_bar assets\\buttons\\backbtn.png")); // NOI18N
        signinbtn2.setBorderPainted(false);
        signinbtn2.setContentAreaFilled(false);
        signinbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinbtn2ActionPerformed(evt);
            }
        });
        jPanel1.add(signinbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        signinbtn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginpkage/clearbtn.png"))); // NOI18N
        signinbtn3.setBorderPainted(false);
        signinbtn3.setContentAreaFilled(false);
        signinbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinbtn3ActionPerformed(evt);
            }
        });
        jPanel1.add(signinbtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 930, -1, -1));

        signinbtn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginpkage/chooseimagebtn.png"))); // NOI18N
        signinbtn4.setBorderPainted(false);
        signinbtn4.setContentAreaFilled(false);
        signinbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinbtn4ActionPerformed(evt);
            }
        });
        jPanel1.add(signinbtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, -1, -1));

        pductnme.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        pductnme.setText("Product Name");
        jPanel1.add(pductnme, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 180, -1, -1));

        errormsg3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        errormsg3.setForeground(new java.awt.Color(255, 0, 0));
        errormsg3.setText("NOTE");
        jPanel1.add(errormsg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, -1, -1));

        errormsg5.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        errormsg5.setText("Image SIze Should Be 250 *210px");
        jPanel1.add(errormsg5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 470, -1, -1));

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/searchbtn.png"))); // NOI18N
        search.setBorder(null);
        search.setBorderPainted(false);
        search.setContentAreaFilled(false);
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 710, -1, -1));

        pductnme2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        pductnme2.setText("Item ID");
        jPanel1.add(pductnme2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 620, -1, -1));

        itemidtxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemidtxt.setBorder(null);
        itemidtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemidtxtActionPerformed(evt);
            }
        });
        jPanel1.add(itemidtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 660, 360, 30));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginpkage/register text field.png"))); // NOI18N
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 650, -1, -1));

        pricetxt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pricetxt1.setBorder(null);
        jPanel1.add(pricetxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 410, 360, 30));

        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/editbtnn.png"))); // NOI18N
        update.setBorder(null);
        update.setBorderPainted(false);
        update.setContentAreaFilled(false);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 510, -1, -1));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginpkage/Logingb.png"))); // NOI18N
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1460, 1100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1452, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void productidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productidActionPerformed

    private void signinbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinbtn1ActionPerformed
        try {
            String name1 = productname.getText().trim();
            String prodid = productid.getText().trim();
            String price = pricetxt.getText().trim();
            String type = typetxt.getText().trim();
            String supplier = suppliertxt.getText().trim();
            String description = descriptiontxt.getText().trim();
            String itemIdText = itemidtxt.getText().trim();

            if (itemIdText.isEmpty()) {
                System.out.println("Item ID is required to update the record.");
                return;
            }

            int empId = Integer.parseInt(itemIdText);

            // Build the dynamic SQL query
            StringBuilder sql = new StringBuilder("UPDATE icecream SET ");
            List<Object> parameters = new ArrayList<>();

            int test = 0;

            if (!name1.isEmpty()) {
                sql.append("productname= ?, ");
                parameters.add(name1);
                test = 1;
            }
            if (!price.isEmpty()) {
                sql.append("price = ?, ");
                parameters.add(Integer.parseInt(price));
                test = 1;
            }
            if (!type.isEmpty()) {
                sql.append("type = ?, ");
                parameters.add(type);
                test = 1;
            }
            if (!supplier.isEmpty()) {
                sql.append("suppliyer = ?, ");
                parameters.add(supplier);
                test = 1;
            }
            if (!description.isEmpty()) {
                sql.append("description = ?, ");
                parameters.add(description);
                test = 1;
            }
            if (!prodid.isEmpty()) {
                sql.append("productid = ?, ");
                parameters.add(prodid);
                test = 1;
            }

            try {

                if(test == 1){
                    
                }else{
                    String sql2 = "UPDATE juices SET photo = ? where itemid = ?  ";
                    Connection con = dbconnection.dbconnection();
                    PreparedStatement ste = con.prepareStatement(sql2);

                    ste.setBytes(1, name);
                    ste.setString(2, itemIdText);
                    ste.executeUpdate();
                }

            }         catch (Exception e) {
                System.out.println(e);
            }
            // Assuming `photoData` is set to a valid byte array for the photo field

            // Remove the last comma and add the WHERE clause
            sql.delete(sql.length() - 2, sql.length()).append(" WHERE itemid = ?;");
            parameters.add(empId);

            // Prepare the statement
            Connection con = dbconnection.dbconnection();
            PreparedStatement ste = con.prepareStatement(sql.toString());

            // Set parameters dynamically
            for (int i = 0; i < parameters.size(); i++) {
                Object param = parameters.get(i);
                if (param instanceof Integer) {
                    ste.setInt(i + 1, (Integer) param);
                } else if (param instanceof String) {
                    ste.setString(i + 1, (String) param);
                } else if (param instanceof byte[]) {
                    ste.setBytes(i + 1, (byte[]) param);
                }
            }

            // Execute the update
            int rowsUpdated = ste.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Juice updated successfully.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Please enter valid numbers .");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_signinbtn1ActionPerformed

    private void productnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productnameActionPerformed

    private void signinbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinbtn2ActionPerformed
        Dashboard_ui dsh = new Dashboard_ui();
        dsh.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signinbtn2ActionPerformed

    private void signinbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinbtn3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signinbtn3ActionPerformed

    private void signinbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinbtn4ActionPerformed

        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File file = chooser.getSelectedFile();

        imageicons.setIcon(new ImageIcon(file.toString()));
        filename = file.getAbsolutePath();

        try {
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte [] buf = new byte [1024];
            for(int readnum;(readnum = fis.read(buf))!= -1;){

                bos.write(buf,0,readnum);
            }
            name = bos.toByteArray();

        } catch (Exception e) {
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_signinbtn4ActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        data1();

        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void itemidtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemidtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemidtxtActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed

        int itemid = Integer.parseInt(itemidtxt.getText());
        try {
            String sql = "UPDATE juices SET type = 'orange apple2' where itemid = 1  ";
            Connection con = dbconnection.dbconnection();
            PreparedStatement ste = con.prepareStatement(sql);

            //           ste.setString(1, "apple");
            //         ste.setInt(2, itemid);
            ste.executeUpdate();

        }         catch (Exception e) {
            System.out.println(e);
        }

        //       String sql = "UPDATE your_table_name SET photo = ? WHERE itemid = ?";
        //    try (PreparedStatement pstmt = connection.prepareStatement(sql);
            //         FileInputStream fis = new FileInputStream(new File(imagePath))) {
            //
            //        pstmt.setBinaryStream(1, fis, (int) new File(imagePath).length());
            //        pstmt.setString(2, itemId);
            //
            //        int rowsUpdated = pstmt.executeUpdate();
            //        if (rowsUpdated > 0) {
                //            System.out.println("Image updated successfully.");
                //        } else {
                //            System.out.println("Item ID not found.");
                //        }
            //    } catch (Exception e) {
            //        e.printStackTrace();
            //    }
        //}
    }//GEN-LAST:event_updateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(updateice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JTextField descriptiontxt;
    private javax.swing.JLabel errormsg3;
    private javax.swing.JLabel errormsg5;
    private javax.swing.JLabel imageicons;
    private javax.swing.JTextField itemidtxt;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JLabel pductnme;
    public javax.swing.JLabel pductnme1;
    public javax.swing.JLabel pductnme2;
    private javax.swing.JTextField pricetxt;
    private javax.swing.JTextField pricetxt1;
    private javax.swing.JTextField productid;
    private javax.swing.JTextField productname;
    private javax.swing.JButton search;
    private javax.swing.JButton signinbtn1;
    private javax.swing.JButton signinbtn2;
    private javax.swing.JButton signinbtn3;
    private javax.swing.JButton signinbtn4;
    private javax.swing.JTextField suppliertxt;
    private javax.swing.JTextField typetxt;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
byte[] name = null;
String filename = null;
}
