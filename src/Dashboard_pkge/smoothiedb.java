/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Dashboard_pkge;
import Dashboard_pkge.dbconnection;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import java.sql.ResultSet;
import javax.imageio.ImageIO;

/**
 *
 * @author User1
 */
public class smoothiedb extends javax.swing.JFrame {

    /**
     * Creates new form smoothiedb
     */
    public smoothiedb() {
        initComponents();
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
        signinbtn1 = new javax.swing.JButton();
        productname = new javax.swing.JTextField();
        typetxt = new javax.swing.JTextField();
        pricetxt = new javax.swing.JTextField();
        suppliertxt = new javax.swing.JTextField();
        descriptiontxt = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
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
        producttxt1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signinbtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginpkage/registerbtn.png"))); // NOI18N
        signinbtn1.setBorderPainted(false);
        signinbtn1.setContentAreaFilled(false);
        signinbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinbtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(signinbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 930, -1, -1));

        productname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        productname.setBorder(null);
        productname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productnameActionPerformed(evt);
            }
        });
        jPanel1.add(productname, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 220, 360, 30));

        typetxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        typetxt.setBorder(null);
        jPanel1.add(typetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 510, 360, 30));

        pricetxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pricetxt.setBorder(null);
        jPanel1.add(pricetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 400, 360, 30));

        suppliertxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        suppliertxt.setBorder(null);
        jPanel1.add(suppliertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 660, 360, 30));

        descriptiontxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        descriptiontxt.setBorder(null);
        jPanel1.add(descriptiontxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 800, 400, 70));

        jTextField7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField7.setBorder(null);
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 740, 360, 30));

        jLabel6.setFont(new java.awt.Font("Goudy Old Style", 1, 43)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("NEW SMOOTHIE REGISTRATION");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginpkage/register text field.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 500, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginpkage/register text field.png"))); // NOI18N
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 390, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginpkage/register text field.png"))); // NOI18N
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 650, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginpkage/long txt firld.png"))); // NOI18N
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 790, -1, 90));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginpkage/register text field.png"))); // NOI18N
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 210, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel9.setText("Supplier");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 610, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel10.setText("Description");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 750, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel14.setText("Price");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 360, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel16.setText("Type");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 460, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel18.setText("Product Picture");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, -1, -1));

        imageicons.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(imageicons, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 240, 290));

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
        jPanel1.add(signinbtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 950, -1, -1));

        signinbtn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginpkage/chooseimagebtn.png"))); // NOI18N
        signinbtn4.setBorderPainted(false);
        signinbtn4.setContentAreaFilled(false);
        signinbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinbtn4ActionPerformed(evt);
            }
        });
        jPanel1.add(signinbtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 480, -1, -1));

        pductnme.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        pductnme.setText("Product Name");
        jPanel1.add(pductnme, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 180, -1, -1));

        producttxt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        producttxt1.setBorder(null);
        jPanel1.add(producttxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 310, 360, 30));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginpkage/register text field.png"))); // NOI18N
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 300, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel15.setText("Product ID");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 270, -1, -1));

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
    }// </editor-fold>//GEN-END:initComponents

    private void signinbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinbtn1ActionPerformed
        try {

            String pname = productname.getText();
            int price = Integer.parseInt(pricetxt.getText());
            String type =typetxt.getText();
            String supplier = suppliertxt.getText();
            String descriprion = descriptiontxt.getText();
            String productid = producttxt1.getText();

            Connection con = dbconnection.dbconnection();
            String sql = "INSERT INTO  smoothiees (productname, price, type, suppliyer, description, photo, productid) VALUES (?, ?, ?, ?, ?, ?, ? )";
            PreparedStatement ste = con.prepareStatement(sql);

            ste.setString(1, pname);
            ste.setInt(2,price);
            ste.setString(3, type);
            ste.setString(4, supplier);
            ste.setString(5, descriprion);
            ste.setBytes(6, name);
            ste.setString(7,  productid);

            ste.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        try {
   
    String pname = productname.getText();
    int price = Integer.parseInt(pricetxt.getText());
    String type =typetxt.getText();
    String supplier = suppliertxt.getText();
    String descriprion = descriptiontxt.getText();
     String productid = producttxt1.getText();

    Connection con = dbconnection.dbconnection();
    String sql = "INSERT INTO item (productname, price, type, suppliyer, desvription, photo, productid ) VALUES (?, ?, ?, ?, ?, ?, ?)";
    PreparedStatement ste = con.prepareStatement(sql);
    
   ste.setString(1, pname);         
    ste.setInt(2,price);             
    ste.setString(3, type);       
    ste.setString(4, supplier);         
    ste.setString(5, descriprion);
    ste.setBytes(6, name);
     ste.setString(7,  productid);
    
    ste.executeUpdate();
    
    } catch (Exception e) {
    System.out.println(e);
}
    }//GEN-LAST:event_signinbtn1ActionPerformed

    private void productnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productnameActionPerformed

    private void signinbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinbtn2ActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(smoothiedb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(smoothiedb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(smoothiedb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(smoothiedb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new smoothiedb().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JTextField descriptiontxt;
    private javax.swing.JLabel imageicons;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField7;
    public javax.swing.JLabel pductnme;
    private javax.swing.JTextField pricetxt;
    private javax.swing.JTextField productname;
    private javax.swing.JTextField producttxt1;
    private javax.swing.JButton signinbtn1;
    private javax.swing.JButton signinbtn2;
    private javax.swing.JButton signinbtn3;
    private javax.swing.JButton signinbtn4;
    private javax.swing.JTextField suppliertxt;
    private javax.swing.JTextField typetxt;
    // End of variables declaration//GEN-END:variables
byte[] name = null;
String filename = null;
}
