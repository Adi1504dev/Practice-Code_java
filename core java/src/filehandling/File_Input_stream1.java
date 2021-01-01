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
public class File_Input_stream1 
{
public static void main(String []a) throws IOException
{
    int i;
    FileInputStream f=new FileInputStream("./name1.txt");
    String s="Tata";
    
    do
    {i=f.read();
    if(i!=-1)//nai to ek square ban jayega text ke end main
        System.out.print((char)i);
    }while(i!=-1);
    f.close();//data ram se hardisk main jata hai
    //ye tab bhi hota hai jab program end hota hai //bt ek achi programing habit ye hai ki ap ise likhe jisse data turant chala jaye
    //isko likhne ke bad file ram vali delete ho jati hai agar use phir se banana hai to apko fir se fileoutputstream ka object banana hoga
    }
    
}

