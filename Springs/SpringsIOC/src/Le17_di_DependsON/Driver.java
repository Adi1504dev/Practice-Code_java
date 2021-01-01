/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Le17_di_DependsON;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Aditya
 */
public class Driver 
{
public static void main(String []a)
{
      //How the Object created by Advanced contariner without Ioc container
    System.out.println("How the Object created by Advanced contariner without Ioc container");
    ApplicationContext ap=new ClassPathXmlApplicationContext("Le17_di_DependsON/di.xml");
    System.out.println();
    System.out.println("-------------------------------------------------------------------");
    System.out.println("-------------------------------------------------------------------");
     System.out.println(); 
    System.out.println("How the Object created by Advanced contariner BY Ioc container");
    ApplicationContext ap1=new ClassPathXmlApplicationContext("Le17_di_DependsON/di1.xml");   
 System.out.println();
    System.out.println("-------------------------------------------------------------------");
    System.out.println("-------------------------------------------------------------------");
     System.out.println(); 
    /*System.out.println("\n"+"Mutual Dependeny not allowed with depends-on");
   ApplicationContext ap2=new ClassPathXmlApplicationContext("Le17_di_DependsON/di2.xml"); 
*/}
}
