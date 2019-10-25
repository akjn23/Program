import java.io.*;
import java.util.*;

public class Solution
{

    public static void main(String[] args)
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n,min,max,i,j,x=0,c=0;
        n = sc.nextInt();
        int a[] = new int[7];
        for(i=0;i<7;i++)
        a[i]=0;
        for(i=0;i<n;i++)
        {
            min = sc.nextInt();
            max = sc.nextInt();
            System.out.println(min + " " + max);
            
        }
        j = 0;
        for(i=0;i<7;i++)
        {
            System.out.println(a[i]);
        }

    }
}