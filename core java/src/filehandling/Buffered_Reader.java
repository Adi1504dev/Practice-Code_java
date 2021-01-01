/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling;

import java.io.*;

/**
 *
 * @author ADITYA
 */
public class Buffered_Reader 
{
public static void main(String []args) throws FileNotFoundException, IOException
{int c;
    BufferedReader b=new BufferedReader(new FileReader("./name2.txt")); 
   //FUNCTION 1
     c=b.read();
    while(c!=-1)       
    {
        System.out.print((char)c);
    c=b.read();
    }
    //Function 2
    String s;
    /*s=b.readLine();
    while(s!=null)
    {
        System.out.println(s);//here println is used as s contains whole line 
        s=b.readLine();
    }*/
   //Function 3
   /*char []as=new char[30];
   b.read(as,10, 6);
   System.out.println(as);//isse pura Array print hota hai
 System.out.println(as[11]);
   b.close();*/
}

}
