import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
         {
             for(int j=n;j>=1;j--)
             {
                 System.out.print(j);
                 System.out.print(" ");
             }
             System.out.println();
         }
    }
}