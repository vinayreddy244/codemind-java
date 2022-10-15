import java.util.Scanner;
import java.lang.Math;
class Sample
{
    static  boolean isPerfectSquare(int x)
    {
        int s = (int) Math.sqrt(x);
        return (s*s == x);
    }
    static boolean isFibonacci(int n)
    {
        return isPerfectSquare(5*n*n + 4) ||
               isPerfectSquare(5*n*n - 4);
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int i=s.nextInt();
        boolean res=isFibonacci(i);
        if(res==true)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}