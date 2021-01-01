/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threading;

import java.util.logging.Level;
import java.util.logging.Logger;


 public /*or synchonized*/ class synchronisation 
{int i ,sum=0;
 public  void count()
 {
/*synchronized(this)//this can be replaced by object
{
    

  for(int i=1;i<=1000;i++)
     sum++;
}*/
       for(int i=1;i<=1000;i++)
     sum++;
 }
    
}
 class synchronisation1 implements Runnable
{
 public void run()
 {
synchronisation s= new synchronisation();
s.count();
 }
    
}
class synchronisation2 implements Runnable
{int i;
 public void run()
 {
synchronisation s= new synchronisation();
s.count();
System.out.println(""+s.sum);
 }
    
}

class c{
    public static void main(String []args) throws InterruptedException
    {synchronisation s=new synchronisation();
        Thread t1=new Thread(new  Runnable()
        {
          public void run()
 {
     synchronized(s)
     {s.count();
     }}  
        });//thread main runnable ka object jayega bs but kyuki class ne implement kiya hai runnable ko
        //isliye us class ka oject de sAkte hai (Beta Baap Concept)
              Thread t2=new Thread(new  Runnable()
        {
          public void run()
 {

    synchronized(s)
     {s.count();
     }
 }  
        });
            
             
t1.start();//to run thread
t2.start();
t1.join();
t2.join();


System.out.println("The COUNT IS="+s.sum);
    }
   
}