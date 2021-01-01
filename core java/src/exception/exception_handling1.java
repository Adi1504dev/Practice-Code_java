import java.lang.Exception;
import java.lang.ArithmeticException;
import java.lang.RuntimeException;
import java.io.IOException;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADITYA
 *//*
public class exception_handling1
{
 public static void main(String []args)
 {
try//here there are lines that can generate error
    //mendatory block hai
{
    int x=4;
    int y=x/0;//Dekho ye exception throw hoga to direct catch block pe jumping hogi aur interpretor vapse back 
    // aa nai payega
    int a[]=new int[3];//ye exception tabi chale jab uper vale main error na aaye
    a[5]=9;
}
catch(ArithmeticException e)//there can be many catch blocks
    //here errors are handeled
    {
            System.out.println(""+e);
        }
catch(ArrayIndexOutOfBoundsException e1)
        {
            System.out.println(""+e1);
        }
finally
{
    System.out.println("Hello");
}
 }
}
*/
//dekho basically java error agar pakadega to problem aayegi program nai chalega to program ko robust banene ke liye iska use kerte hai
/*
public class exception_handling1
{
 public static void main(String []args)
 {
try//here there are lines that can generate error
    //mendatory block hai
{
    int x=4,m;
       m=Integer.parseInt(JOptionPane.showInputDialog("NUMBER"));
    int y=x/m;//Dekho ye exception throw hoga to direct catch block pe jumping hogi aur interpretor vapse back 
    // aa nai payega
    int a[]=new int[3];//ye exception tabi chale jab uper vale main error na aaye
    a[5]=9;
}
catch(ArithmeticException e)//there can be many catch blocks
    //here errors are handeled
    {
            System.out.println(""+e);
        }
catch(ArrayIndexOutOfBoundsException e1)//yaha jo ArrayIndexOutOfBoundsException vo class hai aur e1 uska object
 
        {
            System.out.println(""+e1);
        }
finally
{
//ye block mendatroy run hoga
    System.out.println("Hello");
}
 }
}*/

/*class exception_handling_nested
{
 public static void main(String []args)
 {
try//here there are lines that can generate error
    //mendatory block hai
{
    int x=4,m;
    m=Integer.parseInt(JOptionPane.showInputDialog("NUMBER"));
    
     
     x=x/m;
   
    try
     {
         if(m==1)
         {
             x=x/(m-1);
         }
         if(m==2)
         {
             int []a=new int[4];
             a[7]=99;
         }
     }
     catch(RuntimeException r1)
             {
                 System.out.println(""+r1);
             }
    }

catch(ArithmeticException e)//there can be many catch blocks
    //here errors are handeled
    {
            System.out.println(""+e);
        }
catch(ArrayIndexOutOfBoundsException e1)
        {
            System.out.println(""+e1);
        }
finally
{
//ye block mendatroy run hoga
    System.out.println("Hello");
}
 }
}*/

//use of throw
 /*class exception_handling_throw
{
 public void throwtry()
 {
try//here there are lines that can generate error
    //mendatory block hai
{
    //isme hum ek exception phekege aur vo catch box main catch hoga
    throw new ArithmeticException("yo");//Arithematic Exceotion throw hoga with message yo
    
}
catch(ArithmeticException e)//there can be many catch blocks
    //here errors are handeled
    {
            System.out.println(""+e.getMessage());
            throw e;
        }
catch(ArrayIndexOutOfBoundsException e1)
        {
            System.out.println(""+e1);
        }
finally
{
//ye block mendatroy run hoga
    System.out.println("Hello");
}
 }
}
class mannu
{
    public static void main(String []args)
    {
       exception_handling_throw tt =new exception_handling_throw();
 try
 {
     tt.throwtry();
 }
       catch(ArithmeticException e)
    {
            System.out.println("cought here again"+e);
            
        }      
    }
}*/
//use of throws keyword
class throwstry
{
 public void AE() throws IOException//yaha pe IOException ek compile time errror produce kerega bt
    //by default java runtime pe error catch kerta hai isliye yaha throws lagega
    //iska use khud ke exception banana main use hoga
    //its very important
    
 {
  System.out.println("lele");
  throw new IOException("IOException thrown");
  
 }
  public void AE1() throws ArithmeticException
 {
  System.out.println("hellele");
  throw new ArithmeticException("ArithmeticException thrown");
  
 }
}
class milmina
{
    public static void main(String []args)
    {
        throwstry tt =new throwstry();
        try
        {
            tt.AE1();
            tt.AE();
        }
       catch(ArithmeticException e)
               {
        System.out.println(""+e.getMessage());
               }
              catch(IOException e1)
               {
        System.out.println(""+e1.getMessage());
               }
    }
}
//Use of creating my own Exceptions
class MyException extends Exception//agar yaha Excetion ko extend na kare to MyException class throwable
        //nai hogi
{
    int a;
 
  MyException(int x)
          {
         a=x;     
          }
    public String mass()
  {
  if(a>90)
   {
       return("old");
   }
   else
   {
       return("okk");
   }
    }
}
class demo 
{
    public  void fun1() throws MyException
    {
        throw new MyException(97);
        }
public static void main(String []a) 
{
    demo de=new demo();
    try{
    de.fun1();}
    catch (MyException e)
            {
                System.out.println(""+e.mass());
                   
                
            }
}
}