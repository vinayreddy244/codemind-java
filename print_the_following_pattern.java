import java.util.Scanner;
class Pattern
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int alphabet = 65;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print((char) (alphabet + i) + " ");
            }
            System.out.println();
        }
    }
}