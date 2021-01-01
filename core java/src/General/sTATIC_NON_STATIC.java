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
public class sTATIC_NON_STATIC {
    int x=2,y=9;
    static int z;
    public static void fun1()
    {
       // y=8;
        
        System.out.println("Fun1");
    }
        public void fun2()
        {
                fun1();
        
      //x=6;//non static member x can be called in non static function fun2
      //z=7; //static member z can be called in non static function fun2 
        System.out.println("Fun2");
    }
      
            public void fun3()
    {
        System.out.println("Fun3");
    }
                public void fun4()
    {
        System.out.println("Fun4");
    }
        
    
}
class main
{
    public static void main(String args[])
    {
         /*    System.out.println(""+ sTATIC_NON_STATIC .z);
     sTATIC_NON_STATIC .z=9;
     System.out.println(""+ sTATIC_NON_STATIC .z);
          sTATIC_NON_STATIC.fun1();
          //sTATIC_NON_STATIC.fun2();
          sTATIC_NON_STATIC s=new sTATIC_NON_STATIC();
          s.fun2();
          s.fun3();
          System.out.println(""+ s.x);
          s.x=1;
          System.out.println(""+ s.x);
          
*/
              sTATIC_NON_STATIC s=new sTATIC_NON_STATIC();
              s.fun2();
}
}