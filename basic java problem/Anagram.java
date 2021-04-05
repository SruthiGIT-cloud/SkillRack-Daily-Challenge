import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        char arr1[]=a.toLowerCase().toCharArray();
        char arr2[]=b.toLowerCase().toCharArray();
        String x="";
        String y="";
        if(arr1.length!=arr2.length)
        {
            return false;
        }
        else
        {
           for(int i=0;i<arr1.length;i++)
           {
               for(int j=0;j<arr1.length;j++)
               {
                   if(arr1[j]>arr1[i])
                   {
                       char temp=arr1[j];
                       arr1[j]=arr1[i];
                       arr1[i]=temp;
                   }
                   if(arr2[j]>arr2[i])
                   {
                       char temp2=arr2[j];
                       arr2[j]=arr2[i];
                       arr2[i]=temp2;
                   }
                   
               }
           }
           for(int i=0;i<arr1.length;i++)
           {
               x=x+arr1[i];
               y=y+arr2[i];
           }
           return x.equals(y);
            
        }
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
