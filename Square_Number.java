import java.util.Scanner;
class Sample
{
    static boolean isSquare(int num)
    {
        for(int i=1;i<=num;i++)
        {
            if(i*i==num)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(isSquare(n))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}