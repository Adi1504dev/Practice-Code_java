/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package les27Singleton_class_objectCreation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Aditya
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)   {
        ApplicationContext ap=new ClassPathXmlApplicationContext("les27Singleton_class_objectCreation/di.xml");
    /*Calendar c=(Calendar)ap.getBean("c");*///java.lang.InstantiationException as private constructor throw exception
       Test t1=(Test)ap.getBean("k");
        Test t2=(Test)ap.getBean("k");
       System.out.println(t1==t2);
       t1.show(); 
 //Test t3=new Test();
       Calendar c=(Calendar) ap.getBean("c");
    System.out.println(c.getCalendarType());
    System.out.println(c.getTime());
    }
    
}
