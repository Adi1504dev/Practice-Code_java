/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package les29_4_Defalut_init_and_destroy;

import les29_3_Life_cycle_Annotation_approach.*;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;



/**
 *
 * @author Aditya
 */
public class pojo1 
{
 
    public void Myinitpojo()
    {
        System.out.println("Initializing the Bean pojo1");
    }
    public void use(String Name)
{
    System.out.println("Your name is:"+Name);
}
  
     public void MyDestroypojo()
    {  System.out.println("Destroying the Bean pojo1");
        
    }
}
