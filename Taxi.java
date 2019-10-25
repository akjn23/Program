import java.util.*;
import java.math.*;
//Example of a greedy algorithm
/*After the lessons n groups of schoolchildren went outside and decided to visit Polycarpus to celebrate his birthday. 
 *We know that the i-th group consists of si friends (1 ≤ si ≤ 4), and they want to go to Polycarpus together. 
 *They decided to get there by taxi. Each car can carry at most four passengers. What minimum number of cars will the children need if all members
 *of each group should ride in the same taxi (but one taxi can take more than one group)?

Input
The first line contains integer n (1 ≤ n ≤ 105) — the number of groups of schoolchildren. The second line contains a sequence of integers s1, s2, ..., sn (1 ≤ si ≤ 4). The integers are separated by a space, si is the number of children in the i-th group.

Output
Print the single number — the minimum number of taxis necessary to drive all children to Polycarpus.*/
public class Taxi
{
    public static void main(String args[])
    {
        int a=0,b=0,c=0,d=0,k,x,n,m,i;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            m = sc.nextInt();
            if(m==4)
                a++;
            else if(m==3)
                b++;
            else if(m==2)
                c++;
            else 
                d++;
        }
        x = a;
        x = x + b;
        if(d>b)
        {
            d = d-b;
        }
        else 
        {
            d =0;
        }
        x = x + (int)Math.ceil(c/2.0);
        if(c%2 ==0)
            x = x + (int)Math.ceil(d/4.0);
        else
        {
            x = x + (int)Math.ceil((d-2)/4.0);
        }
        System.out.println(x);
        
        
    }
}
