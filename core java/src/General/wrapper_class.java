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
public class wrapper_class 
        
{
public static void main(String []args)
{
    //wrapper class main use ye hota hai ki vo premitive data type ko object main convert ker deta hai
    //jisse sequrity badh jati hai
    //isse sequrity bandh jati hai
    int x=20,y=8;
   //ways to use
    Integer i=4;//it is similar to integer
    Integer j=new Integer(5);
    
    Integer m=x+i;
Integer n=i+j;
Integer k1=x+y;
int j1=k1;//unboxing refferance data type to premitive data type
 k1=j1;//boxing    premitive data type to refferance data type
 System.out.println(""+m);
 System.out.println(""+n);
 System.out.println(""+k1);
 System.out.println(""+j1);
 //smilarly
 Double h1=4.90;
// Integer h2=(Double)h1;
//Integer h2=(int)h1;
 Byte b1=2;
 Short s1=4;
 Character k='c';
 char k2 = k;
 Character k3=k2;
 Boolean b=true;
 
 
    
}
}
