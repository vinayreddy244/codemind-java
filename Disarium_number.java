import java.util.Scanner;
import java.lang.Math;
class Sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int temp=n;
        int r,sum=0;
        String sc = Integer.toString(n); 
        int len=sc.length();
        while(n>0)
        {
            r=n%10;
            sum+=(int)Math.pow(r,len);
            len--;
            n=n/10;
        }
        if(sum==temp)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}