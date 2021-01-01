package General;


import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showInputDialog;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADITYA
 */
public class java_array {
int  a[]=new int[5];//defining 1d Array

//int c[][]=new int[][2]; error
int d[][]=new int[2][];    
//putting value in d
@SuppressWarnings("empty-statement")
public  static void main(String []args)
{
    int b[][]=new int[3][2];
//defining 2d Array
    int j,i;
    int u[][]={
        {1,2}
            ,{1,32},{8,4}
    };
/*for(j=0;j<2;j++)
    for(i=0;i<3;i++)    
{
    {
        b[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null,"number"+i));
    }}
    
for(j=0;j<2;j++)
    for(i=0;i<3;i++)    
{
    {
        //System.out.println(""+b[i][j]);
    JOptionPane.showMessageDialog(null, u[i][j]);
    }
    
    
}*/
//jagged Array

int km[][]=new int[3][];
km[0]=new int[4];
km[1]=new int[2];
km[2]=new int[3];    
for(int v=0;v<4;v++)
{
    km[0][v]=Integer.parseInt(JOptionPane.showInputDialog(null,"number"));  
}
for(int v=0;v<2;v++)
{
    km[1][v]=Integer.parseInt(JOptionPane.showInputDialog(null,"number"));  
}
for(int v=0;v<3;v++)
{
    km[2][v]=Integer.parseInt(JOptionPane.showInputDialog(null,"number"));  
}
//foreachloop used in jagged Array
/*for(int []x:km)
{//till now i havent worked out how to use for each loop for data entry
    for(int y:x)
    {
       km[1][y]=Integer.parseInt(JOptionPane.showInputDialog(null,"number")); 
    }
}*/
for(int []x:km)//x is for every value of km
{
    for(int y:x)//y is for every value of y
    {
     System.out.print("\t"+y);   
    }
System.out.println("");
}
}
}
