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
		    int n=s.nextInt();//testcase
		    int a[]=new int[n];
		    for(int i=0;i<a.length;i++){
		        a[i]=s.nextInt();
		    }
		    for(int i=a.length-1;i>=0;i--){
		        System.out.print(a[i]+" ");
		    }
		}catch(Exception e){
	        
	    }
	}
}
