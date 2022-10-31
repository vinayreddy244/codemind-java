import java.util.Scanner;
import java.lang.Math;
class Sample
{
    static int isPerfectSquare(int number)
    {
        int iVar=number;
        double fvar;
        fvar=Math.sqrt(number);
        if(iVar==(int)fvar*fvar)
        return number;
        else
        return 0;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int sum=0;
        for(int j = 0; j < n; j++)
        {
            sum = sum + isPerfectSquare(arr[j]);
        }
        System.out.println(sum);
    }
}