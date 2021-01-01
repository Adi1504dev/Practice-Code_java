/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package les29_3_Life_cycle_Annotation_approach;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;



/**
 *
 * @author Aditya
 */
public class pojo 
{
 @PostConstruct
    public void Myinitpojo()
    {
        System.out.println("Initializing the Bean");
    }
    public void use(String Name)
{
    System.out.println("Your name is:"+Name);
}
    @PreDestroy
    //CommonAnnotationBeanPostProcessor isko configure kiye bina xml main destroy method nai chalega
    //annotation main //although init method chalega
     public void MyDestroypojo()
    {  System.out.println("Destroying the Bean");
        
    }
}
