import java.util.Scanner;
class Sample
{
    static boolean ishappy(int num)
    {
        int sum,r;
        if(num<=9)
        {
            return num==1 ||num==7;
        }
        sum=0;
        while(num>0)
        {
            r=num%10;
            num=num/10;
            sum=sum+r*r;
        }
        return ishappy(sum);
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        boolean res=ishappy(n);
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