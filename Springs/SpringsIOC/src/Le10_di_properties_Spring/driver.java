/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Le10_di_properties_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Aditya
 */
public class driver
{
public static void main(String []a)
{
    //Method 1 
    //Without using properties file
     /* ApplicationContext ap=new ClassPathXmlApplicationContext("Le10_di_properties_Spring/di.xml");
    pojo c=(pojo)ap.getBean("t");
    c.print();
     */
    //
    //Method 2 
    //By using properties file
      ApplicationContext ap=new ClassPathXmlApplicationContext("Le10_di_properties_Spring/di1.xml");
    pojo c=(pojo)ap.getBean("t");
    c.print();
     
}
}
