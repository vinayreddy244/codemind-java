import java.util.Scanner;
import java.lang.Math;
class Sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int c=0,mx=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                c=0;
            }
            else
            {
                c++;
            }
            mx=Math.max(mx,c);
        }
        System.out.println(mx);
    }
}