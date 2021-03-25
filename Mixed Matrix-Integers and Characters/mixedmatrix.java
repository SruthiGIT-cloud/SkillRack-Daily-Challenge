import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int sum=0;
		String z="";
		String arr[][]=new String[r][c];
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        arr[i][j]=sc.next();
		    }
		}
		for(int i=0;i<c;i++)
		{
		    for(int j=0;j<r;j++)
		    {
		        char ch=arr[j][i].charAt(0);
		        if(!Character.isDigit(ch))
		        {
		            String y=String.valueOf(arr[j][i]);
		            z=z+y;
		        }
		        else
		        {
		            String x=String.valueOf(arr[j][i]);
		            int a=Integer.parseInt(x);
		            sum=sum+a;
		        }
		        
		    }
		}
		System.out.print(sum);
		System.out.print("\n"+z);

	}
}
