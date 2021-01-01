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
class wn1 extends Thread
{
    public  void run ()
    {wn2 w=new wn2();
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
                   Logger.getLogger(wn1.class.getName()).log(Level.SEVERE, null, ex);
               }
                 }  
       }
        }
    }
}
class wn2 extends Thread
{
    public  void run ()
    {wn3 w=new wn3();
        w.start();
        synchronized(w)
        {for(int i=0;i<10;i++)
       {
           System.out.println("Thread B"+i);

         if(i==5)
                 {
               try {
                   
                   w.wait();
               } catch (InterruptedException ex) {
                   Logger.getLogger(wn1.class.getName()).log(Level.SEVERE, null, ex);
               }
                 }  
       }
        synchronized(this)
        {
            notify();
        }
        }
    }
}
     class wn3 extends Thread
{
     public  void run()
    {
      
        synchronized(this){
       for(int i=0;i<10;i++)
       {
           System.out.println("Thread c"+i);
          
            
       }
       notify();
        }
    }
    }

public class wn1a {
public static void main(String []args)
{
  wn1 w1=new wn1();
  wn2 w2=new wn2();  
   w1.start();         
   }         
}

