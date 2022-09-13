import java.util.Scanner;
class Pattern
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for (int i =1; i<=n; i++)
        {
            for (int j =1; j <= n; j++)
            {
                if(i==j)
                {
                System.out.print(0);
                }
                else
                {
                    System.out.print("x");
                }
            }
            System.out.println();
        }
    }
}