import java.util.Scanner;
class Palindrome
{

    public static void main(String args[]) 
    {
        Scanner s = new Scanner(System.in);
        int t=s.nextInt();
        int j;
        for(j=1;j<=t;j++)
        {
            int n=s.nextInt();
            int temp=n;
            int sum=0;
            int r;
            while (n>0) 
            {
                r = n % 10;
                sum =  (sum* 10) +r;
                n=n/10;
            }

            if (temp ==sum)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
         }
            
    }
}