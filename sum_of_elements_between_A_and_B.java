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
        int a=s.nextInt();
        int b=s.nextInt();
        int sum=0;
        for(int j=0;j<n;j++)
        {
                if(arr[j]>=a &&arr[j]<=b)
                {
                  sum+=arr[j];
                }
        }
        System.out.println(sum);
        
    }
}