import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int p=s.nextInt();
        int r=s.nextInt();
        int t=s.nextInt();
        int si;
        si=(p*t*r)/100;
        System.out.println(si);
    }
}