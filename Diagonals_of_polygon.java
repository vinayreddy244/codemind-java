import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int d;
        d=n*(n-3)/2;
        System.out.println(d);
    }
}