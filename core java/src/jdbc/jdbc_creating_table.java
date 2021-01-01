/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.*;
import java.sql.DriverManager;

/**
 *
 * @author ADITYA
 */
public class jdbc_creating_table {
    public static void main(String []a) throws Exception
    {
    Class.forName("com.mysql.jdbc.Driver");
     Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pratice","root", "12345");
    //creating table 
         PreparedStatement p2=conn.prepareStatement("create table student1(id int(50),name varchar(50))");
          p2.executeUpdate();
     conn.close();
    p2.close();
}

}