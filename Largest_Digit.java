import java.util.Scanner;
class Sample
{
    public static void main(String  args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int r,max=0;
        while(n>0)
        {
            r=n%10;
            if(r>max)
            {
                max=r;
            }
            n=n/10;
        }
        System.out.println(max);
    }
}