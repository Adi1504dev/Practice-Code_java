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
public class File_output_stream 
{
public static void main(String []a) throws IOException
{
    int i;
    FileOutputStream f=new FileOutputStream("./name1.txt");
    String s="Tata";
    char ah[]=s.toCharArray();
    for(i=0;i<s.length();i++)
    {
        f.write(ah[i]);
    }
    f.close();//data ram se hardisk main jata hai
    //ye tab bhi hota hai jab program end hota hai //bt ek achi programing habit ye hai ki ap ise likhe jisse data turant chala jaye
    //isko likhne ke bad file ram vali delete ho jati hai agar use phir se banana hai to apko fir se fileoutputstream ka object banana hoga
    }
    
}

