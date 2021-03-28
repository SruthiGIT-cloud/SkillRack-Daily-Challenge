import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]=new int[n][2];
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<2;j++)
		    {
		        arr[i][j]=sc.nextInt();
		    }
		}
		int c1=0;
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		for(int i=0;i<n;i++)
		    {
		        if(a<c)
		        {
		      if(arr[i][0]>=a&&arr[i][0]<=c)
		      {
		          if(b>d)
		          {
		              if(arr[i][1]>=d&&arr[i][1]<=b)
		              {
		                  c1++;
		              }
		          }
		          else{
		              if(arr[i][1]>=b&&arr[i][1]<=d)
		              {
		                  c1++;
		              }
		          }
		      }
		      
		        }
		        else
		        {
		            if(arr[i][0]>=c&&arr[i][0]<=a)
		            {
		                if(b>d)
		                {
		                    if(arr[i][1]>=d&&arr[i][1]<=b)
		                    {
		                        c1++;
		                    }
		                }
		                else
		                {
		                    if(arr[i][1]>=b&&arr[i][1]<=d)
		                    {
		                        c1++;
		                    }
		                }
		            }
		        }
		    }
		    
        System.out.print(c1);
	}
}
