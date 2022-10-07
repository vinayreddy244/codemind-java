import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=String.valueOf(n);
        int l=s.length();
        int r,even=0,odd=0;
        while(n>0)
        {
            r=n%10;
            if(r%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
            n=n/10;
        }
        if(even==l)
        {
            System.out.println("Even");
        }
        else if(odd==l)
        {
            System.out.println("Odd");
        }
        else
        {
            System.out.println("Mixed");
        }
    }
}