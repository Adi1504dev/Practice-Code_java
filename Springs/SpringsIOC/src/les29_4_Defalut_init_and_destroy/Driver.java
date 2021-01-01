/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package les29_4_Defalut_init_and_destroy;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Aditya
 */
public class Driver {

    
   
       public static void main(String[] args) {
   ConfigurableApplicationContext ap=new ClassPathXmlApplicationContext("les29_4_Defalut_init_and_destroy/di.xml"); 
pojo p=(pojo)ap.getBean("j");
   p.use("Aditya Singh");
   p.use("Anubhav Katiyar");
   p.use("Yash Jain");
   ap.close();
    }
    }
    

