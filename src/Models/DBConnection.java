/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gerges hanna FCI-H
 */
public class DBConnection {
    private static String URL = "jdbc:sqlserver://localhost:1433;databaseName=pharmacy;user=admin;password=admin1;";
    Connection con=null;
    public void makeConnection()
    {
        try { 
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(URL); 
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    //insertEmployee("Mark",5332,"10/10/2015")
    public void insertEmployee(String Name,double salary,String DB) {  
        String sql = "INSERT INTO Employee(EmName,salary,DB) VALUES(?,?,?)";  
   
        try{  
            makeConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);  
            pstmt.setString(1, Name);  
            pstmt.setDouble(2, salary);  
            pstmt.setString(3, DB);  
            pstmt.executeUpdate();  
            con.close();
            System.out.println("success");
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        } 
        
    }
    public void insertLogin(int ID,String Email,String Password) {  
        String sql = "INSERT INTO Login(ID,Email,Login_Password) VALUES(?,?,?)";  
   
        try{  
            makeConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);  
            pstmt.setInt(1, ID);  
            pstmt.setString(2, Email+"");  
            pstmt.setString(3, Password);  
            pstmt.executeUpdate();  
            con.close();
            System.out.println("success");
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        } 
        
    }
    public void insertPhone(int ID,String phone) {  
        String sql = "INSERT INTO phone(ID,phoneNumber) VALUES(?,?)";  
   
        try{  
            makeConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);  
            pstmt.setInt(1, ID);  
            pstmt.setString(2, phone);  
            pstmt.executeUpdate();  
            con.close();
            System.out.println("success");
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        } 
        
    }
    public void insertMedicine(String parcode,String Med_Name,double price
            ,double retail,int quantity,String Expire) {  
        String sql = "INSERT INTO Medicine(Parcode,Med_Name,price,Retail,Quantity,Expire) VALUES(?,?,?,?,?,?)";  
   
        try{  
            makeConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);  
            pstmt.setString(1, parcode);  
            pstmt.setString(2, Med_Name);  
            pstmt.setDouble(3, price);
            pstmt.setDouble(4, retail);
            pstmt.setInt(5, quantity);
            pstmt.setString(6, Expire);
            pstmt.executeUpdate();  
            con.close();
            System.out.println("success");
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        } 
        
    }
    
    public void insertSellReview(String parcode,String Med_Name,double price
            ,double retail,int quantity
            ,int Emp_ID,String Sell_Date,String sell_Time,int ID_Med) {  
        String sql = "INSERT INTO SellReview(Parcode,Med_Name,price,Retail,Quantity,Emp_ID,Sell_Date,sell_Time,ID_Med) VALUES(?,?,?,?,?,?,?,?,?)";  
   
        try{  
            makeConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);  
            pstmt.setString(1, parcode);  
            pstmt.setString(2, Med_Name);  
            pstmt.setDouble(3, price);
            pstmt.setDouble(4, retail);
            pstmt.setInt(5, quantity);
            pstmt.setInt(6, Emp_ID);
            pstmt.setString(7, Sell_Date);  
            pstmt.setString(8, sell_Time);
            pstmt.setInt(9, ID_Med);
            pstmt.executeUpdate();  
            con.close();
            System.out.println("success");
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        } 
    }
    
    
    public void deleteRow(String tableName,String where){
        String sql="DELETE FROM "+tableName+" WHERE "+where;
        try {
            makeConnection();
            Statement st=con.createStatement();
            st.executeUpdate(sql);
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void select(String tableName,String where){  
        String sql = "SELECT * FROM "+tableName;
        String sql2 = "SELECT * FROM "+tableName+" where "+where;
          
        try {  
            makeConnection();
            Statement stmt  = con.createStatement();  
            ResultSet rs;
            if(where.trim().equalsIgnoreCase("") )
                rs=stmt.executeQuery(sql); 
            else
                rs=stmt.executeQuery(sql2);
              
            // loop through the result set  
            if(tableName.equalsIgnoreCase("Employee"))
            {
                while (rs.next()) { 
                    EmployeeModel e=new EmployeeModel(rs.getInt("ID"), rs.getString("EmName"), rs.getDouble("salary"), rs.getString("DB"));
                    EmployeeModel.listEmployee.add(e);
                }
            }else if(tableName.equalsIgnoreCase("Login"))
            {
                while (rs.next()) {
                    EmployeeModel e=new EmployeeModel(rs.getInt("ID")
                            ,rs.getString("Email"), rs.getString("Login_Password"));  
                    EmployeeModel.listLogin.add(e);
                }
            }else if(tableName.equalsIgnoreCase("phone"))
            {
                
                while (rs.next()) {  
                    EmployeeModel e=new EmployeeModel(rs.getInt("ID"), rs.getString("phoneNumber"));
                    EmployeeModel.listPhone.add(e);
                }
            }else if(tableName.equalsIgnoreCase("Medicine"))
            {
                while (rs.next()) { 
                     MedicineModel m=new MedicineModel(rs.getInt("ID"),rs.getString("Parcode")
                       ,rs.getString("Med_name"),rs.getDouble("Price")
                       ,rs.getDouble("Retail"),rs.getInt("Quantity")
                       ,rs.getString("Expire"));
                    MedicineModel.dataofmedicine.add(m);
                
                }
            }else if(tableName.equalsIgnoreCase("SellReview"))
            {
                while (rs.next()) {
                    ReviewModel r=new ReviewModel(rs.getInt("Op_ID")
                            ,rs.getString("Parcode"),rs.getString("Med_name")
                            ,rs.getDouble("Price"),rs.getDouble("Retail"),   
                             rs.getInt("Quantity")
                            ,rs.getInt("Emp_ID"),rs.getString("Sell_Date")
                            ,rs.getString("sell_Time"),rs.getInt("ID_Med"));
                    ReviewModel.listReview.add(r);
                    
      
                                           
                }
            }
                
            
            con.close();
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
    }  
    public int Update(String tableName,String set,String where){
        String sql="UPDATE "+tableName+" set "+set+" where "+where;
        try {
            makeConnection();
            Statement st=con.createStatement();
            st.executeUpdate(sql);
            con.close();
            return 1;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
    
}
