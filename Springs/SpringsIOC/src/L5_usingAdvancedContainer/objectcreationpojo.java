/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L5_usingAdvancedContainer;

import java.util.Locale;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Aditya
 */
public class objectcreationpojo 
{
    objectcreationpojo()
    {
       System.out.println("Costructor in Spring Object Creaction class");
    }
    public void hello()
    {
        System.out.println("Spring object creation");
    }
}