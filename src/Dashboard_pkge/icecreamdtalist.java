/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Dashboard_pkge;

import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author User1
 */
public class icecreamdtalist extends javax.swing.JFrame {

    /**
     * Creates new form icecreamdtalist
     */
    public icecreamdtalist() {
        initComponents();
          productjuicedata1();
         productjuicedata2();
         productjuicedata3();
         productjuicedata4();
         productjuicedata5();
         productjuicedata6();
         productjuicedata7();
         productjuicedata8();
         productjuicedata9();
         productjuicedata10();
         productjuicedata11();
         productjuicedata12();
         productjuicedata13();
         productjuicedata14();
         productjuicedata15();
         productjuicedata16();
         productjuicedata17();
         productjuicedata18();
         
        producticecreamdata1();
         producticecreamdata2();
         producticecreamdata3();
         producticecreamdata4();
         producticecreamdata5();
         producticecreamdata6();
         producticecreamdata7();
         producticecreamdata8();
         producticecreamdata9();
         producticecreamdata10();
         producticecreamdata11();
         producticecreamdata12();
         
                  productmilkshakedata1();
         productmilkshakedata2();
         productmilkshakedata3();
         productmilkshakedata4();
         productmilkshakedata5();
         productmilkshakedata6();
         productmilkshakedata7();
         productmilkshakedata8();
         productmilkshakedata9();
         productmilkshakedata10();
         productmilkshakedata11();
         productmilkshakedata12();
         
         productsmoothidata1();
         productsmoothidata2();
         productsmoothidata3();
         productsmoothidata4();
         productsmoothidata5();
         productsmoothidata6();
         productsmoothidata7();
         productsmoothidata8();
         productsmoothidata9();
         productsmoothidata10();
         productsmoothidata11();
         productsmoothidata12();
    }

//        data7();
//        data8();
//        data9();
       
  

         
         
         
         public void producticecreamdata1(){
    
        String sql = "Select * from  icecream where itemid = 1 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);
 
    
    
    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            icephoto1.setIcon(imageIcon);
    
    icename1.setText(name);
    icetype1.setText(type);
    iceprice1.setText(String.valueOf(price)); 
    icesupplier1.setText(String.valueOf(suppliyer)); 
    icedescription1.setText(description);
    icephoto1.setIcon(imageIcon);
  
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
        
        public void producticecreamdata2(){
    
        String sql = "Select * from  icecream where itemid = 2 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);
 
    
    
    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            icephoto2.setIcon(imageIcon);
    
    icename2.setText(name);
    icetype2.setText(type);
    iceprice2.setText(String.valueOf(price)); 
    icesupplier2.setText(String.valueOf(suppliyer)); 
    icedescription2.setText(description);
    icephoto2.setIcon(imageIcon);
  
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
        
        public void producticecreamdata3(){
    
        String sql = "Select * from  icecream where itemid = 3 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);
 
    
    
    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            icephoto3.setIcon(imageIcon);
    
    icename3.setText(name);
    icetype3.setText(type);
    iceprice3.setText(String.valueOf(price)); 
    icesupplier3.setText(String.valueOf(suppliyer)); 
    icedescription3.setText(description);
    icephoto3.setIcon(imageIcon);
  
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
        
        public void producticecreamdata4(){
    
        String sql = "Select * from  icecream where itemid = 4 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);
 
    
    
    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            icephoto4.setIcon(imageIcon);
    
    icename4.setText(name);
    icetype4.setText(type);
    iceprice4.setText(String.valueOf(price)); 
    icesupplier4.setText(String.valueOf(suppliyer)); 
    icedescription4.setText(description);
    icephoto4.setIcon(imageIcon);
  
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
        
        public void producticecreamdata5(){
    
        String sql = "Select * from  icecream where itemid = 5 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);
 
    
    
    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            icephoto5.setIcon(imageIcon);
    
    icename5.setText(name);
    icetype5.setText(type);
    iceprice5.setText(String.valueOf(price)); 
    icesupplier5.setText(String.valueOf(suppliyer)); 
    icedescription5.setText(description);
    icephoto5.setIcon(imageIcon);
  
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
        
        public void producticecreamdata6(){
    
        String sql = "Select * from  icecream where itemid = 6 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);
 
    
    
    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            icephoto6.setIcon(imageIcon);
    
    icename6.setText(name);
    icetype6.setText(type);
    iceprice6.setText(String.valueOf(price)); 
    icesupplier6.setText(String.valueOf(suppliyer)); 
    icedescription6.setText(description);
    icephoto6.setIcon(imageIcon);
  
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
        
        public void producticecreamdata7(){
    
        String sql = "Select * from  icecream where itemid = 7 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);
 
    
    
    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            icephoto7.setIcon(imageIcon);
    
    icename7.setText(name);
    icetype7.setText(type);
    iceprice7.setText(String.valueOf(price)); 
    icesupplier7.setText(String.valueOf(suppliyer)); 
    icedescription7.setText(description);
    icephoto7.setIcon(imageIcon);
  
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
        
        public void producticecreamdata8(){
    
        String sql = "Select * from  icecream where itemid = 8 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);
 
    
    
    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            icephoto8.setIcon(imageIcon);
    
    icename8.setText(name);
    icetype8.setText(type);
    iceprice8.setText(String.valueOf(price)); 
    icesupplier8.setText(String.valueOf(suppliyer)); 
    icedescription8.setText(description);
    icephoto8.setIcon(imageIcon);
  
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
        
        public void producticecreamdata9(){
    
        String sql = "Select * from  icecream where itemid = 9 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);
 
    
    
    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            icephoto9.setIcon(imageIcon);
    
    icename9.setText(name);
    icetype9.setText(type);
    iceprice9.setText(String.valueOf(price)); 
    icesupplier9.setText(String.valueOf(suppliyer)); 
    icedescription9.setText(description);
    icephoto9.setIcon(imageIcon);
  
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
        
        public void producticecreamdata10(){
    
        String sql = "Select * from  icecream where itemid = 10 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);
 
    
    
    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            icephoto10.setIcon(imageIcon);
    
    icename10.setText(name);
    icetype10.setText(type);
    iceprice10.setText(String.valueOf(price)); 
    icesupplier10.setText(String.valueOf(suppliyer)); 
    icedescription10.setText(description);
    icephoto10.setIcon(imageIcon);
  
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
        
        public void producticecreamdata11(){
    
        String sql = "Select * from  icecream where itemid = 11 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);
 
    
    
    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            icephoto11.setIcon(imageIcon);
    
    icename11.setText(name);
    icetype11.setText(type);
    iceprice11.setText(String.valueOf(price)); 
    icesupplier11.setText(String.valueOf(suppliyer)); 
    icedescription11.setText(description);
    icephoto11.setIcon(imageIcon);
  
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
        
        public void producticecreamdata12(){
    
        String sql = "Select * from  icecream where itemid = 12 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);
 
    
    
    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            icephoto12.setIcon(imageIcon);
    
    icename12.setText(name);
    icetype12.setText(type);
    iceprice12.setText(String.valueOf(price)); 
    icesupplier12.setText(String.valueOf(suppliyer)); 
    icedescription12.setText(description);
    icephoto12.setIcon(imageIcon);
  
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
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
    
    
    
    public void productjuicedata1(){
    
        String sql = "Select * from  juices where itemid = 1 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);
 
    
    
    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            pphoto1.setIcon(imageIcon);
    
    pname1.setText(name);
    ptype1.setText(type);
    pprice1.setText(String.valueOf(price)); 
    psupplier1.setText(String.valueOf(suppliyer)); 
    pdescription1.setText(description);
    pphoto1.setIcon(imageIcon);
   

   
    
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
    
    public void productjuicedata2(){
    
        String sql = "Select * from  juices where itemid = 2 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);
 
    
    
    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            pphoto2.setIcon(imageIcon);
    
    pname2.setText(name);
    ptype2.setText(type);
    pprice2.setText(String.valueOf(price)); 
    psupplier2.setText(String.valueOf(suppliyer)); 
    pdescription2.setText(description);
    pphoto2.setIcon(imageIcon);
   

   
    
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
    
    public void productjuicedata3(){
    
        String sql = "Select * from  juices where itemid = 3 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);
 
    
    
    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            pphoto3.setIcon(imageIcon);
    
    pname3.setText(name);
    ptype3.setText(type);
    pprice3.setText(String.valueOf(price)); 
    psupplier3.setText(String.valueOf(suppliyer)); 
    pdescription3.setText(description);
    pphoto3.setIcon(imageIcon);
   

   
    
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
    
    public void productjuicedata4(){
    
        String sql = "Select * from  juices where itemid = 4 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);
 
    
    
    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            pphoto4.setIcon(imageIcon);
    
    pname4.setText(name);
    ptype4.setText(type);
    pprice4.setText(String.valueOf(price)); 
    psupplier4.setText(String.valueOf(suppliyer)); 
    pdescription4.setText(description);
    pphoto4.setIcon(imageIcon);
   

   
    
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
    
    public void productjuicedata5(){
    
        String sql = "Select * from  juices where itemid = 5 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);
 
    
    
    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            pphoto6.setIcon(imageIcon);
    
    pname5.setText(name);
    ptype5.setText(type);
    pprice5.setText(String.valueOf(price)); 
    psupplier5.setText(String.valueOf(suppliyer)); 
    pdescription5.setText(description);
    pphoto5.setIcon(imageIcon);
   

   
    
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
    
    public void productjuicedata6(){
    
        String sql = "Select * from  juices where itemid = 6 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);
 
    
    
    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            pphoto6.setIcon(imageIcon);
    
    pname6.setText(name);
    ptype6.setText(type);
    pprice6.setText(String.valueOf(price)); 
    psupplier6.setText(String.valueOf(suppliyer)); 
    pdescription6.setText(description);
    pphoto6.setIcon(imageIcon);
   

   
    
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
    
    public void productjuicedata7(){
    
        String sql = "Select * from  juices where itemid = 7 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);
 
    
    
    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            pphoto7.setIcon(imageIcon);
    
    pname7.setText(name);
    ptype7.setText(type);
    pprice7.setText(String.valueOf(price)); 
    psupplier7.setText(String.valueOf(suppliyer)); 
    pdescription7.setText(description);
    pphoto7.setIcon(imageIcon);
   

   
    
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
    
    public void productjuicedata8(){
    
        String sql = "Select * from  juices where itemid = 8 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);
 
    
    
    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            pphoto8.setIcon(imageIcon);
    
    pname8.setText(name);
    ptype8.setText(type);
    pprice8.setText(String.valueOf(price)); 
    psupplier8.setText(String.valueOf(suppliyer)); 
    pdescription8.setText(description);
    pphoto8.setIcon(imageIcon);
   

   
    
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
    
    public void productjuicedata9(){
    
        String sql = "Select * from  juices where itemid = 9 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);
 
    
    
    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            pphoto9.setIcon(imageIcon);
    
    pname9.setText(name);
    ptype9.setText(type);
    pprice9.setText(String.valueOf(price)); 
    psupplier9.setText(String.valueOf(suppliyer)); 
    pdescription9.setText(description);
    pphoto9.setIcon(imageIcon);
   

   
    
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
    
    public void productjuicedata10(){
    
        String sql = "Select * from  juices where itemid = 10 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);
 
    
    
    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            pphoto10.setIcon(imageIcon);
    
    pname10.setText(name);
    ptype10.setText(type);
    pprice10.setText(String.valueOf(price)); 
    psupplier10.setText(String.valueOf(suppliyer)); 
    pdescription10.setText(description);
    pphoto10.setIcon(imageIcon);
   

   
    
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
    
    public void productjuicedata11(){
    
        String sql = "Select * from  juices where itemid = 11 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);
 
    
    
    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            pphoto11.setIcon(imageIcon);
    
    pname11.setText(name);
    ptype11.setText(type);
    pprice11.setText(String.valueOf(price)); 
    psupplier11.setText(String.valueOf(suppliyer)); 
    pdescription11.setText(description);
    pphoto11.setIcon(imageIcon);
   

   
    
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
    
    public void productjuicedata12(){
    
        String sql = "Select * from  juices where itemid = 12 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);
 
    
    
    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            pphoto12.setIcon(imageIcon);
    
    pname12.setText(name);
    ptype12.setText(type);
    pprice12.setText(String.valueOf(price)); 
    psupplier12.setText(String.valueOf(suppliyer)); 
    pdescription12.setText(description);
    pphoto12.setIcon(imageIcon);
   

   
    
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
    
    public void productjuicedata13(){
    
        String sql = "Select * from  juices where itemid = 13 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);
 
    
    
    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            pphoto13.setIcon(imageIcon);
    
    pname13.setText(name);
    ptype13.setText(type);
    pprice13.setText(String.valueOf(price)); 
    psupplier13.setText(String.valueOf(suppliyer)); 
    pdescription13.setText(description);
    pphoto13.setIcon(imageIcon);
   

   
    
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
    
    public void productjuicedata14(){
    
        String sql = "Select * from  juices where itemid = 14 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);
 
    
    
    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            pphoto14.setIcon(imageIcon);
    
    pname14.setText(name);
    ptype14.setText(type);
    pprice14.setText(String.valueOf(price)); 
    psupplier14.setText(String.valueOf(suppliyer)); 
    pdescription14.setText(description);
    pphoto14.setIcon(imageIcon);
   

   
    
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
    
    public void productjuicedata15(){
    
        String sql = "Select * from  juices where itemid = 15 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);
 
    
    
    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            pphoto15.setIcon(imageIcon);
    
    pname15.setText(name);
    ptype15.setText(type);
    pprice15.setText(String.valueOf(price)); 
    psupplier15.setText(String.valueOf(suppliyer)); 
    pdescription15.setText(description);
    pphoto15.setIcon(imageIcon);
   

   
    
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
    
    public void productjuicedata16(){
    
        String sql = "Select * from  juices where itemid = 16 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);
 
    
    
    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            pphoto16.setIcon(imageIcon);
    
    pname16.setText(name);
    ptype16.setText(type);
    pprice16.setText(String.valueOf(price)); 
    psupplier16.setText(String.valueOf(suppliyer)); 
    pdescription16.setText(description);
    pphoto16.setIcon(imageIcon);
   

   
    
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
    
    public void productjuicedata17(){
    
        String sql = "Select * from  juices where itemid = 17 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);
 
    
    
    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            pphoto17.setIcon(imageIcon);
    
    pname17.setText(name);
    ptype17.setText(type);
    pprice17.setText(String.valueOf(price)); 
    psupplier17.setText(String.valueOf(suppliyer)); 
    pdescription17.setText(description);
    pphoto17.setIcon(imageIcon);
   

   
    
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
    
    public void productjuicedata18(){
    
        String sql = "Select * from  juices where itemid = 18 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);
 
    
    
    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            pphoto18.setIcon(imageIcon);
    
    pname18.setText(name);
    ptype18.setText(type);
    pprice18.setText(String.valueOf(price)); 
    psupplier18.setText(String.valueOf(suppliyer)); 
    pdescription18.setText(description);
    pphoto18.setIcon(imageIcon);
   

   
    
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
      
     public void productmilkshakedata1(){
    
        String sql = "Select * from  milkshakes where itemid = 1 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);

    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            milkshakepto1.setIcon(imageIcon);
    
    milkshakename1.setText(name);
    milkshaketype1.setText(type);
    milkshakeprice1.setText(String.valueOf(price)); 
    milkshakesupplier1.setText(String.valueOf(suppliyer)); 
    milkshakedescription1.setText(description);
    milkshakepto1.setIcon(imageIcon);
  
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
        
        public void productmilkshakedata2(){
    
        String sql = "Select * from  milkshakes where itemid = 2";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);

    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            milkshakepto2.setIcon(imageIcon);
    
    milkshakename2.setText(name);
    milkshaketype2.setText(type);
    milkshakeprice2.setText(String.valueOf(price)); 
    milkshakesupplier2.setText(String.valueOf(suppliyer)); 
    milkshakedescription2.setText(description);
    milkshakepto2.setIcon(imageIcon);
  
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
        
        public void productmilkshakedata3(){
    
        String sql = "Select * from  milkshakes where itemid = 3 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);

    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            milkshakepto3.setIcon(imageIcon);
    
    milkshakename3.setText(name);
    milkshaketype3.setText(type);
    milkshakeprice3.setText(String.valueOf(price)); 
    milkshakesupplier3.setText(String.valueOf(suppliyer)); 
    milkshakedescription3.setText(description);
    milkshakepto3.setIcon(imageIcon);
  
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
        
        public void productmilkshakedata4(){
    
        String sql = "Select * from  milkshakes where itemid = 4 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);

    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            milkshakepto4.setIcon(imageIcon);
    
    milkshakename4.setText(name);
    milkshaketype4.setText(type);
    milkshakeprice4.setText(String.valueOf(price)); 
    milkshakesupplier4.setText(String.valueOf(suppliyer)); 
    milkshakedescription4.setText(description);
    milkshakepto4.setIcon(imageIcon);
  
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
        
        public void productmilkshakedata5(){
    
        String sql = "Select * from  milkshakes where itemid = 5 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);

    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            milkshakepto5.setIcon(imageIcon);
    
    milkshakename5.setText(name);
    milkshaketype5.setText(type);
    milkshakeprice5.setText(String.valueOf(price)); 
    milkshakesupplier5.setText(String.valueOf(suppliyer)); 
    milkshakedescription5.setText(description);
    milkshakepto5.setIcon(imageIcon);
  
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
        
        public void productmilkshakedata6(){
    
        String sql = "Select * from  milkshakes where itemid = 6 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);

    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            milkshakepto6.setIcon(imageIcon);
    
    milkshakename6.setText(name);
    milkshaketype6.setText(type);
    milkshakeprice6.setText(String.valueOf(price)); 
    milkshakesupplier6.setText(String.valueOf(suppliyer)); 
    milkshakedescription6.setText(description);
    milkshakepto6.setIcon(imageIcon);
  
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
        
        public void productmilkshakedata7(){
    
        String sql = "Select * from  milkshakes where itemid = 7 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);

    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            milkshakepto7.setIcon(imageIcon);
    
    milkshakename7.setText(name);
    milkshaketype7.setText(type);
    milkshakeprice7.setText(String.valueOf(price)); 
    milkshakesupplier7.setText(String.valueOf(suppliyer)); 
    milkshakedescription7.setText(description);
    milkshakepto7.setIcon(imageIcon);
  
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
        
        public void productmilkshakedata8(){
    
        String sql = "Select * from  milkshakes where itemid = 8 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);

    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            milkshakepto8.setIcon(imageIcon);
    
    milkshakename8.setText(name);
    milkshaketype8.setText(type);
    milkshakeprice8.setText(String.valueOf(price)); 
    milkshakesupplier8.setText(String.valueOf(suppliyer)); 
    milkshakedescription8.setText(description);
    milkshakepto8.setIcon(imageIcon);
  
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
        
        public void productmilkshakedata9(){
    
        String sql = "Select * from  milkshakes where itemid = 9 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);

    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            milkshakepto9.setIcon(imageIcon);
    
    milkshakename9.setText(name);
    milkshaketype9.setText(type);
    milkshakeprice9.setText(String.valueOf(price)); 
    milkshakesupplier9.setText(String.valueOf(suppliyer)); 
    milkshakedescription9.setText(description);
    milkshakepto9.setIcon(imageIcon);
  
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
        
        public void productmilkshakedata10(){
    
        String sql = "Select * from  milkshakes where itemid = 10 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);

    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            milkshakepto10.setIcon(imageIcon);
    
    milkshakename10.setText(name);
    milkshaketype10.setText(type);
    milkshakeprice10.setText(String.valueOf(price)); 
    milkshakesupplier10.setText(String.valueOf(suppliyer)); 
    milkshakedescription10.setText(description);
    milkshakepto10.setIcon(imageIcon);
  
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
        
        public void productmilkshakedata11(){
    
        String sql = "Select * from  milkshakes where itemid = 11 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);

    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            milkshakepto11.setIcon(imageIcon);
    
    milkshakename11.setText(name);
    milkshaketype11.setText(type);
    milkshakeprice11.setText(String.valueOf(price)); 
    milkshakesupplier11.setText(String.valueOf(suppliyer)); 
    milkshakedescription11.setText(description);
    milkshakepto11.setIcon(imageIcon);
  
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
        
        public void productmilkshakedata12(){
    
        String sql = "Select * from  milkshakes where itemid = 12 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);

    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            milkshakepto12.setIcon(imageIcon);
    
    milkshakename12.setText(name);
    milkshaketype12.setText(type);
    milkshakeprice12.setText(String.valueOf(price)); 
    milkshakesupplier12.setText(String.valueOf(suppliyer)); 
    milkshakedescription12.setText(description);
    milkshakepto12.setIcon(imageIcon);
  
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
    
         public void productsmoothidata1(){
    
        String sql = "Select * from  smoothiees where itemid = 1 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);

    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
           smoothiephoto1.setIcon(imageIcon);
    
    smoothiename1.setText(name);
    smoothietype1.setText(type);
    smoothieprice1.setText(String.valueOf(price)); 
    smoothieprice1.setText(String.valueOf(suppliyer)); 
    smoothiedescription1.setText(description);
    smoothiephoto1.setIcon(imageIcon);
  
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
         
          public void productsmoothidata2(){
    
        String sql = "Select * from  smoothiees where itemid = 2 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);

    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
           smoothiephoto2.setIcon(imageIcon);
    
    smoothiename2.setText(name);
    smoothietype2.setText(type);
    smoothieprice2.setText(String.valueOf(price)); 
    smoothieprice2.setText(String.valueOf(suppliyer)); 
    smoothiedescription2.setText(description);
    smoothiephoto2.setIcon(imageIcon);
  
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
           public void productsmoothidata3(){
    
        String sql = "Select * from  smoothiees where itemid = 3 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);

    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
           smoothiephoto3.setIcon(imageIcon);
    
    smoothiename3.setText(name);
    smoothietype3.setText(type);
    smoothieprice3.setText(String.valueOf(price)); 
    smoothieprice3.setText(String.valueOf(suppliyer)); 
    smoothiedescription3.setText(description);
    smoothiephoto3.setIcon(imageIcon);
  
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
            public void productsmoothidata4(){
    
        String sql = "Select * from  smoothiees where itemid = 4 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);

    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
           smoothiephoto4.setIcon(imageIcon);
    
    smoothiename4.setText(name);
    smoothietype4.setText(type);
    smoothieprice4.setText(String.valueOf(price)); 
    smoothieprice4.setText(String.valueOf(suppliyer)); 
    smoothiedescription4.setText(description);
    smoothiephoto4.setIcon(imageIcon);
  
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
             public void productsmoothidata5(){
    
        String sql = "Select * from  smoothiees where itemid = 5 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);

    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
           smoothiephoto5.setIcon(imageIcon);
    
    smoothiename5.setText(name);
    smoothietype5.setText(type);
    smoothieprice5.setText(String.valueOf(price)); 
    smoothieprice5.setText(String.valueOf(suppliyer)); 
    smoothiedescription5.setText(description);
    smoothiephoto5.setIcon(imageIcon);
  
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
              public void productsmoothidata6(){
    
        String sql = "Select * from  smoothiees where itemid = 6 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);

    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
           smoothiephoto6.setIcon(imageIcon);
    
    smoothiename6.setText(name);
    smoothietype6.setText(type);
    smoothieprice6.setText(String.valueOf(price)); 
    smoothieprice6.setText(String.valueOf(suppliyer)); 
    smoothiedescription6.setText(description);
    smoothiephoto6.setIcon(imageIcon);
  
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
               public void productsmoothidata7(){
    
        String sql = "Select * from  smoothiees where itemid = 7 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);

    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
           smoothiephoto7.setIcon(imageIcon);
    
    smoothiename7.setText(name);
    smoothietype7.setText(type);
    smoothieprice7.setText(String.valueOf(price)); 
    smoothieprice7.setText(String.valueOf(suppliyer)); 
    smoothiedescription7.setText(description);
    smoothiephoto7.setIcon(imageIcon);
  
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
                public void productsmoothidata8(){
    
        String sql = "Select * from  smoothiees where itemid = 8 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);

    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
           smoothiephoto8.setIcon(imageIcon);
    
    smoothiename8.setText(name);
    smoothietype8.setText(type);
    smoothieprice8.setText(String.valueOf(price)); 
    smoothieprice8.setText(String.valueOf(suppliyer)); 
    smoothiedescription8.setText(description);
    smoothiephoto8.setIcon(imageIcon);
  
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
                 public void productsmoothidata9(){
    
        String sql = "Select * from  smoothiees where itemid = 9 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);

    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
           smoothiephoto9.setIcon(imageIcon);
    
    smoothiename9.setText(name);
    smoothietype9.setText(type);
    smoothieprice9.setText(String.valueOf(price)); 
    smoothieprice9.setText(String.valueOf(suppliyer)); 
    smoothiedescription9.setText(description);
    smoothiephoto9.setIcon(imageIcon);
  
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
                  public void productsmoothidata10(){
    
        String sql = "Select * from  smoothiees where itemid = 10 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);

    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
           smoothiephoto10.setIcon(imageIcon);
    
    smoothiename10.setText(name);
    smoothietype10.setText(type);
    smoothieprice10.setText(String.valueOf(price)); 
    smoothieprice10.setText(String.valueOf(suppliyer)); 
    smoothiedescription10.setText(description);
    smoothiephoto10.setIcon(imageIcon);
  
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
                   public void productsmoothidata11(){
    
        String sql = "Select * from  smoothiees where itemid = 11 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);

    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
           smoothiephoto11.setIcon(imageIcon);
    
    smoothiename11.setText(name);
    smoothietype11.setText(type);
    smoothieprice11.setText(String.valueOf(price)); 
    smoothieprice11.setText(String.valueOf(suppliyer)); 
    smoothiedescription11.setText(description);
    smoothiephoto11.setIcon(imageIcon);
  
    }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
                    public void productsmoothidata12(){
    
        String sql = "Select * from  smoothiees where itemid = 12 ";
        try {
            Connection con = dbconnection.dbconnection();
    
    PreparedStatement ste = con.prepareStatement(sql);
    
    ResultSet rs = ste.executeQuery();
    if(rs.next()){
    String name = rs.getString(1);
    int price = rs.getInt(2);
    String type = rs.getString(3);
    String suppliyer = rs.getString(4);
    String description = rs.getString(5);
    InputStream in = rs.getBinaryStream(6);

    
    BufferedImage bufferedImage = ImageIO.read(in);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
           smoothiephoto12.setIcon(imageIcon);
    
    smoothiename12.setText(name);
    smoothietype12.setText(type);
    smoothieprice12.setText(String.valueOf(price)); 
    smoothieprice12.setText(String.valueOf(suppliyer)); 
    smoothiedescription12.setText(description);
    smoothiephoto12.setIcon(imageIcon);
  
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
        juicemenupannel1 = new javax.swing.JPanel();
        pphoto3 = new javax.swing.JLabel();
        pphoto2 = new javax.swing.JLabel();
        pphoto1 = new javax.swing.JLabel();
        pname3 = new javax.swing.JLabel();
        pprice3 = new javax.swing.JLabel();
        ptype3 = new javax.swing.JLabel();
        pdescription3 = new javax.swing.JLabel();
        psupplier3 = new javax.swing.JLabel();
        pname2 = new javax.swing.JLabel();
        pdescription2 = new javax.swing.JLabel();
        psupplier2 = new javax.swing.JLabel();
        pprice2 = new javax.swing.JLabel();
        ptype2 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        pname1 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        pprice1 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        pdescription1 = new javax.swing.JLabel();
        ptype1 = new javax.swing.JLabel();
        psupplier1 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        nextbtn2 = new javax.swing.JButton();
        jLabel69 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        juicemenupannel2 = new javax.swing.JPanel();
        pphoto6 = new javax.swing.JLabel();
        pname6 = new javax.swing.JLabel();
        pprice6 = new javax.swing.JLabel();
        pdescription6 = new javax.swing.JLabel();
        ptype6 = new javax.swing.JLabel();
        psupplier6 = new javax.swing.JLabel();
        pphoto5 = new javax.swing.JLabel();
        psupplier5 = new javax.swing.JLabel();
        pname5 = new javax.swing.JLabel();
        pdescription5 = new javax.swing.JLabel();
        ptype5 = new javax.swing.JLabel();
        pprice5 = new javax.swing.JLabel();
        pname4 = new javax.swing.JLabel();
        pdescription4 = new javax.swing.JLabel();
        psupplier4 = new javax.swing.JLabel();
        pprice4 = new javax.swing.JLabel();
        ptype4 = new javax.swing.JLabel();
        pphoto4 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        productpto1 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        backbtn1 = new javax.swing.JButton();
        jLabel70 = new javax.swing.JLabel();
        nextbtn8 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        juicemenupannel3 = new javax.swing.JPanel();
        pdescription9 = new javax.swing.JLabel();
        pprice9 = new javax.swing.JLabel();
        pname9 = new javax.swing.JLabel();
        psupplier9 = new javax.swing.JLabel();
        pphoto9 = new javax.swing.JLabel();
        ptype9 = new javax.swing.JLabel();
        pdescription8 = new javax.swing.JLabel();
        pname8 = new javax.swing.JLabel();
        psupplier8 = new javax.swing.JLabel();
        ptype8 = new javax.swing.JLabel();
        pprice8 = new javax.swing.JLabel();
        pphoto8 = new javax.swing.JLabel();
        nextbtn4 = new javax.swing.JButton();
        ptype7 = new javax.swing.JLabel();
        pname7 = new javax.swing.JLabel();
        pprice7 = new javax.swing.JLabel();
        pdescription7 = new javax.swing.JLabel();
        pphoto7 = new javax.swing.JLabel();
        psupplier7 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        backbtn2 = new javax.swing.JButton();
        bg = new javax.swing.JLabel();
        juicemenupannel4 = new javax.swing.JPanel();
        pprice12 = new javax.swing.JLabel();
        ptype12 = new javax.swing.JLabel();
        pname12 = new javax.swing.JLabel();
        pdescription12 = new javax.swing.JLabel();
        pphoto12 = new javax.swing.JLabel();
        psupplier12 = new javax.swing.JLabel();
        ptype11 = new javax.swing.JLabel();
        pdescription11 = new javax.swing.JLabel();
        psupplier11 = new javax.swing.JLabel();
        pprice11 = new javax.swing.JLabel();
        pname11 = new javax.swing.JLabel();
        pphoto11 = new javax.swing.JLabel();
        pdescription10 = new javax.swing.JLabel();
        pname10 = new javax.swing.JLabel();
        psupplier10 = new javax.swing.JLabel();
        ptype10 = new javax.swing.JLabel();
        pprice10 = new javax.swing.JLabel();
        pphoto10 = new javax.swing.JLabel();
        nextbtn5 = new javax.swing.JButton();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel233 = new javax.swing.JLabel();
        backbtn3 = new javax.swing.JButton();
        jLabel121 = new javax.swing.JLabel();
        juicemenupannel5 = new javax.swing.JPanel();
        nextbtn6 = new javax.swing.JButton();
        backbtn4 = new javax.swing.JButton();
        jLabel163 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        phoneno21 = new javax.swing.JLabel();
        idno21 = new javax.swing.JLabel();
        gender21 = new javax.swing.JLabel();
        jLabel235 = new javax.swing.JLabel();
        age21 = new javax.swing.JLabel();
        name21 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        jLabel171 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        name22 = new javax.swing.JLabel();
        age22 = new javax.swing.JLabel();
        gender22 = new javax.swing.JLabel();
        idno22 = new javax.swing.JLabel();
        phoneno22 = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        jLabel175 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        jLabel177 = new javax.swing.JLabel();
        name23 = new javax.swing.JLabel();
        age23 = new javax.swing.JLabel();
        gender23 = new javax.swing.JLabel();
        idno23 = new javax.swing.JLabel();
        phoneno23 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        jLabel234 = new javax.swing.JLabel();
        backbtn5 = new javax.swing.JButton();
        juicemenupannel6 = new javax.swing.JPanel();
        pphoto18 = new javax.swing.JLabel();
        jLabel259 = new javax.swing.JLabel();
        jLabel260 = new javax.swing.JLabel();
        jLabel261 = new javax.swing.JLabel();
        jLabel262 = new javax.swing.JLabel();
        jLabel263 = new javax.swing.JLabel();
        pname18 = new javax.swing.JLabel();
        ptype18 = new javax.swing.JLabel();
        pprice18 = new javax.swing.JLabel();
        psupplier18 = new javax.swing.JLabel();
        pdescription18 = new javax.swing.JLabel();
        jLabel258 = new javax.swing.JLabel();
        pphoto17 = new javax.swing.JLabel();
        jLabel253 = new javax.swing.JLabel();
        jLabel254 = new javax.swing.JLabel();
        jLabel255 = new javax.swing.JLabel();
        jLabel256 = new javax.swing.JLabel();
        jLabel257 = new javax.swing.JLabel();
        pdescription17 = new javax.swing.JLabel();
        psupplier17 = new javax.swing.JLabel();
        pprice17 = new javax.swing.JLabel();
        ptype17 = new javax.swing.JLabel();
        pname17 = new javax.swing.JLabel();
        jLabel252 = new javax.swing.JLabel();
        jLabel247 = new javax.swing.JLabel();
        jLabel248 = new javax.swing.JLabel();
        jLabel249 = new javax.swing.JLabel();
        jLabel250 = new javax.swing.JLabel();
        jLabel251 = new javax.swing.JLabel();
        pphoto16 = new javax.swing.JLabel();
        pdescription16 = new javax.swing.JLabel();
        psupplier16 = new javax.swing.JLabel();
        pprice16 = new javax.swing.JLabel();
        ptype16 = new javax.swing.JLabel();
        pname16 = new javax.swing.JLabel();
        jLabel231 = new javax.swing.JLabel();
        jLabel237 = new javax.swing.JLabel();
        backbtn7 = new javax.swing.JButton();
        Icecreampannel1 = new javax.swing.JPanel();
        jLabel276 = new javax.swing.JLabel();
        jLabel277 = new javax.swing.JLabel();
        jLabel278 = new javax.swing.JLabel();
        jLabel279 = new javax.swing.JLabel();
        jLabel280 = new javax.swing.JLabel();
        icename3 = new javax.swing.JLabel();
        icetype3 = new javax.swing.JLabel();
        iceprice3 = new javax.swing.JLabel();
        icesupplier3 = new javax.swing.JLabel();
        icedescription3 = new javax.swing.JLabel();
        icephoto3 = new javax.swing.JLabel();
        jLabel281 = new javax.swing.JLabel();
        icephoto2 = new javax.swing.JLabel();
        jLabel271 = new javax.swing.JLabel();
        jLabel272 = new javax.swing.JLabel();
        jLabel273 = new javax.swing.JLabel();
        jLabel274 = new javax.swing.JLabel();
        jLabel275 = new javax.swing.JLabel();
        icename2 = new javax.swing.JLabel();
        icetype2 = new javax.swing.JLabel();
        iceprice2 = new javax.swing.JLabel();
        icesupplier2 = new javax.swing.JLabel();
        icedescription2 = new javax.swing.JLabel();
        jLabel270 = new javax.swing.JLabel();
        jLabel238 = new javax.swing.JLabel();
        icephoto1 = new javax.swing.JLabel();
        jLabel265 = new javax.swing.JLabel();
        jLabel266 = new javax.swing.JLabel();
        jLabel267 = new javax.swing.JLabel();
        jLabel268 = new javax.swing.JLabel();
        jLabel269 = new javax.swing.JLabel();
        icedescription1 = new javax.swing.JLabel();
        icesupplier1 = new javax.swing.JLabel();
        iceprice1 = new javax.swing.JLabel();
        icetype1 = new javax.swing.JLabel();
        icename1 = new javax.swing.JLabel();
        jLabel264 = new javax.swing.JLabel();
        nextbtn9 = new javax.swing.JButton();
        backbtn8 = new javax.swing.JButton();
        Icecreampannel2 = new javax.swing.JPanel();
        icephoto6 = new javax.swing.JLabel();
        jLabel295 = new javax.swing.JLabel();
        jLabel296 = new javax.swing.JLabel();
        jLabel297 = new javax.swing.JLabel();
        jLabel298 = new javax.swing.JLabel();
        jLabel299 = new javax.swing.JLabel();
        icename6 = new javax.swing.JLabel();
        icetype6 = new javax.swing.JLabel();
        iceprice6 = new javax.swing.JLabel();
        icesupplier6 = new javax.swing.JLabel();
        icedescription6 = new javax.swing.JLabel();
        jLabel294 = new javax.swing.JLabel();
        jLabel289 = new javax.swing.JLabel();
        jLabel290 = new javax.swing.JLabel();
        jLabel291 = new javax.swing.JLabel();
        jLabel292 = new javax.swing.JLabel();
        jLabel293 = new javax.swing.JLabel();
        icedescription5 = new javax.swing.JLabel();
        icesupplier5 = new javax.swing.JLabel();
        iceprice5 = new javax.swing.JLabel();
        icetype5 = new javax.swing.JLabel();
        icename5 = new javax.swing.JLabel();
        icephoto5 = new javax.swing.JLabel();
        jLabel239 = new javax.swing.JLabel();
        jLabel282 = new javax.swing.JLabel();
        jLabel288 = new javax.swing.JLabel();
        icesupplier4 = new javax.swing.JLabel();
        jLabel283 = new javax.swing.JLabel();
        icename4 = new javax.swing.JLabel();
        icetype4 = new javax.swing.JLabel();
        icephoto4 = new javax.swing.JLabel();
        iceprice4 = new javax.swing.JLabel();
        jLabel285 = new javax.swing.JLabel();
        icedescription4 = new javax.swing.JLabel();
        jLabel286 = new javax.swing.JLabel();
        jLabel287 = new javax.swing.JLabel();
        jLabel284 = new javax.swing.JLabel();
        nextbtn10 = new javax.swing.JButton();
        backbtn9 = new javax.swing.JButton();
        Icecreampannel3 = new javax.swing.JPanel();
        icephoto9 = new javax.swing.JLabel();
        jLabel313 = new javax.swing.JLabel();
        jLabel314 = new javax.swing.JLabel();
        jLabel315 = new javax.swing.JLabel();
        jLabel316 = new javax.swing.JLabel();
        jLabel317 = new javax.swing.JLabel();
        icename9 = new javax.swing.JLabel();
        icetype9 = new javax.swing.JLabel();
        iceprice9 = new javax.swing.JLabel();
        icesupplier9 = new javax.swing.JLabel();
        icedescription9 = new javax.swing.JLabel();
        jLabel312 = new javax.swing.JLabel();
        jLabel306 = new javax.swing.JLabel();
        icephoto8 = new javax.swing.JLabel();
        jLabel307 = new javax.swing.JLabel();
        icesupplier8 = new javax.swing.JLabel();
        jLabel309 = new javax.swing.JLabel();
        icetype8 = new javax.swing.JLabel();
        iceprice8 = new javax.swing.JLabel();
        jLabel310 = new javax.swing.JLabel();
        icedescription8 = new javax.swing.JLabel();
        icename8 = new javax.swing.JLabel();
        jLabel311 = new javax.swing.JLabel();
        jLabel308 = new javax.swing.JLabel();
        jLabel240 = new javax.swing.JLabel();
        jLabel300 = new javax.swing.JLabel();
        jLabel301 = new javax.swing.JLabel();
        jLabel302 = new javax.swing.JLabel();
        jLabel303 = new javax.swing.JLabel();
        jLabel304 = new javax.swing.JLabel();
        icedescription7 = new javax.swing.JLabel();
        icesupplier7 = new javax.swing.JLabel();
        iceprice7 = new javax.swing.JLabel();
        icetype7 = new javax.swing.JLabel();
        icename7 = new javax.swing.JLabel();
        icephoto7 = new javax.swing.JLabel();
        jLabel305 = new javax.swing.JLabel();
        nextbtn11 = new javax.swing.JButton();
        backbtn10 = new javax.swing.JButton();
        Icecreampannel4 = new javax.swing.JPanel();
        icephoto12 = new javax.swing.JLabel();
        jLabel331 = new javax.swing.JLabel();
        jLabel332 = new javax.swing.JLabel();
        jLabel333 = new javax.swing.JLabel();
        jLabel334 = new javax.swing.JLabel();
        jLabel335 = new javax.swing.JLabel();
        icename12 = new javax.swing.JLabel();
        icetype12 = new javax.swing.JLabel();
        iceprice12 = new javax.swing.JLabel();
        icesupplier12 = new javax.swing.JLabel();
        icedescription12 = new javax.swing.JLabel();
        jLabel330 = new javax.swing.JLabel();
        icephoto11 = new javax.swing.JLabel();
        jLabel325 = new javax.swing.JLabel();
        jLabel326 = new javax.swing.JLabel();
        jLabel327 = new javax.swing.JLabel();
        jLabel328 = new javax.swing.JLabel();
        jLabel329 = new javax.swing.JLabel();
        icename11 = new javax.swing.JLabel();
        icetype11 = new javax.swing.JLabel();
        iceprice11 = new javax.swing.JLabel();
        icesupplier11 = new javax.swing.JLabel();
        icedescription11 = new javax.swing.JLabel();
        jLabel324 = new javax.swing.JLabel();
        jLabel241 = new javax.swing.JLabel();
        icephoto10 = new javax.swing.JLabel();
        jLabel319 = new javax.swing.JLabel();
        jLabel320 = new javax.swing.JLabel();
        jLabel321 = new javax.swing.JLabel();
        jLabel322 = new javax.swing.JLabel();
        jLabel323 = new javax.swing.JLabel();
        icename10 = new javax.swing.JLabel();
        icetype10 = new javax.swing.JLabel();
        iceprice10 = new javax.swing.JLabel();
        icesupplier10 = new javax.swing.JLabel();
        icedescription10 = new javax.swing.JLabel();
        jLabel318 = new javax.swing.JLabel();
        backbtn11 = new javax.swing.JButton();
        milkshakespannel1 = new javax.swing.JPanel();
        milkshakepto3 = new javax.swing.JLabel();
        jLabel349 = new javax.swing.JLabel();
        jLabel350 = new javax.swing.JLabel();
        jLabel351 = new javax.swing.JLabel();
        jLabel352 = new javax.swing.JLabel();
        jLabel353 = new javax.swing.JLabel();
        milkshakename3 = new javax.swing.JLabel();
        milkshaketype3 = new javax.swing.JLabel();
        milkshakeprice3 = new javax.swing.JLabel();
        milkshakesupplier3 = new javax.swing.JLabel();
        milkshakedescription3 = new javax.swing.JLabel();
        jLabel348 = new javax.swing.JLabel();
        milkshakepto2 = new javax.swing.JLabel();
        jLabel343 = new javax.swing.JLabel();
        jLabel344 = new javax.swing.JLabel();
        jLabel345 = new javax.swing.JLabel();
        jLabel346 = new javax.swing.JLabel();
        jLabel347 = new javax.swing.JLabel();
        milkshakename2 = new javax.swing.JLabel();
        milkshaketype2 = new javax.swing.JLabel();
        milkshakeprice2 = new javax.swing.JLabel();
        milkshakesupplier2 = new javax.swing.JLabel();
        milkshakedescription2 = new javax.swing.JLabel();
        jLabel342 = new javax.swing.JLabel();
        jLabel242 = new javax.swing.JLabel();
        milkshakepto1 = new javax.swing.JLabel();
        jLabel337 = new javax.swing.JLabel();
        jLabel338 = new javax.swing.JLabel();
        jLabel339 = new javax.swing.JLabel();
        jLabel340 = new javax.swing.JLabel();
        jLabel341 = new javax.swing.JLabel();
        milkshakename1 = new javax.swing.JLabel();
        milkshaketype1 = new javax.swing.JLabel();
        milkshakeprice1 = new javax.swing.JLabel();
        milkshakesupplier1 = new javax.swing.JLabel();
        milkshakedescription1 = new javax.swing.JLabel();
        jLabel336 = new javax.swing.JLabel();
        nextbtn13 = new javax.swing.JButton();
        backbtn12 = new javax.swing.JButton();
        milkshakespannel2 = new javax.swing.JPanel();
        milkshakepto6 = new javax.swing.JLabel();
        jLabel367 = new javax.swing.JLabel();
        jLabel368 = new javax.swing.JLabel();
        jLabel369 = new javax.swing.JLabel();
        jLabel370 = new javax.swing.JLabel();
        jLabel371 = new javax.swing.JLabel();
        milkshakename6 = new javax.swing.JLabel();
        milkshaketype6 = new javax.swing.JLabel();
        milkshakeprice6 = new javax.swing.JLabel();
        milkshakesupplier6 = new javax.swing.JLabel();
        milkshakedescription6 = new javax.swing.JLabel();
        jLabel366 = new javax.swing.JLabel();
        milkshakepto5 = new javax.swing.JLabel();
        jLabel361 = new javax.swing.JLabel();
        jLabel362 = new javax.swing.JLabel();
        jLabel363 = new javax.swing.JLabel();
        jLabel364 = new javax.swing.JLabel();
        jLabel365 = new javax.swing.JLabel();
        milkshakename5 = new javax.swing.JLabel();
        milkshaketype5 = new javax.swing.JLabel();
        milkshakeprice5 = new javax.swing.JLabel();
        milkshakesupplier5 = new javax.swing.JLabel();
        milkshakedescription5 = new javax.swing.JLabel();
        jLabel360 = new javax.swing.JLabel();
        jLabel243 = new javax.swing.JLabel();
        milkshakepto4 = new javax.swing.JLabel();
        jLabel355 = new javax.swing.JLabel();
        jLabel356 = new javax.swing.JLabel();
        jLabel357 = new javax.swing.JLabel();
        jLabel358 = new javax.swing.JLabel();
        jLabel359 = new javax.swing.JLabel();
        milkshakename4 = new javax.swing.JLabel();
        milkshaketype4 = new javax.swing.JLabel();
        milkshakeprice4 = new javax.swing.JLabel();
        milkshakesupplier4 = new javax.swing.JLabel();
        milkshakedescription4 = new javax.swing.JLabel();
        jLabel354 = new javax.swing.JLabel();
        nextbtn14 = new javax.swing.JButton();
        backbtn13 = new javax.swing.JButton();
        milkshakespannel3 = new javax.swing.JPanel();
        milkshakepto9 = new javax.swing.JLabel();
        jLabel385 = new javax.swing.JLabel();
        jLabel386 = new javax.swing.JLabel();
        jLabel387 = new javax.swing.JLabel();
        jLabel388 = new javax.swing.JLabel();
        jLabel389 = new javax.swing.JLabel();
        milkshakesupplier9 = new javax.swing.JLabel();
        milkshakedescription9 = new javax.swing.JLabel();
        milkshakeprice9 = new javax.swing.JLabel();
        milkshaketype9 = new javax.swing.JLabel();
        milkshakename9 = new javax.swing.JLabel();
        jLabel384 = new javax.swing.JLabel();
        milkshakepto8 = new javax.swing.JLabel();
        jLabel379 = new javax.swing.JLabel();
        jLabel380 = new javax.swing.JLabel();
        jLabel381 = new javax.swing.JLabel();
        jLabel382 = new javax.swing.JLabel();
        jLabel383 = new javax.swing.JLabel();
        milkshakename8 = new javax.swing.JLabel();
        milkshaketype8 = new javax.swing.JLabel();
        milkshakeprice8 = new javax.swing.JLabel();
        milkshakesupplier8 = new javax.swing.JLabel();
        milkshakedescription8 = new javax.swing.JLabel();
        jLabel378 = new javax.swing.JLabel();
        jLabel244 = new javax.swing.JLabel();
        milkshakepto7 = new javax.swing.JLabel();
        jLabel373 = new javax.swing.JLabel();
        jLabel374 = new javax.swing.JLabel();
        jLabel375 = new javax.swing.JLabel();
        jLabel376 = new javax.swing.JLabel();
        jLabel377 = new javax.swing.JLabel();
        milkshakename7 = new javax.swing.JLabel();
        milkshaketype7 = new javax.swing.JLabel();
        milkshakeprice7 = new javax.swing.JLabel();
        milkshakesupplier7 = new javax.swing.JLabel();
        milkshakedescription7 = new javax.swing.JLabel();
        jLabel372 = new javax.swing.JLabel();
        nextbtn15 = new javax.swing.JButton();
        backbtn14 = new javax.swing.JButton();
        milkshakespannel4 = new javax.swing.JPanel();
        milkshakepto12 = new javax.swing.JLabel();
        jLabel403 = new javax.swing.JLabel();
        jLabel404 = new javax.swing.JLabel();
        jLabel405 = new javax.swing.JLabel();
        jLabel406 = new javax.swing.JLabel();
        jLabel407 = new javax.swing.JLabel();
        milkshakename12 = new javax.swing.JLabel();
        milkshaketype12 = new javax.swing.JLabel();
        milkshakeprice12 = new javax.swing.JLabel();
        milkshakesupplier12 = new javax.swing.JLabel();
        milkshakedescription12 = new javax.swing.JLabel();
        jLabel402 = new javax.swing.JLabel();
        milkshakepto11 = new javax.swing.JLabel();
        jLabel397 = new javax.swing.JLabel();
        jLabel398 = new javax.swing.JLabel();
        jLabel399 = new javax.swing.JLabel();
        jLabel400 = new javax.swing.JLabel();
        jLabel401 = new javax.swing.JLabel();
        milkshakename11 = new javax.swing.JLabel();
        milkshaketype11 = new javax.swing.JLabel();
        milkshakeprice11 = new javax.swing.JLabel();
        milkshakesupplier11 = new javax.swing.JLabel();
        milkshakedescription11 = new javax.swing.JLabel();
        jLabel396 = new javax.swing.JLabel();
        jLabel245 = new javax.swing.JLabel();
        milkshakepto10 = new javax.swing.JLabel();
        jLabel391 = new javax.swing.JLabel();
        jLabel392 = new javax.swing.JLabel();
        jLabel393 = new javax.swing.JLabel();
        jLabel394 = new javax.swing.JLabel();
        jLabel395 = new javax.swing.JLabel();
        milkshakedescription10 = new javax.swing.JLabel();
        milkshakesupplier10 = new javax.swing.JLabel();
        milkshakeprice10 = new javax.swing.JLabel();
        milkshaketype10 = new javax.swing.JLabel();
        milkshakename10 = new javax.swing.JLabel();
        jLabel390 = new javax.swing.JLabel();
        backbtn15 = new javax.swing.JButton();
        smootheepannel1 = new javax.swing.JPanel();
        smoothiephoto3 = new javax.swing.JLabel();
        jLabel421 = new javax.swing.JLabel();
        jLabel422 = new javax.swing.JLabel();
        jLabel423 = new javax.swing.JLabel();
        jLabel424 = new javax.swing.JLabel();
        jLabel425 = new javax.swing.JLabel();
        smoothiename3 = new javax.swing.JLabel();
        smoothietype3 = new javax.swing.JLabel();
        smoothieprice3 = new javax.swing.JLabel();
        smoothiesupplyer3 = new javax.swing.JLabel();
        smoothiedescription3 = new javax.swing.JLabel();
        jLabel420 = new javax.swing.JLabel();
        smoothiephoto2 = new javax.swing.JLabel();
        jLabel415 = new javax.swing.JLabel();
        jLabel416 = new javax.swing.JLabel();
        jLabel417 = new javax.swing.JLabel();
        jLabel418 = new javax.swing.JLabel();
        jLabel419 = new javax.swing.JLabel();
        smoothiename2 = new javax.swing.JLabel();
        smoothietype2 = new javax.swing.JLabel();
        smoothieprice2 = new javax.swing.JLabel();
        smoothiesupplyer2 = new javax.swing.JLabel();
        smoothiedescription2 = new javax.swing.JLabel();
        jLabel414 = new javax.swing.JLabel();
        jLabel246 = new javax.swing.JLabel();
        smoothiephoto1 = new javax.swing.JLabel();
        jLabel409 = new javax.swing.JLabel();
        jLabel410 = new javax.swing.JLabel();
        jLabel411 = new javax.swing.JLabel();
        jLabel412 = new javax.swing.JLabel();
        jLabel413 = new javax.swing.JLabel();
        smoothiename1 = new javax.swing.JLabel();
        smoothietype1 = new javax.swing.JLabel();
        smoothieprice1 = new javax.swing.JLabel();
        smoothiesupplyer1 = new javax.swing.JLabel();
        smoothiedescription1 = new javax.swing.JLabel();
        jLabel408 = new javax.swing.JLabel();
        nextbtn17 = new javax.swing.JButton();
        backbtn16 = new javax.swing.JButton();
        smootheepannel2 = new javax.swing.JPanel();
        smoothiephoto6 = new javax.swing.JLabel();
        jLabel439 = new javax.swing.JLabel();
        jLabel440 = new javax.swing.JLabel();
        jLabel441 = new javax.swing.JLabel();
        jLabel442 = new javax.swing.JLabel();
        jLabel443 = new javax.swing.JLabel();
        smoothiename6 = new javax.swing.JLabel();
        smoothietype6 = new javax.swing.JLabel();
        smoothieprice6 = new javax.swing.JLabel();
        smoothiesupplyer6 = new javax.swing.JLabel();
        smoothiedescription6 = new javax.swing.JLabel();
        jLabel438 = new javax.swing.JLabel();
        smoothiephoto5 = new javax.swing.JLabel();
        jLabel433 = new javax.swing.JLabel();
        jLabel434 = new javax.swing.JLabel();
        jLabel435 = new javax.swing.JLabel();
        jLabel436 = new javax.swing.JLabel();
        jLabel437 = new javax.swing.JLabel();
        smoothiename5 = new javax.swing.JLabel();
        smoothietype5 = new javax.swing.JLabel();
        smoothieprice5 = new javax.swing.JLabel();
        smoothiesupplyer5 = new javax.swing.JLabel();
        smoothiedescription5 = new javax.swing.JLabel();
        jLabel432 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        smoothiephoto4 = new javax.swing.JLabel();
        jLabel427 = new javax.swing.JLabel();
        jLabel428 = new javax.swing.JLabel();
        jLabel429 = new javax.swing.JLabel();
        jLabel430 = new javax.swing.JLabel();
        jLabel431 = new javax.swing.JLabel();
        smoothiename4 = new javax.swing.JLabel();
        smoothietype4 = new javax.swing.JLabel();
        smoothieprice4 = new javax.swing.JLabel();
        smoothiesupplyer4 = new javax.swing.JLabel();
        smoothiedescription4 = new javax.swing.JLabel();
        jLabel426 = new javax.swing.JLabel();
        nextbtn18 = new javax.swing.JButton();
        backbtn17 = new javax.swing.JButton();
        smootheepannel3 = new javax.swing.JPanel();
        smoothiephoto9 = new javax.swing.JLabel();
        jLabel457 = new javax.swing.JLabel();
        jLabel458 = new javax.swing.JLabel();
        jLabel459 = new javax.swing.JLabel();
        jLabel460 = new javax.swing.JLabel();
        jLabel461 = new javax.swing.JLabel();
        smoothiename9 = new javax.swing.JLabel();
        smoothietype9 = new javax.swing.JLabel();
        smoothieprice9 = new javax.swing.JLabel();
        smoothiesupplyer9 = new javax.swing.JLabel();
        smoothiedescription9 = new javax.swing.JLabel();
        jLabel456 = new javax.swing.JLabel();
        smoothiephoto8 = new javax.swing.JLabel();
        jLabel451 = new javax.swing.JLabel();
        jLabel452 = new javax.swing.JLabel();
        jLabel453 = new javax.swing.JLabel();
        jLabel454 = new javax.swing.JLabel();
        jLabel455 = new javax.swing.JLabel();
        smoothiedescription8 = new javax.swing.JLabel();
        smoothiesupplyer8 = new javax.swing.JLabel();
        smoothieprice8 = new javax.swing.JLabel();
        smoothietype8 = new javax.swing.JLabel();
        smoothiename8 = new javax.swing.JLabel();
        jLabel450 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        smoothiephoto7 = new javax.swing.JLabel();
        jLabel445 = new javax.swing.JLabel();
        jLabel446 = new javax.swing.JLabel();
        jLabel447 = new javax.swing.JLabel();
        jLabel448 = new javax.swing.JLabel();
        jLabel449 = new javax.swing.JLabel();
        smoothiename7 = new javax.swing.JLabel();
        smoothietype7 = new javax.swing.JLabel();
        smoothieprice7 = new javax.swing.JLabel();
        smoothiesupplyer7 = new javax.swing.JLabel();
        smoothiedescription7 = new javax.swing.JLabel();
        jLabel444 = new javax.swing.JLabel();
        nextbtn19 = new javax.swing.JButton();
        backbtn18 = new javax.swing.JButton();
        smootheepannel4 = new javax.swing.JPanel();
        smoothiephoto12 = new javax.swing.JLabel();
        jLabel475 = new javax.swing.JLabel();
        jLabel476 = new javax.swing.JLabel();
        jLabel477 = new javax.swing.JLabel();
        jLabel478 = new javax.swing.JLabel();
        jLabel479 = new javax.swing.JLabel();
        smoothiename12 = new javax.swing.JLabel();
        smoothietype12 = new javax.swing.JLabel();
        smoothieprice12 = new javax.swing.JLabel();
        smoothiesupplyer12 = new javax.swing.JLabel();
        smoothiedescription12 = new javax.swing.JLabel();
        jLabel474 = new javax.swing.JLabel();
        smoothiephoto11 = new javax.swing.JLabel();
        jLabel469 = new javax.swing.JLabel();
        jLabel470 = new javax.swing.JLabel();
        jLabel471 = new javax.swing.JLabel();
        jLabel472 = new javax.swing.JLabel();
        jLabel473 = new javax.swing.JLabel();
        smoothiename11 = new javax.swing.JLabel();
        smoothietype11 = new javax.swing.JLabel();
        smoothieprice11 = new javax.swing.JLabel();
        smoothiesupplyer11 = new javax.swing.JLabel();
        smoothiedescription11 = new javax.swing.JLabel();
        jLabel468 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel462 = new javax.swing.JLabel();
        smoothiephoto10 = new javax.swing.JLabel();
        jLabel464 = new javax.swing.JLabel();
        jLabel465 = new javax.swing.JLabel();
        jLabel466 = new javax.swing.JLabel();
        jLabel467 = new javax.swing.JLabel();
        smoothiename10 = new javax.swing.JLabel();
        smoothietype10 = new javax.swing.JLabel();
        smoothieprice10 = new javax.swing.JLabel();
        smoothiesupplyer10 = new javax.swing.JLabel();
        smoothiedescription10 = new javax.swing.JLabel();
        jLabel463 = new javax.swing.JLabel();
        backbtn19 = new javax.swing.JButton();
        menuitemsdash = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        deletebtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        addbtn = new javax.swing.JButton();
        addbtn1 = new javax.swing.JButton();
        updatebtn1 = new javax.swing.JButton();
        deletebtn1 = new javax.swing.JButton();
        updatebtn2 = new javax.swing.JButton();
        deletebtn2 = new javax.swing.JButton();
        addbtn2 = new javax.swing.JButton();
        updatebtn3 = new javax.swing.JButton();
        addbtn3 = new javax.swing.JButton();
        deletebtn3 = new javax.swing.JButton();
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
        paymentreportbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentreportbtnActionPerformed(evt);
            }
        });
        jPanel2.add(paymentreportbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 630, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("G:\\huice_bar assets\\dashgrp.png")); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 350, 1040));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 1040));

        mainoannel.setLayout(new java.awt.CardLayout());

        juicemenupannel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        juicemenupannel1.add(pphoto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 660, 240, 250));
        juicemenupannel1.add(pphoto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 240, 250));
        juicemenupannel1.add(pphoto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 240, 250));

        pname3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pname3.setText("PRODUCT NAME");
        juicemenupannel1.add(pname3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 670, -1, -1));

        pprice3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pprice3.setText("PRICE");
        juicemenupannel1.add(pprice3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 730, -1, -1));

        ptype3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ptype3.setText("TYPE");
        juicemenupannel1.add(ptype3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 700, -1, -1));

        pdescription3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pdescription3.setText("DESCRIPTION");
        pdescription3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        juicemenupannel1.add(pdescription3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 790, 530, 90));

        psupplier3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        psupplier3.setText("SUPPLIER");
        juicemenupannel1.add(psupplier3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 760, -1, -1));

        pname2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pname2.setText("PRODUCT NAME");
        juicemenupannel1.add(pname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, -1, -1));

        pdescription2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pdescription2.setText("DESCRIPTION");
        pdescription2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        juicemenupannel1.add(pdescription2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, 530, 90));

        psupplier2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        psupplier2.setText("SUPPLIER");
        juicemenupannel1.add(psupplier2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, -1, -1));

        pprice2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pprice2.setText("PRICE");
        juicemenupannel1.add(pprice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, -1, -1));

        ptype2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ptype2.setText("TYPE");
        juicemenupannel1.add(ptype2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, -1, -1));

        jLabel82.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel82.setText("SUPPLIER");
        juicemenupannel1.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 770, -1, -1));

        jLabel83.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel83.setText("PRICE");
        juicemenupannel1.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 740, -1, -1));

        jLabel84.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel84.setText("DESCRIPTION");
        juicemenupannel1.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 800, -1, -1));

        jLabel85.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel85.setText("TYPE");
        juicemenupannel1.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 710, -1, -1));

        jLabel86.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel86.setText("PRODUCT NAME");
        juicemenupannel1.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 680, -1, -1));

        jLabel78.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel78.setText("DESCRIPTION");
        juicemenupannel1.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 520, -1, -1));

        jLabel76.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel76.setText("SUPPLIER");
        juicemenupannel1.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, -1, -1));

        jLabel79.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel79.setText("PRICE");
        juicemenupannel1.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, -1, -1));

        jLabel80.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel80.setText("TYPE");
        juicemenupannel1.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, -1, -1));

        jLabel81.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel81.setText("PRODUCT NAME");
        juicemenupannel1.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, -1, -1));

        pname1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pname1.setText("PRODUCT NAME");
        juicemenupannel1.add(pname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, -1, -1));

        jLabel72.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel72.setText("PRICE");
        juicemenupannel1.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        jLabel73.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel73.setText("PRODUCT NAME");
        juicemenupannel1.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, -1));

        jLabel74.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel74.setText("SUPPLIER");
        juicemenupannel1.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, -1));

        pprice1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pprice1.setText("PRICE");
        juicemenupannel1.add(pprice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, -1, -1));

        jLabel75.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel75.setText("TYPE");
        juicemenupannel1.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, -1));

        pdescription1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pdescription1.setText("DESCRIPTION");
        pdescription1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        juicemenupannel1.add(pdescription1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 530, 90));

        ptype1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ptype1.setText("TYPE");
        juicemenupannel1.add(ptype1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, -1, -1));

        psupplier1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        psupplier1.setText("SUPPLIER");
        juicemenupannel1.add(psupplier1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, -1, -1));

        jLabel77.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel77.setText("DESCRIPTION");
        juicemenupannel1.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        juicemenupannel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, -1, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        juicemenupannel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        juicemenupannel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        nextbtn2.setForeground(new java.awt.Color(255, 255, 255));
        nextbtn2.setIcon(new javax.swing.ImageIcon("G:\\huice_bar assets\\buttons\\nextbtn.png")); // NOI18N
        nextbtn2.setBorder(null);
        nextbtn2.setBorderPainted(false);
        nextbtn2.setContentAreaFilled(false);
        nextbtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbtn2ActionPerformed(evt);
            }
        });
        juicemenupannel1.add(nextbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 960, -1, -1));

        jLabel69.setFont(new java.awt.Font("Sylfaen", 1, 48)); // NOI18N
        jLabel69.setText("Juices 1");
        juicemenupannel1.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/background pannel.png"))); // NOI18N
        jLabel16.setText("jLabel7");
        juicemenupannel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1090, -1));

        mainoannel.add(juicemenupannel1, "card7");

        juicemenupannel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        juicemenupannel2.add(pphoto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, 240, 250));

        pname6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pname6.setText("PRODUCT NAME");
        juicemenupannel2.add(pname6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 660, -1, -1));

        pprice6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pprice6.setText("PRICE");
        juicemenupannel2.add(pprice6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 720, -1, -1));

        pdescription6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pdescription6.setText("DESCRIPTION");
        pdescription6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        juicemenupannel2.add(pdescription6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 780, 530, 90));

        ptype6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ptype6.setText("TYPE");
        juicemenupannel2.add(ptype6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 690, -1, -1));

        psupplier6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        psupplier6.setText("SUPPLIER");
        juicemenupannel2.add(psupplier6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 750, -1, -1));
        juicemenupannel2.add(pphoto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 240, 250));

        psupplier5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        psupplier5.setText("SUPPLIER");
        juicemenupannel2.add(psupplier5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, -1, -1));

        pname5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pname5.setText("PRODUCT NAME");
        juicemenupannel2.add(pname5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, -1, -1));

        pdescription5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pdescription5.setText("DESCRIPTION");
        pdescription5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        juicemenupannel2.add(pdescription5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 520, 530, 90));

        ptype5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ptype5.setText("TYPE");
        juicemenupannel2.add(ptype5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, -1, -1));

        pprice5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pprice5.setText("PRICE");
        juicemenupannel2.add(pprice5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, -1, -1));

        pname4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pname4.setText("PRODUCT NAME");
        juicemenupannel2.add(pname4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, -1, -1));

        pdescription4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pdescription4.setText("DESCRIPTION");
        pdescription4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        juicemenupannel2.add(pdescription4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 530, 90));

        psupplier4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        psupplier4.setText("SUPPLIER");
        juicemenupannel2.add(psupplier4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, -1, -1));

        pprice4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pprice4.setText("PRICE");
        juicemenupannel2.add(pprice4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, -1, -1));

        ptype4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ptype4.setText("TYPE");
        juicemenupannel2.add(ptype4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, -1, -1));
        juicemenupannel2.add(pphoto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 240, 250));

        jLabel97.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel97.setText("PRICE");
        juicemenupannel2.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 720, -1, -1));
        juicemenupannel2.add(productpto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 240, 250));

        jLabel98.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel98.setText("PRODUCT NAME");
        juicemenupannel2.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 660, -1, -1));

        jLabel99.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel99.setText("DESCRIPTION");
        juicemenupannel2.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 780, -1, -1));

        jLabel100.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel100.setText("TYPE");
        juicemenupannel2.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 690, -1, -1));

        jLabel101.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel101.setText("SUPPLIER");
        juicemenupannel2.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 750, -1, -1));

        jLabel92.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel92.setText("PRICE");
        juicemenupannel2.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        jLabel93.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel93.setText("PRODUCT NAME");
        juicemenupannel2.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, -1));

        jLabel94.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel94.setText("DESCRIPTION");
        juicemenupannel2.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, -1, -1));

        jLabel95.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel95.setText("TYPE");
        juicemenupannel2.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        jLabel96.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel96.setText("SUPPLIER");
        juicemenupannel2.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));

        jLabel87.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel87.setText("SUPPLIER");
        juicemenupannel2.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, -1, -1));

        jLabel88.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel88.setText("PRICE");
        juicemenupannel2.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, -1, -1));

        jLabel89.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel89.setText("DESCRIPTION");
        juicemenupannel2.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 520, -1, -1));

        jLabel90.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel90.setText("TYPE");
        juicemenupannel2.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, -1, -1));

        jLabel91.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel91.setText("PRODUCT NAME");
        juicemenupannel2.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, -1, -1));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        juicemenupannel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        juicemenupannel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, -1, -1));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        juicemenupannel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        backbtn1.setForeground(new java.awt.Color(255, 255, 255));
        backbtn1.setIcon(new javax.swing.ImageIcon("G:\\huice_bar assets\\buttons\\backbtn.png")); // NOI18N
        backbtn1.setBorder(null);
        backbtn1.setBorderPainted(false);
        backbtn1.setContentAreaFilled(false);
        backbtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtn1ActionPerformed(evt);
            }
        });
        juicemenupannel2.add(backbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 940, -1, -1));

        jLabel70.setFont(new java.awt.Font("Sylfaen", 1, 48)); // NOI18N
        jLabel70.setText("Juices 2");
        juicemenupannel2.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        nextbtn8.setForeground(new java.awt.Color(255, 255, 255));
        nextbtn8.setIcon(new javax.swing.ImageIcon("G:\\huice_bar assets\\buttons\\nextbtn.png")); // NOI18N
        nextbtn8.setBorder(null);
        nextbtn8.setBorderPainted(false);
        nextbtn8.setContentAreaFilled(false);
        nextbtn8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbtn8ActionPerformed(evt);
            }
        });
        juicemenupannel2.add(nextbtn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 940, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/background pannel.png"))); // NOI18N
        jLabel22.setText("jLabel7");
        juicemenupannel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1090, -1));

        mainoannel.add(juicemenupannel2, "card8");

        juicemenupannel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pdescription9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pdescription9.setText("DESCRIPTION");
        pdescription9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        juicemenupannel3.add(pdescription9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 800, 530, 90));

        pprice9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pprice9.setText("PRICE");
        juicemenupannel3.add(pprice9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 740, -1, -1));

        pname9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pname9.setText("PRODUCT NAME");
        juicemenupannel3.add(pname9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 680, -1, -1));

        psupplier9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        psupplier9.setText("SUPPLIER");
        juicemenupannel3.add(psupplier9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 770, -1, -1));
        juicemenupannel3.add(pphoto9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 670, 240, 250));

        ptype9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ptype9.setText("TYPE");
        juicemenupannel3.add(ptype9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 710, -1, -1));

        pdescription8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pdescription8.setText("DESCRIPTION");
        pdescription8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        juicemenupannel3.add(pdescription8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 510, 530, 90));

        pname8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pname8.setText("PRODUCT NAME");
        juicemenupannel3.add(pname8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, -1, -1));

        psupplier8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        psupplier8.setText("SUPPLIER");
        juicemenupannel3.add(psupplier8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, -1, -1));

        ptype8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ptype8.setText("TYPE");
        juicemenupannel3.add(ptype8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, -1, -1));

        pprice8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pprice8.setText("PRICE");
        juicemenupannel3.add(pprice8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, -1, -1));
        juicemenupannel3.add(pphoto8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 240, 250));

        nextbtn4.setForeground(new java.awt.Color(255, 255, 255));
        nextbtn4.setIcon(new javax.swing.ImageIcon("G:\\huice_bar assets\\buttons\\nextbtn.png")); // NOI18N
        nextbtn4.setBorder(null);
        nextbtn4.setBorderPainted(false);
        nextbtn4.setContentAreaFilled(false);
        nextbtn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbtn4ActionPerformed(evt);
            }
        });
        juicemenupannel3.add(nextbtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 940, -1, -1));

        ptype7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ptype7.setText("TYPE");
        juicemenupannel3.add(ptype7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, -1));

        pname7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pname7.setText("PRODUCT NAME");
        juicemenupannel3.add(pname7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, -1));

        pprice7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pprice7.setText("PRICE");
        juicemenupannel3.add(pprice7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, -1, -1));

        pdescription7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pdescription7.setText("DESCRIPTION");
        pdescription7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        juicemenupannel3.add(pdescription7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 530, 90));
        juicemenupannel3.add(pphoto7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 240, 250));

        psupplier7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        psupplier7.setText("SUPPLIER");
        juicemenupannel3.add(psupplier7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, -1, -1));

        jLabel125.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel125.setText("DESCRIPTION");
        juicemenupannel3.add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 800, -1, -1));

        jLabel126.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel126.setText("SUPPLIER");
        juicemenupannel3.add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 770, -1, -1));

        jLabel127.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel127.setText("PRICE");
        juicemenupannel3.add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 740, -1, -1));

        jLabel128.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel128.setText("TYPE");
        juicemenupannel3.add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 710, -1, -1));

        jLabel129.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel129.setText("PRODUCT NAME");
        juicemenupannel3.add(jLabel129, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 680, -1, -1));

        jLabel130.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel130.setText("DESCRIPTION");
        juicemenupannel3.add(jLabel130, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 520, -1, -1));

        jLabel131.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel131.setText("SUPPLIER");
        juicemenupannel3.add(jLabel131, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, -1, -1));

        jLabel132.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel132.setText("PRICE");
        juicemenupannel3.add(jLabel132, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, -1, -1));

        jLabel133.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel133.setText("TYPE");
        juicemenupannel3.add(jLabel133, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, -1, -1));

        jLabel134.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel134.setText("PRODUCT NAME");
        juicemenupannel3.add(jLabel134, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, -1, -1));

        jLabel135.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel135.setText("DESCRIPTION");
        juicemenupannel3.add(jLabel135, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));

        jLabel136.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel136.setText("SUPPLIER");
        juicemenupannel3.add(jLabel136, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, -1));

        jLabel137.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel137.setText("PRICE");
        juicemenupannel3.add(jLabel137, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        jLabel138.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel138.setText("TYPE");
        juicemenupannel3.add(jLabel138, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, -1));

        jLabel139.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel139.setText("PRODUCT NAME");
        juicemenupannel3.add(jLabel139, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, -1));

        jLabel122.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        juicemenupannel3.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel123.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        juicemenupannel3.add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jLabel124.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        juicemenupannel3.add(jLabel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, -1, -1));

        jLabel71.setFont(new java.awt.Font("Sylfaen", 1, 48)); // NOI18N
        jLabel71.setText("Juices 3");
        juicemenupannel3.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        backbtn2.setForeground(new java.awt.Color(255, 255, 255));
        backbtn2.setIcon(new javax.swing.ImageIcon("G:\\huice_bar assets\\buttons\\backbtn.png")); // NOI18N
        backbtn2.setBorder(null);
        backbtn2.setBorderPainted(false);
        backbtn2.setContentAreaFilled(false);
        backbtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtn2ActionPerformed(evt);
            }
        });
        juicemenupannel3.add(backbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 940, -1, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/background pannel.png"))); // NOI18N
        bg.setText("jLabel7");
        juicemenupannel3.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1090, -1));

        mainoannel.add(juicemenupannel3, "card10");

        juicemenupannel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pprice12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pprice12.setText("PRICE");
        juicemenupannel4.add(pprice12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 740, -1, -1));

        ptype12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ptype12.setText("TYPE");
        juicemenupannel4.add(ptype12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 710, -1, -1));

        pname12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pname12.setText("PRODUCT NAME");
        juicemenupannel4.add(pname12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 680, -1, -1));

        pdescription12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pdescription12.setText("DESCRIPTION");
        pdescription12.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        juicemenupannel4.add(pdescription12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 800, 530, 90));
        juicemenupannel4.add(pphoto12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 670, 240, 250));

        psupplier12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        psupplier12.setText("SUPPLIER");
        juicemenupannel4.add(psupplier12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 770, -1, -1));

        ptype11.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ptype11.setText("TYPE");
        juicemenupannel4.add(ptype11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, -1, -1));

        pdescription11.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pdescription11.setText("DESCRIPTION");
        pdescription11.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        juicemenupannel4.add(pdescription11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 520, 530, 90));

        psupplier11.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        psupplier11.setText("SUPPLIER");
        juicemenupannel4.add(psupplier11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, -1, -1));

        pprice11.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pprice11.setText("PRICE");
        juicemenupannel4.add(pprice11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, -1, -1));

        pname11.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pname11.setText("PRODUCT NAME");
        juicemenupannel4.add(pname11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, -1, -1));
        juicemenupannel4.add(pphoto11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 240, 250));

        pdescription10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pdescription10.setText("DESCRIPTION");
        pdescription10.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        juicemenupannel4.add(pdescription10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 530, 90));

        pname10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pname10.setText("PRODUCT NAME");
        juicemenupannel4.add(pname10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, -1));

        psupplier10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        psupplier10.setText("SUPPLIER");
        juicemenupannel4.add(psupplier10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, -1, -1));

        ptype10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ptype10.setText("TYPE");
        juicemenupannel4.add(ptype10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, -1));

        pprice10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pprice10.setText("PRICE");
        juicemenupannel4.add(pprice10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, -1, -1));
        juicemenupannel4.add(pphoto10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 240, 250));

        nextbtn5.setForeground(new java.awt.Color(255, 255, 255));
        nextbtn5.setIcon(new javax.swing.ImageIcon("G:\\huice_bar assets\\buttons\\nextbtn.png")); // NOI18N
        nextbtn5.setBorder(null);
        nextbtn5.setBorderPainted(false);
        nextbtn5.setContentAreaFilled(false);
        nextbtn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbtn5ActionPerformed(evt);
            }
        });
        juicemenupannel4.add(nextbtn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 940, -1, -1));

        jLabel143.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel143.setText("DESCRIPTION");
        juicemenupannel4.add(jLabel143, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 800, -1, -1));

        jLabel144.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel144.setText("SUPPLIER");
        juicemenupannel4.add(jLabel144, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 770, -1, -1));

        jLabel145.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel145.setText("PRICE");
        juicemenupannel4.add(jLabel145, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 740, -1, -1));

        jLabel146.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel146.setText("TYPE");
        juicemenupannel4.add(jLabel146, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 710, -1, -1));

        jLabel147.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel147.setText("PRODUCT NAME");
        juicemenupannel4.add(jLabel147, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 680, -1, -1));

        jLabel148.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel148.setText("DESCRIPTION");
        juicemenupannel4.add(jLabel148, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 520, -1, -1));

        jLabel149.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel149.setText("SUPPLIER");
        juicemenupannel4.add(jLabel149, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, -1, -1));

        jLabel150.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel150.setText("PRICE");
        juicemenupannel4.add(jLabel150, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, -1, -1));

        jLabel151.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel151.setText("TYPE");
        juicemenupannel4.add(jLabel151, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, -1, -1));

        jLabel152.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel152.setText("PRODUCT NAME");
        juicemenupannel4.add(jLabel152, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, -1, -1));

        jLabel153.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel153.setText("DESCRIPTION");
        juicemenupannel4.add(jLabel153, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));

        jLabel154.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel154.setText("SUPPLIER");
        juicemenupannel4.add(jLabel154, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, -1));

        jLabel155.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel155.setText("PRICE");
        juicemenupannel4.add(jLabel155, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        jLabel156.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel156.setText("TYPE");
        juicemenupannel4.add(jLabel156, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, -1));

        jLabel157.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel157.setText("PRODUCT NAME");
        juicemenupannel4.add(jLabel157, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, -1));

        jLabel140.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        juicemenupannel4.add(jLabel140, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel141.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        juicemenupannel4.add(jLabel141, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jLabel142.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        juicemenupannel4.add(jLabel142, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, -1, -1));

        jLabel233.setFont(new java.awt.Font("Sylfaen", 1, 48)); // NOI18N
        jLabel233.setText("Juices 4");
        juicemenupannel4.add(jLabel233, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        backbtn3.setForeground(new java.awt.Color(255, 255, 255));
        backbtn3.setIcon(new javax.swing.ImageIcon("G:\\huice_bar assets\\buttons\\backbtn.png")); // NOI18N
        backbtn3.setBorder(null);
        backbtn3.setBorderPainted(false);
        backbtn3.setContentAreaFilled(false);
        backbtn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtn3ActionPerformed(evt);
            }
        });
        juicemenupannel4.add(backbtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 940, -1, -1));

        jLabel121.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/background pannel.png"))); // NOI18N
        jLabel121.setText("jLabel7");
        juicemenupannel4.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1090, -1));

        mainoannel.add(juicemenupannel4, "card11");

        juicemenupannel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nextbtn6.setForeground(new java.awt.Color(255, 255, 255));
        nextbtn6.setIcon(new javax.swing.ImageIcon("G:\\huice_bar assets\\buttons\\nextbtn.png")); // NOI18N
        nextbtn6.setBorder(null);
        nextbtn6.setBorderPainted(false);
        nextbtn6.setContentAreaFilled(false);
        nextbtn6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbtn6ActionPerformed(evt);
            }
        });
        juicemenupannel5.add(nextbtn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 950, -1, -1));

        backbtn4.setForeground(new java.awt.Color(255, 255, 255));
        backbtn4.setIcon(new javax.swing.ImageIcon("G:\\huice_bar assets\\buttons\\backbtn.png")); // NOI18N
        backbtn4.setBorder(null);
        backbtn4.setBorderPainted(false);
        backbtn4.setContentAreaFilled(false);
        backbtn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtn4ActionPerformed(evt);
            }
        });
        juicemenupannel5.add(backbtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 940, -1, -1));

        jLabel163.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel163.setText("DESCRIPTION");
        juicemenupannel5.add(jLabel163, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 800, -1, -1));

        jLabel164.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel164.setText("SUPPLIER");
        juicemenupannel5.add(jLabel164, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 770, -1, -1));

        jLabel165.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel165.setText("PRICE");
        juicemenupannel5.add(jLabel165, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 740, -1, -1));

        jLabel166.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel166.setText("TYPE");
        juicemenupannel5.add(jLabel166, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 710, -1, -1));

        jLabel167.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel167.setText("PRODUCT NAME");
        juicemenupannel5.add(jLabel167, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 680, -1, -1));

        phoneno21.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        phoneno21.setText("DESCRIPTION");
        phoneno21.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        juicemenupannel5.add(phoneno21, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 800, 530, 90));

        idno21.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        idno21.setText("SUPPLIER");
        juicemenupannel5.add(idno21, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 770, -1, -1));

        gender21.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        gender21.setText("PRICE");
        juicemenupannel5.add(gender21, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 740, -1, -1));

        jLabel235.setFont(new java.awt.Font("Sylfaen", 1, 48)); // NOI18N
        jLabel235.setText("Juices 4");
        juicemenupannel5.add(jLabel235, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        age21.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        age21.setText("TYPE");
        juicemenupannel5.add(age21, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 710, -1, -1));

        name21.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        name21.setText("PRODUCT NAME");
        juicemenupannel5.add(name21, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 680, -1, -1));

        jLabel168.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel168.setText("DESCRIPTION");
        juicemenupannel5.add(jLabel168, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 520, -1, -1));

        jLabel169.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel169.setText("SUPPLIER");
        juicemenupannel5.add(jLabel169, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, -1, -1));

        jLabel170.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel170.setText("PRICE");
        juicemenupannel5.add(jLabel170, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, -1, -1));

        jLabel171.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel171.setText("TYPE");
        juicemenupannel5.add(jLabel171, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, -1, -1));

        jLabel172.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel172.setText("PRODUCT NAME");
        juicemenupannel5.add(jLabel172, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, -1, -1));

        name22.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        name22.setText("PRODUCT NAME");
        juicemenupannel5.add(name22, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, -1, -1));

        age22.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        age22.setText("TYPE");
        juicemenupannel5.add(age22, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, -1, -1));

        gender22.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        gender22.setText("PRICE");
        juicemenupannel5.add(gender22, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, -1, -1));

        idno22.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        idno22.setText("SUPPLIER");
        juicemenupannel5.add(idno22, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, -1, -1));

        phoneno22.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        phoneno22.setText("DESCRIPTION");
        phoneno22.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        juicemenupannel5.add(phoneno22, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, 530, 90));

        jLabel173.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel173.setText("DESCRIPTION");
        juicemenupannel5.add(jLabel173, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));

        jLabel174.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel174.setText("SUPPLIER");
        juicemenupannel5.add(jLabel174, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, -1));

        jLabel175.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel175.setText("PRICE");
        juicemenupannel5.add(jLabel175, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        jLabel176.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel176.setText("TYPE");
        juicemenupannel5.add(jLabel176, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, -1));

        jLabel177.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel177.setText("PRODUCT NAME");
        juicemenupannel5.add(jLabel177, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, -1));

        name23.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        name23.setText("PRODUCT NAME");
        juicemenupannel5.add(name23, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, -1, -1));

        age23.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        age23.setText("TYPE");
        juicemenupannel5.add(age23, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, -1, -1));

        gender23.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        gender23.setText("PRICE");
        juicemenupannel5.add(gender23, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, -1, -1));

        idno23.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        idno23.setText("SUPPLIER");
        juicemenupannel5.add(idno23, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, -1, -1));

        phoneno23.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        phoneno23.setText("DESCRIPTION");
        phoneno23.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        juicemenupannel5.add(phoneno23, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 530, 90));

        jLabel160.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        juicemenupannel5.add(jLabel160, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel161.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        juicemenupannel5.add(jLabel161, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jLabel162.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        juicemenupannel5.add(jLabel162, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, -1, -1));

        jLabel178.setText("NRXT 234");
        juicemenupannel5.add(jLabel178, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel159.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/background pannel.png"))); // NOI18N
        jLabel159.setText("jLabel7");
        juicemenupannel5.add(jLabel159, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1090, -1));

        jLabel234.setFont(new java.awt.Font("Sylfaen", 1, 48)); // NOI18N
        jLabel234.setText("Juices 1");
        juicemenupannel5.add(jLabel234, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        backbtn5.setForeground(new java.awt.Color(255, 255, 255));
        backbtn5.setIcon(new javax.swing.ImageIcon("G:\\huice_bar assets\\buttons\\backbtn.png")); // NOI18N
        backbtn5.setBorder(null);
        backbtn5.setBorderPainted(false);
        backbtn5.setContentAreaFilled(false);
        backbtn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtn5ActionPerformed(evt);
            }
        });
        juicemenupannel5.add(backbtn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 940, -1, -1));

        mainoannel.add(juicemenupannel5, "card9");

        juicemenupannel6.setBackground(new java.awt.Color(255, 255, 255));
        juicemenupannel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        juicemenupannel6.add(pphoto18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, 240, 250));

        jLabel259.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel259.setText("DESCRIPTION");
        juicemenupannel6.add(jLabel259, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 780, -1, -1));

        jLabel260.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel260.setText("SUPPLIER");
        juicemenupannel6.add(jLabel260, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 750, -1, -1));

        jLabel261.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel261.setText("PRICE");
        juicemenupannel6.add(jLabel261, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 720, -1, -1));

        jLabel262.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel262.setText("TYPE");
        juicemenupannel6.add(jLabel262, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 690, -1, -1));

        jLabel263.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel263.setText("PRODUCT NAME");
        juicemenupannel6.add(jLabel263, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 660, -1, -1));

        pname18.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pname18.setText("PRODUCT NAME");
        juicemenupannel6.add(pname18, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 660, -1, -1));

        ptype18.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ptype18.setText("TYPE");
        juicemenupannel6.add(ptype18, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 690, -1, -1));

        pprice18.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pprice18.setText("PRICE");
        juicemenupannel6.add(pprice18, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 720, -1, -1));

        psupplier18.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        psupplier18.setText("SUPPLIER");
        juicemenupannel6.add(psupplier18, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 750, -1, -1));

        pdescription18.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pdescription18.setText("DESCRIPTION");
        pdescription18.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        juicemenupannel6.add(pdescription18, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 780, 530, 90));

        jLabel258.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        juicemenupannel6.add(jLabel258, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, -1, -1));
        juicemenupannel6.add(pphoto17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 240, 250));

        jLabel253.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel253.setText("PRODUCT NAME");
        juicemenupannel6.add(jLabel253, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, -1, -1));

        jLabel254.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel254.setText("TYPE");
        juicemenupannel6.add(jLabel254, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, -1, -1));

        jLabel255.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel255.setText("PRICE");
        juicemenupannel6.add(jLabel255, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, -1, -1));

        jLabel256.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel256.setText("SUPPLIER");
        juicemenupannel6.add(jLabel256, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, -1, -1));

        jLabel257.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel257.setText("DESCRIPTION");
        juicemenupannel6.add(jLabel257, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, -1, -1));

        pdescription17.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pdescription17.setText("DESCRIPTION");
        pdescription17.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        juicemenupannel6.add(pdescription17, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, 530, 90));

        psupplier17.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        psupplier17.setText("SUPPLIER");
        juicemenupannel6.add(psupplier17, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, -1, -1));

        pprice17.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pprice17.setText("PRICE");
        juicemenupannel6.add(pprice17, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, -1, -1));

        ptype17.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ptype17.setText("TYPE");
        juicemenupannel6.add(ptype17, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, -1, -1));

        pname17.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pname17.setText("PRODUCT NAME");
        juicemenupannel6.add(pname17, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, -1, -1));

        jLabel252.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        juicemenupannel6.add(jLabel252, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jLabel247.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel247.setText("PRODUCT NAME");
        juicemenupannel6.add(jLabel247, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        jLabel248.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel248.setText("TYPE");
        juicemenupannel6.add(jLabel248, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, -1));

        jLabel249.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel249.setText("PRICE");
        juicemenupannel6.add(jLabel249, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, -1));

        jLabel250.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel250.setText("SUPPLIER");
        juicemenupannel6.add(jLabel250, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));

        jLabel251.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel251.setText("DESCRIPTION");
        juicemenupannel6.add(jLabel251, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));
        juicemenupannel6.add(pphoto16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 240, 250));

        pdescription16.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pdescription16.setText("DESCRIPTION");
        pdescription16.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        juicemenupannel6.add(pdescription16, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 530, 90));

        psupplier16.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        psupplier16.setText("SUPPLIER");
        juicemenupannel6.add(psupplier16, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, -1, -1));

        pprice16.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pprice16.setText("PRICE");
        juicemenupannel6.add(pprice16, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, -1, -1));

        ptype16.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ptype16.setText("TYPE");
        juicemenupannel6.add(ptype16, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, -1, -1));

        pname16.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pname16.setText("PRODUCT NAME");
        juicemenupannel6.add(pname16, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, -1, -1));

        jLabel231.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        juicemenupannel6.add(jLabel231, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel237.setFont(new java.awt.Font("Sylfaen", 1, 48)); // NOI18N
        jLabel237.setText("Juices 6");
        juicemenupannel6.add(jLabel237, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        backbtn7.setForeground(new java.awt.Color(255, 255, 255));
        backbtn7.setIcon(new javax.swing.ImageIcon("G:\\huice_bar assets\\buttons\\backbtn.png")); // NOI18N
        backbtn7.setBorder(null);
        backbtn7.setBorderPainted(false);
        backbtn7.setContentAreaFilled(false);
        backbtn7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtn7ActionPerformed(evt);
            }
        });
        juicemenupannel6.add(backbtn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 920, -1, -1));

        mainoannel.add(juicemenupannel6, "card14");

        Icecreampannel1.setBackground(new java.awt.Color(255, 255, 255));
        Icecreampannel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel276.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel276.setText("DESCRIPTION");
        Icecreampannel1.add(jLabel276, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 790, -1, -1));

        jLabel277.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel277.setText("SUPPLIER");
        Icecreampannel1.add(jLabel277, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 760, -1, -1));

        jLabel278.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel278.setText("PRICE");
        Icecreampannel1.add(jLabel278, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 730, -1, -1));

        jLabel279.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel279.setText("TYPE");
        Icecreampannel1.add(jLabel279, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 700, -1, -1));

        jLabel280.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel280.setText("PRODUCT NAME");
        Icecreampannel1.add(jLabel280, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 670, -1, -1));

        icename3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        icename3.setText("PRODUCT NAME");
        Icecreampannel1.add(icename3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 670, -1, -1));

        icetype3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        icetype3.setText("TYPE");
        Icecreampannel1.add(icetype3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 700, -1, -1));

        iceprice3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        iceprice3.setText("PRICE");
        Icecreampannel1.add(iceprice3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 730, -1, -1));

        icesupplier3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        icesupplier3.setText("SUPPLIER");
        Icecreampannel1.add(icesupplier3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 760, -1, -1));

        icedescription3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        icedescription3.setText("DESCRIPTION");
        icedescription3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Icecreampannel1.add(icedescription3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 790, 530, 90));
        Icecreampannel1.add(icephoto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, 240, 250));

        jLabel281.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        Icecreampannel1.add(jLabel281, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, -1, -1));
        Icecreampannel1.add(icephoto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 240, 250));

        jLabel271.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel271.setText("DESCRIPTION");
        Icecreampannel1.add(jLabel271, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 510, -1, -1));

        jLabel272.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel272.setText("SUPPLIER");
        Icecreampannel1.add(jLabel272, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, -1, -1));

        jLabel273.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel273.setText("PRICE");
        Icecreampannel1.add(jLabel273, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, -1, -1));

        jLabel274.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel274.setText("TYPE");
        Icecreampannel1.add(jLabel274, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, -1, -1));

        jLabel275.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel275.setText("PRODUCT NAME");
        Icecreampannel1.add(jLabel275, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, -1, -1));

        icename2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        icename2.setText("PRODUCT NAME");
        Icecreampannel1.add(icename2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, -1, -1));

        icetype2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        icetype2.setText("TYPE");
        Icecreampannel1.add(icetype2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, -1, -1));

        iceprice2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        iceprice2.setText("PRICE");
        Icecreampannel1.add(iceprice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, -1, -1));

        icesupplier2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        icesupplier2.setText("SUPPLIER");
        Icecreampannel1.add(icesupplier2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, -1, -1));

        icedescription2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        icedescription2.setText("DESCRIPTION");
        icedescription2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Icecreampannel1.add(icedescription2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, 530, 90));

        jLabel270.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        Icecreampannel1.add(jLabel270, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        jLabel238.setFont(new java.awt.Font("Sylfaen", 1, 48)); // NOI18N
        jLabel238.setText("Ice Cream 1");
        Icecreampannel1.add(jLabel238, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        Icecreampannel1.add(icephoto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 240, 250));

        jLabel265.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel265.setText("DESCRIPTION");
        Icecreampannel1.add(jLabel265, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, -1));

        jLabel266.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel266.setText("PRODUCT NAME");
        Icecreampannel1.add(jLabel266, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        jLabel267.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel267.setText("TYPE");
        Icecreampannel1.add(jLabel267, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));

        jLabel268.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel268.setText("PRICE");
        Icecreampannel1.add(jLabel268, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));

        jLabel269.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel269.setText("SUPPLIER");
        Icecreampannel1.add(jLabel269, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, -1));

        icedescription1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        icedescription1.setText("DESCRIPTION");
        icedescription1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Icecreampannel1.add(icedescription1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 530, 90));

        icesupplier1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        icesupplier1.setText("SUPPLIER");
        Icecreampannel1.add(icesupplier1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, -1, -1));

        iceprice1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        iceprice1.setText("PRICE");
        Icecreampannel1.add(iceprice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, -1, -1));

        icetype1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        icetype1.setText("TYPE");
        Icecreampannel1.add(icetype1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, -1, -1));

        icename1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        icename1.setText("PRODUCT NAME");
        Icecreampannel1.add(icename1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, -1));

        jLabel264.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        Icecreampannel1.add(jLabel264, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        nextbtn9.setForeground(new java.awt.Color(255, 255, 255));
        nextbtn9.setIcon(new javax.swing.ImageIcon("G:\\huice_bar assets\\buttons\\nextbtn.png")); // NOI18N
        nextbtn9.setBorder(null);
        nextbtn9.setBorderPainted(false);
        nextbtn9.setContentAreaFilled(false);
        nextbtn9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbtn9ActionPerformed(evt);
            }
        });
        Icecreampannel1.add(nextbtn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 940, -1, -1));

        backbtn8.setForeground(new java.awt.Color(255, 255, 255));
        backbtn8.setIcon(new javax.swing.ImageIcon("G:\\huice_bar assets\\buttons\\backbtn.png")); // NOI18N
        backbtn8.setBorder(null);
        backbtn8.setBorderPainted(false);
        backbtn8.setContentAreaFilled(false);
        backbtn8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtn8ActionPerformed(evt);
            }
        });
        Icecreampannel1.add(backbtn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 940, -1, -1));

        mainoannel.add(Icecreampannel1, "card15");

        Icecreampannel2.setBackground(new java.awt.Color(255, 255, 255));
        Icecreampannel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Icecreampannel2.add(icephoto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, 240, 250));

        jLabel295.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel295.setText("DESCRIPTION");
        Icecreampannel2.add(jLabel295, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 790, -1, -1));

        jLabel296.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel296.setText("SUPPLIER");
        Icecreampannel2.add(jLabel296, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 760, -1, -1));

        jLabel297.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel297.setText("PRICE");
        Icecreampannel2.add(jLabel297, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 730, -1, -1));

        jLabel298.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel298.setText("TYPE");
        Icecreampannel2.add(jLabel298, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 700, -1, -1));

        jLabel299.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel299.setText("PRODUCT NAME");
        Icecreampannel2.add(jLabel299, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 670, -1, -1));

        icename6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        icename6.setText("PRODUCT NAME");
        Icecreampannel2.add(icename6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 670, -1, -1));

        icetype6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        icetype6.setText("TYPE");
        Icecreampannel2.add(icetype6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 700, -1, -1));

        iceprice6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        iceprice6.setText("PRICE");
        Icecreampannel2.add(iceprice6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 730, -1, -1));

        icesupplier6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        icesupplier6.setText("SUPPLIER");
        Icecreampannel2.add(icesupplier6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 760, -1, -1));

        icedescription6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        icedescription6.setText("DESCRIPTION");
        icedescription6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Icecreampannel2.add(icedescription6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 790, 530, 90));

        jLabel294.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        Icecreampannel2.add(jLabel294, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, -1, -1));

        jLabel289.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel289.setText("DESCRIPTION");
        Icecreampannel2.add(jLabel289, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 510, -1, -1));

        jLabel290.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel290.setText("SUPPLIER");
        Icecreampannel2.add(jLabel290, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, -1, -1));

        jLabel291.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel291.setText("PRICE");
        Icecreampannel2.add(jLabel291, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, -1, -1));

        jLabel292.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel292.setText("TYPE");
        Icecreampannel2.add(jLabel292, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, -1, -1));

        jLabel293.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel293.setText("PRODUCT NAME");
        Icecreampannel2.add(jLabel293, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, -1, -1));

        icedescription5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        icedescription5.setText("DESCRIPTION");
        icedescription5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Icecreampannel2.add(icedescription5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, 530, 90));

        icesupplier5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        icesupplier5.setText("SUPPLIER");
        Icecreampannel2.add(icesupplier5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, -1, -1));

        iceprice5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        iceprice5.setText("PRICE");
        Icecreampannel2.add(iceprice5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, -1, -1));

        icetype5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        icetype5.setText("TYPE");
        Icecreampannel2.add(icetype5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, -1, -1));

        icename5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        icename5.setText("PRODUCT NAME");
        Icecreampannel2.add(icename5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, -1, -1));
        Icecreampannel2.add(icephoto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 240, 250));

        jLabel239.setFont(new java.awt.Font("Sylfaen", 1, 48)); // NOI18N
        jLabel239.setText("Ice Cream 2");
        Icecreampannel2.add(jLabel239, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel282.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel282.setText("TYPE");
        Icecreampannel2.add(jLabel282, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));

        jLabel288.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        Icecreampannel2.add(jLabel288, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        icesupplier4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        icesupplier4.setText("SUPPLIER");
        Icecreampannel2.add(icesupplier4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, -1, -1));

        jLabel283.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel283.setText("PRODUCT NAME");
        Icecreampannel2.add(jLabel283, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        icename4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        icename4.setText("PRODUCT NAME");
        Icecreampannel2.add(icename4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, -1));

        icetype4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        icetype4.setText("TYPE");
        Icecreampannel2.add(icetype4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, -1, -1));
        Icecreampannel2.add(icephoto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 240, 250));

        iceprice4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        iceprice4.setText("PRICE");
        Icecreampannel2.add(iceprice4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, -1, -1));

        jLabel285.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel285.setText("DESCRIPTION");
        Icecreampannel2.add(jLabel285, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, -1));

        icedescription4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        icedescription4.setText("DESCRIPTION");
        icedescription4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Icecreampannel2.add(icedescription4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 530, 90));

        jLabel286.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel286.setText("SUPPLIER");
        Icecreampannel2.add(jLabel286, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, -1));

        jLabel287.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel287.setText("PRICE");
        Icecreampannel2.add(jLabel287, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));

        jLabel284.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        Icecreampannel2.add(jLabel284, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        nextbtn10.setForeground(new java.awt.Color(255, 255, 255));
        nextbtn10.setIcon(new javax.swing.ImageIcon("G:\\huice_bar assets\\buttons\\nextbtn.png")); // NOI18N
        nextbtn10.setBorder(null);
        nextbtn10.setBorderPainted(false);
        nextbtn10.setContentAreaFilled(false);
        nextbtn10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextbtn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbtn10ActionPerformed(evt);
            }
        });
        Icecreampannel2.add(nextbtn10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 940, -1, -1));

        backbtn9.setForeground(new java.awt.Color(255, 255, 255));
        backbtn9.setIcon(new javax.swing.ImageIcon("G:\\huice_bar assets\\buttons\\backbtn.png")); // NOI18N
        backbtn9.setBorder(null);
        backbtn9.setBorderPainted(false);
        backbtn9.setContentAreaFilled(false);
        backbtn9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtn9ActionPerformed(evt);
            }
        });
        Icecreampannel2.add(backbtn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 940, -1, -1));

        mainoannel.add(Icecreampannel2, "card16");

        Icecreampannel3.setBackground(new java.awt.Color(255, 255, 255));
        Icecreampannel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Icecreampannel3.add(icephoto9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 660, 240, 250));

        jLabel313.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel313.setText("DESCRIPTION");
        Icecreampannel3.add(jLabel313, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 790, -1, -1));

        jLabel314.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel314.setText("SUPPLIER");
        Icecreampannel3.add(jLabel314, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 760, -1, -1));

        jLabel315.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel315.setText("PRICE");
        Icecreampannel3.add(jLabel315, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 730, -1, -1));

        jLabel316.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel316.setText("TYPE");
        Icecreampannel3.add(jLabel316, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 700, -1, -1));

        jLabel317.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel317.setText("PRODUCT NAME");
        Icecreampannel3.add(jLabel317, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 670, -1, -1));

        icename9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        icename9.setText("PRODUCT NAME");
        Icecreampannel3.add(icename9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 670, -1, -1));

        icetype9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        icetype9.setText("TYPE");
        Icecreampannel3.add(icetype9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 700, -1, -1));

        iceprice9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        iceprice9.setText("PRICE");
        Icecreampannel3.add(iceprice9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 730, -1, -1));

        icesupplier9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        icesupplier9.setText("SUPPLIER");
        Icecreampannel3.add(icesupplier9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 760, -1, -1));

        icedescription9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        icedescription9.setText("DESCRIPTION");
        icedescription9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Icecreampannel3.add(icedescription9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 790, 530, 90));

        jLabel312.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        Icecreampannel3.add(jLabel312, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, -1, -1));

        jLabel306.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel306.setText("TYPE");
        Icecreampannel3.add(jLabel306, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, -1, -1));
        Icecreampannel3.add(icephoto8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 240, 250));

        jLabel307.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel307.setText("PRICE");
        Icecreampannel3.add(jLabel307, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, -1, -1));

        icesupplier8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        icesupplier8.setText("SUPPLIER");
        Icecreampannel3.add(icesupplier8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, -1, -1));

        jLabel309.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel309.setText("DESCRIPTION");
        Icecreampannel3.add(jLabel309, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 520, -1, -1));

        icetype8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        icetype8.setText("TYPE");
        Icecreampannel3.add(icetype8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, -1, -1));

        iceprice8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        iceprice8.setText("PRICE");
        Icecreampannel3.add(iceprice8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, -1, -1));

        jLabel310.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel310.setText("PRODUCT NAME");
        Icecreampannel3.add(jLabel310, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, -1, -1));

        icedescription8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        icedescription8.setText("DESCRIPTION");
        icedescription8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Icecreampannel3.add(icedescription8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, 530, 90));

        icename8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        icename8.setText("PRODUCT NAME");
        Icecreampannel3.add(icename8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, -1, -1));

        jLabel311.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel311.setText("SUPPLIER");
        Icecreampannel3.add(jLabel311, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, -1, -1));

        jLabel308.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        Icecreampannel3.add(jLabel308, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jLabel240.setFont(new java.awt.Font("Sylfaen", 1, 48)); // NOI18N
        jLabel240.setText("Ice Cream 3");
        Icecreampannel3.add(jLabel240, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel300.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel300.setText("DESCRIPTION");
        Icecreampannel3.add(jLabel300, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, -1));

        jLabel301.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel301.setText("PRODUCT NAME");
        Icecreampannel3.add(jLabel301, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        jLabel302.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel302.setText("TYPE");
        Icecreampannel3.add(jLabel302, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        jLabel303.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel303.setText("PRICE");
        Icecreampannel3.add(jLabel303, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));

        jLabel304.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel304.setText("SUPPLIER");
        Icecreampannel3.add(jLabel304, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, -1, -1));

        icedescription7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        icedescription7.setText("DESCRIPTION");
        icedescription7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Icecreampannel3.add(icedescription7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 530, 90));

        icesupplier7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        icesupplier7.setText("SUPPLIER");
        Icecreampannel3.add(icesupplier7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, -1, -1));

        iceprice7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        iceprice7.setText("PRICE");
        Icecreampannel3.add(iceprice7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, -1, -1));

        icetype7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        icetype7.setText("TYPE");
        Icecreampannel3.add(icetype7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, -1, -1));

        icename7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        icename7.setText("PRODUCT NAME");
        Icecreampannel3.add(icename7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, -1, -1));
        Icecreampannel3.add(icephoto7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 240, 250));

        jLabel305.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        Icecreampannel3.add(jLabel305, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        nextbtn11.setForeground(new java.awt.Color(255, 255, 255));
        nextbtn11.setIcon(new javax.swing.ImageIcon("G:\\huice_bar assets\\buttons\\nextbtn.png")); // NOI18N
        nextbtn11.setBorder(null);
        nextbtn11.setBorderPainted(false);
        nextbtn11.setContentAreaFilled(false);
        nextbtn11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextbtn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbtn11ActionPerformed(evt);
            }
        });
        Icecreampannel3.add(nextbtn11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 940, -1, -1));

        backbtn10.setForeground(new java.awt.Color(255, 255, 255));
        backbtn10.setIcon(new javax.swing.ImageIcon("G:\\huice_bar assets\\buttons\\backbtn.png")); // NOI18N
        backbtn10.setBorder(null);
        backbtn10.setBorderPainted(false);
        backbtn10.setContentAreaFilled(false);
        backbtn10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backbtn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtn10ActionPerformed(evt);
            }
        });
        Icecreampannel3.add(backbtn10, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 940, -1, -1));

        mainoannel.add(Icecreampannel3, "card17");

        Icecreampannel4.setBackground(new java.awt.Color(255, 255, 255));
        Icecreampannel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Icecreampannel4.add(icephoto12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 240, 250));

        jLabel331.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel331.setText("DESCRIPTION");
        Icecreampannel4.add(jLabel331, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 770, -1, -1));

        jLabel332.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel332.setText("SUPPLIER");
        Icecreampannel4.add(jLabel332, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 740, -1, -1));

        jLabel333.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel333.setText("PRICE");
        Icecreampannel4.add(jLabel333, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 710, -1, -1));

        jLabel334.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel334.setText("TYPE");
        Icecreampannel4.add(jLabel334, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 680, -1, -1));

        jLabel335.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel335.setText("PRODUCT NAME");
        Icecreampannel4.add(jLabel335, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 650, -1, -1));

        icename12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        icename12.setText("PRODUCT NAME");
        Icecreampannel4.add(icename12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 650, -1, -1));

        icetype12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        icetype12.setText("TYPE");
        Icecreampannel4.add(icetype12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 680, -1, -1));

        iceprice12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        iceprice12.setText("PRICE");
        Icecreampannel4.add(iceprice12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 710, -1, -1));

        icesupplier12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        icesupplier12.setText("SUPPLIER");
        Icecreampannel4.add(icesupplier12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 740, -1, -1));

        icedescription12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        icedescription12.setText("DESCRIPTION");
        icedescription12.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Icecreampannel4.add(icedescription12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 770, 530, 90));

        jLabel330.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        Icecreampannel4.add(jLabel330, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, -1, -1));
        Icecreampannel4.add(icephoto11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 240, 250));

        jLabel325.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel325.setText("DESCRIPTION");
        Icecreampannel4.add(jLabel325, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, -1, -1));

        jLabel326.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel326.setText("SUPPLIER");
        Icecreampannel4.add(jLabel326, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, -1, -1));

        jLabel327.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel327.setText("PRICE");
        Icecreampannel4.add(jLabel327, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, -1, -1));

        jLabel328.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel328.setText("TYPE");
        Icecreampannel4.add(jLabel328, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, -1, -1));

        jLabel329.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel329.setText("PRODUCT NAME");
        Icecreampannel4.add(jLabel329, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, -1, -1));

        icename11.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        icename11.setText("PRODUCT NAME");
        Icecreampannel4.add(icename11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, -1, -1));

        icetype11.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        icetype11.setText("TYPE");
        Icecreampannel4.add(icetype11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, -1, -1));

        iceprice11.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        iceprice11.setText("PRICE");
        Icecreampannel4.add(iceprice11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, -1, -1));

        icesupplier11.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        icesupplier11.setText("SUPPLIER");
        Icecreampannel4.add(icesupplier11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, -1, -1));

        icedescription11.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        icedescription11.setText("DESCRIPTION");
        icedescription11.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Icecreampannel4.add(icedescription11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, 530, 90));

        jLabel324.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        Icecreampannel4.add(jLabel324, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jLabel241.setFont(new java.awt.Font("Sylfaen", 1, 48)); // NOI18N
        jLabel241.setText("Ice Cream 4");
        Icecreampannel4.add(jLabel241, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));
        Icecreampannel4.add(icephoto10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 240, 250));

        jLabel319.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel319.setText("DESCRIPTION");
        Icecreampannel4.add(jLabel319, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        jLabel320.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel320.setText("SUPPLIER");
        Icecreampannel4.add(jLabel320, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));

        jLabel321.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel321.setText("PRICE");
        Icecreampannel4.add(jLabel321, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, -1));

        jLabel322.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel322.setText("TYPE");
        Icecreampannel4.add(jLabel322, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, -1));

        jLabel323.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel323.setText("PRODUCT NAME");
        Icecreampannel4.add(jLabel323, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        icename10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        icename10.setText("PRODUCT NAME");
        Icecreampannel4.add(icename10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, -1, -1));

        icetype10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        icetype10.setText("TYPE");
        Icecreampannel4.add(icetype10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, -1, -1));

        iceprice10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        iceprice10.setText("PRICE");
        Icecreampannel4.add(iceprice10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, -1, -1));

        icesupplier10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        icesupplier10.setText("SUPPLIER");
        Icecreampannel4.add(icesupplier10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, -1, -1));

        icedescription10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        icedescription10.setText("DESCRIPTION");
        icedescription10.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Icecreampannel4.add(icedescription10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 530, 90));

        jLabel318.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        Icecreampannel4.add(jLabel318, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        backbtn11.setForeground(new java.awt.Color(255, 255, 255));
        backbtn11.setIcon(new javax.swing.ImageIcon("G:\\huice_bar assets\\buttons\\backbtn.png")); // NOI18N
        backbtn11.setBorder(null);
        backbtn11.setBorderPainted(false);
        backbtn11.setContentAreaFilled(false);
        backbtn11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backbtn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtn11ActionPerformed(evt);
            }
        });
        Icecreampannel4.add(backbtn11, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 940, -1, -1));

        mainoannel.add(Icecreampannel4, "card18");

        milkshakespannel1.setBackground(new java.awt.Color(255, 255, 255));
        milkshakespannel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        milkshakespannel1.add(milkshakepto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, 240, 250));

        jLabel349.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel349.setText("DESCRIPTION");
        milkshakespannel1.add(jLabel349, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 780, -1, -1));

        jLabel350.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel350.setText("SUPPLIER");
        milkshakespannel1.add(jLabel350, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 750, -1, -1));

        jLabel351.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel351.setText("PRICE");
        milkshakespannel1.add(jLabel351, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 720, -1, -1));

        jLabel352.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel352.setText("TYPE");
        milkshakespannel1.add(jLabel352, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 690, -1, -1));

        jLabel353.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel353.setText("PRODUCT NAME");
        milkshakespannel1.add(jLabel353, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 660, -1, -1));

        milkshakename3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshakename3.setText("PRODUCT NAME");
        milkshakespannel1.add(milkshakename3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 660, -1, -1));

        milkshaketype3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshaketype3.setText("TYPE");
        milkshakespannel1.add(milkshaketype3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 690, -1, -1));

        milkshakeprice3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshakeprice3.setText("PRICE");
        milkshakespannel1.add(milkshakeprice3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 720, -1, -1));

        milkshakesupplier3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshakesupplier3.setText("SUPPLIER");
        milkshakespannel1.add(milkshakesupplier3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 750, -1, -1));

        milkshakedescription3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshakedescription3.setText("DESCRIPTION");
        milkshakedescription3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        milkshakespannel1.add(milkshakedescription3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 780, 530, 90));

        jLabel348.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        milkshakespannel1.add(jLabel348, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, -1, -1));
        milkshakespannel1.add(milkshakepto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 240, 250));

        jLabel343.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel343.setText("DESCRIPTION");
        milkshakespannel1.add(jLabel343, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, -1, -1));

        jLabel344.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel344.setText("SUPPLIER");
        milkshakespannel1.add(jLabel344, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, -1, -1));

        jLabel345.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel345.setText("PRICE");
        milkshakespannel1.add(jLabel345, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, -1, -1));

        jLabel346.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel346.setText("TYPE");
        milkshakespannel1.add(jLabel346, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, -1, -1));

        jLabel347.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel347.setText("PRODUCT NAME");
        milkshakespannel1.add(jLabel347, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, -1, -1));

        milkshakename2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshakename2.setText("PRODUCT NAME");
        milkshakespannel1.add(milkshakename2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, -1, -1));

        milkshaketype2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshaketype2.setText("TYPE");
        milkshakespannel1.add(milkshaketype2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, -1, -1));

        milkshakeprice2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshakeprice2.setText("PRICE");
        milkshakespannel1.add(milkshakeprice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, -1, -1));

        milkshakesupplier2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshakesupplier2.setText("SUPPLIER");
        milkshakespannel1.add(milkshakesupplier2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, -1, -1));

        milkshakedescription2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshakedescription2.setText("DESCRIPTION");
        milkshakedescription2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        milkshakespannel1.add(milkshakedescription2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 510, 530, 90));

        jLabel342.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        milkshakespannel1.add(jLabel342, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        jLabel242.setFont(new java.awt.Font("Sylfaen", 1, 48)); // NOI18N
        jLabel242.setText("Milk Shakes 1");
        milkshakespannel1.add(jLabel242, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        milkshakespannel1.add(milkshakepto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 240, 250));

        jLabel337.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel337.setText("DESCRIPTION");
        milkshakespannel1.add(jLabel337, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, -1));

        jLabel338.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel338.setText("SUPPLIER");
        milkshakespannel1.add(jLabel338, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, -1));

        jLabel339.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel339.setText("PRICE");
        milkshakespannel1.add(jLabel339, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, -1));

        jLabel340.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel340.setText("TYPE");
        milkshakespannel1.add(jLabel340, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, -1));

        jLabel341.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel341.setText("PRODUCT NAME");
        milkshakespannel1.add(jLabel341, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));

        milkshakename1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshakename1.setText("PRODUCT NAME");
        milkshakespannel1.add(milkshakename1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, -1));

        milkshaketype1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshaketype1.setText("TYPE");
        milkshakespannel1.add(milkshaketype1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, -1, -1));

        milkshakeprice1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshakeprice1.setText("PRICE");
        milkshakespannel1.add(milkshakeprice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, -1, -1));

        milkshakesupplier1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshakesupplier1.setText("SUPPLIER");
        milkshakespannel1.add(milkshakesupplier1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, -1, -1));

        milkshakedescription1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshakedescription1.setText("DESCRIPTION");
        milkshakedescription1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        milkshakespannel1.add(milkshakedescription1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 530, 90));

        jLabel336.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        milkshakespannel1.add(jLabel336, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        nextbtn13.setForeground(new java.awt.Color(255, 255, 255));
        nextbtn13.setIcon(new javax.swing.ImageIcon("G:\\huice_bar assets\\buttons\\nextbtn.png")); // NOI18N
        nextbtn13.setBorder(null);
        nextbtn13.setBorderPainted(false);
        nextbtn13.setContentAreaFilled(false);
        nextbtn13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextbtn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbtn13ActionPerformed(evt);
            }
        });
        milkshakespannel1.add(nextbtn13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 940, -1, -1));

        backbtn12.setForeground(new java.awt.Color(255, 255, 255));
        backbtn12.setIcon(new javax.swing.ImageIcon("G:\\huice_bar assets\\buttons\\backbtn.png")); // NOI18N
        backbtn12.setBorder(null);
        backbtn12.setBorderPainted(false);
        backbtn12.setContentAreaFilled(false);
        backbtn12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backbtn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtn12ActionPerformed(evt);
            }
        });
        milkshakespannel1.add(backbtn12, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 940, -1, -1));

        mainoannel.add(milkshakespannel1, "card19");

        milkshakespannel2.setBackground(new java.awt.Color(255, 255, 255));
        milkshakespannel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        milkshakespannel2.add(milkshakepto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, 240, 250));

        jLabel367.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel367.setText("DESCRIPTION");
        milkshakespannel2.add(jLabel367, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 780, -1, -1));

        jLabel368.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel368.setText("SUPPLIER");
        milkshakespannel2.add(jLabel368, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 750, -1, -1));

        jLabel369.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel369.setText("PRICE");
        milkshakespannel2.add(jLabel369, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 720, -1, -1));

        jLabel370.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel370.setText("TYPE");
        milkshakespannel2.add(jLabel370, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 690, -1, -1));

        jLabel371.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel371.setText("PRODUCT NAME");
        milkshakespannel2.add(jLabel371, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 660, -1, -1));

        milkshakename6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshakename6.setText("PRODUCT NAME");
        milkshakespannel2.add(milkshakename6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 660, -1, -1));

        milkshaketype6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshaketype6.setText("TYPE");
        milkshakespannel2.add(milkshaketype6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 690, -1, -1));

        milkshakeprice6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshakeprice6.setText("PRICE");
        milkshakespannel2.add(milkshakeprice6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 720, -1, -1));

        milkshakesupplier6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshakesupplier6.setText("SUPPLIER");
        milkshakespannel2.add(milkshakesupplier6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 750, -1, -1));

        milkshakedescription6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshakedescription6.setText("DESCRIPTION");
        milkshakedescription6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        milkshakespannel2.add(milkshakedescription6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 780, 530, 90));

        jLabel366.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        milkshakespannel2.add(jLabel366, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, -1, -1));
        milkshakespannel2.add(milkshakepto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 240, 250));

        jLabel361.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel361.setText("DESCRIPTION");
        milkshakespannel2.add(jLabel361, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 510, -1, -1));

        jLabel362.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel362.setText("SUPPLIER");
        milkshakespannel2.add(jLabel362, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, -1, -1));

        jLabel363.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel363.setText("PRICE");
        milkshakespannel2.add(jLabel363, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, -1, -1));

        jLabel364.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel364.setText("TYPE");
        milkshakespannel2.add(jLabel364, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, -1, -1));

        jLabel365.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel365.setText("PRODUCT NAME");
        milkshakespannel2.add(jLabel365, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, -1, -1));

        milkshakename5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshakename5.setText("PRODUCT NAME");
        milkshakespannel2.add(milkshakename5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, -1, -1));

        milkshaketype5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshaketype5.setText("TYPE");
        milkshakespannel2.add(milkshaketype5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, -1, -1));

        milkshakeprice5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshakeprice5.setText("PRICE");
        milkshakespannel2.add(milkshakeprice5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, -1, -1));

        milkshakesupplier5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshakesupplier5.setText("SUPPLIER");
        milkshakespannel2.add(milkshakesupplier5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, -1, -1));

        milkshakedescription5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshakedescription5.setText("DESCRIPTION");
        milkshakedescription5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        milkshakespannel2.add(milkshakedescription5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, 530, 90));

        jLabel360.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        milkshakespannel2.add(jLabel360, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        jLabel243.setFont(new java.awt.Font("Sylfaen", 1, 48)); // NOI18N
        jLabel243.setText("Milk Shakes 2");
        milkshakespannel2.add(jLabel243, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));
        milkshakespannel2.add(milkshakepto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 240, 250));

        jLabel355.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel355.setText("DESCRIPTION");
        milkshakespannel2.add(jLabel355, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, -1));

        jLabel356.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel356.setText("SUPPLIER");
        milkshakespannel2.add(jLabel356, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, -1));

        jLabel357.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel357.setText("PRICE");
        milkshakespannel2.add(jLabel357, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));

        jLabel358.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel358.setText("TYPE");
        milkshakespannel2.add(jLabel358, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));

        jLabel359.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel359.setText("PRODUCT NAME");
        milkshakespannel2.add(jLabel359, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        milkshakename4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshakename4.setText("PRODUCT NAME");
        milkshakespannel2.add(milkshakename4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, -1));

        milkshaketype4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshaketype4.setText("TYPE");
        milkshakespannel2.add(milkshaketype4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, -1, -1));

        milkshakeprice4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshakeprice4.setText("PRICE");
        milkshakespannel2.add(milkshakeprice4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, -1, -1));

        milkshakesupplier4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshakesupplier4.setText("SUPPLIER");
        milkshakespannel2.add(milkshakesupplier4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, -1, -1));

        milkshakedescription4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshakedescription4.setText("DESCRIPTION");
        milkshakedescription4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        milkshakespannel2.add(milkshakedescription4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 530, 90));

        jLabel354.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        milkshakespannel2.add(jLabel354, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        nextbtn14.setForeground(new java.awt.Color(255, 255, 255));
        nextbtn14.setIcon(new javax.swing.ImageIcon("G:\\huice_bar assets\\buttons\\nextbtn.png")); // NOI18N
        nextbtn14.setBorder(null);
        nextbtn14.setBorderPainted(false);
        nextbtn14.setContentAreaFilled(false);
        nextbtn14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextbtn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbtn14ActionPerformed(evt);
            }
        });
        milkshakespannel2.add(nextbtn14, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 940, -1, -1));

        backbtn13.setForeground(new java.awt.Color(255, 255, 255));
        backbtn13.setIcon(new javax.swing.ImageIcon("G:\\huice_bar assets\\buttons\\backbtn.png")); // NOI18N
        backbtn13.setBorder(null);
        backbtn13.setBorderPainted(false);
        backbtn13.setContentAreaFilled(false);
        backbtn13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backbtn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtn13ActionPerformed(evt);
            }
        });
        milkshakespannel2.add(backbtn13, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 940, -1, -1));

        mainoannel.add(milkshakespannel2, "card20");

        milkshakespannel3.setBackground(new java.awt.Color(255, 255, 255));
        milkshakespannel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        milkshakespannel3.add(milkshakepto9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, 240, 250));

        jLabel385.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel385.setText("DESCRIPTION");
        milkshakespannel3.add(jLabel385, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 790, -1, -1));

        jLabel386.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel386.setText("PRODUCT NAME");
        milkshakespannel3.add(jLabel386, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 670, -1, -1));

        jLabel387.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel387.setText("TYPE");
        milkshakespannel3.add(jLabel387, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 700, -1, -1));

        jLabel388.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel388.setText("PRICE");
        milkshakespannel3.add(jLabel388, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 730, -1, -1));

        jLabel389.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel389.setText("SUPPLIER");
        milkshakespannel3.add(jLabel389, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 760, -1, -1));

        milkshakesupplier9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshakesupplier9.setText("SUPPLIER");
        milkshakespannel3.add(milkshakesupplier9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 760, -1, -1));

        milkshakedescription9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshakedescription9.setText("DESCRIPTION");
        milkshakedescription9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        milkshakespannel3.add(milkshakedescription9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 790, 530, 90));

        milkshakeprice9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshakeprice9.setText("PRICE");
        milkshakespannel3.add(milkshakeprice9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 730, -1, -1));

        milkshaketype9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshaketype9.setText("TYPE");
        milkshakespannel3.add(milkshaketype9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 700, -1, -1));

        milkshakename9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshakename9.setText("PRODUCT NAME");
        milkshakespannel3.add(milkshakename9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 670, -1, -1));

        jLabel384.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        milkshakespannel3.add(jLabel384, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, -1, -1));
        milkshakespannel3.add(milkshakepto8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 240, 250));

        jLabel379.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel379.setText("DESCRIPTION");
        milkshakespannel3.add(jLabel379, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 510, -1, -1));

        jLabel380.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel380.setText("SUPPLIER");
        milkshakespannel3.add(jLabel380, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, -1, -1));

        jLabel381.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel381.setText("PRICE");
        milkshakespannel3.add(jLabel381, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, -1, -1));

        jLabel382.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel382.setText("TYPE");
        milkshakespannel3.add(jLabel382, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, -1, -1));

        jLabel383.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel383.setText("PRODUCT NAME");
        milkshakespannel3.add(jLabel383, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, -1, -1));

        milkshakename8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshakename8.setText("PRODUCT NAME");
        milkshakespannel3.add(milkshakename8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, -1, -1));

        milkshaketype8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshaketype8.setText("TYPE");
        milkshakespannel3.add(milkshaketype8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, -1, -1));

        milkshakeprice8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshakeprice8.setText("PRICE");
        milkshakespannel3.add(milkshakeprice8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, -1, -1));

        milkshakesupplier8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshakesupplier8.setText("SUPPLIER");
        milkshakespannel3.add(milkshakesupplier8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, -1, -1));

        milkshakedescription8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshakedescription8.setText("DESCRIPTION");
        milkshakedescription8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        milkshakespannel3.add(milkshakedescription8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, 530, 90));

        jLabel378.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        milkshakespannel3.add(jLabel378, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        jLabel244.setFont(new java.awt.Font("Sylfaen", 1, 48)); // NOI18N
        jLabel244.setText("Milk Shakes 3");
        milkshakespannel3.add(jLabel244, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));
        milkshakespannel3.add(milkshakepto7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 240, 250));

        jLabel373.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel373.setText("DESCRIPTION");
        milkshakespannel3.add(jLabel373, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, -1));

        jLabel374.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel374.setText("SUPPLIER");
        milkshakespannel3.add(jLabel374, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, -1));

        jLabel375.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel375.setText("PRICE");
        milkshakespannel3.add(jLabel375, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));

        jLabel376.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel376.setText("TYPE");
        milkshakespannel3.add(jLabel376, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));

        jLabel377.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel377.setText("PRODUCT NAME");
        milkshakespannel3.add(jLabel377, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        milkshakename7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshakename7.setText("PRODUCT NAME");
        milkshakespannel3.add(milkshakename7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, -1));

        milkshaketype7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshaketype7.setText("TYPE");
        milkshakespannel3.add(milkshaketype7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, -1, -1));

        milkshakeprice7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshakeprice7.setText("PRICE");
        milkshakespannel3.add(milkshakeprice7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, -1, -1));

        milkshakesupplier7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshakesupplier7.setText("SUPPLIER");
        milkshakespannel3.add(milkshakesupplier7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, -1, -1));

        milkshakedescription7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshakedescription7.setText("DESCRIPTION");
        milkshakedescription7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        milkshakespannel3.add(milkshakedescription7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 530, 90));

        jLabel372.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        milkshakespannel3.add(jLabel372, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        nextbtn15.setForeground(new java.awt.Color(255, 255, 255));
        nextbtn15.setIcon(new javax.swing.ImageIcon("G:\\huice_bar assets\\buttons\\nextbtn.png")); // NOI18N
        nextbtn15.setBorder(null);
        nextbtn15.setBorderPainted(false);
        nextbtn15.setContentAreaFilled(false);
        nextbtn15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextbtn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbtn15ActionPerformed(evt);
            }
        });
        milkshakespannel3.add(nextbtn15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 940, -1, -1));

        backbtn14.setForeground(new java.awt.Color(255, 255, 255));
        backbtn14.setIcon(new javax.swing.ImageIcon("G:\\huice_bar assets\\buttons\\backbtn.png")); // NOI18N
        backbtn14.setBorder(null);
        backbtn14.setBorderPainted(false);
        backbtn14.setContentAreaFilled(false);
        backbtn14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backbtn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtn14ActionPerformed(evt);
            }
        });
        milkshakespannel3.add(backbtn14, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 940, -1, -1));

        mainoannel.add(milkshakespannel3, "card21");

        milkshakespannel4.setBackground(new java.awt.Color(255, 255, 255));
        milkshakespannel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        milkshakespannel4.add(milkshakepto12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, 240, 250));

        jLabel403.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel403.setText("DESCRIPTION");
        milkshakespannel4.add(jLabel403, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 770, -1, -1));

        jLabel404.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel404.setText("SUPPLIER");
        milkshakespannel4.add(jLabel404, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 740, -1, -1));

        jLabel405.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel405.setText("PRICE");
        milkshakespannel4.add(jLabel405, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 710, -1, -1));

        jLabel406.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel406.setText("TYPE");
        milkshakespannel4.add(jLabel406, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 680, -1, -1));

        jLabel407.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel407.setText("PRODUCT NAME");
        milkshakespannel4.add(jLabel407, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 650, -1, -1));

        milkshakename12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshakename12.setText("PRODUCT NAME");
        milkshakespannel4.add(milkshakename12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 650, -1, -1));

        milkshaketype12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshaketype12.setText("TYPE");
        milkshakespannel4.add(milkshaketype12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 680, -1, -1));

        milkshakeprice12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshakeprice12.setText("PRICE");
        milkshakespannel4.add(milkshakeprice12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 710, -1, -1));

        milkshakesupplier12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshakesupplier12.setText("SUPPLIER");
        milkshakespannel4.add(milkshakesupplier12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 740, -1, -1));

        milkshakedescription12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshakedescription12.setText("DESCRIPTION");
        milkshakedescription12.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        milkshakespannel4.add(milkshakedescription12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 770, 530, 90));

        jLabel402.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        milkshakespannel4.add(jLabel402, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, -1, -1));
        milkshakespannel4.add(milkshakepto11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 240, 250));

        jLabel397.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel397.setText("DESCRIPTION");
        milkshakespannel4.add(jLabel397, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, -1, -1));

        jLabel398.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel398.setText("SUPPLIER");
        milkshakespannel4.add(jLabel398, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, -1, -1));

        jLabel399.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel399.setText("PRICE");
        milkshakespannel4.add(jLabel399, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, -1, -1));

        jLabel400.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel400.setText("TYPE");
        milkshakespannel4.add(jLabel400, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, -1, -1));

        jLabel401.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel401.setText("PRODUCT NAME");
        milkshakespannel4.add(jLabel401, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, -1, -1));

        milkshakename11.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshakename11.setText("PRODUCT NAME");
        milkshakespannel4.add(milkshakename11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, -1, -1));

        milkshaketype11.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshaketype11.setText("TYPE");
        milkshakespannel4.add(milkshaketype11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, -1, -1));

        milkshakeprice11.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshakeprice11.setText("PRICE");
        milkshakespannel4.add(milkshakeprice11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, -1, -1));

        milkshakesupplier11.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshakesupplier11.setText("SUPPLIER");
        milkshakespannel4.add(milkshakesupplier11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, -1, -1));

        milkshakedescription11.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshakedescription11.setText("DESCRIPTION");
        milkshakedescription11.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        milkshakespannel4.add(milkshakedescription11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, 530, 90));

        jLabel396.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        milkshakespannel4.add(jLabel396, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jLabel245.setFont(new java.awt.Font("Sylfaen", 1, 48)); // NOI18N
        jLabel245.setText("Milk Shakes 4");
        milkshakespannel4.add(jLabel245, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));
        milkshakespannel4.add(milkshakepto10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 240, 250));

        jLabel391.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel391.setText("DESCRIPTION");
        milkshakespannel4.add(jLabel391, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, -1));

        jLabel392.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel392.setText("PRODUCT NAME");
        milkshakespannel4.add(jLabel392, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        jLabel393.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel393.setText("TYPE");
        milkshakespannel4.add(jLabel393, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        jLabel394.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel394.setText("PRICE");
        milkshakespannel4.add(jLabel394, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, -1, -1));

        jLabel395.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel395.setText("SUPPLIER");
        milkshakespannel4.add(jLabel395, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, -1));

        milkshakedescription10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshakedescription10.setText("DESCRIPTION");
        milkshakedescription10.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        milkshakespannel4.add(milkshakedescription10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 530, 90));

        milkshakesupplier10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshakesupplier10.setText("SUPPLIER");
        milkshakespannel4.add(milkshakesupplier10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, -1, -1));

        milkshakeprice10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshakeprice10.setText("PRICE");
        milkshakespannel4.add(milkshakeprice10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, -1, -1));

        milkshaketype10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshaketype10.setText("TYPE");
        milkshakespannel4.add(milkshaketype10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, -1, -1));

        milkshakename10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        milkshakename10.setText("PRODUCT NAME");
        milkshakespannel4.add(milkshakename10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, -1, -1));

        jLabel390.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        milkshakespannel4.add(jLabel390, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        backbtn15.setForeground(new java.awt.Color(255, 255, 255));
        backbtn15.setIcon(new javax.swing.ImageIcon("G:\\huice_bar assets\\buttons\\backbtn.png")); // NOI18N
        backbtn15.setBorder(null);
        backbtn15.setBorderPainted(false);
        backbtn15.setContentAreaFilled(false);
        backbtn15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backbtn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtn15ActionPerformed(evt);
            }
        });
        milkshakespannel4.add(backbtn15, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 940, -1, -1));

        mainoannel.add(milkshakespannel4, "card22");

        smootheepannel1.setBackground(new java.awt.Color(255, 255, 255));
        smootheepannel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        smootheepannel1.add(smoothiephoto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, 240, 250));

        jLabel421.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel421.setText("DESCRIPTION");
        smootheepannel1.add(jLabel421, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 780, -1, -1));

        jLabel422.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel422.setText("SUPPLIER");
        smootheepannel1.add(jLabel422, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 750, -1, -1));

        jLabel423.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel423.setText("PRICE");
        smootheepannel1.add(jLabel423, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 720, -1, -1));

        jLabel424.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel424.setText("TYPE");
        smootheepannel1.add(jLabel424, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 690, -1, -1));

        jLabel425.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel425.setText("PRODUCT NAME");
        smootheepannel1.add(jLabel425, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 660, -1, -1));

        smoothiename3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothiename3.setText("PRODUCT NAME");
        smootheepannel1.add(smoothiename3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 660, -1, -1));

        smoothietype3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothietype3.setText("TYPE");
        smootheepannel1.add(smoothietype3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 690, -1, -1));

        smoothieprice3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothieprice3.setText("PRICE");
        smootheepannel1.add(smoothieprice3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 720, -1, -1));

        smoothiesupplyer3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothiesupplyer3.setText("SUPPLIER");
        smootheepannel1.add(smoothiesupplyer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 750, -1, -1));

        smoothiedescription3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothiedescription3.setText("DESCRIPTION");
        smoothiedescription3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        smootheepannel1.add(smoothiedescription3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 780, 530, 90));

        jLabel420.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        smootheepannel1.add(jLabel420, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, -1, -1));
        smootheepannel1.add(smoothiephoto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 240, 250));

        jLabel415.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel415.setText("DESCRIPTION");
        smootheepannel1.add(jLabel415, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, -1, -1));

        jLabel416.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel416.setText("SUPPLIER");
        smootheepannel1.add(jLabel416, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, -1, -1));

        jLabel417.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel417.setText("PRICE");
        smootheepannel1.add(jLabel417, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, -1, -1));

        jLabel418.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel418.setText("TYPE");
        smootheepannel1.add(jLabel418, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, -1, -1));

        jLabel419.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel419.setText("PRODUCT NAME");
        smootheepannel1.add(jLabel419, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, -1, -1));

        smoothiename2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothiename2.setText("PRODUCT NAME");
        smootheepannel1.add(smoothiename2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, -1, -1));

        smoothietype2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothietype2.setText("TYPE");
        smootheepannel1.add(smoothietype2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, -1, -1));

        smoothieprice2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothieprice2.setText("PRICE");
        smootheepannel1.add(smoothieprice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, -1, -1));

        smoothiesupplyer2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothiesupplyer2.setText("SUPPLIER");
        smootheepannel1.add(smoothiesupplyer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, -1, -1));

        smoothiedescription2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothiedescription2.setText("DESCRIPTION");
        smoothiedescription2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        smootheepannel1.add(smoothiedescription2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 510, 530, 90));

        jLabel414.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        smootheepannel1.add(jLabel414, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        jLabel246.setFont(new java.awt.Font("Sylfaen", 1, 48)); // NOI18N
        jLabel246.setText("Smoothie 1");
        smootheepannel1.add(jLabel246, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));
        smootheepannel1.add(smoothiephoto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 240, 250));

        jLabel409.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel409.setText("DESCRIPTION");
        smootheepannel1.add(jLabel409, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, -1, -1));

        jLabel410.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel410.setText("SUPPLIER");
        smootheepannel1.add(jLabel410, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, -1));

        jLabel411.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel411.setText("PRICE");
        smootheepannel1.add(jLabel411, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, -1, -1));

        jLabel412.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel412.setText("TYPE");
        smootheepannel1.add(jLabel412, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, -1));

        jLabel413.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel413.setText("PRODUCT NAME");
        smootheepannel1.add(jLabel413, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, -1, -1));

        smoothiename1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothiename1.setText("PRODUCT NAME");
        smootheepannel1.add(smoothiename1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, -1));

        smoothietype1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothietype1.setText("TYPE");
        smootheepannel1.add(smoothietype1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, -1));

        smoothieprice1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothieprice1.setText("PRICE");
        smootheepannel1.add(smoothieprice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, -1, -1));

        smoothiesupplyer1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothiesupplyer1.setText("SUPPLIER");
        smootheepannel1.add(smoothiesupplyer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, -1, -1));

        smoothiedescription1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothiedescription1.setText("DESCRIPTION");
        smoothiedescription1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        smootheepannel1.add(smoothiedescription1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 530, 90));

        jLabel408.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        smootheepannel1.add(jLabel408, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        nextbtn17.setForeground(new java.awt.Color(255, 255, 255));
        nextbtn17.setIcon(new javax.swing.ImageIcon("G:\\huice_bar assets\\buttons\\nextbtn.png")); // NOI18N
        nextbtn17.setBorder(null);
        nextbtn17.setBorderPainted(false);
        nextbtn17.setContentAreaFilled(false);
        nextbtn17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextbtn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbtn17ActionPerformed(evt);
            }
        });
        smootheepannel1.add(nextbtn17, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 940, -1, -1));

        backbtn16.setForeground(new java.awt.Color(255, 255, 255));
        backbtn16.setIcon(new javax.swing.ImageIcon("G:\\huice_bar assets\\buttons\\backbtn.png")); // NOI18N
        backbtn16.setBorder(null);
        backbtn16.setBorderPainted(false);
        backbtn16.setContentAreaFilled(false);
        backbtn16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backbtn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtn16ActionPerformed(evt);
            }
        });
        smootheepannel1.add(backbtn16, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 940, -1, -1));

        mainoannel.add(smootheepannel1, "card23");

        smootheepannel2.setBackground(new java.awt.Color(255, 255, 255));
        smootheepannel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        smootheepannel2.add(smoothiephoto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 240, 250));

        jLabel439.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel439.setText("DESCRIPTION");
        smootheepannel2.add(jLabel439, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 770, -1, -1));

        jLabel440.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel440.setText("SUPPLIER");
        smootheepannel2.add(jLabel440, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 740, -1, -1));

        jLabel441.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel441.setText("PRICE");
        smootheepannel2.add(jLabel441, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 710, -1, -1));

        jLabel442.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel442.setText("TYPE");
        smootheepannel2.add(jLabel442, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 680, -1, -1));

        jLabel443.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel443.setText("PRODUCT NAME");
        smootheepannel2.add(jLabel443, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 650, -1, -1));

        smoothiename6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothiename6.setText("PRODUCT NAME");
        smootheepannel2.add(smoothiename6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 650, -1, -1));

        smoothietype6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothietype6.setText("TYPE");
        smootheepannel2.add(smoothietype6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 680, -1, -1));

        smoothieprice6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothieprice6.setText("PRICE");
        smootheepannel2.add(smoothieprice6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 710, -1, -1));

        smoothiesupplyer6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothiesupplyer6.setText("SUPPLIER");
        smootheepannel2.add(smoothiesupplyer6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 740, -1, -1));

        smoothiedescription6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothiedescription6.setText("DESCRIPTION");
        smoothiedescription6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        smootheepannel2.add(smoothiedescription6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 770, 530, 90));

        jLabel438.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        smootheepannel2.add(jLabel438, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, -1, -1));
        smootheepannel2.add(smoothiephoto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 240, 250));

        jLabel433.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel433.setText("DESCRIPTION");
        smootheepannel2.add(jLabel433, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, -1, -1));

        jLabel434.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel434.setText("SUPPLIER");
        smootheepannel2.add(jLabel434, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, -1, -1));

        jLabel435.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel435.setText("PRICE");
        smootheepannel2.add(jLabel435, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, -1, -1));

        jLabel436.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel436.setText("TYPE");
        smootheepannel2.add(jLabel436, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, -1, -1));

        jLabel437.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel437.setText("PRODUCT NAME");
        smootheepannel2.add(jLabel437, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, -1, -1));

        smoothiename5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothiename5.setText("PRODUCT NAME");
        smootheepannel2.add(smoothiename5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, -1, -1));

        smoothietype5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothietype5.setText("TYPE");
        smootheepannel2.add(smoothietype5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, -1, -1));

        smoothieprice5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothieprice5.setText("PRICE");
        smootheepannel2.add(smoothieprice5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, -1, -1));

        smoothiesupplyer5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothiesupplyer5.setText("SUPPLIER");
        smootheepannel2.add(smoothiesupplyer5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, -1, -1));

        smoothiedescription5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothiedescription5.setText("DESCRIPTION");
        smoothiedescription5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        smootheepannel2.add(smoothiedescription5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, 530, 90));

        jLabel432.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        smootheepannel2.add(jLabel432, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jLabel53.setText("Smoothiee Page 2");
        smootheepannel2.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));
        smootheepannel2.add(smoothiephoto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 240, 250));

        jLabel427.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel427.setText("DESCRIPTION");
        smootheepannel2.add(jLabel427, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        jLabel428.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel428.setText("SUPPLIER");
        smootheepannel2.add(jLabel428, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));

        jLabel429.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel429.setText("PRICE");
        smootheepannel2.add(jLabel429, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, -1));

        jLabel430.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel430.setText("TYPE");
        smootheepannel2.add(jLabel430, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, -1));

        jLabel431.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel431.setText("PRODUCT NAME");
        smootheepannel2.add(jLabel431, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        smoothiename4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothiename4.setText("PRODUCT NAME");
        smootheepannel2.add(smoothiename4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, -1, -1));

        smoothietype4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothietype4.setText("TYPE");
        smootheepannel2.add(smoothietype4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, -1, -1));

        smoothieprice4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothieprice4.setText("PRICE");
        smootheepannel2.add(smoothieprice4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, -1, -1));

        smoothiesupplyer4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothiesupplyer4.setText("SUPPLIER");
        smootheepannel2.add(smoothiesupplyer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, -1, -1));

        smoothiedescription4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothiedescription4.setText("DESCRIPTION");
        smoothiedescription4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        smootheepannel2.add(smoothiedescription4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 530, 90));

        jLabel426.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        smootheepannel2.add(jLabel426, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        nextbtn18.setForeground(new java.awt.Color(255, 255, 255));
        nextbtn18.setIcon(new javax.swing.ImageIcon("G:\\huice_bar assets\\buttons\\nextbtn.png")); // NOI18N
        nextbtn18.setBorder(null);
        nextbtn18.setBorderPainted(false);
        nextbtn18.setContentAreaFilled(false);
        nextbtn18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextbtn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbtn18ActionPerformed(evt);
            }
        });
        smootheepannel2.add(nextbtn18, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 940, -1, -1));

        backbtn17.setForeground(new java.awt.Color(255, 255, 255));
        backbtn17.setIcon(new javax.swing.ImageIcon("G:\\huice_bar assets\\buttons\\backbtn.png")); // NOI18N
        backbtn17.setBorder(null);
        backbtn17.setBorderPainted(false);
        backbtn17.setContentAreaFilled(false);
        backbtn17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backbtn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtn17ActionPerformed(evt);
            }
        });
        smootheepannel2.add(backbtn17, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 940, -1, -1));

        mainoannel.add(smootheepannel2, "card24");

        smootheepannel3.setBackground(new java.awt.Color(255, 255, 255));
        smootheepannel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        smootheepannel3.add(smoothiephoto9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, 240, 250));

        jLabel457.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel457.setText("DESCRIPTION");
        smootheepannel3.add(jLabel457, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 780, -1, -1));

        jLabel458.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel458.setText("SUPPLIER");
        smootheepannel3.add(jLabel458, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 750, -1, -1));

        jLabel459.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel459.setText("PRICE");
        smootheepannel3.add(jLabel459, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 720, -1, -1));

        jLabel460.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel460.setText("TYPE");
        smootheepannel3.add(jLabel460, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 690, -1, -1));

        jLabel461.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel461.setText("PRODUCT NAME");
        smootheepannel3.add(jLabel461, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 660, -1, -1));

        smoothiename9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothiename9.setText("PRODUCT NAME");
        smootheepannel3.add(smoothiename9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 660, -1, -1));

        smoothietype9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothietype9.setText("TYPE");
        smootheepannel3.add(smoothietype9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 690, -1, -1));

        smoothieprice9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothieprice9.setText("PRICE");
        smootheepannel3.add(smoothieprice9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 720, -1, -1));

        smoothiesupplyer9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothiesupplyer9.setText("SUPPLIER");
        smootheepannel3.add(smoothiesupplyer9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 750, -1, -1));

        smoothiedescription9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothiedescription9.setText("DESCRIPTION");
        smoothiedescription9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        smootheepannel3.add(smoothiedescription9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 780, 530, 90));

        jLabel456.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        smootheepannel3.add(jLabel456, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, -1, -1));
        smootheepannel3.add(smoothiephoto8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 240, 250));

        jLabel451.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel451.setText("DESCRIPTION");
        smootheepannel3.add(jLabel451, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, -1, -1));

        jLabel452.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel452.setText("SUPPLIER");
        smootheepannel3.add(jLabel452, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, -1, -1));

        jLabel453.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel453.setText("PRICE");
        smootheepannel3.add(jLabel453, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, -1, -1));

        jLabel454.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel454.setText("TYPE");
        smootheepannel3.add(jLabel454, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, -1, -1));

        jLabel455.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel455.setText("PRODUCT NAME");
        smootheepannel3.add(jLabel455, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, -1, -1));

        smoothiedescription8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothiedescription8.setText("DESCRIPTION");
        smoothiedescription8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        smootheepannel3.add(smoothiedescription8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, 530, 90));

        smoothiesupplyer8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothiesupplyer8.setText("SUPPLIER");
        smootheepannel3.add(smoothiesupplyer8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, -1, -1));

        smoothieprice8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothieprice8.setText("PRICE");
        smootheepannel3.add(smoothieprice8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, -1, -1));

        smoothietype8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothietype8.setText("TYPE");
        smootheepannel3.add(smoothietype8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, -1, -1));

        smoothiename8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothiename8.setText("PRODUCT NAME");
        smootheepannel3.add(smoothiename8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, -1, -1));

        jLabel450.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        smootheepannel3.add(jLabel450, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jLabel54.setText("Smoothiee Page 3");
        smootheepannel3.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));
        smootheepannel3.add(smoothiephoto7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 240, 250));

        jLabel445.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel445.setText("DESCRIPTION");
        smootheepannel3.add(jLabel445, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, -1));

        jLabel446.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel446.setText("SUPPLIER");
        smootheepannel3.add(jLabel446, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, -1));

        jLabel447.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel447.setText("PRICE");
        smootheepannel3.add(jLabel447, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));

        jLabel448.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel448.setText("TYPE");
        smootheepannel3.add(jLabel448, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));

        jLabel449.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel449.setText("PRODUCT NAME");
        smootheepannel3.add(jLabel449, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        smoothiename7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothiename7.setText("PRODUCT NAME");
        smootheepannel3.add(smoothiename7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, -1));

        smoothietype7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothietype7.setText("TYPE");
        smootheepannel3.add(smoothietype7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, -1, -1));

        smoothieprice7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothieprice7.setText("PRICE");
        smootheepannel3.add(smoothieprice7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, -1, -1));

        smoothiesupplyer7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothiesupplyer7.setText("SUPPLIER");
        smootheepannel3.add(smoothiesupplyer7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, -1, -1));

        smoothiedescription7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothiedescription7.setText("DESCRIPTION");
        smoothiedescription7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        smootheepannel3.add(smoothiedescription7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 530, 90));

        jLabel444.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        smootheepannel3.add(jLabel444, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        nextbtn19.setForeground(new java.awt.Color(255, 255, 255));
        nextbtn19.setIcon(new javax.swing.ImageIcon("G:\\huice_bar assets\\buttons\\nextbtn.png")); // NOI18N
        nextbtn19.setBorder(null);
        nextbtn19.setBorderPainted(false);
        nextbtn19.setContentAreaFilled(false);
        nextbtn19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextbtn19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbtn19ActionPerformed(evt);
            }
        });
        smootheepannel3.add(nextbtn19, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 940, -1, -1));

        backbtn18.setForeground(new java.awt.Color(255, 255, 255));
        backbtn18.setIcon(new javax.swing.ImageIcon("G:\\huice_bar assets\\buttons\\backbtn.png")); // NOI18N
        backbtn18.setBorder(null);
        backbtn18.setBorderPainted(false);
        backbtn18.setContentAreaFilled(false);
        backbtn18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backbtn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtn18ActionPerformed(evt);
            }
        });
        smootheepannel3.add(backbtn18, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 940, -1, -1));

        mainoannel.add(smootheepannel3, "card25");

        smootheepannel4.setBackground(new java.awt.Color(255, 255, 255));
        smootheepannel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        smootheepannel4.add(smoothiephoto12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, 240, 250));

        jLabel475.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel475.setText("DESCRIPTION");
        smootheepannel4.add(jLabel475, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 780, -1, -1));

        jLabel476.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel476.setText("SUPPLIER");
        smootheepannel4.add(jLabel476, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 750, -1, -1));

        jLabel477.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel477.setText("PRICE");
        smootheepannel4.add(jLabel477, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 720, -1, -1));

        jLabel478.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel478.setText("TYPE");
        smootheepannel4.add(jLabel478, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 690, -1, -1));

        jLabel479.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel479.setText("PRODUCT NAME");
        smootheepannel4.add(jLabel479, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 660, -1, -1));

        smoothiename12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothiename12.setText("PRODUCT NAME");
        smootheepannel4.add(smoothiename12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 660, -1, -1));

        smoothietype12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothietype12.setText("TYPE");
        smootheepannel4.add(smoothietype12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 690, -1, -1));

        smoothieprice12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothieprice12.setText("PRICE");
        smootheepannel4.add(smoothieprice12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 720, -1, -1));

        smoothiesupplyer12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothiesupplyer12.setText("SUPPLIER");
        smootheepannel4.add(smoothiesupplyer12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 750, -1, -1));

        smoothiedescription12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothiedescription12.setText("DESCRIPTION");
        smoothiedescription12.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        smootheepannel4.add(smoothiedescription12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 780, 530, 90));

        jLabel474.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        smootheepannel4.add(jLabel474, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, -1, -1));
        smootheepannel4.add(smoothiephoto11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 240, 250));

        jLabel469.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel469.setText("DESCRIPTION");
        smootheepannel4.add(jLabel469, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 510, -1, -1));

        jLabel470.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel470.setText("SUPPLIER");
        smootheepannel4.add(jLabel470, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, -1, -1));

        jLabel471.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel471.setText("PRICE");
        smootheepannel4.add(jLabel471, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, -1, -1));

        jLabel472.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel472.setText("TYPE");
        smootheepannel4.add(jLabel472, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, -1, -1));

        jLabel473.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel473.setText("PRODUCT NAME");
        smootheepannel4.add(jLabel473, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, -1, -1));

        smoothiename11.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothiename11.setText("PRODUCT NAME");
        smootheepannel4.add(smoothiename11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, -1, -1));

        smoothietype11.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothietype11.setText("TYPE");
        smootheepannel4.add(smoothietype11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, -1, -1));

        smoothieprice11.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothieprice11.setText("PRICE");
        smootheepannel4.add(smoothieprice11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, -1, -1));

        smoothiesupplyer11.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothiesupplyer11.setText("SUPPLIER");
        smootheepannel4.add(smoothiesupplyer11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, -1, -1));

        smoothiedescription11.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothiedescription11.setText("DESCRIPTION");
        smoothiedescription11.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        smootheepannel4.add(smoothiedescription11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, 530, 90));

        jLabel468.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        smootheepannel4.add(jLabel468, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        jLabel55.setText("Smoothiee Page 4");
        smootheepannel4.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel462.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel462.setText("DESCRIPTION");
        smootheepannel4.add(jLabel462, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, -1));
        smootheepannel4.add(smoothiephoto10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 240, 250));

        jLabel464.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel464.setText("SUPPLIER");
        smootheepannel4.add(jLabel464, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, -1));

        jLabel465.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel465.setText("PRICE");
        smootheepannel4.add(jLabel465, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));

        jLabel466.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel466.setText("TYPE");
        smootheepannel4.add(jLabel466, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));

        jLabel467.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel467.setText("PRODUCT NAME");
        smootheepannel4.add(jLabel467, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        smoothiename10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothiename10.setText("PRODUCT NAME");
        smootheepannel4.add(smoothiename10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, -1));

        smoothietype10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothietype10.setText("TYPE");
        smootheepannel4.add(smoothietype10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, -1, -1));

        smoothieprice10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothieprice10.setText("PRICE");
        smootheepannel4.add(smoothieprice10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, -1, -1));

        smoothiesupplyer10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothiesupplyer10.setText("SUPPLIER");
        smootheepannel4.add(smoothiesupplyer10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, -1, -1));

        smoothiedescription10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        smoothiedescription10.setText("DESCRIPTION");
        smoothiedescription10.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        smootheepannel4.add(smoothiedescription10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 530, 90));

        jLabel463.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/employees detalis bar2.png"))); // NOI18N
        smootheepannel4.add(jLabel463, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        backbtn19.setForeground(new java.awt.Color(255, 255, 255));
        backbtn19.setIcon(new javax.swing.ImageIcon("G:\\huice_bar assets\\buttons\\backbtn.png")); // NOI18N
        backbtn19.setBorder(null);
        backbtn19.setBorderPainted(false);
        backbtn19.setContentAreaFilled(false);
        backbtn19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backbtn19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtn19ActionPerformed(evt);
            }
        });
        smootheepannel4.add(backbtn19, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 940, -1, -1));

        mainoannel.add(smootheepannel4, "card26");

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

        deletebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/delete.png"))); // NOI18N
        deletebtn.setBorder(null);
        deletebtn.setBorderPainted(false);
        deletebtn.setContentAreaFilled(false);
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        menuitemsdash.add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, -1, -1));

        updatebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/update.png"))); // NOI18N
        updatebtn.setBorder(null);
        updatebtn.setBorderPainted(false);
        updatebtn.setContentAreaFilled(false);
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        menuitemsdash.add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));

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

        addbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/add.png"))); // NOI18N
        addbtn.setBorder(null);
        addbtn.setBorderPainted(false);
        addbtn.setContentAreaFilled(false);
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        menuitemsdash.add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        addbtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/add.png"))); // NOI18N
        addbtn1.setBorder(null);
        addbtn1.setBorderPainted(false);
        addbtn1.setContentAreaFilled(false);
        addbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtn1ActionPerformed(evt);
            }
        });
        menuitemsdash.add(addbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, -1, -1));

        updatebtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/update.png"))); // NOI18N
        updatebtn1.setBorder(null);
        updatebtn1.setBorderPainted(false);
        updatebtn1.setContentAreaFilled(false);
        updatebtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtn1ActionPerformed(evt);
            }
        });
        menuitemsdash.add(updatebtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 100, -1, -1));

        deletebtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/delete.png"))); // NOI18N
        deletebtn1.setBorder(null);
        deletebtn1.setBorderPainted(false);
        deletebtn1.setContentAreaFilled(false);
        deletebtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtn1ActionPerformed(evt);
            }
        });
        menuitemsdash.add(deletebtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 100, -1, -1));

        updatebtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/update.png"))); // NOI18N
        updatebtn2.setBorder(null);
        updatebtn2.setBorderPainted(false);
        updatebtn2.setContentAreaFilled(false);
        updatebtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtn2ActionPerformed(evt);
            }
        });
        menuitemsdash.add(updatebtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, -1, -1));

        deletebtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/delete.png"))); // NOI18N
        deletebtn2.setBorder(null);
        deletebtn2.setBorderPainted(false);
        deletebtn2.setContentAreaFilled(false);
        deletebtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtn2ActionPerformed(evt);
            }
        });
        menuitemsdash.add(deletebtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 550, -1, -1));

        addbtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/add.png"))); // NOI18N
        addbtn2.setBorder(null);
        addbtn2.setBorderPainted(false);
        addbtn2.setContentAreaFilled(false);
        addbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtn2ActionPerformed(evt);
            }
        });
        menuitemsdash.add(addbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, -1, -1));

        updatebtn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/update.png"))); // NOI18N
        updatebtn3.setBorder(null);
        updatebtn3.setBorderPainted(false);
        updatebtn3.setContentAreaFilled(false);
        updatebtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtn3ActionPerformed(evt);
            }
        });
        menuitemsdash.add(updatebtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 550, -1, -1));

        addbtn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/add.png"))); // NOI18N
        addbtn3.setBorder(null);
        addbtn3.setBorderPainted(false);
        addbtn3.setContentAreaFilled(false);
        addbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtn3ActionPerformed(evt);
            }
        });
        menuitemsdash.add(addbtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 550, -1, -1));

        deletebtn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard_pkge/delete.png"))); // NOI18N
        deletebtn3.setBorder(null);
        deletebtn3.setBorderPainted(false);
        deletebtn3.setContentAreaFilled(false);
        deletebtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtn3ActionPerformed(evt);
            }
        });
        menuitemsdash.add(deletebtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 550, -1, -1));

        mainoannel.add(menuitemsdash, "card27");

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
        jPanel6.add(nextbtn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 950, -1, -1));
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

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutbtnActionPerformed

    private void manageitemsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageitemsbtnActionPerformed
        dbresetsjuices();
    dbresetsicecream();
    dbresetsmilkshakes();
    dbresetssmoothiees();
        juicemenupannel1.setVisible(false);
        juicemenupannel2.setVisible(false);
        juicemenupannel3.setVisible(false);
        juicemenupannel4.setVisible(false);
        juicemenupannel5.setVisible(false);
        juicemenupannel6.setVisible(false);
      
        Icecreampannel1.setVisible(false);
        Icecreampannel2.setVisible(false);
        Icecreampannel3.setVisible(false);
        Icecreampannel4.setVisible(false);
        milkshakespannel1.setVisible(false);
        milkshakespannel2.setVisible(false);
        milkshakespannel3.setVisible(false);
        smootheepannel1.setVisible(false);
        smootheepannel2.setVisible(false);
        smootheepannel3.setVisible(false);
        menuitemsdash.setVisible(true);
        
        jPanel6.setVisible(false);

        // adminlogin log = new adminlogin();
        //        log.setVisible(true);
        //        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_manageitemsbtnActionPerformed

    private void menubtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menubtnActionPerformed
        

    }//GEN-LAST:event_menubtnActionPerformed

    private void manageemployeebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageemployeebtnActionPerformed

      
        juicemenupannel1.setVisible(false);
        juicemenupannel2.setVisible(false);
        juicemenupannel3.setVisible(false);
        juicemenupannel4.setVisible(false);
        juicemenupannel5.setVisible(false);
        juicemenupannel6.setVisible(false);
        
        Icecreampannel1.setVisible(false);
        Icecreampannel2.setVisible(false);
        Icecreampannel3.setVisible(false);
        Icecreampannel4.setVisible(false);
        milkshakespannel1.setVisible(false);
        milkshakespannel2.setVisible(false);
        milkshakespannel3.setVisible(false);
        smootheepannel1.setVisible(false);
        smootheepannel2.setVisible(false);
        smootheepannel3.setVisible(false);
        menuitemsdash.setVisible(false);
        
        jPanel6.setVisible(false);
    }//GEN-LAST:event_manageemployeebtnActionPerformed

    private void employeebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeebtnActionPerformed
       
        juicemenupannel1.setVisible(false);
        juicemenupannel2.setVisible(false);
        juicemenupannel3.setVisible(false);
        juicemenupannel4.setVisible(false);
        juicemenupannel5.setVisible(false);
        juicemenupannel6.setVisible(false);
        
        Icecreampannel1.setVisible(false);
        Icecreampannel2.setVisible(false);
        Icecreampannel3.setVisible(false);
        Icecreampannel4.setVisible(false);
        milkshakespannel1.setVisible(false);
        milkshakespannel2.setVisible(false);
        milkshakespannel3.setVisible(false);
        smootheepannel1.setVisible(false);
        smootheepannel2.setVisible(false);
        smootheepannel3.setVisible(false);
        menuitemsdash.setVisible(false);
        
        jPanel6.setVisible(false);
    }//GEN-LAST:event_employeebtnActionPerformed

    private void dashboardbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardbtnActionPerformed
Dashboard_ui das = new Dashboard_ui();
das.setVisible(true);
this.dispose();
       

    }//GEN-LAST:event_dashboardbtnActionPerformed

    private void nextbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbtn2ActionPerformed
       
        juicemenupannel1.setVisible(false);
        juicemenupannel2.setVisible(true);
        juicemenupannel3.setVisible(false);
        juicemenupannel4.setVisible(false);
        juicemenupannel5.setVisible(false);
        juicemenupannel6.setVisible(false);
      
        Icecreampannel1.setVisible(false);
        Icecreampannel2.setVisible(false);
        Icecreampannel3.setVisible(false);
        Icecreampannel4.setVisible(false);
        milkshakespannel1.setVisible(false);
        milkshakespannel2.setVisible(false);
        milkshakespannel3.setVisible(false);
        smootheepannel1.setVisible(false);
        smootheepannel2.setVisible(false);
        smootheepannel3.setVisible(false);
        menuitemsdash.setVisible(false);
        jPanel6.setVisible(false);
    }//GEN-LAST:event_nextbtn2ActionPerformed

    private void backbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtn1ActionPerformed
        
        juicemenupannel1.setVisible(true);
        juicemenupannel2.setVisible(false);
        juicemenupannel3.setVisible(false);
        juicemenupannel4.setVisible(false);
        juicemenupannel5.setVisible(false);
        juicemenupannel6.setVisible(false);
        
        Icecreampannel1.setVisible(false);
        Icecreampannel2.setVisible(false);
        Icecreampannel3.setVisible(false);
        Icecreampannel4.setVisible(false);
        milkshakespannel1.setVisible(false);
        milkshakespannel2.setVisible(false);
        milkshakespannel3.setVisible(false);
        smootheepannel1.setVisible(false);
        smootheepannel2.setVisible(false);
        smootheepannel3.setVisible(false);
        menuitemsdash.setVisible(false);
        
        jPanel6.setVisible(false); // TODO add your handling code here:
    }//GEN-LAST:event_backbtn1ActionPerformed

    private void nextbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbtn8ActionPerformed
        
        juicemenupannel1.setVisible(false);
        juicemenupannel2.setVisible(false);
        juicemenupannel3.setVisible(true);
        juicemenupannel4.setVisible(false);
        juicemenupannel5.setVisible(false);
        juicemenupannel6.setVisible(false);
        
        Icecreampannel1.setVisible(false);
        Icecreampannel2.setVisible(false);
        Icecreampannel3.setVisible(false);
        Icecreampannel4.setVisible(false);
        milkshakespannel1.setVisible(false);
        milkshakespannel2.setVisible(false);
        milkshakespannel3.setVisible(false);
        smootheepannel1.setVisible(false);
        smootheepannel2.setVisible(false);
        smootheepannel3.setVisible(false);
        menuitemsdash.setVisible(false);
       
        jPanel6.setVisible(false);
    }//GEN-LAST:event_nextbtn8ActionPerformed

    private void nextbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbtn4ActionPerformed
       
        juicemenupannel1.setVisible(false);
        juicemenupannel2.setVisible(false);
        juicemenupannel3.setVisible(false);
        juicemenupannel4.setVisible(true);
        juicemenupannel5.setVisible(false);
        juicemenupannel6.setVisible(false);
        
        Icecreampannel1.setVisible(false);
        Icecreampannel2.setVisible(false);
        Icecreampannel3.setVisible(false);
        Icecreampannel4.setVisible(false);
        milkshakespannel1.setVisible(false);
        milkshakespannel2.setVisible(false);
        milkshakespannel3.setVisible(false);
        smootheepannel1.setVisible(false);
        smootheepannel2.setVisible(false);
        smootheepannel3.setVisible(false);
        menuitemsdash.setVisible(false);
        
        jPanel6.setVisible(false);
    }//GEN-LAST:event_nextbtn4ActionPerformed

    private void backbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtn2ActionPerformed
        
        juicemenupannel1.setVisible(false);
        juicemenupannel2.setVisible(true);
        juicemenupannel3.setVisible(false);
        juicemenupannel4.setVisible(false);
        juicemenupannel5.setVisible(false);
        juicemenupannel6.setVisible(false);
       
        Icecreampannel1.setVisible(false);
        Icecreampannel2.setVisible(false);
        Icecreampannel3.setVisible(false);
        Icecreampannel4.setVisible(false);
        milkshakespannel1.setVisible(false);
        milkshakespannel2.setVisible(false);
        milkshakespannel3.setVisible(false);
        smootheepannel1.setVisible(false);
        smootheepannel2.setVisible(false);
        smootheepannel3.setVisible(false);
        menuitemsdash.setVisible(false);
        
        jPanel6.setVisible(false);
    }//GEN-LAST:event_backbtn2ActionPerformed

    private void nextbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbtn5ActionPerformed
       
        juicemenupannel1.setVisible(false);
        juicemenupannel2.setVisible(false);
        juicemenupannel3.setVisible(false);
        juicemenupannel4.setVisible(false);
        juicemenupannel5.setVisible(false);
        juicemenupannel6.setVisible(false);
       
        Icecreampannel1.setVisible(false);
        Icecreampannel2.setVisible(false);
        Icecreampannel3.setVisible(false);
        Icecreampannel4.setVisible(false);
        milkshakespannel1.setVisible(false);
        milkshakespannel2.setVisible(false);
        milkshakespannel3.setVisible(false);
        smootheepannel1.setVisible(false);
        smootheepannel2.setVisible(false);
        smootheepannel3.setVisible(false);
        menuitemsdash.setVisible(false);
        
        jPanel6.setVisible(true);
    }//GEN-LAST:event_nextbtn5ActionPerformed

    private void backbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtn3ActionPerformed
    
        juicemenupannel1.setVisible(false);
        juicemenupannel2.setVisible(false);
        juicemenupannel3.setVisible(true);
        juicemenupannel4.setVisible(false);
        juicemenupannel5.setVisible(false);
        juicemenupannel6.setVisible(false);
        
        Icecreampannel1.setVisible(false);
        Icecreampannel2.setVisible(false);
        Icecreampannel3.setVisible(false);
        Icecreampannel4.setVisible(false);
        milkshakespannel1.setVisible(false);
        milkshakespannel2.setVisible(false);
        milkshakespannel3.setVisible(false);
        smootheepannel1.setVisible(false);
        smootheepannel2.setVisible(false);
        smootheepannel3.setVisible(false);
        menuitemsdash.setVisible(false);
        
        jPanel6.setVisible(false);
    }//GEN-LAST:event_backbtn3ActionPerformed

    private void nextbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbtn6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nextbtn6ActionPerformed

    private void backbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtn4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backbtn4ActionPerformed

    private void backbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtn5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backbtn5ActionPerformed

    private void backbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtn7ActionPerformed
        
        juicemenupannel1.setVisible(false);
        juicemenupannel2.setVisible(false);
        juicemenupannel3.setVisible(false);
        juicemenupannel4.setVisible(false);
        juicemenupannel5.setVisible(false);
        juicemenupannel6.setVisible(false);
        
        Icecreampannel1.setVisible(false);
        Icecreampannel2.setVisible(false);
        Icecreampannel3.setVisible(false);
        Icecreampannel4.setVisible(false);
        milkshakespannel1.setVisible(false);
        milkshakespannel2.setVisible(false);
        milkshakespannel3.setVisible(false);
        smootheepannel1.setVisible(false);
        smootheepannel2.setVisible(false);
        smootheepannel3.setVisible(false);
        menuitemsdash.setVisible(false);
       
        jPanel6.setVisible(true);
    }//GEN-LAST:event_backbtn7ActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        deletefood jud = new deletefood();
        jud.setVisible(true);
       
    }//GEN-LAST:event_deletebtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        updatefood jbu = new updatefood();
        jbu.setVisible(true);
        
    }//GEN-LAST:event_updatebtnActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        
        juicemenupannel1.setVisible(false);
        juicemenupannel2.setVisible(false);
        juicemenupannel3.setVisible(false);
        juicemenupannel4.setVisible(false);
        juicemenupannel5.setVisible(false);
        juicemenupannel6.setVisible(false);
        
        Icecreampannel1.setVisible(false);
        Icecreampannel2.setVisible(false);
        Icecreampannel3.setVisible(false);
        Icecreampannel4.setVisible(false);
        milkshakespannel1.setVisible(true);
        milkshakespannel2.setVisible(false);
        milkshakespannel3.setVisible(false);
        smootheepannel1.setVisible(false);
        smootheepannel2.setVisible(false);
        smootheepannel3.setVisible(false);
        menuitemsdash.setVisible(false);
        
        jPanel6.setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       
        juicemenupannel1.setVisible(true);
        juicemenupannel2.setVisible(false);
        juicemenupannel3.setVisible(false);
        juicemenupannel4.setVisible(false);
        juicemenupannel5.setVisible(false);
        juicemenupannel6.setVisible(false);
        
        Icecreampannel1.setVisible(false);
        Icecreampannel2.setVisible(false);
        Icecreampannel3.setVisible(false);
        Icecreampannel4.setVisible(false);
        milkshakespannel1.setVisible(false);
        milkshakespannel2.setVisible(false);
        milkshakespannel3.setVisible(false);
        smootheepannel1.setVisible(false);
        smootheepannel2.setVisible(false);
        smootheepannel3.setVisible(false);
        menuitemsdash.setVisible(false);
        
        jPanel6.setVisible(false);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
       juicemenupannel1.setVisible(false);
        juicemenupannel2.setVisible(false);
        juicemenupannel3.setVisible(false);
        juicemenupannel4.setVisible(false);
        juicemenupannel5.setVisible(false);
        juicemenupannel6.setVisible(false);
      
        Icecreampannel1.setVisible(true);
        Icecreampannel2.setVisible(false);
        Icecreampannel3.setVisible(false);
        Icecreampannel4.setVisible(false);
        milkshakespannel1.setVisible(false);
        milkshakespannel2.setVisible(false);
        milkshakespannel3.setVisible(false);
        smootheepannel1.setVisible(false);
        smootheepannel2.setVisible(false);
        smootheepannel3.setVisible(false);
        menuitemsdash.setVisible(false);
        
        jPanel6.setVisible(false); 

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

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        
        juicemenupannel1.setVisible(false);
        juicemenupannel2.setVisible(false);
        juicemenupannel3.setVisible(false);
        juicemenupannel4.setVisible(false);
        juicemenupannel5.setVisible(false);
        juicemenupannel6.setVisible(false);
       
        Icecreampannel1.setVisible(false);
        Icecreampannel2.setVisible(false);
        Icecreampannel3.setVisible(false);
        Icecreampannel4.setVisible(false);
        milkshakespannel1.setVisible(false);
        milkshakespannel2.setVisible(false);
        milkshakespannel3.setVisible(false);
        smootheepannel1.setVisible(true);
        smootheepannel2.setVisible(false);
        smootheepannel3.setVisible(false);
        menuitemsdash.setVisible(false);
        
        jPanel6.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        juicedb jb = new juicedb();
        jb.setVisible(true);
        
    }//GEN-LAST:event_addbtnActionPerformed

    private void addbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtn1ActionPerformed
       icreamdb ice = new icreamdb();
        ice.setVisible(true);
    }//GEN-LAST:event_addbtn1ActionPerformed

    private void updatebtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtn1ActionPerformed
      updateice ice = new updateice();
        ice.setVisible(true);
    }//GEN-LAST:event_updatebtn1ActionPerformed

    private void deletebtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtn1ActionPerformed
       deleteice ice = new deleteice();
        ice.setVisible(true);
    }//GEN-LAST:event_deletebtn1ActionPerformed

    private void updatebtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtn2ActionPerformed
    updatemilkshake mlk = new updatemilkshake();
        mlk.setVisible(true);
    }//GEN-LAST:event_updatebtn2ActionPerformed

    private void deletebtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtn2ActionPerformed
       deletemilkshake mlk = new deletemilkshake();
        mlk.setVisible(true);
    }//GEN-LAST:event_deletebtn2ActionPerformed

    private void addbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtn2ActionPerformed
      milkshakedb mlk = new milkshakedb();
        mlk.setVisible(true);
    }//GEN-LAST:event_addbtn2ActionPerformed

    private void updatebtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtn3ActionPerformed
        updatesmoothie smoo = new updatesmoothie();
        smoo.setVisible(true);
    }//GEN-LAST:event_updatebtn3ActionPerformed

    private void addbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtn3ActionPerformed
      smoothiedb smoo = new smoothiedb();
        smoo.setVisible(true);
    }//GEN-LAST:event_addbtn3ActionPerformed

    private void deletebtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtn3ActionPerformed
        deletesmoothie smoo = new deletesmoothie();
        smoo.setVisible(true);
    }//GEN-LAST:event_deletebtn3ActionPerformed

    private void nextbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbtn7ActionPerformed
        
        juicemenupannel1.setVisible(false);
        juicemenupannel2.setVisible(false);
        juicemenupannel3.setVisible(false);
        juicemenupannel4.setVisible(false);
        juicemenupannel5.setVisible(false);
        juicemenupannel6.setVisible(true);
       
        Icecreampannel1.setVisible(false);
        Icecreampannel2.setVisible(false);
        Icecreampannel3.setVisible(false);
        Icecreampannel4.setVisible(false);
        milkshakespannel1.setVisible(false);
        milkshakespannel2.setVisible(false);
        milkshakespannel3.setVisible(false);
        smootheepannel1.setVisible(false);
        smootheepannel2.setVisible(false);
        smootheepannel3.setVisible(false);
        menuitemsdash.setVisible(false);
       
        jPanel6.setVisible(false);
    }//GEN-LAST:event_nextbtn7ActionPerformed

    private void backbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtn6ActionPerformed
       
        juicemenupannel1.setVisible(false);
        juicemenupannel2.setVisible(false);
        juicemenupannel3.setVisible(false);
        juicemenupannel4.setVisible(true);
        juicemenupannel5.setVisible(false);
        juicemenupannel6.setVisible(false);
       
        Icecreampannel1.setVisible(false);
        Icecreampannel2.setVisible(false);
        Icecreampannel3.setVisible(false);
        Icecreampannel4.setVisible(false);
        milkshakespannel1.setVisible(false);
        milkshakespannel2.setVisible(false);
        milkshakespannel3.setVisible(false);
        smootheepannel1.setVisible(false);
        smootheepannel2.setVisible(false);
        smootheepannel3.setVisible(false);
        menuitemsdash.setVisible(false);
        
        jPanel6.setVisible(false);
    }//GEN-LAST:event_backbtn6ActionPerformed

    private void paymentreportbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentreportbtnActionPerformed
       reporttest report = new  reporttest();
       report.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_paymentreportbtnActionPerformed

    private void nextbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbtn9ActionPerformed
     juicemenupannel1.setVisible(false);
        juicemenupannel2.setVisible(false);
        juicemenupannel3.setVisible(false);
        juicemenupannel4.setVisible(false);
        juicemenupannel5.setVisible(false);
        juicemenupannel6.setVisible(false);
        
        Icecreampannel1.setVisible(false);
        Icecreampannel2.setVisible(true);
        Icecreampannel3.setVisible(false);
        Icecreampannel4.setVisible(false);
        milkshakespannel1.setVisible(false);
        milkshakespannel2.setVisible(false);
        milkshakespannel3.setVisible(false);
        smootheepannel1.setVisible(false);
        smootheepannel2.setVisible(false);
        smootheepannel3.setVisible(false);
        menuitemsdash.setVisible(false);
        jPanel6.setVisible(false);
    }//GEN-LAST:event_nextbtn9ActionPerformed

    private void backbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtn8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backbtn8ActionPerformed

    private void nextbtn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbtn10ActionPerformed
      juicemenupannel1.setVisible(false);
        juicemenupannel2.setVisible(false);
        juicemenupannel3.setVisible(false);
        juicemenupannel4.setVisible(false);
        juicemenupannel5.setVisible(false);
        juicemenupannel6.setVisible(false);
        
        Icecreampannel1.setVisible(false);
        Icecreampannel2.setVisible(false);
        Icecreampannel3.setVisible(true);
        Icecreampannel4.setVisible(false);
        milkshakespannel1.setVisible(false);
        milkshakespannel2.setVisible(false);
        milkshakespannel3.setVisible(false);
        smootheepannel1.setVisible(false);
        smootheepannel2.setVisible(false);
        smootheepannel3.setVisible(false);
        menuitemsdash.setVisible(false);
        jPanel6.setVisible(false);
    }//GEN-LAST:event_nextbtn10ActionPerformed

    private void backbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtn9ActionPerformed
       juicemenupannel1.setVisible(false);
        juicemenupannel2.setVisible(false);
        juicemenupannel3.setVisible(false);
        juicemenupannel4.setVisible(false);
        juicemenupannel5.setVisible(false);
        juicemenupannel6.setVisible(false);
        
        Icecreampannel1.setVisible(false);
        Icecreampannel2.setVisible(true);
        Icecreampannel3.setVisible(true);
        Icecreampannel4.setVisible(false);
        milkshakespannel1.setVisible(false);
        milkshakespannel2.setVisible(false);
        milkshakespannel3.setVisible(false);
        smootheepannel1.setVisible(false);
        smootheepannel2.setVisible(false);
        smootheepannel3.setVisible(false);
        menuitemsdash.setVisible(false);
        jPanel6.setVisible(false);
    }//GEN-LAST:event_backbtn9ActionPerformed

    private void nextbtn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbtn11ActionPerformed
       juicemenupannel1.setVisible(false);
        juicemenupannel2.setVisible(false);
        juicemenupannel3.setVisible(false);
        juicemenupannel4.setVisible(false);
        juicemenupannel5.setVisible(false);
        juicemenupannel6.setVisible(false);
        
        Icecreampannel1.setVisible(true);
        Icecreampannel2.setVisible(false);
        Icecreampannel3.setVisible(false);
        Icecreampannel4.setVisible(false);
        milkshakespannel1.setVisible(false);
        milkshakespannel2.setVisible(false);
        milkshakespannel3.setVisible(false);
        smootheepannel1.setVisible(false);
        smootheepannel2.setVisible(false);
        smootheepannel3.setVisible(false);
        menuitemsdash.setVisible(false);
        jPanel6.setVisible(false);
    }//GEN-LAST:event_nextbtn11ActionPerformed

    private void backbtn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtn10ActionPerformed
     juicemenupannel1.setVisible(false);
        juicemenupannel2.setVisible(false);
        juicemenupannel3.setVisible(false);
        juicemenupannel4.setVisible(false);
        juicemenupannel5.setVisible(false);
        juicemenupannel6.setVisible(false);
        
        Icecreampannel1.setVisible(false);
        Icecreampannel2.setVisible(true);
        Icecreampannel3.setVisible(false);
        Icecreampannel4.setVisible(false);
        milkshakespannel1.setVisible(false);
        milkshakespannel2.setVisible(false);
        milkshakespannel3.setVisible(false);
        smootheepannel1.setVisible(false);
        smootheepannel2.setVisible(false);
        smootheepannel3.setVisible(false);
        menuitemsdash.setVisible(false);
        jPanel6.setVisible(false);
    }//GEN-LAST:event_backbtn10ActionPerformed

    private void backbtn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtn11ActionPerformed
      juicemenupannel1.setVisible(false);
        juicemenupannel2.setVisible(false);
        juicemenupannel3.setVisible(false);
        juicemenupannel4.setVisible(false);
        juicemenupannel5.setVisible(false);
        juicemenupannel6.setVisible(false);
        
        Icecreampannel1.setVisible(false);
        Icecreampannel2.setVisible(false);
        Icecreampannel3.setVisible(true);
        Icecreampannel4.setVisible(false);
        milkshakespannel1.setVisible(false);
        milkshakespannel2.setVisible(false);
        milkshakespannel3.setVisible(false);
        smootheepannel1.setVisible(false);
        smootheepannel2.setVisible(false);
        smootheepannel3.setVisible(false);
        menuitemsdash.setVisible(false);
        jPanel6.setVisible(false);
    }//GEN-LAST:event_backbtn11ActionPerformed

    private void nextbtn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbtn13ActionPerformed
       juicemenupannel1.setVisible(false);
        juicemenupannel2.setVisible(false);
        juicemenupannel3.setVisible(false);
        juicemenupannel4.setVisible(false);
        juicemenupannel5.setVisible(false);
        juicemenupannel6.setVisible(false);
        
        Icecreampannel1.setVisible(false);
        Icecreampannel2.setVisible(false);
        Icecreampannel3.setVisible(false);
        Icecreampannel4.setVisible(false);
        milkshakespannel1.setVisible(false);
        milkshakespannel2.setVisible(true);
        milkshakespannel3.setVisible(false);
        smootheepannel1.setVisible(false);
        smootheepannel2.setVisible(false);
        smootheepannel3.setVisible(false);
        menuitemsdash.setVisible(false);
        jPanel6.setVisible(false);
    }//GEN-LAST:event_nextbtn13ActionPerformed

    private void backbtn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtn12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backbtn12ActionPerformed

    private void nextbtn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbtn14ActionPerformed
      juicemenupannel1.setVisible(false);
        juicemenupannel2.setVisible(false);
        juicemenupannel3.setVisible(false);
        juicemenupannel4.setVisible(false);
        juicemenupannel5.setVisible(false);
        juicemenupannel6.setVisible(false);
        
        Icecreampannel1.setVisible(false);
        Icecreampannel2.setVisible(false);
        Icecreampannel3.setVisible(false);
        Icecreampannel4.setVisible(false);
        milkshakespannel1.setVisible(false);
        milkshakespannel2.setVisible(false);
        milkshakespannel3.setVisible(true);
        smootheepannel1.setVisible(false);
        smootheepannel2.setVisible(false);
        smootheepannel3.setVisible(false);
        menuitemsdash.setVisible(false);
        jPanel6.setVisible(false);
    }//GEN-LAST:event_nextbtn14ActionPerformed

    private void backbtn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtn13ActionPerformed
 juicemenupannel1.setVisible(false);
        juicemenupannel2.setVisible(false);
        juicemenupannel3.setVisible(false);
        juicemenupannel4.setVisible(false);
        juicemenupannel5.setVisible(false);
        juicemenupannel6.setVisible(false);
        
        Icecreampannel1.setVisible(false);
        Icecreampannel2.setVisible(false);
        Icecreampannel3.setVisible(false);
        Icecreampannel4.setVisible(false);
        milkshakespannel1.setVisible(true);
        milkshakespannel2.setVisible(false);
        milkshakespannel3.setVisible(false);
        smootheepannel1.setVisible(false);
        smootheepannel2.setVisible(false);
        smootheepannel3.setVisible(false);
        menuitemsdash.setVisible(false);
        jPanel6.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_backbtn13ActionPerformed

    private void nextbtn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbtn15ActionPerformed
     juicemenupannel1.setVisible(false);
        juicemenupannel2.setVisible(false);
        juicemenupannel3.setVisible(false);
        juicemenupannel4.setVisible(false);
        juicemenupannel5.setVisible(false);
        juicemenupannel6.setVisible(false);
        
        Icecreampannel1.setVisible(false);
        Icecreampannel2.setVisible(false);
        Icecreampannel3.setVisible(false);
        Icecreampannel4.setVisible(false);
        milkshakespannel1.setVisible(false);
        milkshakespannel2.setVisible(false);
        milkshakespannel3.setVisible(false);
        milkshakespannel4.setVisible(true);
        smootheepannel1.setVisible(false);
        smootheepannel2.setVisible(false);
        smootheepannel3.setVisible(false);
        menuitemsdash.setVisible(false);
        jPanel6.setVisible(false);
    }//GEN-LAST:event_nextbtn15ActionPerformed

    private void backbtn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtn14ActionPerformed
 juicemenupannel1.setVisible(false);
        juicemenupannel2.setVisible(false);
        juicemenupannel3.setVisible(false);
        juicemenupannel4.setVisible(false);
        juicemenupannel5.setVisible(false);
        juicemenupannel6.setVisible(false);
        
        Icecreampannel1.setVisible(false);
        Icecreampannel2.setVisible(false);
        Icecreampannel3.setVisible(false);
        Icecreampannel4.setVisible(false);
        milkshakespannel1.setVisible(false);
        milkshakespannel2.setVisible(true);
        milkshakespannel3.setVisible(false);
        smootheepannel1.setVisible(false);
        smootheepannel2.setVisible(false);
        smootheepannel3.setVisible(false);
        menuitemsdash.setVisible(false);
        jPanel6.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_backbtn14ActionPerformed

    private void backbtn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtn15ActionPerformed
        juicemenupannel1.setVisible(false);
        juicemenupannel2.setVisible(false);
        juicemenupannel3.setVisible(false);
        juicemenupannel4.setVisible(false);
        juicemenupannel5.setVisible(false);
        juicemenupannel6.setVisible(false);
        
        Icecreampannel1.setVisible(false);
        Icecreampannel2.setVisible(false);
        Icecreampannel3.setVisible(false);
        Icecreampannel4.setVisible(false);
        milkshakespannel1.setVisible(false);
        milkshakespannel2.setVisible(false);
        milkshakespannel3.setVisible(true);
         milkshakespannel4.setVisible(false);
        smootheepannel1.setVisible(false);
        smootheepannel2.setVisible(false);
        smootheepannel3.setVisible(false);
        menuitemsdash.setVisible(false);
        jPanel6.setVisible(false);
    }//GEN-LAST:event_backbtn15ActionPerformed

    private void nextbtn17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbtn17ActionPerformed
 juicemenupannel1.setVisible(false);
        juicemenupannel2.setVisible(false);
        juicemenupannel3.setVisible(false);
        juicemenupannel4.setVisible(false);
        juicemenupannel5.setVisible(false);
        juicemenupannel6.setVisible(false);
        
        Icecreampannel1.setVisible(false);
        Icecreampannel2.setVisible(false);
        Icecreampannel3.setVisible(false);
        Icecreampannel4.setVisible(false);
        milkshakespannel1.setVisible(false);
        milkshakespannel2.setVisible(false);
        milkshakespannel3.setVisible(false);
        smootheepannel1.setVisible(false);
        smootheepannel2.setVisible(true);
        smootheepannel3.setVisible(false);
        menuitemsdash.setVisible(false);
        jPanel6.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_nextbtn17ActionPerformed

    private void backbtn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtn16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backbtn16ActionPerformed

    private void nextbtn18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbtn18ActionPerformed
     juicemenupannel1.setVisible(false);
        juicemenupannel2.setVisible(false);
        juicemenupannel3.setVisible(false);
        juicemenupannel4.setVisible(false);
        juicemenupannel5.setVisible(false);
        juicemenupannel6.setVisible(false);
        
        Icecreampannel1.setVisible(false);
        Icecreampannel2.setVisible(false);
        Icecreampannel3.setVisible(false);
        Icecreampannel4.setVisible(false);
        milkshakespannel1.setVisible(false);
        milkshakespannel2.setVisible(false);
        milkshakespannel3.setVisible(false);
        smootheepannel1.setVisible(false);
        smootheepannel2.setVisible(false);
        smootheepannel3.setVisible(true);
        menuitemsdash.setVisible(false);
        jPanel6.setVisible(false);
    }//GEN-LAST:event_nextbtn18ActionPerformed

    private void backbtn17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtn17ActionPerformed
 juicemenupannel1.setVisible(false);
        juicemenupannel2.setVisible(false);
        juicemenupannel3.setVisible(false);
        juicemenupannel4.setVisible(false);
        juicemenupannel5.setVisible(false);
        juicemenupannel6.setVisible(false);
        
        Icecreampannel1.setVisible(false);
        Icecreampannel2.setVisible(false);
        Icecreampannel3.setVisible(false);
        Icecreampannel4.setVisible(false);
        milkshakespannel1.setVisible(false);
        milkshakespannel2.setVisible(false);
        milkshakespannel3.setVisible(false);
        smootheepannel1.setVisible(true);
        smootheepannel2.setVisible(false);
        smootheepannel3.setVisible(false);
        menuitemsdash.setVisible(false);
        jPanel6.setVisible(false);            // TODO add your handling code here:
    }//GEN-LAST:event_backbtn17ActionPerformed

    private void nextbtn19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbtn19ActionPerformed
      juicemenupannel1.setVisible(false);
        juicemenupannel2.setVisible(false);
        juicemenupannel3.setVisible(false);
        juicemenupannel4.setVisible(false);
        juicemenupannel5.setVisible(false);
        juicemenupannel6.setVisible(false);
        
        Icecreampannel1.setVisible(false);
        Icecreampannel2.setVisible(false);
        Icecreampannel3.setVisible(false);
        Icecreampannel4.setVisible(false);
        milkshakespannel1.setVisible(false);
        milkshakespannel2.setVisible(false);
        milkshakespannel3.setVisible(false);
        smootheepannel1.setVisible(false);
        smootheepannel2.setVisible(false);
        smootheepannel3.setVisible(false);
         smootheepannel3.setVisible(true);
        menuitemsdash.setVisible(false);
        jPanel6.setVisible(false);
    }//GEN-LAST:event_nextbtn19ActionPerformed

    private void backbtn18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtn18ActionPerformed
 juicemenupannel1.setVisible(false);
        juicemenupannel2.setVisible(false);
        juicemenupannel3.setVisible(false);
        juicemenupannel4.setVisible(false);
        juicemenupannel5.setVisible(false);
        juicemenupannel6.setVisible(false);
        
        Icecreampannel1.setVisible(false);
        Icecreampannel2.setVisible(false);
        Icecreampannel3.setVisible(false);
        Icecreampannel4.setVisible(false);
        milkshakespannel1.setVisible(false);
        milkshakespannel2.setVisible(false);
        milkshakespannel3.setVisible(false);
        smootheepannel1.setVisible(false);
        smootheepannel2.setVisible(true);
        smootheepannel3.setVisible(false);
        menuitemsdash.setVisible(false);
        jPanel6.setVisible(false);            // TODO add your handling code here:
    }//GEN-LAST:event_backbtn18ActionPerformed

    private void backbtn19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtn19ActionPerformed
 juicemenupannel1.setVisible(false);
        juicemenupannel2.setVisible(false);
        juicemenupannel3.setVisible(false);
        juicemenupannel4.setVisible(false);
        juicemenupannel5.setVisible(false);
        juicemenupannel6.setVisible(false);
        
        Icecreampannel1.setVisible(false);
        Icecreampannel2.setVisible(false);
        Icecreampannel3.setVisible(false);
        Icecreampannel4.setVisible(false);
        milkshakespannel1.setVisible(false);
        milkshakespannel2.setVisible(false);
        milkshakespannel3.setVisible(false);
        smootheepannel1.setVisible(false);
        smootheepannel2.setVisible(false);
        smootheepannel3.setVisible(true);
        menuitemsdash.setVisible(false);
        jPanel6.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_backbtn19ActionPerformed

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
            java.util.logging.Logger.getLogger(icecreamdtalist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(icecreamdtalist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(icecreamdtalist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(icecreamdtalist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new icecreamdtalist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Icecreampannel1;
    private javax.swing.JPanel Icecreampannel2;
    private javax.swing.JPanel Icecreampannel3;
    private javax.swing.JPanel Icecreampannel4;
    private javax.swing.JButton addbtn;
    private javax.swing.JButton addbtn1;
    private javax.swing.JButton addbtn2;
    private javax.swing.JButton addbtn3;
    private javax.swing.JLabel age21;
    private javax.swing.JLabel age22;
    private javax.swing.JLabel age23;
    private javax.swing.JButton backbtn1;
    private javax.swing.JButton backbtn10;
    private javax.swing.JButton backbtn11;
    private javax.swing.JButton backbtn12;
    private javax.swing.JButton backbtn13;
    private javax.swing.JButton backbtn14;
    private javax.swing.JButton backbtn15;
    private javax.swing.JButton backbtn16;
    private javax.swing.JButton backbtn17;
    private javax.swing.JButton backbtn18;
    private javax.swing.JButton backbtn19;
    private javax.swing.JButton backbtn2;
    private javax.swing.JButton backbtn3;
    private javax.swing.JButton backbtn4;
    private javax.swing.JButton backbtn5;
    private javax.swing.JButton backbtn6;
    private javax.swing.JButton backbtn7;
    private javax.swing.JButton backbtn8;
    private javax.swing.JButton backbtn9;
    private javax.swing.JLabel bg;
    private javax.swing.JButton dashboardbtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JButton deletebtn1;
    private javax.swing.JButton deletebtn2;
    private javax.swing.JButton deletebtn3;
    private javax.swing.JButton employeebtn;
    private javax.swing.JLabel gender21;
    private javax.swing.JLabel gender22;
    private javax.swing.JLabel gender23;
    private javax.swing.JLabel icedescription1;
    private javax.swing.JLabel icedescription10;
    private javax.swing.JLabel icedescription11;
    private javax.swing.JLabel icedescription12;
    private javax.swing.JLabel icedescription2;
    private javax.swing.JLabel icedescription3;
    private javax.swing.JLabel icedescription4;
    private javax.swing.JLabel icedescription5;
    private javax.swing.JLabel icedescription6;
    private javax.swing.JLabel icedescription7;
    private javax.swing.JLabel icedescription8;
    private javax.swing.JLabel icedescription9;
    private javax.swing.JLabel icename1;
    private javax.swing.JLabel icename10;
    private javax.swing.JLabel icename11;
    private javax.swing.JLabel icename12;
    private javax.swing.JLabel icename2;
    private javax.swing.JLabel icename3;
    private javax.swing.JLabel icename4;
    private javax.swing.JLabel icename5;
    private javax.swing.JLabel icename6;
    private javax.swing.JLabel icename7;
    private javax.swing.JLabel icename8;
    private javax.swing.JLabel icename9;
    private javax.swing.JLabel icephoto1;
    private javax.swing.JLabel icephoto10;
    private javax.swing.JLabel icephoto11;
    private javax.swing.JLabel icephoto12;
    private javax.swing.JLabel icephoto2;
    private javax.swing.JLabel icephoto3;
    private javax.swing.JLabel icephoto4;
    private javax.swing.JLabel icephoto5;
    private javax.swing.JLabel icephoto6;
    private javax.swing.JLabel icephoto7;
    private javax.swing.JLabel icephoto8;
    private javax.swing.JLabel icephoto9;
    private javax.swing.JLabel iceprice1;
    private javax.swing.JLabel iceprice10;
    private javax.swing.JLabel iceprice11;
    private javax.swing.JLabel iceprice12;
    private javax.swing.JLabel iceprice2;
    private javax.swing.JLabel iceprice3;
    private javax.swing.JLabel iceprice4;
    private javax.swing.JLabel iceprice5;
    private javax.swing.JLabel iceprice6;
    private javax.swing.JLabel iceprice7;
    private javax.swing.JLabel iceprice8;
    private javax.swing.JLabel iceprice9;
    private javax.swing.JLabel icesupplier1;
    private javax.swing.JLabel icesupplier10;
    private javax.swing.JLabel icesupplier11;
    private javax.swing.JLabel icesupplier12;
    private javax.swing.JLabel icesupplier2;
    private javax.swing.JLabel icesupplier3;
    private javax.swing.JLabel icesupplier4;
    private javax.swing.JLabel icesupplier5;
    private javax.swing.JLabel icesupplier6;
    private javax.swing.JLabel icesupplier7;
    private javax.swing.JLabel icesupplier8;
    private javax.swing.JLabel icesupplier9;
    private javax.swing.JLabel icetype1;
    private javax.swing.JLabel icetype10;
    private javax.swing.JLabel icetype11;
    private javax.swing.JLabel icetype12;
    private javax.swing.JLabel icetype2;
    private javax.swing.JLabel icetype3;
    private javax.swing.JLabel icetype4;
    private javax.swing.JLabel icetype5;
    private javax.swing.JLabel icetype6;
    private javax.swing.JLabel icetype7;
    private javax.swing.JLabel icetype8;
    private javax.swing.JLabel icetype9;
    private javax.swing.JLabel idno21;
    private javax.swing.JLabel idno22;
    private javax.swing.JLabel idno23;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel213;
    private javax.swing.JLabel jLabel214;
    private javax.swing.JLabel jLabel215;
    private javax.swing.JLabel jLabel216;
    private javax.swing.JLabel jLabel217;
    private javax.swing.JLabel jLabel218;
    private javax.swing.JLabel jLabel219;
    private javax.swing.JLabel jLabel22;
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
    private javax.swing.JLabel jLabel231;
    private javax.swing.JLabel jLabel232;
    private javax.swing.JLabel jLabel233;
    private javax.swing.JLabel jLabel234;
    private javax.swing.JLabel jLabel235;
    private javax.swing.JLabel jLabel236;
    private javax.swing.JLabel jLabel237;
    private javax.swing.JLabel jLabel238;
    private javax.swing.JLabel jLabel239;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel240;
    private javax.swing.JLabel jLabel241;
    private javax.swing.JLabel jLabel242;
    private javax.swing.JLabel jLabel243;
    private javax.swing.JLabel jLabel244;
    private javax.swing.JLabel jLabel245;
    private javax.swing.JLabel jLabel246;
    private javax.swing.JLabel jLabel247;
    private javax.swing.JLabel jLabel248;
    private javax.swing.JLabel jLabel249;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel250;
    private javax.swing.JLabel jLabel251;
    private javax.swing.JLabel jLabel252;
    private javax.swing.JLabel jLabel253;
    private javax.swing.JLabel jLabel254;
    private javax.swing.JLabel jLabel255;
    private javax.swing.JLabel jLabel256;
    private javax.swing.JLabel jLabel257;
    private javax.swing.JLabel jLabel258;
    private javax.swing.JLabel jLabel259;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel260;
    private javax.swing.JLabel jLabel261;
    private javax.swing.JLabel jLabel262;
    private javax.swing.JLabel jLabel263;
    private javax.swing.JLabel jLabel264;
    private javax.swing.JLabel jLabel265;
    private javax.swing.JLabel jLabel266;
    private javax.swing.JLabel jLabel267;
    private javax.swing.JLabel jLabel268;
    private javax.swing.JLabel jLabel269;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel270;
    private javax.swing.JLabel jLabel271;
    private javax.swing.JLabel jLabel272;
    private javax.swing.JLabel jLabel273;
    private javax.swing.JLabel jLabel274;
    private javax.swing.JLabel jLabel275;
    private javax.swing.JLabel jLabel276;
    private javax.swing.JLabel jLabel277;
    private javax.swing.JLabel jLabel278;
    private javax.swing.JLabel jLabel279;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel280;
    private javax.swing.JLabel jLabel281;
    private javax.swing.JLabel jLabel282;
    private javax.swing.JLabel jLabel283;
    private javax.swing.JLabel jLabel284;
    private javax.swing.JLabel jLabel285;
    private javax.swing.JLabel jLabel286;
    private javax.swing.JLabel jLabel287;
    private javax.swing.JLabel jLabel288;
    private javax.swing.JLabel jLabel289;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel290;
    private javax.swing.JLabel jLabel291;
    private javax.swing.JLabel jLabel292;
    private javax.swing.JLabel jLabel293;
    private javax.swing.JLabel jLabel294;
    private javax.swing.JLabel jLabel295;
    private javax.swing.JLabel jLabel296;
    private javax.swing.JLabel jLabel297;
    private javax.swing.JLabel jLabel298;
    private javax.swing.JLabel jLabel299;
    private javax.swing.JLabel jLabel300;
    private javax.swing.JLabel jLabel301;
    private javax.swing.JLabel jLabel302;
    private javax.swing.JLabel jLabel303;
    private javax.swing.JLabel jLabel304;
    private javax.swing.JLabel jLabel305;
    private javax.swing.JLabel jLabel306;
    private javax.swing.JLabel jLabel307;
    private javax.swing.JLabel jLabel308;
    private javax.swing.JLabel jLabel309;
    private javax.swing.JLabel jLabel310;
    private javax.swing.JLabel jLabel311;
    private javax.swing.JLabel jLabel312;
    private javax.swing.JLabel jLabel313;
    private javax.swing.JLabel jLabel314;
    private javax.swing.JLabel jLabel315;
    private javax.swing.JLabel jLabel316;
    private javax.swing.JLabel jLabel317;
    private javax.swing.JLabel jLabel318;
    private javax.swing.JLabel jLabel319;
    private javax.swing.JLabel jLabel320;
    private javax.swing.JLabel jLabel321;
    private javax.swing.JLabel jLabel322;
    private javax.swing.JLabel jLabel323;
    private javax.swing.JLabel jLabel324;
    private javax.swing.JLabel jLabel325;
    private javax.swing.JLabel jLabel326;
    private javax.swing.JLabel jLabel327;
    private javax.swing.JLabel jLabel328;
    private javax.swing.JLabel jLabel329;
    private javax.swing.JLabel jLabel330;
    private javax.swing.JLabel jLabel331;
    private javax.swing.JLabel jLabel332;
    private javax.swing.JLabel jLabel333;
    private javax.swing.JLabel jLabel334;
    private javax.swing.JLabel jLabel335;
    private javax.swing.JLabel jLabel336;
    private javax.swing.JLabel jLabel337;
    private javax.swing.JLabel jLabel338;
    private javax.swing.JLabel jLabel339;
    private javax.swing.JLabel jLabel340;
    private javax.swing.JLabel jLabel341;
    private javax.swing.JLabel jLabel342;
    private javax.swing.JLabel jLabel343;
    private javax.swing.JLabel jLabel344;
    private javax.swing.JLabel jLabel345;
    private javax.swing.JLabel jLabel346;
    private javax.swing.JLabel jLabel347;
    private javax.swing.JLabel jLabel348;
    private javax.swing.JLabel jLabel349;
    private javax.swing.JLabel jLabel350;
    private javax.swing.JLabel jLabel351;
    private javax.swing.JLabel jLabel352;
    private javax.swing.JLabel jLabel353;
    private javax.swing.JLabel jLabel354;
    private javax.swing.JLabel jLabel355;
    private javax.swing.JLabel jLabel356;
    private javax.swing.JLabel jLabel357;
    private javax.swing.JLabel jLabel358;
    private javax.swing.JLabel jLabel359;
    private javax.swing.JLabel jLabel360;
    private javax.swing.JLabel jLabel361;
    private javax.swing.JLabel jLabel362;
    private javax.swing.JLabel jLabel363;
    private javax.swing.JLabel jLabel364;
    private javax.swing.JLabel jLabel365;
    private javax.swing.JLabel jLabel366;
    private javax.swing.JLabel jLabel367;
    private javax.swing.JLabel jLabel368;
    private javax.swing.JLabel jLabel369;
    private javax.swing.JLabel jLabel370;
    private javax.swing.JLabel jLabel371;
    private javax.swing.JLabel jLabel372;
    private javax.swing.JLabel jLabel373;
    private javax.swing.JLabel jLabel374;
    private javax.swing.JLabel jLabel375;
    private javax.swing.JLabel jLabel376;
    private javax.swing.JLabel jLabel377;
    private javax.swing.JLabel jLabel378;
    private javax.swing.JLabel jLabel379;
    private javax.swing.JLabel jLabel380;
    private javax.swing.JLabel jLabel381;
    private javax.swing.JLabel jLabel382;
    private javax.swing.JLabel jLabel383;
    private javax.swing.JLabel jLabel384;
    private javax.swing.JLabel jLabel385;
    private javax.swing.JLabel jLabel386;
    private javax.swing.JLabel jLabel387;
    private javax.swing.JLabel jLabel388;
    private javax.swing.JLabel jLabel389;
    private javax.swing.JLabel jLabel390;
    private javax.swing.JLabel jLabel391;
    private javax.swing.JLabel jLabel392;
    private javax.swing.JLabel jLabel393;
    private javax.swing.JLabel jLabel394;
    private javax.swing.JLabel jLabel395;
    private javax.swing.JLabel jLabel396;
    private javax.swing.JLabel jLabel397;
    private javax.swing.JLabel jLabel398;
    private javax.swing.JLabel jLabel399;
    private javax.swing.JLabel jLabel400;
    private javax.swing.JLabel jLabel401;
    private javax.swing.JLabel jLabel402;
    private javax.swing.JLabel jLabel403;
    private javax.swing.JLabel jLabel404;
    private javax.swing.JLabel jLabel405;
    private javax.swing.JLabel jLabel406;
    private javax.swing.JLabel jLabel407;
    private javax.swing.JLabel jLabel408;
    private javax.swing.JLabel jLabel409;
    private javax.swing.JLabel jLabel410;
    private javax.swing.JLabel jLabel411;
    private javax.swing.JLabel jLabel412;
    private javax.swing.JLabel jLabel413;
    private javax.swing.JLabel jLabel414;
    private javax.swing.JLabel jLabel415;
    private javax.swing.JLabel jLabel416;
    private javax.swing.JLabel jLabel417;
    private javax.swing.JLabel jLabel418;
    private javax.swing.JLabel jLabel419;
    private javax.swing.JLabel jLabel420;
    private javax.swing.JLabel jLabel421;
    private javax.swing.JLabel jLabel422;
    private javax.swing.JLabel jLabel423;
    private javax.swing.JLabel jLabel424;
    private javax.swing.JLabel jLabel425;
    private javax.swing.JLabel jLabel426;
    private javax.swing.JLabel jLabel427;
    private javax.swing.JLabel jLabel428;
    private javax.swing.JLabel jLabel429;
    private javax.swing.JLabel jLabel430;
    private javax.swing.JLabel jLabel431;
    private javax.swing.JLabel jLabel432;
    private javax.swing.JLabel jLabel433;
    private javax.swing.JLabel jLabel434;
    private javax.swing.JLabel jLabel435;
    private javax.swing.JLabel jLabel436;
    private javax.swing.JLabel jLabel437;
    private javax.swing.JLabel jLabel438;
    private javax.swing.JLabel jLabel439;
    private javax.swing.JLabel jLabel440;
    private javax.swing.JLabel jLabel441;
    private javax.swing.JLabel jLabel442;
    private javax.swing.JLabel jLabel443;
    private javax.swing.JLabel jLabel444;
    private javax.swing.JLabel jLabel445;
    private javax.swing.JLabel jLabel446;
    private javax.swing.JLabel jLabel447;
    private javax.swing.JLabel jLabel448;
    private javax.swing.JLabel jLabel449;
    private javax.swing.JLabel jLabel450;
    private javax.swing.JLabel jLabel451;
    private javax.swing.JLabel jLabel452;
    private javax.swing.JLabel jLabel453;
    private javax.swing.JLabel jLabel454;
    private javax.swing.JLabel jLabel455;
    private javax.swing.JLabel jLabel456;
    private javax.swing.JLabel jLabel457;
    private javax.swing.JLabel jLabel458;
    private javax.swing.JLabel jLabel459;
    private javax.swing.JLabel jLabel460;
    private javax.swing.JLabel jLabel461;
    private javax.swing.JLabel jLabel462;
    private javax.swing.JLabel jLabel463;
    private javax.swing.JLabel jLabel464;
    private javax.swing.JLabel jLabel465;
    private javax.swing.JLabel jLabel466;
    private javax.swing.JLabel jLabel467;
    private javax.swing.JLabel jLabel468;
    private javax.swing.JLabel jLabel469;
    private javax.swing.JLabel jLabel470;
    private javax.swing.JLabel jLabel471;
    private javax.swing.JLabel jLabel472;
    private javax.swing.JLabel jLabel473;
    private javax.swing.JLabel jLabel474;
    private javax.swing.JLabel jLabel475;
    private javax.swing.JLabel jLabel476;
    private javax.swing.JLabel jLabel477;
    private javax.swing.JLabel jLabel478;
    private javax.swing.JLabel jLabel479;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel juicemenupannel1;
    private javax.swing.JPanel juicemenupannel2;
    private javax.swing.JPanel juicemenupannel3;
    private javax.swing.JPanel juicemenupannel4;
    private javax.swing.JPanel juicemenupannel5;
    private javax.swing.JPanel juicemenupannel6;
    private javax.swing.JButton logoutbtn;
    private javax.swing.JPanel mainoannel;
    private javax.swing.JButton manageemployeebtn;
    private javax.swing.JButton manageitemsbtn;
    private javax.swing.JButton menubtn;
    private javax.swing.JPanel menuitemsdash;
    private javax.swing.JLabel milkshakedescription1;
    private javax.swing.JLabel milkshakedescription10;
    private javax.swing.JLabel milkshakedescription11;
    private javax.swing.JLabel milkshakedescription12;
    private javax.swing.JLabel milkshakedescription2;
    private javax.swing.JLabel milkshakedescription3;
    private javax.swing.JLabel milkshakedescription4;
    private javax.swing.JLabel milkshakedescription5;
    private javax.swing.JLabel milkshakedescription6;
    private javax.swing.JLabel milkshakedescription7;
    private javax.swing.JLabel milkshakedescription8;
    private javax.swing.JLabel milkshakedescription9;
    private javax.swing.JLabel milkshakename1;
    private javax.swing.JLabel milkshakename10;
    private javax.swing.JLabel milkshakename11;
    private javax.swing.JLabel milkshakename12;
    private javax.swing.JLabel milkshakename2;
    private javax.swing.JLabel milkshakename3;
    private javax.swing.JLabel milkshakename4;
    private javax.swing.JLabel milkshakename5;
    private javax.swing.JLabel milkshakename6;
    private javax.swing.JLabel milkshakename7;
    private javax.swing.JLabel milkshakename8;
    private javax.swing.JLabel milkshakename9;
    private javax.swing.JLabel milkshakeprice1;
    private javax.swing.JLabel milkshakeprice10;
    private javax.swing.JLabel milkshakeprice11;
    private javax.swing.JLabel milkshakeprice12;
    private javax.swing.JLabel milkshakeprice2;
    private javax.swing.JLabel milkshakeprice3;
    private javax.swing.JLabel milkshakeprice4;
    private javax.swing.JLabel milkshakeprice5;
    private javax.swing.JLabel milkshakeprice6;
    private javax.swing.JLabel milkshakeprice7;
    private javax.swing.JLabel milkshakeprice8;
    private javax.swing.JLabel milkshakeprice9;
    private javax.swing.JLabel milkshakepto1;
    private javax.swing.JLabel milkshakepto10;
    private javax.swing.JLabel milkshakepto11;
    private javax.swing.JLabel milkshakepto12;
    private javax.swing.JLabel milkshakepto2;
    private javax.swing.JLabel milkshakepto3;
    private javax.swing.JLabel milkshakepto4;
    private javax.swing.JLabel milkshakepto5;
    private javax.swing.JLabel milkshakepto6;
    private javax.swing.JLabel milkshakepto7;
    private javax.swing.JLabel milkshakepto8;
    private javax.swing.JLabel milkshakepto9;
    private javax.swing.JPanel milkshakespannel1;
    private javax.swing.JPanel milkshakespannel2;
    private javax.swing.JPanel milkshakespannel3;
    private javax.swing.JPanel milkshakespannel4;
    private javax.swing.JLabel milkshakesupplier1;
    private javax.swing.JLabel milkshakesupplier10;
    private javax.swing.JLabel milkshakesupplier11;
    private javax.swing.JLabel milkshakesupplier12;
    private javax.swing.JLabel milkshakesupplier2;
    private javax.swing.JLabel milkshakesupplier3;
    private javax.swing.JLabel milkshakesupplier4;
    private javax.swing.JLabel milkshakesupplier5;
    private javax.swing.JLabel milkshakesupplier6;
    private javax.swing.JLabel milkshakesupplier7;
    private javax.swing.JLabel milkshakesupplier8;
    private javax.swing.JLabel milkshakesupplier9;
    private javax.swing.JLabel milkshaketype1;
    private javax.swing.JLabel milkshaketype10;
    private javax.swing.JLabel milkshaketype11;
    private javax.swing.JLabel milkshaketype12;
    private javax.swing.JLabel milkshaketype2;
    private javax.swing.JLabel milkshaketype3;
    private javax.swing.JLabel milkshaketype4;
    private javax.swing.JLabel milkshaketype5;
    private javax.swing.JLabel milkshaketype6;
    private javax.swing.JLabel milkshaketype7;
    private javax.swing.JLabel milkshaketype8;
    private javax.swing.JLabel milkshaketype9;
    private javax.swing.JLabel name21;
    private javax.swing.JLabel name22;
    private javax.swing.JLabel name23;
    private javax.swing.JButton nextbtn10;
    private javax.swing.JButton nextbtn11;
    private javax.swing.JButton nextbtn13;
    private javax.swing.JButton nextbtn14;
    private javax.swing.JButton nextbtn15;
    private javax.swing.JButton nextbtn17;
    private javax.swing.JButton nextbtn18;
    private javax.swing.JButton nextbtn19;
    private javax.swing.JButton nextbtn2;
    private javax.swing.JButton nextbtn4;
    private javax.swing.JButton nextbtn5;
    private javax.swing.JButton nextbtn6;
    private javax.swing.JButton nextbtn7;
    private javax.swing.JButton nextbtn8;
    private javax.swing.JButton nextbtn9;
    private javax.swing.JButton paymentreportbtn;
    private javax.swing.JLabel pdescription1;
    private javax.swing.JLabel pdescription10;
    private javax.swing.JLabel pdescription11;
    private javax.swing.JLabel pdescription12;
    private javax.swing.JLabel pdescription13;
    private javax.swing.JLabel pdescription14;
    private javax.swing.JLabel pdescription15;
    private javax.swing.JLabel pdescription16;
    private javax.swing.JLabel pdescription17;
    private javax.swing.JLabel pdescription18;
    private javax.swing.JLabel pdescription2;
    private javax.swing.JLabel pdescription3;
    private javax.swing.JLabel pdescription4;
    private javax.swing.JLabel pdescription5;
    private javax.swing.JLabel pdescription6;
    private javax.swing.JLabel pdescription7;
    private javax.swing.JLabel pdescription8;
    private javax.swing.JLabel pdescription9;
    private javax.swing.JLabel phoneno21;
    private javax.swing.JLabel phoneno22;
    private javax.swing.JLabel phoneno23;
    private javax.swing.JLabel pname1;
    private javax.swing.JLabel pname10;
    private javax.swing.JLabel pname11;
    private javax.swing.JLabel pname12;
    private javax.swing.JLabel pname13;
    private javax.swing.JLabel pname14;
    private javax.swing.JLabel pname15;
    private javax.swing.JLabel pname16;
    private javax.swing.JLabel pname17;
    private javax.swing.JLabel pname18;
    private javax.swing.JLabel pname2;
    private javax.swing.JLabel pname3;
    private javax.swing.JLabel pname4;
    private javax.swing.JLabel pname5;
    private javax.swing.JLabel pname6;
    private javax.swing.JLabel pname7;
    private javax.swing.JLabel pname8;
    private javax.swing.JLabel pname9;
    private javax.swing.JLabel pphoto1;
    private javax.swing.JLabel pphoto10;
    private javax.swing.JLabel pphoto11;
    private javax.swing.JLabel pphoto12;
    private javax.swing.JLabel pphoto13;
    private javax.swing.JLabel pphoto14;
    private javax.swing.JLabel pphoto15;
    private javax.swing.JLabel pphoto16;
    private javax.swing.JLabel pphoto17;
    private javax.swing.JLabel pphoto18;
    private javax.swing.JLabel pphoto2;
    private javax.swing.JLabel pphoto3;
    private javax.swing.JLabel pphoto4;
    private javax.swing.JLabel pphoto5;
    private javax.swing.JLabel pphoto6;
    private javax.swing.JLabel pphoto7;
    private javax.swing.JLabel pphoto8;
    private javax.swing.JLabel pphoto9;
    private javax.swing.JLabel pprice1;
    private javax.swing.JLabel pprice10;
    private javax.swing.JLabel pprice11;
    private javax.swing.JLabel pprice12;
    private javax.swing.JLabel pprice13;
    private javax.swing.JLabel pprice14;
    private javax.swing.JLabel pprice15;
    private javax.swing.JLabel pprice16;
    private javax.swing.JLabel pprice17;
    private javax.swing.JLabel pprice18;
    private javax.swing.JLabel pprice2;
    private javax.swing.JLabel pprice3;
    private javax.swing.JLabel pprice4;
    private javax.swing.JLabel pprice5;
    private javax.swing.JLabel pprice6;
    private javax.swing.JLabel pprice7;
    private javax.swing.JLabel pprice8;
    private javax.swing.JLabel pprice9;
    private javax.swing.JLabel productpto1;
    private javax.swing.JLabel psupplier1;
    private javax.swing.JLabel psupplier10;
    private javax.swing.JLabel psupplier11;
    private javax.swing.JLabel psupplier12;
    private javax.swing.JLabel psupplier13;
    private javax.swing.JLabel psupplier14;
    private javax.swing.JLabel psupplier15;
    private javax.swing.JLabel psupplier16;
    private javax.swing.JLabel psupplier17;
    private javax.swing.JLabel psupplier18;
    private javax.swing.JLabel psupplier2;
    private javax.swing.JLabel psupplier3;
    private javax.swing.JLabel psupplier4;
    private javax.swing.JLabel psupplier5;
    private javax.swing.JLabel psupplier6;
    private javax.swing.JLabel psupplier7;
    private javax.swing.JLabel psupplier8;
    private javax.swing.JLabel psupplier9;
    private javax.swing.JLabel ptype1;
    private javax.swing.JLabel ptype10;
    private javax.swing.JLabel ptype11;
    private javax.swing.JLabel ptype12;
    private javax.swing.JLabel ptype13;
    private javax.swing.JLabel ptype14;
    private javax.swing.JLabel ptype15;
    private javax.swing.JLabel ptype16;
    private javax.swing.JLabel ptype17;
    private javax.swing.JLabel ptype18;
    private javax.swing.JLabel ptype2;
    private javax.swing.JLabel ptype3;
    private javax.swing.JLabel ptype4;
    private javax.swing.JLabel ptype5;
    private javax.swing.JLabel ptype6;
    private javax.swing.JLabel ptype7;
    private javax.swing.JLabel ptype8;
    private javax.swing.JLabel ptype9;
    private javax.swing.JPanel smootheepannel1;
    private javax.swing.JPanel smootheepannel2;
    private javax.swing.JPanel smootheepannel3;
    private javax.swing.JPanel smootheepannel4;
    private javax.swing.JLabel smoothiedescription1;
    private javax.swing.JLabel smoothiedescription10;
    private javax.swing.JLabel smoothiedescription11;
    private javax.swing.JLabel smoothiedescription12;
    private javax.swing.JLabel smoothiedescription2;
    private javax.swing.JLabel smoothiedescription3;
    private javax.swing.JLabel smoothiedescription4;
    private javax.swing.JLabel smoothiedescription5;
    private javax.swing.JLabel smoothiedescription6;
    private javax.swing.JLabel smoothiedescription7;
    private javax.swing.JLabel smoothiedescription8;
    private javax.swing.JLabel smoothiedescription9;
    private javax.swing.JLabel smoothiename1;
    private javax.swing.JLabel smoothiename10;
    private javax.swing.JLabel smoothiename11;
    private javax.swing.JLabel smoothiename12;
    private javax.swing.JLabel smoothiename2;
    private javax.swing.JLabel smoothiename3;
    private javax.swing.JLabel smoothiename4;
    private javax.swing.JLabel smoothiename5;
    private javax.swing.JLabel smoothiename6;
    private javax.swing.JLabel smoothiename7;
    private javax.swing.JLabel smoothiename8;
    private javax.swing.JLabel smoothiename9;
    private javax.swing.JLabel smoothiephoto1;
    private javax.swing.JLabel smoothiephoto10;
    private javax.swing.JLabel smoothiephoto11;
    private javax.swing.JLabel smoothiephoto12;
    private javax.swing.JLabel smoothiephoto2;
    private javax.swing.JLabel smoothiephoto3;
    private javax.swing.JLabel smoothiephoto4;
    private javax.swing.JLabel smoothiephoto5;
    private javax.swing.JLabel smoothiephoto6;
    private javax.swing.JLabel smoothiephoto7;
    private javax.swing.JLabel smoothiephoto8;
    private javax.swing.JLabel smoothiephoto9;
    private javax.swing.JLabel smoothieprice1;
    private javax.swing.JLabel smoothieprice10;
    private javax.swing.JLabel smoothieprice11;
    private javax.swing.JLabel smoothieprice12;
    private javax.swing.JLabel smoothieprice2;
    private javax.swing.JLabel smoothieprice3;
    private javax.swing.JLabel smoothieprice4;
    private javax.swing.JLabel smoothieprice5;
    private javax.swing.JLabel smoothieprice6;
    private javax.swing.JLabel smoothieprice7;
    private javax.swing.JLabel smoothieprice8;
    private javax.swing.JLabel smoothieprice9;
    private javax.swing.JLabel smoothiesupplyer1;
    private javax.swing.JLabel smoothiesupplyer10;
    private javax.swing.JLabel smoothiesupplyer11;
    private javax.swing.JLabel smoothiesupplyer12;
    private javax.swing.JLabel smoothiesupplyer2;
    private javax.swing.JLabel smoothiesupplyer3;
    private javax.swing.JLabel smoothiesupplyer4;
    private javax.swing.JLabel smoothiesupplyer5;
    private javax.swing.JLabel smoothiesupplyer6;
    private javax.swing.JLabel smoothiesupplyer7;
    private javax.swing.JLabel smoothiesupplyer8;
    private javax.swing.JLabel smoothiesupplyer9;
    private javax.swing.JLabel smoothietype1;
    private javax.swing.JLabel smoothietype10;
    private javax.swing.JLabel smoothietype11;
    private javax.swing.JLabel smoothietype12;
    private javax.swing.JLabel smoothietype2;
    private javax.swing.JLabel smoothietype3;
    private javax.swing.JLabel smoothietype4;
    private javax.swing.JLabel smoothietype5;
    private javax.swing.JLabel smoothietype6;
    private javax.swing.JLabel smoothietype7;
    private javax.swing.JLabel smoothietype8;
    private javax.swing.JLabel smoothietype9;
    private javax.swing.JButton updatebtn;
    private javax.swing.JButton updatebtn1;
    private javax.swing.JButton updatebtn2;
    private javax.swing.JButton updatebtn3;
    // End of variables declaration//GEN-END:variables
}
