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
public class Thread_making_by_class extends Thread {
    int i;
 public void run()
 {
 for(i=1;i<+10;i++)
 {
     System.out.println("Thread A:"+i);
 }
 }
    
    
}
 class Thread_making_by_class1 extends Thread {
    int i;
 public void run()
 {
 for(i=1;i<+10;i++)
 {
     System.out.println("Thread b:"+i);
 }
 }
    
    
}
class b1{
    public static void main(String []args)
    {
     Thread_making_by_class t1 =new Thread_making_by_class();
      Thread_making_by_class1 t2 =new Thread_making_by_class1();
t1.start();//to run thread
t2.start();

    }
}