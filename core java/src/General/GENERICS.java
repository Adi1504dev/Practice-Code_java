package General;




import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADITYA
 */
//Generics in class
public class GENERICS<dt>
{   
   public void fun1(int x,dt y)
    { 
  
        System.out.println("fun1");
 }
      
   public void fun2(dt y)
    { 
  
        System.out.println("fun2");
 }
    
   
}
class mini{
    public static void main(String []args)
    {
      GENERICS<Integer> g=new GENERICS<Integer>();
      GENERICS<String> g1=new GENERICS<String>();
      g.fun1(4, 6);
      g1.fun2("hello");
    }

}
class jini
{
public <E> void printSet(E []a)
{
    for(E x:a)
    {
    System.out.println(x);
    }
}
public static void main(String []args)
{
    jini j1=new jini();
String animals[]=new String[]{"cow","goat","cat"};
Integer numbers[]=new Integer[]{12,3,4,5,4};   
j1.printSet(animals);
j1.printSet(numbers);
}
}