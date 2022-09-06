import java.util.Scanner;
class Sample
{
    
    public static String convertToTitle(int n) 
    {
        StringBuilder ans= new StringBuilder();
        while(n>0)
        {
            --n;
            int d= n%26;
            n/=26;
            ans.append((char)('A'+d));            
        }
        ans.reverse();
        return ans.toString(); 
    }
    
    public static void main(String args[])
    {   
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
       System.out.println( convertToTitle(n));
    }
}