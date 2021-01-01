/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L8_di_Set;

import java.util.Set;


/**
 *
 * @author Aditya
 */
public class car
{
 Set carname[];
 engine e[];
 public void setname(Set nam[])
 {
     carname=nam;     //Premitive Datatype Passing
 }
 public void setengine(engine nam[])
 {
     e=nam;         //secondary Data type passing 
 }
 
public void print()
{
    /*for(Object cri:carname)
    {
        System.out.println(cri);
    }
   */
                                     //OR
  System.out.println("car Name ="+carname[1] +"\n"+ "Model year =" +e[0].getmodel());
}

}
