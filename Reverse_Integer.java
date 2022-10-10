import java.util.Scanner;
import java.lang.Math;
class Sample
{
    static int reversDigits(int num)
    {
        int rev_num = 0;
        while(num > 0)
        {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
        return rev_num;
    }
     
    // Driver code
    public static void main (String[] args)
    {
        Scanner s=new Scanner(System.in);
        int num = s.nextInt();
        int t=reversDigits(Math.abs(num));
        if(num>0)
        {
            System.out.println(t);
        }
        else
        {
            System.out.println(-t);
        }
    }
}
 