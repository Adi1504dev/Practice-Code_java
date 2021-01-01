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
public class stop_isAlive_sleep extends Thread 
{
    int i;
    public void run()
    {
     for(i=0;i<10;i++)
     {
         System.out.println("Thread A:"+i);
         if(i==5)
         {
             this.stop();
         }
     }
    }
}

class fd
{
    public static void main(String []a)
    {
      stop_isAlive_sleep s=new stop_isAlive_sleep();
          System.out.println("S Thread is Alive?"+s.isAlive());
      s.start();
           System.out.println("S Thread is Alive?"+ s.isAlive());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(fd.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Hey");
             System.out.println("S Thread is Alive?"+s.isAlive());
      
    }
}