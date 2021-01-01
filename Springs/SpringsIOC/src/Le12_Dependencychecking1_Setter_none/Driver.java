/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Le12_Dependencychecking1_Setter_none;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Aditya
 */
public class Driver {

    
    public static void main(String[] args) 
    {
    ApplicationContext ap=new ClassPathXmlApplicationContext("Le12_Dependencychecking1_Setter_none/di.xml");
    /*Niche ki dono line ko comment kero to get proper result*/
//car c=(car)ap.getBean("T");
  //  c.print();  
    }
    
}
