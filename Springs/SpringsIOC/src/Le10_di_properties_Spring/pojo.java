/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Le10_di_properties_Spring;

import java.util.Properties;
import java.util.Set;

/**
 *
 * @author Aditya
 */
public class pojo 
{
Properties info;  
public void setprop(Properties p)
{info=p;
}
public void print()
{
    //Propertiess are also types of map
    //Learn about properties in core java learning
    Set key=info.keySet();
    for(Object k:key)
    {
        System.out.println("Key :"+k+"Value :"+info.getProperty(k.toString()));
    }
    System.out.println("Value For Key Value 3 is" + info.getProperty("3"));
}
}
