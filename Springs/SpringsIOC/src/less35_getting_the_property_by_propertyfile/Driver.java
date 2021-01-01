/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package less35_getting_the_property_by_propertyfile;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Aditya
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    ApplicationContext ap=new ClassPathXmlApplicationContext("less35_getting_the_property_by_propertyfile/di.xml");
  CP c=(CP)ap.getBean("t");
    System.out.println("Driver ="+c.driver);
     System.out.println("Location ="+c.location);
      System.out.println("Username ="+c.username);
       System.out.println("PAssword ="+c.password);
           
    }
    
}
