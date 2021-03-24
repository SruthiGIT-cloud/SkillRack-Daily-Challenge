import java.util.*; 
interface Pair 
{ 
    public long getHCF(int a, int b); 
    public boolean areCoPrime(int a, int b); 
    
}

class Node implements Pair
   {
       long hcf=1;
        public long getHCF(int a,int b)
        {
            for(int j=1;j<=a && j<=b ;j++)
            {
                if(a%j==0 && b%j==0)
                {
                    hcf=j;
                }
            }
            
            return hcf;
        }
    
        public boolean areCoPrime(int a,int b)
        {
            if(hcf!=1)
                return false;
            else
                return true;
        }
    
   }


public class Hello 
{ 
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in); 
        int a = sc.nextInt(); 
        int b = sc.nextInt(); 
        Pair pair = new Node(); 
        System.out.println("HCF: " + pair.getHCF(a, b)); 
        System.out.println(pair.areCoPrime(a, b) ? "YES" : "NO"); 
        
    }
}
