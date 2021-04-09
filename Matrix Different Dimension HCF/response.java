/*sample input: 2 6
	      4 4 3 2 2 4
	      8 8 6 3 8 5
	      3 3
	      4 2 6
	      7 2 6
	      5 1 8
	
sample output: 4 2 3 
	       1 2 6
	       
	       */
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int arr1[][]=new int[m][n];
		for(int i=0;i<m;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        arr1[i][j]=sc.nextInt();
		    }
		}
		int hcf=1;
		int r=sc.nextInt();
		int c=sc.nextInt();
		int arr2[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        arr2[i][j]=sc.nextInt();
		    }
		}
		if(r<m)
		{
		    r=r;
		}
		else
		{
		    r=m;
		}
		if(c<n)
		{
		    c=c;
		}
		else{
		    c=n;
		}
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        for(int k=1;k<=arr1[i][j]||k<=arr2[i][j];k++)
		        {
		        if(arr1[i][j]%k==0&&arr2[i][j]%k==0)
		        {
		            hcf=k;
		        }
		        }
		        System.out.print(hcf+" ");
		    }
		    System.out.print("\n");
		}
    }
}
