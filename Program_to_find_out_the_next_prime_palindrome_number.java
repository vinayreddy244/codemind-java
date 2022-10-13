import java.util.Scanner;
import java.lang.Math;
class Palindrome
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n, t, r = 0, c;
        int d;
         n=s.nextInt();
         while (n>0)
         {
             n++;
             t = n;
             while(t>0)
             {
                 r = r*10;
                 r = r + t%10;
                 t = t/10;
             }
             if (r == n)
             {
                 d = (int)Math.sqrt(n);
                 for (c = 2; c <= d; c++)
                 {
                     if (n%c == 0)
                     break;
                 }
                 if (c == d+1)
                 break;
             }
             r = 0;
         }
         System.out.println(n);
    }
}