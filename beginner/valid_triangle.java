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
		    int a=s.nextInt();
		    int b=s.nextInt();
		    int c=s.nextInt();
		    if(a+b<=c || a+c<=b || b+c<=a){
		        System.out.println("NO");
		    }else{
		        System.out.println("YES");
		    }
		}catch(Exception e){
	        
	    }
	}
}
