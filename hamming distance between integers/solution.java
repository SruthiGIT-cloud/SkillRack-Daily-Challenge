/*sample input : 12 4
sample output: 1(as the binary representation of both numbers have 1 diifernt value)*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=0,dif=0;
		String a1=Integer.toBinaryString(a);
		String b1=Integer.toBinaryString(b);
		int a1len=a1.length();
		int b1len=b1.length();
		if(a1len<b1len)
		{
		    String temp=a1;
		    a1=b1;
		    b1=temp;
		}
		a1len=a1.length();
		b1len=b1.length();
		if((a1len>b1len)||(a1len==b1len))
		{
		     dif=a1len-b1len;
		    while(dif!=0)
		    {
		        b1="0"+b1;
		        dif--;
		    }
		
		String arr1[]=a1.split("");
		String arr2[]=b1.split("");
		for(int i=0;i<arr1.length;i++)
		{
		    if(!(arr1[i].equals(arr2[i])))
		    {
		        c++;
		    }
		    
		}
	
		
		System.out.print(c);
		}
		
	}
}
