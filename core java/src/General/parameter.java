package General;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADITYA
 */
public class parameter 
{
 public void fun1()
 {
     System.out.println("Fun1");
 }
 
}
 class parameter1 
{
   
 public void fun2(parameter m)//m jo hai paramater class ka refferance variable hoga aur isse hum uske fuction aur varible 
//acess ker sakte hai         
 {
     System.out.println("I am fun2 bt i am calling fun1 by refferance");
     m.fun1();
 }
  public void fun3(int x)
 {
     System.out.println("Fun3");
 }
 
 //elipse symbol
 public void add(int...x)
 {
     int i,z=0;
     
     for(i=0;i<x.length;i++){
         z=z+x[i];
     }
 System.out.println(""+z);
 }
}
class aa
{
    public static void main(String []args)
    {
        parameter p=new parameter();
         parameter1 p1=new parameter1();
         p.fun1();
         p1.fun3(4);
         p1.fun2(p);
         p1.add(1,2,3,4);
         p1.add(2,3);
         p1.add(1,2,3,4,5,6,7,8,9,1,0);
         
    }
}