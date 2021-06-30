/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CodeChef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try{
		    Scanner s=new Scanner(System.in);
		    int n=s.nextInt();
		    if((n%5==0 && n%11!=0) || (n%5!=0 && n%11==0)){
		        System.out.println("ONE");
		    }else if(n%5==0 && n%11==0){
		        System.out.println("BOTH");
		    }else{
		        System.out.println("NONE");
		    }
		}catch(Exception e){
	        
	    }
	}
}
