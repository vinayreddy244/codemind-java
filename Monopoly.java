import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            int r1=s.nextInt();
            int r2=s.nextInt();
            int r3=s.nextInt();
        if(r1>r2+r3||r2>r1+r3||r3>r1+r2)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
    }
}