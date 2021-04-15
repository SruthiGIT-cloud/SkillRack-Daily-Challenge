/*sample input:  4
               2 3 4 5
	       3 5 10 9
	       6 10 8 8 
	       7  9 2 1
sample output: YES
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int flag=0;
		int m;
		int arr[][]=new int[n][n];
		int brr[][]=new int [n][n];
		int ref[]=new int [n];
		int ref2[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        arr[i][j]=sc.nextInt();
		    }
		}
	   for(int i=0;i<n;i++)
	   {
	       for(int j=0;j<n;j++)
	       {
	           brr[i][j]=arr[j][i];
	       }
	   }
	   for(int i=0;i<n;i++)
	   {
	       for(int j=0;j<n;j++)
	       {
	           ref[j]=arr[i][j];
	       }
	       for(int k=0;k<n;k++)
	       {
	           int count=0;
	           for(int g=0;g<n;g++)
	           {
	               if(ref[g]==brr[k][g])
	               {
	                   c++;
	               }
	           }
	           if(c==n)
	           {
	               flag=1;
	
	           }
	       }
	       if(flag==1)
	       {
	           System.out.print("YES");
	           break;
	       }
	   }
	   if(flag==0)
	   {
	       for(int a=0;a<n;a++)
	       {
	           m=n-1;
	           for(int b=0;b<n;b++)
	           {
	              ref[b]=arr[a][b];
	           }
	           for(int f=0;f<n;f++)
	           {
	               ref2[f]=ref[m];
	               m--;
	           }
	          
	           for(int q=0;q<n;q++)
	           {
	               int count=0;
	               for(int w=0;w<n;w++)
	               {
	                   if(ref2[w]==brr[q][w])
	                   {
	                       count++;
	                   }
	               }
	               if(count==n)
	               {
	                   flag=1;
	               }
	           }
	           if(flag==1)
	           {
	               System.out.print("YES");
	               break;
	           }
	       }
	        if(flag==0)
	       {
	           System.out.print("NO");
	       }
	   }
    }
}
