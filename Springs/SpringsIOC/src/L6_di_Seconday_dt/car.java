/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L6_di_Seconday_dt;

/**
 *
 * @author Aditya
 */
public class car
{
String carname;
engine e;
public void setname(String nam)
{
    carname=nam;
}
public void setengine(engine e1)
{
    e=e1;
}
public void print()
{
    System.out.println("car Name ="+carname +"\n"+ "Model year =" +e.modelyear);
                                     //OR
  //System.out.println("car Name ="+carname +"\n"+ "Model year =" +e.getmodel());
}
}
