import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		String s11[]=s1.split("");
		String s22[]=s2.split("");
		int k=0;
		String x1="";
		String y1="";
		String vow="aeiouAEIOU";
		for(int i=0;i<s1.length();i++)
		{
		    char c1=s1.charAt(i);
		    String x=String.valueOf(c1);
		    if(vow.contains(x))
		    {
		    for(int j=k;j<s2.length();j++)
		    {
		        char c2=s2.charAt(j);
		        String y=String.valueOf(c2);
		        if(vow.contains(y))
		        {
		            s11[i]=y;
		            s22[j]=x;
		            k=j+1;
		            break;
		        }
		    }
		    
		    }
		}
		for(int i=0;i<s11.length;i++)
		{
		    x1=x1+s11[i];
		}
		for(int j=0;j<s22.length;j++)
		{
		    y1=y1+s22[j];
		}
		
		System.out.print(x1+"\n"+y1);
	}
}
