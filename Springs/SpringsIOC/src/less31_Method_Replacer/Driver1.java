/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package less31_Method_Replacer;
import les29_4_Defalut_init_and_destroy.pojo;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Aditya
 */
public class Driver1 {

    
   
       public static void main(String[] args) {
   ConfigurableApplicationContext ap=new ClassPathXmlApplicationContext("less31_Method_Replacer/di.xml"); 
bank b=(bank)ap.getBean("e");
b.deposit();
b.intrest(10,"%");
b.withdraw();
    }
    }
    

