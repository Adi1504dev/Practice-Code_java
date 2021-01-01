/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADITYA
 */
public class file_class {
    public static void main(String []argd)
    {
        File f=new File("D:/New Folder/name1.txt");
             System.out.println("Is exist:"+f.exists());
        try {
            f.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(file_class.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Is exist:"+f.exists());
             System.out.println("Size"+f.length());
                  System.out.println("Name:"+f.getName());
                  //f.delete();
                       System.out.println("Is exist:"+f.exists());
    }
    
}
