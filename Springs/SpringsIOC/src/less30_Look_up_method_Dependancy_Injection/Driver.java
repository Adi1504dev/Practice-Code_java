/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package less30_Look_up_method_Dependancy_Injection;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Aditya
 */
public class Driver {

    public static void main(String[] args) {
        ConfigurableApplicationContext ap=new ClassPathXmlApplicationContext("less30_Look_up_method_Dependancy_Injection/di.xml"); 
  System.out.println("\n\n\n\n\n-----------------CAR--------------------");
        car c=(car)ap.getBean("c");
             System.out.println("Runtime created class name   :"+c.getClass().getCanonicalName());
        System.out.println(c.mycarengine().enginename);
   
  System.out.println("\n\n\n\n\n-----------------BUS--------------------");
        Bus b=(Bus)ap.getBean("b");
             System.out.println("Runtime created class name   :"+b.getClass().getCanonicalName());
        System.out.println(b.mybusengine().enginename);
        System.out.println("\n\n\n\n\n-----------------TRUCK--------------------");
        truck t=(truck)ap.getBean("t");
             System.out.println("Runtime created class name   :"+t.getClass().getCanonicalName());
        System.out.println(t.mytruckengine().enginename);
    }
    
}
