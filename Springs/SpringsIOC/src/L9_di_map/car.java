/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L9_di_map;

import java.util.Map;
import java.util.Set;


/**
 *
 * @author Aditya
 */
public class car
{
 Map carname;
 engine e[];
 public void setname(Map nam)
 {
     carname=nam;     //Premitive Datatype Passing
 }
 public void setengine(engine nam[])
 {
     e=nam;         //secondary Data type passing 
 }
 
public void print()
{
    Set keys=carname.keySet();
    for(Object Key:keys)
    {
        System.out.println("Key :"+Key+"\t"+"Value :"+carname.get(Key));
    }
   
                                     //OR
  //System.out.println("car Name ="+carname +"\n"+ "Model year =" +e.getmodel());
}

}
