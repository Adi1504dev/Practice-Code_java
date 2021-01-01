/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.*;
;

/**
 *
 * @author ADITYA
 */
public class jdbc_getting_single_value {
    public static void main(String []a) throws Exception
    {
    Class.forName("com.mysql.jdbc.Driver");
     Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pratice","root", "12345");
    /*//creating table  
     PreparedStatement p2=conn.prepareStatement("create table student(id int(50),name varchar(50))");
          p2.executeUpdate();*/
         //creating table in database
         Statement s=conn.createStatement();
         ResultSet r=s.executeQuery("Select name from student where id=2");
         r.next();
        System.out.println(r.getString("name"));
        s.close();
        conn.close();
    }
}
