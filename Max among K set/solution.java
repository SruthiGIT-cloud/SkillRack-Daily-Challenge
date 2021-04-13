
import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		int div=n/k,a=k;
		int h=0,max=0;
		while(div!=0)
		{ 
		    max=arr[h];
		    for(int i=h;i<k;i++)
		    {
		        if(arr[i]>max)
		        {
		            max=arr[i];
		        }
		    }
		    System.out.print(max+" ");
		    h=k;
		    k=k+a;
		    div--;
		}
	}
}
