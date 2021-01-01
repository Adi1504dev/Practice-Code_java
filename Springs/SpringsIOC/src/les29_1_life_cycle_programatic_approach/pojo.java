
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package les29_1_life_cycle_programatic_approach;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 *
 * @author Aditya
 */
public class pojo implements InitializingBean,DisposableBean
{

    @Override
    public void afterPropertiesSet() throws Exception {
    System.out.println("Intialaizing the Bean");
    }
public void use(String Name)
{
    System.out.println("Your name is:"+Name);
}
    @Override
    public void destroy() throws Exception {
        System.out.println("Destroying the Bean");
    
    }
    
}
