import java.util.*;
import java.math.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc =new Scanner(System.in);
		String s=sc.nextLine();
		char[]ch=s.toCharArray();
		int index=-1;
		for(int i=ch.length-1;i>=0;i--)
		{
		    int n=Integer.parseInt(String.valueOf(ch[i]));
		    if(n%2!=0)
		    {
		        index=i;
		        break;
		    }
		}
		if(index==-1)
		{
		    System.out.print("0");
		}
		else
		{
		    System.out.print(s.substring(0,index+1));
		}
		
	}
}
