package program;
import java.util.*;
public class array_duplicates {
	public static void frequency(int arr1[])
	{
		int frq1[]=new int[arr1.length];
		Arrays.fill(frq1, -1);
		System.out.println("The frequency elements are ");
		for(int i=0;i<10;i++)
		{
			if(frq1[i]==0)
			{
				continue;
			}
			int count=1; 
			for(int j=i+1;j<10;j++)
			{
				if(arr1[i]==arr1[j])
				{
					count++;
					frq1[j]=0;
				}
			}
			 System.out.println(arr1[i]+" "+count);
			
		}
		}
	public static void main(String[] args) 
	{
		int arr1[]=new int [50];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			arr1[i]=sc.nextInt();
		}
		frequency(arr1);
	}
}
