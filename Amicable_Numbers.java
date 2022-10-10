import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        int sum=0,sum1=0;
        for(int i=1;i<m;i++)
        {
            if(m%i==0)
            {
                sum+=i;
            }
        }
        for(int j=1;j<n;j++)
        {
            if(n%j==0)
            {
                sum1+=j;
            }
        }
        if(sum==n&&sum1==m)
        {
            System.out.println("Amicable");
        }
        else
        {
            System.out.println("Not Amicable");
        }
        
    }
}