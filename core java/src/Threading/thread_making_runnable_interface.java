package Threading;

import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author ADITYA
 */
public class thread_making_runnable_interface implements Runnable
{int i;
 public void run()
 {
 for(i=1;i<+10;i++)
 {
     System.out.println("Thread A:"+i);
 }
 }
    
}
 class thread_making_runnable_interface1 implements Runnable
{int i;
 public void run()
 {
 for(i=1;i<+10;i++)
 {
     System.out.println("Thread B:"+i);
 }
 }
    
}

class a{
    public static void main(String []args)
    {
        Thread t1=new Thread(new thread_making_runnable_interface());//thread main runnable ka object jayega bs but kyuki class ne implement kiya hai runnable ko
        //isliye us class ka oject de sAkte hai (Beta Baap Concept)
              Thread t2=new Thread(new thread_making_runnable_interface1());
              //another method to make thread
               Thread t3=new Thread(new Runnable()
               {
                   public void run()
                   { 
                       int i;
                       for(i=1;i<+10;i++)
 {
     System.out.println("Thread c:"+i);
 } 
                   }
               });
t1.start();//to run thread
t2.start();
t3.start();
System.out.println("Checking join 1");
        try {
            t1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(a.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Checking join 2");
        try {
            t2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(a.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Checking join 3");
        try {
            t3.join();//basicaly join is use in main to start the other wrok when previos is done
        } catch (InterruptedException ex) {
            Logger.getLogger(a.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Checking join 4");
    }
   
}