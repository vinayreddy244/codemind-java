import java.util.Scanner;
class Smaple
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int i;
        for(i=1;i<=t;i++)
        {
            int n1=s.nextInt();
            int n2=s.nextInt();
            int sum=n1+n2;
            System.out.println(sum);
        }
    }
}