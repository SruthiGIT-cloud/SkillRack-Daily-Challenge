import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==1)
		{
		    System.out.print("0");
		}
		else{
		long a=0,b=1;
		int n1=n-2;
		long ans=0;
		System.out.print(a+" "+b+" ");
		for(int i=0;i<n1;i++)
		{
		    ans=a+b;
		    System.out.print(ans+" ");
		    a=b;
		    String strans=String.valueOf(ans);
		    StringBuilder sb=new StringBuilder(strans);
		    sb.reverse();
		    sb.toString();
		    String s=new String(sb);
		    long newans=Long.parseLong(s);
		    b=newans;
		}
		}

	}
}
