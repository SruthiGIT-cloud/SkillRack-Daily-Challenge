import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int k1=1,c=0;
		System.out.print(n+" ");
	     while(n%k==0)
		    {
		        int div=n/k;
		        while(k1!=0)
		        {
		        for(int i=0;i<k;i++)
		        {
		            System.out.print(div+" ");
		            c++;
		        }
		        k1--;
		    }
		    k1=c;
		    n=div;
		    }
		
	}
}
