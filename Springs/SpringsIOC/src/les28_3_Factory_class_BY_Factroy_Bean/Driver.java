
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package les28_3_Factory_class_BY_Factroy_Bean;


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
         ApplicationContext ap=new ClassPathXmlApplicationContext("les28_3_Factory_class_BY_Factroy_Bean/di.xml");
   Car c=(Car)ap.getBean("m");
  

   c.drive();
    }
    
}
