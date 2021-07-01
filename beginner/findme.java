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
		    int n=s.nextInt();//testcase
		    int f=s.nextInt();
		    int c=0;
		    int a[]=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=s.nextInt();
		        if(a[i]==f){
		            c=1;
		        }
		    }
		    if(c==1){
		        System.out.println("1");
		    }else{
		        System.out.println("-1");
		    }
		}catch(Exception e){
	        
	    }
	}
}
