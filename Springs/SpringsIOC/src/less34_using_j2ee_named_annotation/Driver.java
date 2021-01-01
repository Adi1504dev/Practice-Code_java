/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package less34_using_j2ee_named_annotation;


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
 ApplicationContext ap=new ClassPathXmlApplicationContext("less34_using_j2ee_named_annotation/di.xml");
       car c=(car)ap.getBean(car.class);
       c.printdata();
      
    }
    
}
