import java.util.Scanner;
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
        int sum=0,avg;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        avg=sum/n;
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=avg)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}