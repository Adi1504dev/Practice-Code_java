/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package les25_Stereotype_annotation_componentIOC;



import org.springframework.context.ApplicationContext;
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
 ApplicationContext ap=new ClassPathXmlApplicationContext("les25_Stereotype_annotation_componentIOC/di.xml");
       car c=(car)ap.getBean(car.class);
        c.print();
    }
    
}
