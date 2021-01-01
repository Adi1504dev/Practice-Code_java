/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L7_di_Array;

/**
 *
 * @author Aditya
 */
public class car
{
 String carname[];
 engine e[];
 public void setname(String nam[])
 {
     carname=nam;     //Premitive Datatype Passing
 }
 public void setengine(engine nam[])
 {
     e=nam;         //secondary Data type passing
 }
 
public void print()
{for(int i=0;i<=2;i++)
    System.out.println("car Name ="+carname[i] +"\n"+ "Model year =" +e[i].modelyear);
                                     //OR
  //System.out.println("car Name ="+carname +"\n"+ "Model year =" +e.getmodel());
}

}
