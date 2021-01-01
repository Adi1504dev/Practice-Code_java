/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author ADITYA
 */
public class ganerics_method 
{
public <E,f> E print(E s,f k )//return type is also ganerics type
{
    System.out.println(s);
     System.out.println(k);
    return s;
}
public static void main(String []args)
{
    ganerics_method g=new  ganerics_method();
    Integer i=4,j;//only class can ve used in ganerics
    String a="Aditya",b;
    //E=interger,f=String
    j=g.print(i, a);
    //f=interger E=String
    b=g.print(a, i);
}
}
