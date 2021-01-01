/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package les28_2_Factroy_class_Instance;



/**
 *
 * @author Aditya
 */
public class Car_Factory 
{
     static Car c=null;
    private static String car;
public  void  setcarname(String car1) 
{
    car=car1;
}
public  Car createObject() throws ClassNotFoundException, InstantiationException, IllegalAccessException
{
   if(c==null)//here there was no need of this as spring always creates object singleton by Default
   {
   c= (Car)Class.forName("les28_2_Factroy_class_Instance."+car).newInstance();
   return c;
   }
   else return c;
  
    //return null;
   }
public static  Car createObject(String car) throws ClassNotFoundException, InstantiationException, IllegalAccessException
{//For Creating object without Springs
   //here there was no need of this as spring always creates object singleton by Default
   {
   c= (Car)Class.forName("les28_2_Factroy_class_Instance."+car).newInstance();
   return c;
   }
  
   }
protected Object clone() throws CloneNotSupportedException
{
    throw new CloneNotSupportedException();
}
}
