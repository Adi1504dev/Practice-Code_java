/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package les28_2_Factroy_class_Instance;


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
    public static void main(String[] args) throws Exception {
         ApplicationContext ap=new ClassPathXmlApplicationContext("les28_2_Factroy_class_Instance/di.xml");
   Car c=(Car)ap.getBean("m");
   c.drive();
   // Car_Factory cf=Car_Factory.createObject("Swift");
   Car c1=(Car)Car_Factory.createObject("Swift");
   c1.drive();
    }
    
}
