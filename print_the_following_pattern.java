import java.util.Scanner;
class Pattern
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int alphabet = 65;
        for (int i = n-1; i>=0; i--)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print((char) (alphabet + i) + " ");
            }
            System.out.println();
        }
    }
}