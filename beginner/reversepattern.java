/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try{
		    Scanner s=new Scanner(System.in);
		    int rows=s.nextInt();
		    for (int i= 0; i<= rows; i++){
                for (int j=1; j<=rows-i; j++){
                    System.out.print(" ");
                }
                for (int k=1;k<=i;k++){
                    System.out.print("*");
                } 
                System.out.println("");
            }
		}catch(Exception e){
	        
	    }
	}
}
