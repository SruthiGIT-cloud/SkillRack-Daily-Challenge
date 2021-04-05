package program;
import java.util.*;
public class valid {

	public static void main(String[]args)
	{
		
		Scanner sc=new Scanner(System.in);
		String stringname=sc.next();
		int dotincrementor=0;
		int catorvalue=0;
		char chararray[]=stringname.toCharArray();
		for(int counter=0;counter<chararray.length;counter++)
		{
			if(chararray[counter]=='.')
			{
				dotincrementor++;
			}
		}
			 if(chararray[chararray.length-1]!='.')
			{
				catorvalue=1;
			}
			
			
		if(catorvalue==1&&dotincrementor==1)
		{
		System.out.print("valid");
		}
		else
		{
			System.out.print("notvalid");
			
		}
			
}
}
