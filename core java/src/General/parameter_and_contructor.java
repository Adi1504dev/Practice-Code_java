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
public class parameter_and_contructor  
{int k,a,b,c,j;

   
 parameter_and_contructor ()
{
    a=43;
    b=423;
    c=90;
}
 parameter_and_contructor (int l,int m,int n)
{
    a=l;
    b=m;
    c=n;
}
 void add(int x,int y)
 {int z=x+y;
     System.out.println(""+z);
 }
  void add1(int...x)
 {int i,z=0;
     for(i=0;i<x.length;i++)
     {
         z=z+x[i];
     }
  System.out.println(""+z);
 }
  void addr(int k)
 {
     k=k;//this k means not the parameter. the result of this k of instance variable is zero
     //in the function as local variable is always preffered so to get instance variable to work we have to use this
    //keyword
     //this.k=k;
 }
  
}
class mokke
{
public static void main(String []a)
{
    parameter_and_contructor  p=new parameter_and_contructor ();
    System.out.println(""+p.a+"\n"+p.b+"\n"+p.c+"\n"+p.j);
  /*   parameter_and_contructor  p1=new parameter_and_contructor (2,3,4);
    System.out.println("\n"+p1.a+"\n"+p1.b+"\n"+p1.c+"\n"+p1.j);//here j shows fuction of hidden intializer block
    //which intializes the the remainig variables to zero which are not initialized by constructor
    p.add(4,6);
    p.add1(1,2,3);
    p.add1(1,2,3,4);
    p.add1(1,2,6,3,4);
  // p.addr(3);
   System.out.println(""+p.k);
*/
   }
}