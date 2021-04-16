package program;
import java.util.*;
public class ex1 {

	public static void main(String[]args)
	{
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String patt=sc.next();
		char[]ch=s.toCharArray();
		char[]ph=patt.toCharArray();
		int index=0;
	    String s1="";
	    String s2="";
	    String a="0";
	    String b="1";
		for(int i=0;i<s.length();i++) {
			if(Character.isUpperCase(ch[i]))
			{
				s1=s1+b;
			}
			else
			{
				s1=s1+a;
			}
		}
		for(int i=0;i<patt.length();i++) {
			if(Character.isUpperCase(ph[i]))
			{
				s2=s2+b;
			}
			else
			{
				s2=s2+a;
			}
		}
		if(s1.contains(s2))
		{
			index=s1.indexOf(s2);
		}
		int len=s2.length();
		int k=len+index;
		for(int i=index;i<k;i++)
		{
			System.out.print(ch[i]+"");
		}
		
		
			
	}
			
}

