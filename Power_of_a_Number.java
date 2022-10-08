import java.util.Scanner;
import java.lang.Math;
class Sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();
        int m=s.nextInt();
        double res=Math.pow(x,y)%m;
        System.out.println((int)res);
    }
}