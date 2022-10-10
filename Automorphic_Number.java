import java.util.Scanner;
class Sample
{
    static boolean isAuto(int num)
    {
        int sq=num*num;
        while (num > 0)   
         {   
           if (num % 10 != sq % 10)   
           return false;   
           num = num/10;   
           sq = sq/10;   
         }   
        return true;   
  
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(isAuto(n))
        {
            System.out.println("Automorphic Number");
        }
        else
        {
            System.out.println("Not an Automorphic Number");
        }
        
    }
}