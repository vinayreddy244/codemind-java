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
        int k=s.nextInt();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            if(arr[i]==k)
            break;
        }
        System.out.println(sum);
    }
}