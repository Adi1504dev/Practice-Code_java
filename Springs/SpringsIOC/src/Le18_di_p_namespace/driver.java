/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Le18_di_p_namespace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Aditya
 */
public class driver {

    public static void main(String[] args) {
        ApplicationContext ap=new ClassPathXmlApplicationContext("Le18_di_p_namespace/di.xml");
        car c=(car)ap.getBean("t1");
        c.print();
    }
    
}
