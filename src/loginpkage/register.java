/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package loginpkage;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author User1
 */
public class register extends javax.swing.JFrame {

    /**
     * Creates new form register
     */
    public register() {
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
        jTextField1 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        photo = new javax.swing.JLabel();
        signinbtn2 = new javax.swing.JButton();
        signinbtn3 = new javax.swing.JButton();
        signinbtn4 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
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
        jPanel1.add(signinbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 980, -1, -1));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField1.setBorder(null);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 360, 30));

        jTextField9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField9.setBorder(null);
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 630, 360, 30));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField2.setBorder(null);
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, 360, 30));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField3.setBorder(null);
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 520, 360, 30));

        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField4.setBorder(null);
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 740, 360, 30));

        jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField5.setBorder(null);
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 860, 360, 30));

        jTextField6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField6.setBorder(null);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 630, 360, 30));

        jTextField7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField7.setBorder(null);
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 740, 360, 30));

        jTextField8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField8.setBorder(null);
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 176, 360, 30));

        jLabel6.setFont(new java.awt.Font("Goudy Old Style", 1, 43)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("NEW EMPLOYMENT");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginpkage/register text field.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginpkage/register text field.png"))); // NOI18N
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginpkage/register text field.png"))); // NOI18N
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 510, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginpkage/register text field.png"))); // NOI18N
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 850, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginpkage/register text field.png"))); // NOI18N
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 620, -1, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginpkage/register text field.png"))); // NOI18N
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel9.setText("ID Number");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel10.setText("Phone Number ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 580, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel12.setText("E-mail Address");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 810, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel14.setText("Gender");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel16.setText("Age");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel18.setText("Profile Picture");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 150, -1, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginpkage/register text field.png"))); // NOI18N
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 730, -1, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel26.setText("Education");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 580, -1, -1));

        photo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 180, 230, 280));

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
        jPanel1.add(signinbtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 990, -1, -1));

        signinbtn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginpkage/chooseimagebtn.png"))); // NOI18N
        signinbtn4.setBorderPainted(false);
        signinbtn4.setContentAreaFilled(false);
        signinbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinbtn4ActionPerformed(evt);
            }
        });
        jPanel1.add(signinbtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 480, -1, -1));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginpkage/register text field.png"))); // NOI18N
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 620, -1, -1));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginpkage/register text field.png"))); // NOI18N
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 730, -1, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel30.setText("Designation");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 690, -1, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel31.setText("Address");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 690, -1, -1));

        jLabel32.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel32.setText("Name");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, -1, -1));

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

    private void signinbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinbtn1ActionPerformed
       
    }//GEN-LAST:event_signinbtn1ActionPerformed

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
        
        photo.setIcon(new ImageIcon(file.toString()));
        filename = file.getAbsolutePath();

try {
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte [] buf = new byte [1024];
            for(int readnum;(readnum = fis.read(buf))!= -1;){
            
                bos.write(buf,0,readnum);
        } 
         
       
            
        } catch (Exception e) {
            
        }

     
    }//GEN-LAST:event_signinbtn4ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel photo;
    private javax.swing.JButton signinbtn1;
    private javax.swing.JButton signinbtn2;
    private javax.swing.JButton signinbtn3;
    private javax.swing.JButton signinbtn4;
    // End of variables declaration//GEN-END:variables
String filename = null;
}
