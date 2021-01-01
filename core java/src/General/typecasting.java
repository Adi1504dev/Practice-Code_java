package General;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADITYA
 */
public class typecasting
{
    public void implicit()
    {
        //chote ko bade main
        int a=19;
        double b=19.9;
        b=a;
        char k='s';
        int kl=k;        
    }
      public void explicit()
    {
        //bade ko chote main
       
        double b=19;
        int a=(int)b; 
     
        
    }
      //remember the use of type  casting while giving parameter to function
      public void cast(double x ,int r)//here x can be a integer as well bt r can not be float value
      {
          System.out.println("hello");
      }
}
//remember the use of type  casting while giving parameter to function