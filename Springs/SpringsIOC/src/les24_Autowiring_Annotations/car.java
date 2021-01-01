/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package les24_Autowiring_Annotations;

import les23_Autowiring_Autodetect.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;



/**
 
 * @author Aditya
 */
public class car 
{
String name;
@Autowired()
@Qualifier(value="engine")
Engine engine;

public void setna(String naa)
        
{
    name=naa;
   
}


public void print()
{
    System.out.println("Carname   :"+name+"     Year"+engine.Year);
}
}
