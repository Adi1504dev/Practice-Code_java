/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package les26_DI_Staticmethod;

import org.springframework.beans.factory.config.MethodInvokingFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Aditya
 */
public class Driver {

   
    public static void main(String[] args) {
 ApplicationContext ap=new ClassPathXmlApplicationContext("les26_DI_Staticmethod/di.xml");
        Car c=(Car)ap.getBean("t");
        c.print();
        
        
    }
    
}
