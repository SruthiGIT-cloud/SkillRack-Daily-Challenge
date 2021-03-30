package program;
import java.util.*;
public class arraylist {
	public static void adding(ArrayList<Integer>arr1)
	{
		System.out.println("the entries are : ");   
		for(int i=0;i<arr1.size();i++)
		{
			
			System.out.println(arr1.get(i)+ " ");
		}
	}
	public static void merge(ArrayList<Integer>arr1,ArrayList<Integer>arr2)
	{
		System.out.println("the combined entries are : ");
		arr1.addAll(arr2);
		System.out.println(arr1);
	}
	public static void modify(ArrayList<Integer>arr1)
	{
		System.out.println("the modified entries are : ");
		arr1.set(3,98);
		System.out.println(arr1);
	}
	public static void retrieve(ArrayList<Integer>arr2)
	{
		System.out.println("the accessed(retrieved) entries are : ");
		System.out.println(arr2.get(3));
		
	}
	public static void remove_common(ArrayList<Integer>arr1,ArrayList<Integer>arr2)
	{
		System.out.println("the unique entries are : ");
		arr1.removeAll(arr2);
		System.out.println(arr1);
	}
	public static void contain(ArrayList<Integer>arr1)
	{
		System.out.println("the  entries contains or not : "+ arr1.contains(22));
	}
	public static void index(ArrayList<Integer>arr2)
	{
		System.out.println("the  entries index are : ");
		for(int i=0;i<arr2.size();i++)
		 System.out.println(arr2.indexOf(arr2.get(i)));
	}
	public static void copyarray(ArrayList<Integer>arr3)
	{
		System.out.println("the  entries of another array are : ");
		for(int i=0;i<arr3.size();i++)
		 System.out.println(arr3.get(i));
	}
	public static void sort(ArrayList<Integer>arr3)
	{
		System.out.println("the  ascending order sorted entries array are : ");
		Collections.sort(arr3);
		for(int i=0;i<arr3.size();i++)
		 System.out.println(arr3.get(i));
		
		System.out.println("the  descending order sorted entries array are : ");
		Collections.sort(arr3,Collections.reverseOrder());
		for(int i=0;i<arr3.size();i++)
			 System.out.println(arr3.get(i));
	}
	
	

	public static void main(String[] args)  
	{
		// TODO Auto-generated method stub
		ArrayList<Integer>arr1=new ArrayList<Integer>(50);
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			arr1.add(sc.nextInt());
		}
		arr1.trimToSize();
		ArrayList<Integer>arr2=new ArrayList<Integer>(50);
		for(int i=0;i<5;i++)
		{
			arr2.add(sc.nextInt());
		}
		arr2.trimToSize();
		ArrayList<Integer>arr3=(ArrayList<Integer>)arr1.clone();
		adding(arr1);//add
		merge(arr1,arr2);//addAll
		modify(arr1);//set
		retrieve(arr2);//get
		remove_common(arr1,arr2);//removeAll
		contain(arr1);//contains..say true or false
		index(arr2);//prints index of all entries
		copyarray(arr3);//clone
		sort(arr3);//.sort,.reverseOrder
	}
}
