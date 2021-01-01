/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ADITYA
 */
public class buffered_writer 
{
public static void main(String []a) throws IOException
{
    BufferedWriter b=new BufferedWriter(new FileWriter("./name2.txt",true));
    b.write("Computer is fancy world");
     b.write("Computer is fancy world", 6, 8);
  
     
     b.close();
}
}