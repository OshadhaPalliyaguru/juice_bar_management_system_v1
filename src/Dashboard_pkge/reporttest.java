/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Dashboard_pkge;

import java.sql.*;
import com.mysql.cj.protocol.Resultset;
import java.awt.Component;
//import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import net.proteanit.sql.DbUtils;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

/**
 *
 * @author User1
 */
public class reporttest extends javax.swing.JFrame {

    /**
     * Creates new form reporttest
     */
    public reporttest() {
//        tble();
        initComponents();
   

        
    }
    
    // Function to hide columns that are completely empty
public void hideEmptyColumns(JTable table) {
    TableModel model = table.getModel();

    // Loop through each column starting from the last to avoid index shifting issues
    for (int col = model.getColumnCount() - 1; col >= 0; col--) {
        boolean isEmpty = true;

        // Check each row in the column
        for (int row = 0; row < model.getRowCount(); row++) {
            Object value = model.getValueAt(row, col);
            if (value != null && !value.toString().trim().isEmpty()) {
                isEmpty = false;  // Column has some data
                break;
            }
        }

        // If the entire column is empty, hide it
        if (isEmpty) {
            TableColumn tableColumn = table.getColumnModel().getColumn(col);
            table.removeColumn(tableColumn);  // This hides the column from the JTable view
        }
    }
}
    
public void saveTableAsPDF(JTable table, String filePath) {
    // Create a new document in landscape mode (A4 rotated)
    Document document = new Document(PageSize.A4.rotate());

    try {
        // Create a PdfWriter instance
        PdfWriter.getInstance(document, new FileOutputStream(filePath));

        // Open the document
        document.open();

        // Check if the table has data
        if (table.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Table is empty. Cannot export to PDF.");
            return; // Exit the method if there is no data
        }

        // Create a PDF table with the same number of columns as the JTable
        PdfPTable pdfTable = new PdfPTable(table.getColumnCount());

        // Add table headers
        for (int i = 0; i < table.getColumnCount(); i++) {
            pdfTable.addCell(new PdfPCell(new Phrase(table.getColumnName(i))));
        }

        // Add table rows
        for (int rows = 0; rows < table.getRowCount(); rows++) {
            for (int cols = 0; cols < table.getColumnCount(); cols++) {
                Object value = table.getValueAt(rows, cols);
                if (value != null) {
                    pdfTable.addCell(new PdfPCell(new Phrase(value.toString())));
                } else {
                    pdfTable.addCell(""); // Add an empty cell if value is null
                }
            }
        }

        // Add the PDF table to the document
        document.add(pdfTable);

    } catch (DocumentException | FileNotFoundException e) {
        e.printStackTrace();
    } finally {
        // Close the document only if it was opened and content was added
        if (document.isOpen()) {
            document.close();
        }
    }
}

    Statement ste = null;
    public void tble(){
                  try {
  
   Connection con = dbconnection.dbconnection();
Statement ste = con.createStatement(); 
String sql = "SELECT `Orderid`, `Name_of_Item`, `item1_qty`, `item1_price`, `item2`, `item2_qty`, `item2_price`, `item3`, `item3_qty`, `item3_price`, `item4`, `item4_qty`, `item4_price`, `item5`, `item5_qty`, `item5_price`, `item6`, `item6_qty`, `item6_price`, `cash`, `total`, `change`, `Date_n_time`  FROM order_info";

ResultSet rs = ste.executeQuery(sql);
tble1.setModel(DbUtils.resultSetToTableModel(rs));



             
    
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
        jButton1 = new javax.swing.JButton();
        txt1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tble1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        downloadbtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/Frame 35357.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 170, -1, -1));

        txt1.setBorder(null);
        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });
        jPanel1.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 176, 580, 30));

        tble1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tble1.setGridColor(new java.awt.Color(255, 255, 255));
        tble1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tble1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 240, 1790, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/Password Input.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/Search Payments.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/juice barc logo.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        downloadbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/dwnload.png"))); // NOI18N
        downloadbtn.setBorder(null);
        downloadbtn.setBorderPainted(false);
        downloadbtn.setContentAreaFilled(false);
        downloadbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downloadbtnActionPerformed(evt);
            }
        });
        jPanel1.add(downloadbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 170, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/backbtn.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 1810, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
//        String fld = txt1.getText();
//        String sql = "SELECT `Orderid`, `Name_of_Item`, `item1_qty`,  `item2`, `item2_qty`,  `item3`, `item3_qty`,  `item4`, `item4_qty`, `item5`, `item5_qty`,  `item6`, `item6_qty`,  `cash`, `total`, `change`, `Date_n_time`  FROM order_info WHERE CAST(Date_n_time AS CHAR) LIKE '"+fld+"%'; ";
//
//        
//        System.out.println(fld);
//        try {
//            Connection con = dbconnection.dbconnection();
//            Statement ste = con.createStatement(); 
//
//
//ResultSet rs = ste.executeQuery(sql);
//tble1.setModel(DbUtils.resultSetToTableModel(rs));
//
//        } catch (Exception e) {
//        }



String fld = txt1.getText();

// Modify the SQL query to retrieve rows where at least one column has data (not NULL or empty)
String sql = "SELECT `Orderid`, `Name_of_Item`, `item1_qty`, `item2`, `item2_qty`, `item3`, `item3_qty`, " +
             "`item4`, `item4_qty`, `item5`, `item5_qty`, `item6`, `item6_qty`, `cash`, `total`, `change`, `Date_n_time` " +
             "FROM order_info " +
             "WHERE (CAST(Date_n_time AS CHAR) LIKE '" + fld + "%') " +  // Filter by Date_n_time
             "AND (`Orderid` IS NOT NULL AND `Orderid` <> '' " +
             "OR `Name_of_Item` IS NOT NULL AND `Name_of_Item` <> '' " +
             "OR `item1_qty` IS NOT NULL AND `item1_qty` <> '' " +
             "OR `item2` IS NOT NULL AND `item2` <> '' " +
             "OR `item2_qty` IS NOT NULL AND `item2_qty` <> '' " +
             "OR `item3` IS NOT NULL AND `item3` <> '' " +
             "OR `item3_qty` IS NOT NULL AND `item3_qty` <> '' " +
             "OR `item4` IS NOT NULL AND `item4` <> '' " +
             "OR `item4_qty` IS NOT NULL AND `item4_qty` <> '' " +
             "OR `item5` IS NOT NULL AND `item5` <> '' " +
             "OR `item5_qty` IS NOT NULL AND `item5_qty` <> '' " +
             "OR `item6` IS NOT NULL AND `item6` <> '' " +
             "OR `item6_qty` IS NOT NULL AND `item6_qty` <> '' " +
             "OR `cash` IS NOT NULL AND `cash` <> '' " +
             "OR `total` IS NOT NULL AND `total` <> '' " +
             "OR `change` IS NOT NULL AND `change` <> '');";

System.out.println(fld);

try {
    // Database connection
    Connection con = dbconnection.dbconnection();
    Statement ste = con.createStatement(); 

    // Execute the query
    ResultSet rs = ste.executeQuery(sql);

    // Set the table model with the retrieved data
    tble1.setModel(DbUtils.resultSetToTableModel(rs));

    // Hide columns that are entirely empty
    hideEmptyColumns(tble1);

} catch (Exception e) {
    e.printStackTrace();
}




        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1ActionPerformed

    private void downloadbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downloadbtnActionPerformed
      
          // Assuming you have a JTable named 'myTable' in your form
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Save as PDF");
    
    // Show the save dialog
    int userSelection = fileChooser.showSaveDialog(this);

    if (userSelection == JFileChooser.APPROVE_OPTION) {
        String filePath = fileChooser.getSelectedFile().getAbsolutePath();
        
        // Append ".pdf" to the file if the user didn't include it
        if (!filePath.toLowerCase().endsWith(".pdf")) {
            filePath += ".pdf";
        }

        // Call the method to save the JTable as a PDF
        saveTableAsPDF(tble1, filePath);
    }



// TODO add your handling code here:
    }//GEN-LAST:event_downloadbtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      icecreamdtalist icd = new  icecreamdtalist();
       icd.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(reporttest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reporttest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reporttest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reporttest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reporttest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton downloadbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tble1;
    private javax.swing.JTextField txt1;
    // End of variables declaration//GEN-END:variables
}
