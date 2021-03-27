package program;
import java.util.*;
public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//Your Code Here
				Scanner sc=new Scanner(System.in);
				String str=sc.nextLine();
				char[]ch=str.toCharArray();
				int freq[]=new int[str.length()];
				for(int i=0;i<ch.length;i++)
				{
					freq[i]=1;
				    for(int j=i+1;j<ch.length;j++)
				    {
				    	if(Character.isLetter(ch[i])&&ch[i]==ch[j])
				    	{
				    		freq[i]++;
				    		ch[j]='0';
				    	}
				    	
				    }
				}
				       
				for(int i=0;i<ch.length;i++)
				{
					if(Character.isLetter(ch[i]))
			    	{
						System.out.println(ch[i]+" occurs "+freq[i]);
			    	}
					
				}
				//maximum freq count character
				int max=freq[0];
				char c='a';
				for(int i=0;i<freq.length;i++)
				{
					if(max<freq[i])
					{
						max=freq[i];
						 c=ch[i];
					}
				}
				System.out.println("maximum occured character ");
				
				System.out.println(c+" occurs highest "+ max);
				
				}
	}
