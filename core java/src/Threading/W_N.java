/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADITYA
 */
class W_N1 extends Thread
{
    public  void run ()
    {W_N2 w=new W_N2();
        w.start();
        synchronized(w)
        {for(int i=0;i<10;i++)
       {
           System.out.println("Thread A"+i);

         if(i==5)
                 {
               try {
                   
                   w.wait();
               } catch (InterruptedException ex) {
                   Logger.getLogger(W_N1.class.getName()).log(Level.SEVERE, null, ex);
               }
                 }  
       }
        }
    }
}
class W_N2 extends Thread
{
     public synchronized void run()
    {
       for(int i=0;i<10;i++)
       {
           System.out.println("Thread b"+i);
           
       }
       notify();
    }
}
public class W_N {
public static void main(String []args)
{
  W_N1 w1=new W_N1();
  W_N2 w2=new W_N2();  
   w1.start();

 
   
        
   }     
    
}

