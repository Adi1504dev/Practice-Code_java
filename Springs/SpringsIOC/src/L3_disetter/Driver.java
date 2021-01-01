/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L3_disetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Aditya
 */
public class Driver {
    public static void main(String []args)
    {
        ApplicationContext ap=new ClassPathXmlApplicationContext("L3_disetter/disetter.xml");

 pojo p=(pojo)ap.getBean("t");
 p.printdata();
    }
    
}
