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
class a_join extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Thread A"+i);
        }
    }
}
public class join_dub
{
public static void main(String []args)
{
   a_join j=new a_join();
   j.start();
    try {
        j.join();
    } catch (InterruptedException ex) {
        Logger.getLogger(join_dub.class.getName()).log(Level.SEVERE, null, ex);
    }
    for(int i=0;i<10;i++)
        {
            System.out.println("Thread b"+i);
        }
   
/* try {
        j.join();
    } catch (InterruptedException ex) {
        Logger.getLogger(join_dub.class.getName()).log(Level.SEVERE, null, ex);
    }*/
}

}
