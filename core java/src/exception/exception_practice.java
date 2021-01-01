package exception;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADITYA
 */
public class exception_practice 
{
    public static void main(String []ar)
    {
        
    
try
{
    System.out.println("First line");
              System.out.println("Result"+ 3/0);
              
}
catch(RuntimeException e) 
{
    System.out.println(e.getMessage());
}
}
}
