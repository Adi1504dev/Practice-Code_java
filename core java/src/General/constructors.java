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
public class constructors 
{
    int x,y,z;
constructors()
{
    System.out.println("I am constructor");
    x=4;
    y=7;
    z=8;
}
constructors(int a,int b ,int c)
{
    System.out.println("I am parameterised constructor");
    x=a;
    y=b;
    z=c;
}
}
class chingu
{
    public static void main(String []args)
    {
    constructors  s=new constructors();
System.out.println(""+s.x+" "+s.y+" "+s.z);
    constructors  s1=new constructors(2,3,4);
System.out.println(""+s1.x+" "+s1.y+" "+s1.z);
    }
}