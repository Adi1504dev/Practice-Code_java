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
class wait_not1 extends Thread
{
    public  void run ()
    {wait_not2 w=new wait_not2();
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
                   Logger.getLogger(wait_not1.class.getName()).log(Level.SEVERE, null, ex);
               }
                 }  
       }
        }
       }
}
class wait_not2 extends Thread
{
     public synchronized void run()
    {wait_not1 w=new wait_not1();
    
        synchronized(this)
        {
       for(int i=0;i<10;i++)
       {
           System.out.println("Thread b"+i);
          if(i==5){notify();
              try {synchronized(w){
                  this.wait(2);}
           } catch (InterruptedException ex) {
               Logger.getLogger(wait_not2.class.getName()).log(Level.SEVERE, null, ex);
           }
          }       }
        }
    }
}
public class wait_not12 {
public static void main(String []args)
{
  wait_not1 w1=new wait_not1();
  
   w1.start();

 
   
        
   }     
    
}

