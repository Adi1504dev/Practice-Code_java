/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Aditya
 */
public class dao implements daoInterface{

    private DataSource d;
    public void setDataSource(DataSource s)
    {
        d=s;
    }
    public boolean insert(model m) throws Exception
    {boolean j;
    Connection conn=d.getConnection();
         String query="Insert into stu_in values(?,?,?)";
         PreparedStatement s=(PreparedStatement) conn.prepareStatement(query);
 s.setInt(1, 5);
 s.setString(2, m.name);
 s.setString(3, m.subject);
 int count=s.executeUpdate();
 if (count==0)
     j=false;
 else
     j=true;
        s.close();
        conn.close();
   return j; 
    }

    public model get() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
}
class daomain
{
     public static void main(String []a) throws Exception
    {ApplicationContext b=new ClassPathXmlApplicationContext("Springdao/file.xml");
        dao d=(dao)b.getBean("T2");
        model s=new model();
        s.name="Aditya";
        s.subject="Computer";
        boolean k=d.insert(s);
        if(k)
        {
            System.out.println("Data Inserted");
            
        }
        else
            System.out.println("Data not Inserted");
    }
}