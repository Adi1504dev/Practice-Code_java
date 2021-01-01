/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package les20_Autowiring.bytest;

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
        ApplicationContext ap=new ClassPathXmlApplicationContext("les20_Autowiring/bytest/di.xml");
        car c=(car)ap.getBean("t");
        c.print();
    }
    
}
