package Threading;

import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author ADITYA
 */                                                          /*SUCESSFUL*/
public class join_test implements Runnable
{int i;
 public void run()
 {
 for(i=1;i<+10;i++)
 {
     System.out.println("Thread A:"+i);
 }
 }
    
}
 class join_test1 implements Runnable
{int i;
 public void run()
 {
   Thread t2=new Thread(new join_test());
   t2.start();
    try {
        t2.join();
    } catch (InterruptedException ex) {
        Logger.getLogger(join_test1.class.getName()).log(Level.SEVERE, null, ex);
    }
    
 for(i=1;i<=10;i++)
 {
     System.out.println("Thread B:"+i);
 }
 }
    
}

class a1{
    public static void main(String []args) throws InterruptedException
    {
        Thread t1=new Thread(new join_test1());//thread main runnable ka object jayega bs but kyuki class ne implement kiya hai runnable ko
        //isliye us class ka oject de sAkte hai (Beta Baap Concept)
              
              //another method to make thread
              
t1.start();//to run thread
t1.join();
System.out.println("Check 1");

    }
   
}
//NOte : Always use diffrent lok for multiple sycnhronized b