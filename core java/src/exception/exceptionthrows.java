package exception;


import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADITYA
 */
public class exceptionthrows {
    public static void main(String []ar)// throws IOException
    {
        try{
        throw new IOException("I love u");
        //In this case although the exception has been thown and caught by default machenism of java .
//pr phir bi vo dhang se handle nai hui hai kyunki uske aage program nai chalega
//isliye agar dhang se kerna hai to try catch lagana jaruri hai
        }
        catch(IOException e)
        {
            System.out.println("Exception:"+e.getMessage());

        }
    }
    
}
