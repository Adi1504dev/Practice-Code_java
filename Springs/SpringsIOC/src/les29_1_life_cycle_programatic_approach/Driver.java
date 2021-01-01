/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package les29_1_life_cycle_programatic_approach;


import org.springframework.context.ConfigurableApplicationContext;
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
        //important ConfigurableApplicationContext
   ConfigurableApplicationContext ap=new ClassPathXmlApplicationContext("les29_1_life_cycle_programatic_approach/di.xml"); 
   pojo p=(pojo)ap.getBean("j");
   p.use("Aditya Singh");
   p.use("Anubhav Katiyar");
   p.use("Yash Jain");
   ap.close();//closing the bean container 
   //ye facility sirf ConfigurableApplicationContext ke sath available hai ApplicationContext
   //ke sath ye facility available nai hai

    }
    
}
