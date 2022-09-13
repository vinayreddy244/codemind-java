import java.util.Scanner;
class Pattern
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int z=1;
        int k;
        for (int i = 1; i<=n; i++)
        {
            for (int j =n-1; j >=i; j--)
            {
                System.out.print(" ");
            }
            for(k=0;k<z;k++)
            {
                System.out.print(i);
            }
            z+=2;
            System.out.print("
");
        }
    }
}