/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ADITYA
 */
public class jdbc_inserting_values 
{
public static void main(String []a) throws Exception
    {
    Class.forName("com.mysql.jdbc.Driver");
     Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pratice","root", "12345");
    /*//creating table  
     PreparedStatement p2=conn.prepareStatement("create table student(id int(50),name varchar(50))");
          p2.executeUpdate();*/
         //creating table in database
         String query="Insert into student values(?,?)";
         PreparedStatement s=conn.prepareStatement(query);
 s.setInt(1, 5);
 s.setString(2, "sabse_");
 int count=s.executeUpdate();
        s.close();
        conn.close();
    }    
}
