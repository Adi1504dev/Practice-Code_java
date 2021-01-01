/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package les28_1_Singleton_Object_Static_Factory_Class;

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
         ApplicationContext ap=new ClassPathXmlApplicationContext("les28_1_Singleton_Object_Static_Factory_Class/di.xml");
   Car c=(Car)ap.getBean("k");
   c.drive();
   Car_Factory f=new Car_Factory();
   Car g=f.createObject("Audi");
   g.drive();
    }
    
}
