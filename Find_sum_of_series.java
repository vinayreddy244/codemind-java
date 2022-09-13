import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        double sum=0;
        for(double i=1;i<=n;i++)
        {
               sum+=1/i;
        }
        System.out.format("%.2f",sum);
    }
}