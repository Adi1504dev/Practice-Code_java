package ResourceBundelCheck;




import java.util.ResourceBundle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aditya
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ResourceBundle r=ResourceBundle.getBundle("m1");
           ResourceBundle r2=ResourceBundle.getBundle("m1");
           ResourceBundle r3=ResourceBundle.getBundle("m2");
           
           System.out.println(r==r2);
           System.out.println(r2==r3);
        // TODO code application logic here
    }
    
}
