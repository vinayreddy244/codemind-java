import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t>0)
        {
            int fact=1;
            int n=s.nextInt();
            for(int j=1;j<=n;j++)
            {
                fact=fact*j;
            }
            System.out.println(fact);
        }
    }
}