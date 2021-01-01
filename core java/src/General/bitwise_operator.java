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
public class bitwise_operator 
{
    public static void main(String []args)
    {
       int a=12,b=9,c;
       
        c=~a;//negation
        System.out.println(""+c);
             c=a&b;//and
        System.out.println(""+c);
             c=a|b;//or
        System.out.println(""+c);
      c=a<<1;//left shift
        System.out.println(""+c);
             c=a>>1;//right shift
        System.out.println(""+c);
     c=a^b;//XOR
        System.out.println(""+c);
        
/*        int z=0
            
               x:
                {
                System.out.println("hi");
                z++;
                }
                if (z<10)
                    goto x;//cant use goto in java
                }*/
                //const int a=10;
                //a=6;
                //System.out.println(""+a); //nither const keyword
        
    

}
}
