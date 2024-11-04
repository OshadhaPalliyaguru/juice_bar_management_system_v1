/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Dashboard_pkge;

import java.awt.image.BufferedImage;
import java.io.InputStream;
import static java.lang.System.in;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import loginpkage.adminlogin;
import java.sql.Statement;

import menue.mENURE2;


/**
 *
 * @author User1
 */
public class Dashboard_ui extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard_ui
     */
    public Dashboard_ui() {
        initComponents();
        
        data1();
        data2();
        data3();
        data4();
        data5();
        data6();
//        data7();
//        data8();
//        data9();
         
         countnum1();
         countnum2();
         countnum3();
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void dbresetsjuices(){
        
       try {
        Connection con = dbconnection.dbconnection();
        Statement stmt = con.createStatement();

        String sqlSetNum = "SET @num := 0";
        stmt.execute(sqlSetNum);

        String sqlUpdateIds = "UPDATE juices SET itemid = @num := (@num + 1)";
        stmt.execute(sqlUpdateIds);

        String sqlResetAutoIncrement = "ALTER TABLE juices AUTO_INCREMENT = 1";
        stmt.execute(sqlResetAutoIncrement);

        System.out.println("Database reset completed successfully.");

    } catch (Exception e) {
        System.out.println("Error resetting database: " + e.getMessage());
    }

    }
    
        public void dbresetsicecream(){
        
       try {
        Connection con = dbconnection.dbconnection();
        Statement stmt = con.createStatement();

        String sqlSetNum = "SET @num := 0";
        stmt.execute(sqlSetNum);

        String sqlUpdateIds = "UPDATE icecream SET itemid = @num := (@num + 1)";
        stmt.execute(sqlUpdateIds);

        String sqlResetAutoIncrement = "ALTER TABLE icecream AUTO_INCREMENT = 1";
        stmt.execute(sqlResetAutoIncrement);

        System.out.println("Database reset completed successfully.");

    } catch (Exception e) {
        System.out.println("Error resetting database: " + e.getMessage());
    }

    }
        
            public void dbresetsmilkshakes(){
        
       try {
        Connection con = dbconnection.dbconnection();
        Statement stmt = con.createStatement();

        String sqlSetNum = "SET @num := 0";
        stmt.execute(sqlSetNum);

        String sqlUpdateIds = "UPDATE milkshakes SET itemid = @num := (@num + 1)";
        stmt.execute(sqlUpdateIds);

        String sqlResetAutoIncrement = "ALTER TABLE milkshakes AUTO_INCREMENT = 1";
        stmt.execute(sqlResetAutoIncrement);

        System.out.println("Database reset completed successfully.");

    } catch (Exception e) {
        System.out.println("Error resetting database: " + e.getMessage());
    }

    }
            
                public void dbresetssmoothiees(){
        
       try {
        Connection con = dbconnection.dbconnection();
        Statement stmt = con.createStatement();

        String sqlSetNum = "SET @num := 0";
        stmt.execute(sqlSetNum);

        String sqlUpdateIds = "UPDATE smoothiees SET itemid = @num := (@num + 1)";
        stmt.execute(sqlUpdateIds);

        String sqlResetAutoIncrement = "ALTER TABLE smoothiees AUTO_INCREMENT = 1";
        stmt.execute(sqlResetAutoIncrement);

        System.out.println("Database reset completed successfully.");

    } catch (Exception e) {
        System.out.println("Error resetting database: " + e.getMessage());
    }

    }
    
    
    public void countnum1(){
    String sql = "Select COUNT(*) from  item";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String count = rs.getString(1);
    ttleitmes.setText(count);
    }
    } catch (Exception e) {
            System.out.println(e);
        }
    }
    
     public void countnum2(){
    String sql = "Select COUNT(*) from  employee";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String count = rs.getString(1);
    ttlemployes.setText(count);
    }
    } catch (Exception e) {
            System.out.println(e);
        }
    }
      public void countnum3(){
    String sql = "Select COUNT(*) from  order_info";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String count = rs.getString(1);
    ttlesales.setText(count);
    }
    } catch (Exception e) {
            System.out.println(e);
        }
    }
    
//        public void producticecreamdata1(){
//    
//        String sql = "Select * from  icecream where itemid = 1 ";
//        try {
//            Connection con = dbconnection.dbconnection();
//    
//    PreparedStatement ste = con.prepareStatement(sql);
//    
//    ResultSet rs = ste.executeQuery();
//    if(rs.next()){
//    String name = rs.getString(1);
//    int price = rs.getInt(2);
//    String type = rs.getString(3);
//    String suppliyer = rs.getString(4);
//    String description = rs.getString(5);
//    InputStream in = rs.getBinaryStream(6);
// 
//    
//    
//    
//    BufferedImage bufferedImage = ImageIO.read(in);
//            ImageIcon imageIcon = new ImageIcon(bufferedImage);
//            icephoto1.setIcon(imageIcon);
//    
//    icename1.setText(name);
//    icetype1.setText(type);
//    iceprice1.setText(String.valueOf(price)); 
//    icesupplier1.setText(String.valueOf(suppliyer)); 
//    icedescription1.setText(description);
//    icephoto1.setIcon(imageIcon);
//  
//    }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    
//    }
        
//        public void productmilkshakedata1(){
//    
//        String sql = "Select * from  milkshakes where itemid = 1 ";
//        try {
//            Connection con = dbconnection.dbconnection();
//    
//    PreparedStatement ste = con.prepareStatement(sql);
//    
//    ResultSet rs = ste.executeQuery();
//    if(rs.next()){
//    String name = rs.getString(1);
//    int price = rs.getInt(2);
//    String type = rs.getString(3);
//    String suppliyer = rs.getString(4);
//    String description = rs.getString(5);
//    InputStream in = rs.getBinaryStream(6);
//
//    
//    BufferedImage bufferedImage = ImageIO.read(in);
//            ImageIcon imageIcon = new ImageIcon(bufferedImage);
//            milkshakepto1.setIcon(imageIcon);
//    
//    milkshakename1.setText(name);
//    milkshaketype1.setText(type);
//    milkshakeprice1.setText(String.valueOf(price)); 
//    milkshakesupplier1.setText(String.valueOf(suppliyer)); 
//    milkshakedescription1.setText(description);
//    milkshakepto1.setIcon(imageIcon);
//  
//    }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    
//    }
//    
//         public void productsmoothidata1(){
//    
//        String sql = "Select * from  smoothiees where itemid = 1 ";
//        try {
//            Connection con = dbconnection.dbconnection();
//    
//    PreparedStatement ste = con.prepareStatement(sql);
//    
//    ResultSet rs = ste.executeQuery();
//    if(rs.next()){
//    String name = rs.getString(1);
//    int price = rs.getInt(2);
//    String type = rs.getString(3);
//    String suppliyer = rs.getString(4);
//    String description = rs.getString(5);
//    InputStream in = rs.getBinaryStream(6);
//
//    
//    BufferedImage bufferedImage = ImageIO.read(in);
//            ImageIcon imageIcon = new ImageIcon(bufferedImage);
//           smoothiephoto1.setIcon(imageIcon);
//    
//    smoothiename1.setText(name);
//    smoothietype1.setText(type);
//    smoothieprice1.setText(String.valueOf(price)); 
//    smoothieprice1.setText(String.valueOf(suppliyer)); 
//    smoothiedescription1.setText(description);
//    smoothiephoto1.setIcon(imageIcon);
//  
//    }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    
//    }
   

    public void data1(){
    
        String sql = "Select * from employee where empid = 1";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int age = rs.getInt(2);
    String gender = rs.getString(3);
    String idno = rs.getString(4);
    int phoneNumber = rs.getInt(5);
    String Address = rs.getString(6);
    String Email = rs.getString(7);
    InputStream in = rs.getBinaryStream(8);
    String education = rs.getString(9);
    String Designation = rs.getString(10);
    
    
    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            empprofilephoto2.setIcon(imageIcon);
    
    empname1.setText(name);
    empage1.setText(String.valueOf(age));
    empgender1.setText(gender);
    empidno1.setText(idno); 
    empphoneno1.setText(String.valueOf(phoneNumber)); 
    empaddress1.setText(Address);
    empemailaddress1.setText(Email);
    crddesignation.setText(Designation);
    crdname.setText(name);
    cardname.setIcon(imageIcon);
    empeducation1.setText(education);

   
    
    }
        } catch (Exception e) {
        }
    
    }
    
      public void data2(){
    
        String sql = "Select * from employee where empid = 2";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int age = rs.getInt(2);
    String gender = rs.getString(3);
    String idno = rs.getString(4);
    int phoneNumber = rs.getInt(5);
    String Address = rs.getString(6);
    String Email = rs.getString(7);
    InputStream in = rs.getBinaryStream(8);
    String education = rs.getString(9);
    String Designation = rs.getString(10);
    
    
    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            empprofilephoto3.setIcon(imageIcon);
    
    empname2.setText(name);
    empage2.setText(String.valueOf(age));
    empgender2.setText(gender);
    empidno2.setText(idno); 
    empphoneno2.setText(String.valueOf(phoneNumber)); 
    empaddress2.setText(Address);
    empemailaddress2.setText(Email);
    crddesignation1.setText(Designation);
    crdname1.setText(name);
    cardname1.setIcon(imageIcon);
    empeducation2.setText(education);

   
    
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
     
      public void data3(){
    
        String sql = "Select * from employee where empid = 3";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int age = rs.getInt(2);
    String gender = rs.getString(3);
    String idno = rs.getString(4);
    int phoneNumber = rs.getInt(5);
    String Address = rs.getString(6);
    String Email = rs.getString(7);
    InputStream in = rs.getBinaryStream(8);
    String education = rs.getString(9);
    String Designation = rs.getString(10);
    
    
    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            empprofilephoto1.setIcon(imageIcon);
    
    empname3.setText(name);
    empage3.setText(String.valueOf(age));
    empgender3.setText(gender);
    empidno3.setText(idno); 
    empphoneno3.setText(String.valueOf(phoneNumber)); 
    empaddress3.setText(Address);
    empemailaddress3.setText(Email);
    crddesignation2.setText(Designation);
    crdname2.setText(name);
    cardname2.setIcon(imageIcon);
    empeducation3.setText(education);

   
    
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
      
      public void data4(){
    
        String sql = "Select * from employee where empid = 4";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int age = rs.getInt(2);
    String gender = rs.getString(3);
    String idno = rs.getString(4);
    int phoneNumber = rs.getInt(5);
    String Address = rs.getString(6);
    String Email = rs.getString(7);
    InputStream in = rs.getBinaryStream(8);
    String education = rs.getString(9);
    String Designation = rs.getString(10);
    
    
    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            empprofilephoto4.setIcon(imageIcon);
    
    empname4.setText(name);
    empage4.setText(String.valueOf(age));
    empgender4.setText(gender);
    empidno4.setText(idno); 
    empphoneno4.setText(String.valueOf(phoneNumber)); 
    empaddress4.setText(Address);
    empemailaddress4.setText(Email);
    crddesignation3.setText(Designation);
    crdname3.setText(name);
    cardname3.setIcon(imageIcon);
    empeducation4.setText(education);

   
    
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
      
      public void data5(){
    
        String sql = "Select * from employee where empid = 5";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int age = rs.getInt(2);
    String gender = rs.getString(3);
    String idno = rs.getString(4);
    int phoneNumber = rs.getInt(5);
    String Address = rs.getString(6);
    String Email = rs.getString(7);
    InputStream in = rs.getBinaryStream(8);
    String education = rs.getString(9);
    String Designation = rs.getString(10);
    
    
    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            empprofilephoto5.setIcon(imageIcon);
    
    empname5.setText(name);
    empage5.setText(String.valueOf(age));
    empgender5.setText(gender);
    empidno5.setText(idno); 
    empphoneno5.setText(String.valueOf(phoneNumber)); 
    empaddress5.setText(Address);
    empemailaddress5.setText(Email);
    crddesignation4.setText(Designation);
    crdname4.setText(name);
    cardname4.setIcon(imageIcon);
    empeducation5.setText(education);

   
    
    }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
    
    }
      
      public void data6(){
    
        String sql = "Select * from employee where empid = 6";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int age = rs.getInt(2);
    String gender = rs.getString(3);
    String idno = rs.getString(4);
    int phoneNumber = rs.getInt(5);
    String Address = rs.getString(6);
    String Email = rs.getString(7);
    InputStream in = rs.getBinaryStream(8);
    String education = rs.getString(9);
    String Designation = rs.getString(10);
    
    
    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            empprofilephoto6.setIcon(imageIcon);
    
    empname6.setText(name);
    empage6.setText(String.valueOf(age));
    empgender6.setText(gender);
    empidno6.setText(idno); 
    empphoneno6.setText(String.valueOf(phoneNumber)); 
    empaddress6.setText(Address);
    empemailaddress6.setText(Email);
    crddesignation5.setText(Designation);
    crdname5.setText(name);
    cardname5.setIcon(imageIcon);
    empeducation6.setText(education);

   
    
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
      
      
//      public void data7(){
//    
//        String sql = "Select * from employee where empid = 7";
//        try {
//            Connection con = dbconnection.dbconnection();
//    
//    PreparedStatement ste = con.prepareStatement(sql);
//    
//    ResultSet rs = ste.executeQuery();
//    if(rs.next()){
//    String name = rs.getString(1);
//    int age = rs.getInt(2);
//    String gender = rs.getString(3);
//    String idno = rs.getString(4);
//    int phoneNumber = rs.getInt(5);
//    String Address = rs.getString(6);
//    String Email = rs.getString(7);
//    InputStream in = rs.getBinaryStream(8);
//    String education = rs.getString(9);
//    String Designation = rs.getString(10);
//    
//    
//    
//    BufferedImage bufferedImage = ImageIO.read(in);
//            ImageIcon imageIcon = new ImageIcon(bufferedImage);
//            empprofilephoto7.setIcon(imageIcon);
//    
//    empname7.setText(name);
//    empage7.setText(String.valueOf(age));
//    empgender7.setText(gender);
//    empidno7.setText(idno); 
//    empphoneno7.setText(String.valueOf(phoneNumber)); 
//    empaddress7.setText(Address);
//    empemailaddress7.setText(Email);
//    crddesignation6.setText(Designation);
//    crdname6.setText(name);
//    cardname6.setIcon(imageIcon);
//    empeducation7.setText(education);
//
//   
//    
//    }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    
//    }
//      
//      
//      public void data8(){
//    
//        String sql = "Select * from employee where empid = 8";
//        try {
//            Connection con = dbconnection.dbconnection();
//    
//    PreparedStatement ste = con.prepareStatement(sql);
//    
//    ResultSet rs = ste.executeQuery();
//    if(rs.next()){
//    String name = rs.getString(1);
//    int age = rs.getInt(2);
//    String gender = rs.getString(3);
//    String idno = rs.getString(4);
//    int phoneNumber = rs.getInt(5);
//    String Address = rs.getString(6);
//    String Email = rs.getString(7);
//    InputStream in = rs.getBinaryStream(8);
//    String education = rs.getString(9);
//    String Designation = rs.getString(10);
//    
//    
//    
//    BufferedImage bufferedImage = ImageIO.read(in);
//            ImageIcon imageIcon = new ImageIcon(bufferedImage);
//            empprofilephoto8.setIcon(imageIcon);
//    
//    empname8.setText(name);
//    empage8.setText(String.valueOf(age));
//    empgender8.setText(gender);
//    empidno8.setText(idno); 
//    empphoneno8.setText(String.valueOf(phoneNumber)); 
//    empaddress8.setText(Address);
//    empemailaddress8.setText(Email);
//    crddesignation7.setText(Designation);
//    crdname7.setText(name);
//    cardname7.setIcon(imageIcon);
//    empeducation8.setText(education);
//
//   
//    
//    }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    
//    }
//      
//      public void data9(){
//    
//        String sql = "Select * from employee where empid = 9";
//        try {
//            Connection con = dbconnection.dbconnection();
//    
//    PreparedStatement ste = con.prepareStatement(sql);
//    
//    ResultSet rs = ste.executeQuery();
//    if(rs.next()){
//    String name = rs.getString(1);
//    int age = rs.getInt(2);
//    String gender = rs.getString(3);
//    String idno = rs.getString(4);
//    int phoneNumber = rs.getInt(5);
//    String Address = rs.getString(6);
//    String Email = rs.getString(7);
//    InputStream in = rs.getBinaryStream(8);
//    String education = rs.getString(9);
//    String Designation = rs.getString(10);
//    
//    
//    
//    BufferedImage bufferedImage = ImageIO.read(in);
//            ImageIcon imageIcon = new ImageIcon(bufferedImage);
//            empprofilephoto9.setIcon(imageIcon);
//    
//    empname9.setText(name);
//    empage9.setText(String.valueOf(age));
//    empgender9.setText(gender);
//    empidno9.setText(idno); 
//    empphoneno9.setText(String.valueOf(phoneNumber)); 
//    empaddress9.setText(Address);
//    empemailaddress9.setText(Email);
//    crddesignation8.setText(Designation);
//    crdname8.setText(name);
//    cardname8.setIcon(imageIcon);
//    empeducation9.setText(education);
//
//   
//    
//    }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        logoutbtn = new javax.swing.JButton();
        manageitemsbtn = new javax.swing.JButton();
        menubtn = new javax.swing.JButton();
        manageemployeebtn = new javax.swing.JButton();
        employeebtn = new javax.swing.JButton();
        dashboardbtn = new javax.swing.JButton();
        paymentreportbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        mainoannel = new javax.swing.JPanel();
        dashboardpannel = new javax.swing.JPanel();
        ttlemployes = new javax.swing.JLabel();
        ttlesales = new javax.swing.JLabel();
        ttleitmes = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        empdetailspannnext = new javax.swing.JPanel();
        next = new javax.swing.JButton();
        cardname5 = new javax.swing.JLabel();
        crddesignation5 = new javax.swing.JLabel();
        crdname5 = new javax.swing.JLabel();
        crdname4 = new javax.swing.JLabel();
        cardname4 = new javax.swing.JLabel();
        crddesignation4 = new javax.swing.JLabel();
        cardname3 = new javax.swing.JLabel();
        crdname3 = new javax.swing.JLabel();
        crddesignation3 = new javax.swing.JLabel();
        crddesignation2 = new javax.swing.JLabel();
        crdname2 = new javax.swing.JLabel();
        cardname2 = new javax.swing.JLabel();
        cardname1 = new javax.swing.JLabel();
        crdname1 = new javax.swing.JLabel();
        crddesignation1 = new javax.swing.JLabel();
        cardname = new javax.swing.JLabel();
        crdname = new javax.swing.JLabel();
        crddesignation = new javax.swing.JLabel();
        emplable7 = new javax.swing.JLabel();
        emplable8 = new javax.swing.JLabel();
        emplable9 = new javax.swing.JLabel();
        emplable10 = new javax.swing.JLabel();
        emplable11 = new javax.swing.JLabel();
        emplable12 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        manageemployyepanel = new javax.swing.JPanel();
        refresh = new javax.swing.JButton();
        empprofilephoto1 = new javax.swing.JLabel();
        empeducation1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        empprofilephoto3 = new javax.swing.JLabel();
        empprofilephoto2 = new javax.swing.JLabel();
        jLabel181 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();
        jLabel183 = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        jLabel185 = new javax.swing.JLabel();
        empgender3 = new javax.swing.JLabel();
        empname3 = new javax.swing.JLabel();
        jLabel186 = new javax.swing.JLabel();
        empemailaddress3 = new javax.swing.JLabel();
        empage3 = new javax.swing.JLabel();
        empaddress3 = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        jLabel188 = new javax.swing.JLabel();
        empidno3 = new javax.swing.JLabel();
        empeducation3 = new javax.swing.JLabel();
        empphoneno3 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        empeducation2 = new javax.swing.JLabel();
        empemailaddress2 = new javax.swing.JLabel();
        empaddress2 = new javax.swing.JLabel();
        empphoneno2 = new javax.swing.JLabel();
        empidno2 = new javax.swing.JLabel();
        empgender2 = new javax.swing.JLabel();
        empage2 = new javax.swing.JLabel();
        empname2 = new javax.swing.JLabel();
        jLabel179 = new javax.swing.JLabel();
        empname1 = new javax.swing.JLabel();
        empage1 = new javax.swing.JLabel();
        empgender1 = new javax.swing.JLabel();
        empidno1 = new javax.swing.JLabel();
        empphoneno1 = new javax.swing.JLabel();
        empaddress1 = new javax.swing.JLabel();
        empemailaddress1 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        nextbtn1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        manageemployeenextpannel = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        empprofilephoto6 = new javax.swing.JLabel();
        empprofilephoto5 = new javax.swing.JLabel();
        empprofilephoto4 = new javax.swing.JLabel();
        empgender6 = new javax.swing.JLabel();
        empphoneno6 = new javax.swing.JLabel();
        empname6 = new javax.swing.JLabel();
        empidno6 = new javax.swing.JLabel();
        jLabel205 = new javax.swing.JLabel();
        jLabel206 = new javax.swing.JLabel();
        jLabel207 = new javax.swing.JLabel();
        empaddress6 = new javax.swing.JLabel();
        jLabel208 = new javax.swing.JLabel();
        jLabel209 = new javax.swing.JLabel();
        empage6 = new javax.swing.JLabel();
        jLabel210 = new javax.swing.JLabel();
        empemailaddress6 = new javax.swing.JLabel();
        jLabel211 = new javax.swing.JLabel();
        empeducation6 = new javax.swing.JLabel();
        jLabel212 = new javax.swing.JLabel();
        jLabel197 = new javax.swing.JLabel();
        empidno5 = new javax.swing.JLabel();
        empage5 = new javax.swing.JLabel();
        empemailaddress5 = new javax.swing.JLabel();
        jLabel198 = new javax.swing.JLabel();
        jLabel199 = new javax.swing.JLabel();
        empgender5 = new javax.swing.JLabel();
        empeducation5 = new javax.swing.JLabel();
        jLabel200 = new javax.swing.JLabel();
        empphoneno5 = new javax.swing.JLabel();
        jLabel201 = new javax.swing.JLabel();
        jLabel202 = new javax.swing.JLabel();
        empname5 = new javax.swing.JLabel();
        jLabel203 = new javax.swing.JLabel();
        jLabel204 = new javax.swing.JLabel();
        empaddress5 = new javax.swing.JLabel();
        jLabel189 = new javax.swing.JLabel();
        jLabel190 = new javax.swing.JLabel();
        jLabel191 = new javax.swing.JLabel();
        jLabel192 = new javax.swing.JLabel();
        jLabel193 = new javax.swing.JLabel();
        jLabel194 = new javax.swing.JLabel();
        jLabel195 = new javax.swing.JLabel();
        jLabel196 = new javax.swing.JLabel();
        empeducation4 = new javax.swing.JLabel();
        empemailaddress4 = new javax.swing.JLabel();
        empaddress4 = new javax.swing.JLabel();
        empphoneno4 = new javax.swing.JLabel();
        empidno4 = new javax.swing.JLabel();
        empgender4 = new javax.swing.JLabel();
        empage4 = new javax.swing.JLabel();
        empname4 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel68 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        manageemployyepannel3 = new javax.swing.JPanel();
        jLabel158 = new javax.swing.JLabel();
        menupannel1 = new javax.swing.JPanel();
        age12 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        idno12 = new javax.swing.JLabel();
        name12 = new javax.swing.JLabel();
        phoneno12 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        gender12 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        phoneno13 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        name13 = new javax.swing.JLabel();
        age13 = new javax.swing.JLabel();
        gender13 = new javax.swing.JLabel();
        idno13 = new javax.swing.JLabel();
        productnamee1 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        productpricee1 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        productdescriptionn1 = new javax.swing.JLabel();
        producttypee1 = new javax.swing.JLabel();
        suppliername1 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        nextbtn3 = new javax.swing.JButton();
        jLabel120 = new javax.swing.JLabel();
        employeenext = new javax.swing.JPanel();
        emplable13 = new javax.swing.JLabel();
        emplable14 = new javax.swing.JLabel();
        emplable15 = new javax.swing.JLabel();
        emplable16 = new javax.swing.JLabel();
        emplable17 = new javax.swing.JLabel();
        emplable18 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        next1 = new javax.swing.JButton();
        menuitemsdash = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        reportpannel = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        nextbtn7 = new javax.swing.JButton();
        pphoto15 = new javax.swing.JLabel();
        ptype15 = new javax.swing.JLabel();
        pname15 = new javax.swing.JLabel();
        pprice15 = new javax.swing.JLabel();
        psupplier15 = new javax.swing.JLabel();
        pdescription15 = new javax.swing.JLabel();
        ptype14 = new javax.swing.JLabel();
        pname14 = new javax.swing.JLabel();
        psupplier14 = new javax.swing.JLabel();
        pdescription14 = new javax.swing.JLabel();
        pprice14 = new javax.swing.JLabel();
        pphoto14 = new javax.swing.JLabel();
        ptype13 = new javax.swing.JLabel();
        pprice13 = new javax.swing.JLabel();
        psupplier13 = new javax.swing.JLabel();
        pdescription13 = new javax.swing.JLabel();
        pphoto13 = new javax.swing.JLabel();
        pname13 = new javax.swing.JLabel();
        jLabel213 = new javax.swing.JLabel();
        jLabel214 = new javax.swing.JLabel();
        jLabel215 = new javax.swing.JLabel();
        jLabel216 = new javax.swing.JLabel();
        jLabel217 = new javax.swing.JLabel();
        jLabel218 = new javax.swing.JLabel();
        jLabel219 = new javax.swing.JLabel();
        jLabel220 = new javax.swing.JLabel();
        jLabel221 = new javax.swing.JLabel();
        jLabel222 = new javax.swing.JLabel();
        jLabel223 = new javax.swing.JLabel();
        jLabel224 = new javax.swing.JLabel();
        jLabel225 = new javax.swing.JLabel();
        jLabel226 = new javax.swing.JLabel();
        jLabel227 = new javax.swing.JLabel();
        jLabel228 = new javax.swing.JLabel();
        jLabel229 = new javax.swing.JLabel();
        jLabel230 = new javax.swing.JLabel();
        jLabel236 = new javax.swing.JLabel();
        backbtn6 = new javax.swing.JButton();
        jLabel232 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoutbtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/logoutbtn.png"))); // NOI18N
        logoutbtn.setBorder(null);
        logoutbtn.setBorderPainted(false);
        logoutbtn.setContentAreaFilled(false);
        logoutbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });
        jPanel2.add(logoutbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 950, -1, -1));

        manageitemsbtn.setForeground(new java.awt.Color(255, 255, 255));
        manageitemsbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/manageitemsbtn.png"))); // NOI18N
        manageitemsbtn.setBorder(null);
        manageitemsbtn.setBorderPainted(false);
        manageitemsbtn.setContentAreaFilled(false);
        manageitemsbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageitemsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageitemsbtnActionPerformed(evt);
            }
        });
        jPanel2.add(manageitemsbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 570, -1, -1));

        menubtn.setForeground(new java.awt.Color(255, 255, 255));
        menubtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/menuebtn.png"))); // NOI18N
        menubtn.setBorder(null);
        menubtn.setBorderPainted(false);
        menubtn.setContentAreaFilled(false);
        menubtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menubtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menubtnActionPerformed(evt);
            }
        });
        jPanel2.add(menubtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, -1, -1));

        manageemployeebtn.setForeground(new java.awt.Color(255, 255, 255));
        manageemployeebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/manageempbtn.png"))); // NOI18N
        manageemployeebtn.setBorder(null);
        manageemployeebtn.setBorderPainted(false);
        manageemployeebtn.setContentAreaFilled(false);
        manageemployeebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageemployeebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageemployeebtnActionPerformed(evt);
            }
        });
        jPanel2.add(manageemployeebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, -1, -1));

        employeebtn.setForeground(new java.awt.Color(255, 255, 255));
        employeebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/empdetailsbtn.png"))); // NOI18N
        employeebtn.setBorder(null);
        employeebtn.setBorderPainted(false);
        employeebtn.setContentAreaFilled(false);
        employeebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        employeebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeebtnActionPerformed(evt);
            }
        });
        jPanel2.add(employeebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        dashboardbtn.setForeground(new java.awt.Color(255, 255, 255));
        dashboardbtn.setIcon(new javax.swing.ImageIcon("G:\\huice_bar assets\\buttons\\dashbrdbtn.png")); // NOI18N
        dashboardbtn.setBorder(null);
        dashboardbtn.setBorderPainted(false);
        dashboardbtn.setContentAreaFilled(false);
        dashboardbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashboardbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardbtnActionPerformed(evt);
            }
        });
        jPanel2.add(dashboardbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        paymentreportbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/payment report.png"))); // NOI18N
        paymentreportbtn.setBorder(null);
        paymentreportbtn.setBorderPainted(false);
        paymentreportbtn.setContentAreaFilled(false);
        jPanel2.add(paymentreportbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 630, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("G:\\huice_bar assets\\dashgrp.png")); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 350, 1040));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 1040));

        mainoannel.setLayout(new java.awt.CardLayout());

        dashboardpannel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ttlemployes.setFont(new java.awt.Font("Sylfaen", 1, 70)); // NOI18N
        ttlemployes.setText("1");
        dashboardpannel.add(ttlemployes, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 60, 110));

        ttlesales.setFont(new java.awt.Font("Sylfaen", 1, 70)); // NOI18N
        ttlesales.setText("1");
        dashboardpannel.add(ttlesales, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 220, 60, 110));

        ttleitmes.setFont(new java.awt.Font("Sylfaen", 1, 70)); // NOI18N
        ttleitmes.setText("1");
        dashboardpannel.add(ttleitmes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 120, 110));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/dashbrd.png"))); // NOI18N
        dashboardpannel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, 850));

        jLabel63.setFont(new java.awt.Font("Sylfaen", 1, 48)); // NOI18N
        jLabel63.setText("Dash Board");
        dashboardpannel.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/background pannel.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        dashboardpannel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1080, 1040));

        mainoannel.add(dashboardpannel, "card2");

        empdetailspannnext.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/nextbtn.png"))); // NOI18N
        next.setBorderPainted(false);
        next.setContentAreaFilled(false);
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        empdetailspannnext.add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 950, -1, -1));
        empdetailspannnext.add(cardname5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 610, 210, 230));

        crddesignation5.setText("Designation");
        empdetailspannnext.add(crddesignation5, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 880, -1, -1));

        crdname5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        crdname5.setText("Name");
        empdetailspannnext.add(crdname5, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 850, -1, -1));

        crdname4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        crdname4.setText("Name");
        empdetailspannnext.add(crdname4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 850, -1, -1));
        empdetailspannnext.add(cardname4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 610, 210, 230));

        crddesignation4.setText("Designation");
        empdetailspannnext.add(crddesignation4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 880, -1, -1));
        empdetailspannnext.add(cardname3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 610, 210, 230));

        crdname3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        crdname3.setText("Name");
        empdetailspannnext.add(crdname3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 850, -1, -1));

        crddesignation3.setText("Designation");
        empdetailspannnext.add(crddesignation3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 880, -1, -1));

        crddesignation2.setText("Designation");
        empdetailspannnext.add(crddesignation2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 430, -1, -1));

        crdname2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        crdname2.setText("Name");
        empdetailspannnext.add(crdname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 400, -1, -1));
        empdetailspannnext.add(cardname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 160, 210, 230));
        empdetailspannnext.add(cardname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 210, 230));

        crdname1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        crdname1.setText("Name");
        empdetailspannnext.add(crdname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 400, -1, -1));

        crddesignation1.setText("Designation");
        empdetailspannnext.add(crddesignation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, -1, -1));
        empdetailspannnext.add(cardname, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 210, 230));

        crdname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        crdname.setText("Name");
        empdetailspannnext.add(crdname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, -1, -1));

        crddesignation.setText("Designation");
        empdetailspannnext.add(crddesignation, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, -1, -1));

        emplable7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employee lable.png"))); // NOI18N
        empdetailspannnext.add(emplable7, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 580, -1, -1));

        emplable8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employee lable.png"))); // NOI18N
        empdetailspannnext.add(emplable8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 580, -1, -1));

        emplable9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employee lable.png"))); // NOI18N
        empdetailspannnext.add(emplable9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 580, -1, -1));

        emplable10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employee lable.png"))); // NOI18N
        empdetailspannnext.add(emplable10, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 130, -1, -1));

        emplable11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employee lable.png"))); // NOI18N
        empdetailspannnext.add(emplable11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, -1, -1));

        emplable12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employee lable.png"))); // NOI18N
        empdetailspannnext.add(emplable12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        jLabel66.setFont(new java.awt.Font("Sylfaen", 1, 48)); // NOI18N
        jLabel66.setText("Employee Details");
        empdetailspannnext.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/background pannel.png"))); // NOI18N
        jLabel11.setText("jLabel5");
        empdetailspannnext.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1090, -1));

        mainoannel.add(empdetailspannnext, "card3");

        manageemployyepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        refresh.setText("refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        manageemployyepanel.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 50, -1, -1));

        empprofilephoto1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        empprofilephoto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        empprofilephoto1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        manageemployyepanel.add(empprofilephoto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 670, 240, 250));

        empeducation1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        empeducation1.setText("EDUCATION");
        manageemployyepanel.add(empeducation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/editbtnn.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        manageemployyepanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 670, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/editbtnn.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        manageemployyepanel.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 410, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/editbtnn.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        manageemployyepanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 120, -1, -1));

        empprofilephoto3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        empprofilephoto3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        empprofilephoto3.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        manageemployyepanel.add(empprofilephoto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 240, 250));

        empprofilephoto2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        empprofilephoto2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        empprofilephoto2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        manageemployyepanel.add(empprofilephoto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 240, 260));

        jLabel181.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel181.setText("ID NO");
        manageemployyepanel.add(jLabel181, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 750, -1, -1));

        jLabel182.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel182.setText("NAME");
        manageemployyepanel.add(jLabel182, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 660, -1, -1));

        jLabel183.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel183.setText("AGE");
        manageemployyepanel.add(jLabel183, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 690, -1, -1));

        jLabel184.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel184.setText("ADDRESS");
        manageemployyepanel.add(jLabel184, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 810, -1, -1));

        jLabel185.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel185.setText("EDUCATION");
        manageemployyepanel.add(jLabel185, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 870, -1, -1));

        empgender3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        empgender3.setText("GENDER");
        manageemployyepanel.add(empgender3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 720, -1, -1));

        empname3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        empname3.setText("NAME");
        manageemployyepanel.add(empname3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 660, -1, -1));

        jLabel186.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel186.setText("E-MAIL ADDRESS");
        manageemployyepanel.add(jLabel186, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 840, -1, -1));

        empemailaddress3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        empemailaddress3.setText("E-MAIL ADDRESS");
        manageemployyepanel.add(empemailaddress3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 840, -1, -1));

        empage3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        empage3.setText("AGE");
        manageemployyepanel.add(empage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 690, -1, -1));

        empaddress3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        empaddress3.setText("ADDRESS");
        manageemployyepanel.add(empaddress3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 810, -1, -1));

        jLabel187.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel187.setText("GENDER");
        manageemployyepanel.add(jLabel187, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 720, -1, -1));

        jLabel188.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel188.setText("PHONE NO");
        manageemployyepanel.add(jLabel188, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 780, -1, -1));

        empidno3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        empidno3.setText("ID NO");
        manageemployyepanel.add(empidno3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 750, -1, -1));

        empeducation3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        empeducation3.setText("EDUCATION");
        manageemployyepanel.add(empeducation3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 870, -1, -1));

        empphoneno3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        empphoneno3.setText("PHONE NO");
        manageemployyepanel.add(empphoneno3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 780, -1, -1));

        jLabel37.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel37.setText("NAME");
        manageemployyepanel.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, -1, -1));

        jLabel38.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel38.setText("AGE");
        manageemployyepanel.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, -1, -1));

        jLabel39.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel39.setText("GENDER");
        manageemployyepanel.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, -1, -1));

        jLabel40.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel40.setText("ID NO");
        manageemployyepanel.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 480, -1, -1));

        jLabel41.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel41.setText("PHONE NO");
        manageemployyepanel.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 510, -1, -1));

        jLabel42.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel42.setText("ADDRESS");
        manageemployyepanel.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 540, -1, -1));

        jLabel43.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel43.setText("E-MAIL ADDRESS");
        manageemployyepanel.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 570, -1, -1));

        jLabel180.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel180.setText("EDUCATION");
        manageemployyepanel.add(jLabel180, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 600, -1, -1));

        empeducation2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        empeducation2.setText("EDUCATION");
        manageemployyepanel.add(empeducation2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 600, -1, -1));

        empemailaddress2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        empemailaddress2.setText("E-MAIL ADDRESS");
        manageemployyepanel.add(empemailaddress2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 570, -1, -1));

        empaddress2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        empaddress2.setText("ADDRESS");
        manageemployyepanel.add(empaddress2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 540, -1, -1));

        empphoneno2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        empphoneno2.setText("PHONE NO");
        manageemployyepanel.add(empphoneno2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, -1, -1));

        empidno2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        empidno2.setText("ID NO");
        manageemployyepanel.add(empidno2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 480, -1, -1));

        empgender2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        empgender2.setText("GENDER");
        manageemployyepanel.add(empgender2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, -1, -1));

        empage2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        empage2.setText("AGE");
        manageemployyepanel.add(empage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, -1, -1));

        empname2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        empname2.setText("NAME");
        manageemployyepanel.add(empname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, -1, -1));

        jLabel179.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel179.setText("EDUCATION");
        manageemployyepanel.add(jLabel179, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, -1, -1));

        empname1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        empname1.setText("NAME");
        manageemployyepanel.add(empname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, -1));

        empage1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        empage1.setText("AGE");
        manageemployyepanel.add(empage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, -1, -1));

        empgender1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        empgender1.setText("GENDER");
        manageemployyepanel.add(empgender1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, -1, -1));

        empidno1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        empidno1.setText("ID NO");
        manageemployyepanel.add(empidno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, -1, -1));

        empphoneno1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        empphoneno1.setText("PHONE NO");
        manageemployyepanel.add(empphoneno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, -1, -1));

        empaddress1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        empaddress1.setText("ADDRESS");
        manageemployyepanel.add(empaddress1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, -1, -1));

        empemailaddress1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        empemailaddress1.setText("E-MAIL ADDRESS");
        manageemployyepanel.add(empemailaddress1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, -1, -1));

        jLabel31.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel31.setText("AGE");
        manageemployyepanel.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, -1));

        jLabel32.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel32.setText("GENDER");
        manageemployyepanel.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, -1));

        jLabel33.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel33.setText("ID NO");
        manageemployyepanel.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, -1));

        jLabel34.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel34.setText("PHONE NO");
        manageemployyepanel.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, -1));

        jLabel35.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel35.setText("ADDRESS");
        manageemployyepanel.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));

        jLabel36.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel36.setText("E-MAIL ADDRESS");
        manageemployyepanel.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, -1, -1));

        jLabel30.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel30.setText("NAME");
        manageemployyepanel.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));

        nextbtn1.setForeground(new java.awt.Color(255, 255, 255));
        nextbtn1.setIcon(new javax.swing.ImageIcon("G:\\huice_bar assets\\buttons\\nextbtn.png")); // NOI18N
        nextbtn1.setBorder(null);
        nextbtn1.setBorderPainted(false);
        nextbtn1.setContentAreaFilled(false);
        nextbtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbtn1ActionPerformed(evt);
            }
        });
        manageemployyepanel.add(nextbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 950, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        manageemployyepanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        manageemployyepanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        manageemployyepanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jLabel67.setFont(new java.awt.Font("Sylfaen", 1, 48)); // NOI18N
        jLabel67.setText("Manage Employees");
        manageemployyepanel.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/background pannel.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        manageemployyepanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1090, -1));

        mainoannel.add(manageemployyepanel, "card4");

        manageemployeenextpannel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/editbtnn.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        manageemployeenextpannel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 380, -1, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/editbtnn.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        manageemployeenextpannel.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 660, -1, -1));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/editbtnn.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        manageemployeenextpannel.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 120, -1, -1));

        backbtn.setForeground(new java.awt.Color(255, 255, 255));
        backbtn.setIcon(new javax.swing.ImageIcon("G:\\huice_bar assets\\buttons\\backbtn.png")); // NOI18N
        backbtn.setBorder(null);
        backbtn.setBorderPainted(false);
        backbtn.setContentAreaFilled(false);
        backbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        manageemployeenextpannel.add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 950, -1, -1));

        empprofilephoto6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        empprofilephoto6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        empprofilephoto6.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        manageemployeenextpannel.add(empprofilephoto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 660, 240, 250));

        empprofilephoto5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        empprofilephoto5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        empprofilephoto5.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        manageemployeenextpannel.add(empprofilephoto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 240, 250));

        empprofilephoto4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        empprofilephoto4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        empprofilephoto4.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        manageemployeenextpannel.add(empprofilephoto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 240, 250));

        empgender6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        empgender6.setText("GENDER");
        manageemployeenextpannel.add(empgender6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 710, -1, -1));

        empphoneno6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        empphoneno6.setText("PHONE NO");
        manageemployeenextpannel.add(empphoneno6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 770, -1, -1));

        empname6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        empname6.setText("NAME");
        manageemployeenextpannel.add(empname6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 650, -1, -1));

        empidno6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        empidno6.setText("ID NO");
        manageemployeenextpannel.add(empidno6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 740, -1, -1));

        jLabel205.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel205.setText("EDUCATION");
        manageemployeenextpannel.add(jLabel205, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 860, -1, -1));

        jLabel206.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel206.setText("E-MAIL ADDRESS");
        manageemployeenextpannel.add(jLabel206, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 830, -1, -1));

        jLabel207.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel207.setText("ADDRESS");
        manageemployeenextpannel.add(jLabel207, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 800, -1, -1));

        empaddress6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        empaddress6.setText("ADDRESS");
        manageemployeenextpannel.add(empaddress6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 800, -1, -1));

        jLabel208.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel208.setText("NAME");
        manageemployeenextpannel.add(jLabel208, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 650, -1, -1));

        jLabel209.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel209.setText("AGE");
        manageemployeenextpannel.add(jLabel209, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 680, -1, -1));

        empage6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        empage6.setText("AGE");
        manageemployeenextpannel.add(empage6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 680, -1, -1));

        jLabel210.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel210.setText("ID NO");
        manageemployeenextpannel.add(jLabel210, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 740, -1, -1));

        empemailaddress6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        empemailaddress6.setText("E-MAIL ADDRESS");
        manageemployeenextpannel.add(empemailaddress6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 830, -1, -1));

        jLabel211.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel211.setText("PHONE NO");
        manageemployeenextpannel.add(jLabel211, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 770, -1, -1));

        empeducation6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        empeducation6.setText("EDUCATION");
        manageemployeenextpannel.add(empeducation6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 860, -1, -1));

        jLabel212.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel212.setText("GENDER");
        manageemployeenextpannel.add(jLabel212, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 710, -1, -1));

        jLabel197.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel197.setText("PHONE NO");
        manageemployeenextpannel.add(jLabel197, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, -1, -1));

        empidno5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        empidno5.setText("ID NO");
        manageemployeenextpannel.add(empidno5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, -1, -1));

        empage5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        empage5.setText("AGE");
        manageemployeenextpannel.add(empage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, -1, -1));

        empemailaddress5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        empemailaddress5.setText("E-MAIL ADDRESS");
        manageemployeenextpannel.add(empemailaddress5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 550, -1, -1));

        jLabel198.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel198.setText("ADDRESS");
        manageemployeenextpannel.add(jLabel198, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 520, -1, -1));

        jLabel199.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel199.setText("AGE");
        manageemployeenextpannel.add(jLabel199, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, -1, -1));

        empgender5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        empgender5.setText("GENDER");
        manageemployeenextpannel.add(empgender5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, -1, -1));

        empeducation5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        empeducation5.setText("EDUCATION");
        manageemployeenextpannel.add(empeducation5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 580, -1, -1));

        jLabel200.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel200.setText("NAME");
        manageemployeenextpannel.add(jLabel200, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, -1, -1));

        empphoneno5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        empphoneno5.setText("PHONE NO");
        manageemployeenextpannel.add(empphoneno5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, -1, -1));

        jLabel201.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel201.setText("ID NO");
        manageemployeenextpannel.add(jLabel201, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, -1, -1));

        jLabel202.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel202.setText("E-MAIL ADDRESS");
        manageemployeenextpannel.add(jLabel202, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 550, -1, -1));

        empname5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        empname5.setText("NAME");
        manageemployeenextpannel.add(empname5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, -1, -1));

        jLabel203.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel203.setText("GENDER");
        manageemployeenextpannel.add(jLabel203, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, -1, -1));

        jLabel204.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel204.setText("EDUCATION");
        manageemployeenextpannel.add(jLabel204, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 580, -1, -1));

        empaddress5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        empaddress5.setText("ADDRESS");
        manageemployeenextpannel.add(empaddress5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 520, -1, -1));

        jLabel189.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel189.setText("NAME");
        manageemployeenextpannel.add(jLabel189, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        jLabel190.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel190.setText("AGE");
        manageemployeenextpannel.add(jLabel190, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        jLabel191.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel191.setText("GENDER");
        manageemployeenextpannel.add(jLabel191, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, -1, -1));

        jLabel192.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel192.setText("ID NO");
        manageemployeenextpannel.add(jLabel192, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, -1));

        jLabel193.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel193.setText("PHONE NO");
        manageemployeenextpannel.add(jLabel193, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, -1));

        jLabel194.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel194.setText("ADDRESS");
        manageemployeenextpannel.add(jLabel194, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));

        jLabel195.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel195.setText("E-MAIL ADDRESS");
        manageemployeenextpannel.add(jLabel195, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));

        jLabel196.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel196.setText("EDUCATION");
        manageemployeenextpannel.add(jLabel196, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, -1, -1));

        empeducation4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        empeducation4.setText("EDUCATION");
        manageemployeenextpannel.add(empeducation4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, -1, -1));

        empemailaddress4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        empemailaddress4.setText("E-MAIL ADDRESS");
        manageemployeenextpannel.add(empemailaddress4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, -1, -1));

        empaddress4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        empaddress4.setText("ADDRESS");
        manageemployeenextpannel.add(empaddress4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, -1, -1));

        empphoneno4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        empphoneno4.setText("PHONE NO");
        manageemployeenextpannel.add(empphoneno4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, -1, -1));

        empidno4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        empidno4.setText("ID NO");
        manageemployeenextpannel.add(empidno4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, -1, -1));

        empgender4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        empgender4.setText("GENDER");
        manageemployeenextpannel.add(empgender4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, -1, -1));

        empage4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        empage4.setText("AGE");
        manageemployeenextpannel.add(empage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, -1, -1));

        empname4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        empname4.setText("NAME");
        manageemployeenextpannel.add(empname4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        manageemployeenextpannel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        manageemployeenextpannel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        manageemployeenextpannel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/registerbtn.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        manageemployeenextpannel.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, -1, -1));

        jLabel68.setFont(new java.awt.Font("Sylfaen", 1, 48)); // NOI18N
        jLabel68.setText("Manage Employees 2");
        manageemployeenextpannel.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/background pannel.png"))); // NOI18N
        jLabel9.setText("jLabel7");
        manageemployeenextpannel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1090, -1));

        mainoannel.add(manageemployeenextpannel, "card5");

        manageemployyepannel3.setBackground(new java.awt.Color(255, 255, 255));
        manageemployyepannel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel158.setFont(new java.awt.Font("Sylfaen", 1, 48)); // NOI18N
        jLabel158.setText("Manage Employees 3");
        manageemployyepannel3.add(jLabel158, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        mainoannel.add(manageemployyepannel3, "card29");

        menupannel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        age12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        age12.setText("TYPE");
        menupannel1.add(age12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 710, -1, -1));

        jLabel102.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel102.setText("SUPPLIER");
        menupannel1.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 770, -1, -1));

        idno12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        idno12.setText("SUPPLIER");
        menupannel1.add(idno12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 770, -1, -1));

        name12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        name12.setText("PRODUCT NAME");
        menupannel1.add(name12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 680, -1, -1));

        phoneno12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        phoneno12.setText("DESCRIPTION");
        phoneno12.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        menupannel1.add(phoneno12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 800, 530, 90));

        jLabel103.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel103.setText("PRICE");
        menupannel1.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 740, -1, -1));

        gender12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        gender12.setText("PRICE");
        menupannel1.add(gender12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 740, -1, -1));

        jLabel104.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel104.setText("DESCRIPTION");
        menupannel1.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 800, -1, -1));

        jLabel105.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel105.setText("TYPE");
        menupannel1.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 710, -1, -1));

        jLabel106.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel106.setText("PRODUCT NAME");
        menupannel1.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 680, -1, -1));

        phoneno13.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        phoneno13.setText("DESCRIPTION");
        phoneno13.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        menupannel1.add(phoneno13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, 530, 90));

        jLabel107.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel107.setText("DESCRIPTION");
        menupannel1.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 520, -1, -1));

        jLabel108.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel108.setText("SUPPLIER");
        menupannel1.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, -1, -1));

        jLabel109.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel109.setText("PRICE");
        menupannel1.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, -1, -1));

        jLabel110.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel110.setText("TYPE");
        menupannel1.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, -1, -1));

        jLabel111.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel111.setText("PRODUCT NAME");
        menupannel1.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, -1, -1));

        name13.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        name13.setText("PRODUCT NAME");
        menupannel1.add(name13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, -1, -1));

        age13.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        age13.setText("TYPE");
        menupannel1.add(age13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, -1, -1));

        gender13.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        gender13.setText("PRICE");
        menupannel1.add(gender13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, -1, -1));

        idno13.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        idno13.setText("SUPPLIER");
        menupannel1.add(idno13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, -1, -1));

        productnamee1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        productnamee1.setText("PRODUCT NAME3");
        menupannel1.add(productnamee1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, -1, -1));

        jLabel112.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel112.setText("PRICE");
        menupannel1.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        jLabel113.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel113.setText("PRODUCT NAME");
        menupannel1.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, -1));

        jLabel114.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel114.setText("SUPPLIER");
        menupannel1.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, -1));

        productpricee1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        productpricee1.setText("PRICE");
        menupannel1.add(productpricee1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, -1, -1));

        jLabel115.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel115.setText("TYPE");
        menupannel1.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, -1));

        productdescriptionn1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        productdescriptionn1.setText("DESCRIPTION");
        productdescriptionn1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        menupannel1.add(productdescriptionn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 530, 90));

        producttypee1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        producttypee1.setText("TYPE");
        menupannel1.add(producttypee1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, -1, -1));

        suppliername1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        suppliername1.setText("SUPPLIER");
        menupannel1.add(suppliername1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, -1, -1));

        jLabel116.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel116.setText("DESCRIPTION");
        menupannel1.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));

        jLabel12.setText("Juice Page 1");
        menupannel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel117.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        menupannel1.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, -1, -1));

        jLabel118.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        menupannel1.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel119.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        menupannel1.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        nextbtn3.setForeground(new java.awt.Color(255, 255, 255));
        nextbtn3.setIcon(new javax.swing.ImageIcon("G:\\huice_bar assets\\buttons\\nextbtn.png")); // NOI18N
        nextbtn3.setBorder(null);
        nextbtn3.setBorderPainted(false);
        nextbtn3.setContentAreaFilled(false);
        nextbtn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbtn3ActionPerformed(evt);
            }
        });
        menupannel1.add(nextbtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 950, -1, -1));

        jLabel120.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/background pannel.png"))); // NOI18N
        jLabel120.setText("jLabel7");
        menupannel1.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1090, -1));

        mainoannel.add(menupannel1, "card7");

        employeenext.setBackground(new java.awt.Color(255, 255, 255));
        employeenext.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        emplable13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employee lable.png"))); // NOI18N
        employeenext.add(emplable13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        emplable14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employee lable.png"))); // NOI18N
        employeenext.add(emplable14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 580, -1, -1));

        emplable15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employee lable.png"))); // NOI18N
        employeenext.add(emplable15, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 580, -1, -1));

        emplable16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employee lable.png"))); // NOI18N
        employeenext.add(emplable16, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, -1, -1));

        emplable17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employee lable.png"))); // NOI18N
        employeenext.add(emplable17, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 130, -1, -1));

        emplable18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employee lable.png"))); // NOI18N
        employeenext.add(emplable18, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 580, -1, -1));

        jLabel14.setText("employee next");
        employeenext.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 69, -1, -1));

        next1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/backbtn.png"))); // NOI18N
        next1.setBorder(null);
        next1.setBorderPainted(false);
        next1.setContentAreaFilled(false);
        next1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next1ActionPerformed(evt);
            }
        });
        employeenext.add(next1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 950, -1, -1));

        mainoannel.add(employeenext, "card12");

        menuitemsdash.setBackground(new java.awt.Color(255, 255, 255));
        menuitemsdash.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/smootheecollection.png"))); // NOI18N
        menuitemsdash.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 600, -1, -1));

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/juicescollection.png"))); // NOI18N
        menuitemsdash.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/icecream collection.png"))); // NOI18N
        menuitemsdash.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, -1, -1));

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/milkshake collection.png"))); // NOI18N
        menuitemsdash.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 630, -1, -1));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/Frame 38159.png"))); // NOI18N
        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        menuitemsdash.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 870, -1, -1));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/Frame 38167.png"))); // NOI18N
        jButton10.setBorder(null);
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        menuitemsdash.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, -1, -1));

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/ICECEREAM.png"))); // NOI18N
        jButton11.setBorder(null);
        jButton11.setBorderPainted(false);
        jButton11.setContentAreaFilled(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        menuitemsdash.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, -1, -1));

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/Frame 38160.png"))); // NOI18N
        jButton12.setBorder(null);
        jButton12.setBorderPainted(false);
        jButton12.setContentAreaFilled(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        menuitemsdash.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 870, -1, -1));

        mainoannel.add(menuitemsdash, "card27");

        reportpannel.setBackground(new java.awt.Color(255, 255, 255));
        reportpannel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/Search Payments.png"))); // NOI18N
        reportpannel.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, -1, -1));

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/Frame 35357.png"))); // NOI18N
        reportpannel.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 550, -1, -1));

        mainoannel.add(reportpannel, "card28");

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nextbtn7.setForeground(new java.awt.Color(255, 255, 255));
        nextbtn7.setIcon(new javax.swing.ImageIcon("G:\\huice_bar assets\\buttons\\nextbtn.png")); // NOI18N
        nextbtn7.setBorder(null);
        nextbtn7.setBorderPainted(false);
        nextbtn7.setContentAreaFilled(false);
        nextbtn7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbtn7ActionPerformed(evt);
            }
        });
        jPanel6.add(nextbtn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 950, -1, -1));
        jPanel6.add(pphoto15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 670, 240, 250));

        ptype15.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ptype15.setText("TYPE");
        jPanel6.add(ptype15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 710, -1, -1));

        pname15.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pname15.setText("PRODUCT NAME");
        jPanel6.add(pname15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 680, -1, -1));

        pprice15.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pprice15.setText("PRICE");
        jPanel6.add(pprice15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 740, -1, -1));

        psupplier15.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        psupplier15.setText("SUPPLIER");
        jPanel6.add(psupplier15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 770, -1, -1));

        pdescription15.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pdescription15.setText("DESCRIPTION");
        pdescription15.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel6.add(pdescription15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 800, 530, 90));

        ptype14.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ptype14.setText("TYPE");
        jPanel6.add(ptype14, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, -1, -1));

        pname14.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pname14.setText("PRODUCT NAME");
        jPanel6.add(pname14, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, -1, -1));

        psupplier14.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        psupplier14.setText("SUPPLIER");
        jPanel6.add(psupplier14, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, -1, -1));

        pdescription14.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pdescription14.setText("DESCRIPTION");
        pdescription14.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel6.add(pdescription14, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, 530, 90));

        pprice14.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pprice14.setText("PRICE");
        jPanel6.add(pprice14, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, -1, -1));
        jPanel6.add(pphoto14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 240, 250));

        ptype13.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ptype13.setText("TYPE");
        jPanel6.add(ptype13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, -1, -1));

        pprice13.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pprice13.setText("PRICE");
        jPanel6.add(pprice13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, -1, -1));

        psupplier13.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        psupplier13.setText("SUPPLIER");
        jPanel6.add(psupplier13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, -1, -1));

        pdescription13.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pdescription13.setText("DESCRIPTION");
        pdescription13.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel6.add(pdescription13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 530, 90));
        jPanel6.add(pphoto13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 240, 250));

        pname13.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pname13.setText("PRODUCT NAME");
        jPanel6.add(pname13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, -1, -1));

        jLabel213.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel213.setText("DESCRIPTION");
        jPanel6.add(jLabel213, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 800, -1, -1));

        jLabel214.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel214.setText("SUPPLIER");
        jPanel6.add(jLabel214, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 770, -1, -1));

        jLabel215.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel215.setText("PRICE");
        jPanel6.add(jLabel215, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 740, -1, -1));

        jLabel216.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel216.setText("TYPE");
        jPanel6.add(jLabel216, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 710, -1, -1));

        jLabel217.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel217.setText("PRODUCT NAME");
        jPanel6.add(jLabel217, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 680, -1, -1));

        jLabel218.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel218.setText("DESCRIPTION");
        jPanel6.add(jLabel218, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 520, -1, -1));

        jLabel219.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel219.setText("SUPPLIER");
        jPanel6.add(jLabel219, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, -1, -1));

        jLabel220.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel220.setText("PRICE");
        jPanel6.add(jLabel220, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, -1, -1));

        jLabel221.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel221.setText("TYPE");
        jPanel6.add(jLabel221, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, -1, -1));

        jLabel222.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel222.setText("PRODUCT NAME");
        jPanel6.add(jLabel222, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, -1, -1));

        jLabel223.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel223.setText("DESCRIPTION");
        jPanel6.add(jLabel223, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));

        jLabel224.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel224.setText("SUPPLIER");
        jPanel6.add(jLabel224, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, -1));

        jLabel225.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel225.setText("PRICE");
        jPanel6.add(jLabel225, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        jLabel226.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel226.setText("TYPE");
        jPanel6.add(jLabel226, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, -1));

        jLabel227.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel227.setText("PRODUCT NAME");
        jPanel6.add(jLabel227, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, -1));

        jLabel228.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        jPanel6.add(jLabel228, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel229.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        jPanel6.add(jLabel229, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jLabel230.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        jPanel6.add(jLabel230, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, -1, -1));

        jLabel236.setFont(new java.awt.Font("Sylfaen", 1, 48)); // NOI18N
        jLabel236.setText("Juices 5");
        jPanel6.add(jLabel236, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        backbtn6.setForeground(new java.awt.Color(255, 255, 255));
        backbtn6.setIcon(new javax.swing.ImageIcon("G:\\huice_bar assets\\buttons\\backbtn.png")); // NOI18N
        backbtn6.setBorder(null);
        backbtn6.setBorderPainted(false);
        backbtn6.setContentAreaFilled(false);
        backbtn6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtn6ActionPerformed(evt);
            }
        });
        jPanel6.add(backbtn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 950, -1, -1));

        jLabel232.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/background pannel.png"))); // NOI18N
        jLabel232.setText("jLabel7");
        jPanel6.add(jLabel232, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1090, -1));

        mainoannel.add(jPanel6, "card9");

        jPanel1.add(mainoannel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 1080, 1030));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1026, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardbtnActionPerformed
     
         
dashboardpannel.setVisible(true);
empdetailspannnext.setVisible(false);
manageemployyepanel.setVisible(false);
manageemployeenextpannel.setVisible(false);
manageemployyepannel3.setVisible(false);
menupannel1.setVisible(false);

menuitemsdash.setVisible(false);
reportpannel.setVisible(false);
jPanel6.setVisible(false);
         
    }//GEN-LAST:event_dashboardbtnActionPerformed

    private void employeebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeebtnActionPerformed
       dashboardpannel.setVisible(false);
empdetailspannnext.setVisible(true);
manageemployyepanel.setVisible(false);
manageemployeenextpannel.setVisible(false);
manageemployyepannel3.setVisible(false);
menupannel1.setVisible(false);

employeenext.setVisible(false);

menuitemsdash.setVisible(false);
reportpannel.setVisible(false);
jPanel6.setVisible(false);
    }//GEN-LAST:event_employeebtnActionPerformed

    private void manageemployeebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageemployeebtnActionPerformed
      
      
      dashboardpannel.setVisible(false);
empdetailspannnext.setVisible(false);
manageemployyepanel.setVisible(true);
manageemployeenextpannel.setVisible(false);
manageemployyepannel3.setVisible(false);
menupannel1.setVisible(false);

employeenext.setVisible(false);

menuitemsdash.setVisible(false);
reportpannel.setVisible(false);
jPanel6.setVisible(false);
    }//GEN-LAST:event_manageemployeebtnActionPerformed

    private void menubtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menubtnActionPerformed
       mENURE2 men = new  mENURE2();
        men.setVisible(true);
        this.dispose();
       
    }//GEN-LAST:event_menubtnActionPerformed

    private void manageitemsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageitemsbtnActionPerformed
dbresetsjuices();
dbresetsicecream();
dbresetsmilkshakes();
dbresetssmoothiees();
icecreamdtalist icd = new icecreamdtalist();
icd.setVisible(true);
this.dispose();
//dashboardpannel.setVisible(false);
//empdetailspannnext.setVisible(false);
//manageemployyepanel.setVisible(false);
//manageemployeenextpannel.setVisible(false);
//manageemployyepannel3.setVisible(false);
//menupannel1.setVisible(false);
//juicemenupannel1.setVisible(false);
//juicemenupannel2.setVisible(false);
//juicemenupannel3.setVisible(false);
//juicemenupannel4.setVisible(false);
//juicemenupannel5.setVisible(false);
//juicemenupannel6.setVisible(false);
//employeenext.setVisible(false);
//Icecreampannel1.setVisible(false);
//Icecreampannel2.setVisible(false);
//Icecreampannel3.setVisible(false);
//Icecreampannel4.setVisible(false);
//milkshakespannel1.setVisible(false);
//milkshakespannel2.setVisible(false);
//milkshakespannel3.setVisible(false);
//smootheepannel1.setVisible(false);
//smootheepannel2.setVisible(false);
//smootheepannel3.setVisible(false);
//menuitemsdash.setVisible(true);
//reportpannel.setVisible(false);
//jPanel6.setVisible(false);








// adminlogin log = new adminlogin();
//        log.setVisible(true);
//        this.dispose();
                // TODO add your handling code here:
    }//GEN-LAST:event_manageitemsbtnActionPerformed

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutbtnActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
       dashboardpannel.setVisible(false);
empdetailspannnext.setVisible(false);
manageemployyepanel.setVisible(true);
manageemployeenextpannel.setVisible(false);
manageemployyepannel3.setVisible(false);
menupannel1.setVisible(false);

employeenext.setVisible(false);

menuitemsdash.setVisible(false);
reportpannel.setVisible(false);
jPanel6.setVisible(false);
    }//GEN-LAST:event_backbtnActionPerformed

    private void nextbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbtn1ActionPerformed
    dashboardpannel.setVisible(false);
empdetailspannnext.setVisible(false);
manageemployyepanel.setVisible(false);
manageemployeenextpannel.setVisible(true);
manageemployyepannel3.setVisible(false);
menupannel1.setVisible(false);

employeenext.setVisible(false);

menuitemsdash.setVisible(false);
reportpannel.setVisible(false);
jPanel6.setVisible(false);
    }//GEN-LAST:event_nextbtn1ActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
dashboardpannel.setVisible(false);
empdetailspannnext.setVisible(false);
manageemployyepanel.setVisible(false);
manageemployeenextpannel.setVisible(false);
manageemployyepannel3.setVisible(false);
menupannel1.setVisible(false);

employeenext.setVisible(true);


menuitemsdash.setVisible(false);
reportpannel.setVisible(false);
jPanel6.setVisible(false);
    }//GEN-LAST:event_nextActionPerformed

    private void nextbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbtn3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nextbtn3ActionPerformed
    String fname = null;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         
        
         
        
        
        
        adminlogin log = new adminlogin();
  
        log.setVisible(true);

        this.dispose();
  
    
        
    
      
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
   
     
      
    }//GEN-LAST:event_jButton6ActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed



//       try {
//            Connection con = dbconnection.dbconnection();
//            String sql = "SELECT * From employee";
//            PreparedStatement ste = con.prepareStatement(sql);
//            ResultSet res = ste.executeQuery();
//            if(res.next()){
//            String id = res.getString(1);
//            InputStream in = res.getBinaryStream(2);
//                
//
//            BufferedImage bufferedImage = ImageIO.read(in);
//            ImageIcon imageIcon = new ImageIcon(bufferedImage);
//            
////employeeregistration empr1 = new employeeregistration();
////empr1.getEmpname1().setText(name1);
////empr1.empname1.setText(name1);
////empage1.setText(String.valueOf(age));
////empgender1.setText(gender);
////empidno1.setText(idno);
////empphoneno1.setText(String.valueOf(phoneno));
////empaddress1.setText(address);
////empemailaddress1.setText(email);
////empprofilephoto1.setIcon(imageIcon);//this is a image
//            
//            
//            
//            
//            }
//        } catch (Exception e) {
//        }
    }//GEN-LAST:event_refreshActionPerformed

    private void next1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next1ActionPerformed
     employeenext.setVisible(false);
empdetailspannnext.setVisible(true);
    }//GEN-LAST:event_next1ActionPerformed

    private void nextbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbtn7ActionPerformed
       dashboardpannel.setVisible(false);
empdetailspannnext.setVisible(false);
manageemployyepanel.setVisible(false);
manageemployeenextpannel.setVisible(false);
manageemployyepannel3.setVisible(false);
menupannel1.setVisible(false);

employeenext.setVisible(false);

menuitemsdash.setVisible(false);
reportpannel.setVisible(false);
jPanel6.setVisible(false);
    }//GEN-LAST:event_nextbtn7ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        dashboardpannel.setVisible(false);
empdetailspannnext.setVisible(false);
manageemployyepanel.setVisible(false);
manageemployeenextpannel.setVisible(false);
manageemployyepannel3.setVisible(false);
menupannel1.setVisible(false);

employeenext.setVisible(false);

menuitemsdash.setVisible(false);
reportpannel.setVisible(false);
jPanel6.setVisible(false);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void backbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtn6ActionPerformed
       dashboardpannel.setVisible(false);
empdetailspannnext.setVisible(false);
manageemployyepanel.setVisible(false);
manageemployeenextpannel.setVisible(false);
manageemployyepannel3.setVisible(false);
menupannel1.setVisible(false);

employeenext.setVisible(false);

menuitemsdash.setVisible(false);
reportpannel.setVisible(false);
jPanel6.setVisible(false);
    }//GEN-LAST:event_backbtn6ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
icecreamdtalist icd = new icecreamdtalist();
icd.setVisible(true);
this.dispose();





//               dashboardpannel.setVisible(false);
//empdetailspannnext.setVisible(false);
//manageemployyepanel.setVisible(false);
//manageemployeenextpannel.setVisible(false);
//manageemployyepannel3.setVisible(false);
//menupannel1.setVisible(false);
//juicemenupannel1.setVisible(false);
//juicemenupannel2.setVisible(false);
//juicemenupannel3.setVisible(false);
//juicemenupannel4.setVisible(false);
//juicemenupannel5.setVisible(false);
//juicemenupannel6.setVisible(false);
//employeenext.setVisible(false);
//Icecreampannel1.setVisible(true);
//Icecreampannel2.setVisible(false);
//Icecreampannel3.setVisible(false);
//Icecreampannel4.setVisible(false);
//milkshakespannel1.setVisible(false);
//milkshakespannel2.setVisible(false);
//milkshakespannel3.setVisible(false);
//smootheepannel1.setVisible(false);
//smootheepannel2.setVisible(false);
//smootheepannel3.setVisible(false);
//menuitemsdash.setVisible(false);
//reportpannel.setVisible(false);
//jPanel6.setVisible(false);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
                      dashboardpannel.setVisible(false);
empdetailspannnext.setVisible(false);
manageemployyepanel.setVisible(false);
manageemployeenextpannel.setVisible(false);
manageemployyepannel3.setVisible(false);
menupannel1.setVisible(false);

employeenext.setVisible(false);

menuitemsdash.setVisible(false);
reportpannel.setVisible(false);
jPanel6.setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
               dashboardpannel.setVisible(false);
empdetailspannnext.setVisible(false);
manageemployyepanel.setVisible(false);
manageemployeenextpannel.setVisible(false);
manageemployyepannel3.setVisible(false);
menupannel1.setVisible(false);

employeenext.setVisible(false);

menuitemsdash.setVisible(false);
reportpannel.setVisible(false);
jPanel6.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
      employeeregistration empr = new employeeregistration();
      empr.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard_ui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age12;
    private javax.swing.JLabel age13;
    private javax.swing.JButton backbtn;
    private javax.swing.JButton backbtn6;
    private javax.swing.JLabel cardname;
    private javax.swing.JLabel cardname1;
    private javax.swing.JLabel cardname2;
    private javax.swing.JLabel cardname3;
    private javax.swing.JLabel cardname4;
    private javax.swing.JLabel cardname5;
    private javax.swing.JLabel crddesignation;
    private javax.swing.JLabel crddesignation1;
    private javax.swing.JLabel crddesignation2;
    private javax.swing.JLabel crddesignation3;
    private javax.swing.JLabel crddesignation4;
    private javax.swing.JLabel crddesignation5;
    private javax.swing.JLabel crdname;
    private javax.swing.JLabel crdname1;
    private javax.swing.JLabel crdname2;
    private javax.swing.JLabel crdname3;
    private javax.swing.JLabel crdname4;
    private javax.swing.JLabel crdname5;
    private javax.swing.JButton dashboardbtn;
    private javax.swing.JPanel dashboardpannel;
    public javax.swing.JLabel empaddress1;
    public javax.swing.JLabel empaddress2;
    public javax.swing.JLabel empaddress3;
    public javax.swing.JLabel empaddress4;
    public javax.swing.JLabel empaddress5;
    public javax.swing.JLabel empaddress6;
    public javax.swing.JLabel empage1;
    public javax.swing.JLabel empage2;
    public javax.swing.JLabel empage3;
    public javax.swing.JLabel empage4;
    public javax.swing.JLabel empage5;
    public javax.swing.JLabel empage6;
    private javax.swing.JPanel empdetailspannnext;
    public javax.swing.JLabel empeducation1;
    public javax.swing.JLabel empeducation2;
    public javax.swing.JLabel empeducation3;
    public javax.swing.JLabel empeducation4;
    public javax.swing.JLabel empeducation5;
    public javax.swing.JLabel empeducation6;
    public javax.swing.JLabel empemailaddress1;
    public javax.swing.JLabel empemailaddress2;
    public javax.swing.JLabel empemailaddress3;
    public javax.swing.JLabel empemailaddress4;
    public javax.swing.JLabel empemailaddress5;
    public javax.swing.JLabel empemailaddress6;
    public javax.swing.JLabel empgender1;
    public javax.swing.JLabel empgender2;
    public javax.swing.JLabel empgender3;
    public javax.swing.JLabel empgender4;
    public javax.swing.JLabel empgender5;
    public javax.swing.JLabel empgender6;
    public javax.swing.JLabel empidno1;
    public javax.swing.JLabel empidno2;
    public javax.swing.JLabel empidno3;
    public javax.swing.JLabel empidno4;
    public javax.swing.JLabel empidno5;
    public javax.swing.JLabel empidno6;
    private javax.swing.JLabel emplable10;
    private javax.swing.JLabel emplable11;
    private javax.swing.JLabel emplable12;
    private javax.swing.JLabel emplable13;
    private javax.swing.JLabel emplable14;
    private javax.swing.JLabel emplable15;
    private javax.swing.JLabel emplable16;
    private javax.swing.JLabel emplable17;
    private javax.swing.JLabel emplable18;
    private javax.swing.JLabel emplable7;
    private javax.swing.JLabel emplable8;
    private javax.swing.JLabel emplable9;
    private javax.swing.JButton employeebtn;
    private javax.swing.JPanel employeenext;
    public javax.swing.JLabel empname1;
    public javax.swing.JLabel empname2;
    public javax.swing.JLabel empname3;
    public javax.swing.JLabel empname4;
    public javax.swing.JLabel empname5;
    public javax.swing.JLabel empname6;
    public javax.swing.JLabel empphoneno1;
    public javax.swing.JLabel empphoneno2;
    public javax.swing.JLabel empphoneno3;
    public javax.swing.JLabel empphoneno4;
    public javax.swing.JLabel empphoneno5;
    public javax.swing.JLabel empphoneno6;
    public javax.swing.JLabel empprofilephoto1;
    public javax.swing.JLabel empprofilephoto2;
    public javax.swing.JLabel empprofilephoto3;
    public javax.swing.JLabel empprofilephoto4;
    public javax.swing.JLabel empprofilephoto5;
    public javax.swing.JLabel empprofilephoto6;
    private javax.swing.JLabel gender12;
    private javax.swing.JLabel gender13;
    private javax.swing.JLabel idno12;
    private javax.swing.JLabel idno13;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel200;
    private javax.swing.JLabel jLabel201;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel203;
    private javax.swing.JLabel jLabel204;
    private javax.swing.JLabel jLabel205;
    private javax.swing.JLabel jLabel206;
    private javax.swing.JLabel jLabel207;
    private javax.swing.JLabel jLabel208;
    private javax.swing.JLabel jLabel209;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel210;
    private javax.swing.JLabel jLabel211;
    private javax.swing.JLabel jLabel212;
    private javax.swing.JLabel jLabel213;
    private javax.swing.JLabel jLabel214;
    private javax.swing.JLabel jLabel215;
    private javax.swing.JLabel jLabel216;
    private javax.swing.JLabel jLabel217;
    private javax.swing.JLabel jLabel218;
    private javax.swing.JLabel jLabel219;
    private javax.swing.JLabel jLabel220;
    private javax.swing.JLabel jLabel221;
    private javax.swing.JLabel jLabel222;
    private javax.swing.JLabel jLabel223;
    private javax.swing.JLabel jLabel224;
    private javax.swing.JLabel jLabel225;
    private javax.swing.JLabel jLabel226;
    private javax.swing.JLabel jLabel227;
    private javax.swing.JLabel jLabel228;
    private javax.swing.JLabel jLabel229;
    private javax.swing.JLabel jLabel230;
    private javax.swing.JLabel jLabel232;
    private javax.swing.JLabel jLabel236;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton logoutbtn;
    private javax.swing.JPanel mainoannel;
    private javax.swing.JButton manageemployeebtn;
    private javax.swing.JPanel manageemployeenextpannel;
    private javax.swing.JPanel manageemployyepanel;
    private javax.swing.JPanel manageemployyepannel3;
    private javax.swing.JButton manageitemsbtn;
    private javax.swing.JButton menubtn;
    private javax.swing.JPanel menuitemsdash;
    private javax.swing.JPanel menupannel1;
    private javax.swing.JLabel name12;
    private javax.swing.JLabel name13;
    private javax.swing.JButton next;
    private javax.swing.JButton next1;
    private javax.swing.JButton nextbtn1;
    private javax.swing.JButton nextbtn3;
    private javax.swing.JButton nextbtn7;
    private javax.swing.JButton paymentreportbtn;
    private javax.swing.JLabel pdescription13;
    private javax.swing.JLabel pdescription14;
    private javax.swing.JLabel pdescription15;
    private javax.swing.JLabel phoneno12;
    private javax.swing.JLabel phoneno13;
    private javax.swing.JLabel pname13;
    private javax.swing.JLabel pname14;
    private javax.swing.JLabel pname15;
    private javax.swing.JLabel pphoto13;
    private javax.swing.JLabel pphoto14;
    private javax.swing.JLabel pphoto15;
    private javax.swing.JLabel pprice13;
    private javax.swing.JLabel pprice14;
    private javax.swing.JLabel pprice15;
    private javax.swing.JLabel productdescriptionn1;
    private javax.swing.JLabel productnamee1;
    private javax.swing.JLabel productpricee1;
    private javax.swing.JLabel producttypee1;
    private javax.swing.JLabel psupplier13;
    private javax.swing.JLabel psupplier14;
    private javax.swing.JLabel psupplier15;
    private javax.swing.JLabel ptype13;
    private javax.swing.JLabel ptype14;
    private javax.swing.JLabel ptype15;
    private javax.swing.JButton refresh;
    private javax.swing.JPanel reportpannel;
    private javax.swing.JLabel suppliername1;
    private javax.swing.JLabel ttleitmes;
    private javax.swing.JLabel ttlemployes;
    private javax.swing.JLabel ttlesales;
    // End of variables declaration//GEN-END:variables
}
