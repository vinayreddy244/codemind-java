import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int firstterm=0;
        int secondterm=1;
        int res=0;
        for(int i=1;i<=n;i++)
        {
            System.out.print(firstterm+" ");
            res=firstterm+secondterm;
            firstterm=secondterm;
            secondterm=res;
        }

    }
}