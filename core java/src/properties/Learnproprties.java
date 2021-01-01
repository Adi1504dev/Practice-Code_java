/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package properties;

import java.io.FileReader;
import java.util.Properties;

/**
 *
 * @author Aditya
 */
public class Learnproprties {
    public static void main(String []args)
    {String name=null,clas=null,Section=null;
        try
        {
            FileReader fr=new FileReader("C:\\Users\\Aditya\\Documents\\NetBeansProjects\\core java\\src\\properties\\learn.properties");
             Properties p=new Properties();
             p.load(fr);
              name=p.getProperty("db.name");
                  clas=p.getProperty("db.clas");
                       Section=p.getProperty("db.section");   }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("Name :"+name);
         System.out.println("CLass :"+clas);
          System.out.println("Section :"+Section);
    }
    
}
