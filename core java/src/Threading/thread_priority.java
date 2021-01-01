/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threading;

/**
 *
 * @author ADITYA
 */
class threadpriority extends Thread
{
    int i;
    public void run()
    {
        for(i=0;i<10;i++)
        {
           System.out.println("Thread A" +i);
        }
        
    }
    
}
class threadpriority1 extends Thread
{
    int i;
    public void run()
    {
        for(i=0;i<10;i++)
        {
           System.out.println("Thread B" +i);
        }
        
    }
    
}
class kane
{
    int i;
    public static void main(String []args)
    {
        threadpriority1 t1=new threadpriority1();
        threadpriority t2=new threadpriority();
       t1.setPriority(9);
        t1.start();
        t2.start();
    System.out.print(t2.getPriority());
    }
    
}
