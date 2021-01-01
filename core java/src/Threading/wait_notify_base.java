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

class adderthread extends Thread
{int total=0;
public void run()
{
    System.out.println("came here");
  int i;
  synchronized(this)
  {
      for(i=0;i<100;i++)
      {
          total=total+i;
      }
      notify();
  }
}/*9170177939*/
}

class hj
{
    public static void main(String []args)
    {
     
      adderthread adder=new adderthread();
      adder.start();
      synchronized(adder)
      {
          try
          {
              System.out.println("WAiting......");
                      adder.wait();
          }
          catch(Exception w)
          {
              
          }
      }
      
 System.out.println("Total="+adder.total);
    }
}