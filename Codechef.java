/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
	public static void main (String[] args) throws java.lang.Exception 
	{
	    
		// your code goes here
		Scanner sc = new Scanner(System.in);
		long n=0,a=0,b=0,sum=0;
		int x,i;
		if(sc.hasNext())
		n = sc.next().charAt(0);
		int y[] = {6,2,5,5,4,5,6,3,7,6};
		int z[] = new int[(int)n];
		for(i=1;i<=n;i++)
		{
		    x = 0;
		    if(sc.hasNext())
		    a = sc.next().charAt(0);
		    if(sc.hasNext())
		    b = sc.next().charAt(0);
		    sum = a+b;
		    System.out.println(sum);
		    while(sum>0)
		    {
		        x = x + y[(int)(sum%10)];
		        sum = sum/10;
		    }
		    z[i-1] = x;
		}
		for(i=0;i<n;i++)
		    System.out.println(z[i]);
	    }
	    
		    
		    
		    
		
		
	}
    

