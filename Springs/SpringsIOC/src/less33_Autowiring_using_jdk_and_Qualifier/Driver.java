/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package less33_Autowiring_using_jdk_and_Qualifier;


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
 ApplicationContext ap=new ClassPathXmlApplicationContext("less33_Autowiring_using_jdk_and_Qualifier/di.xml");
       car c=(car)ap.getBean("c");
       c.printdata();
      
    }
    
}
