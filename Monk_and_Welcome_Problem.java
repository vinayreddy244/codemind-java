import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=s.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            arr2[j]=s.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr1[i]+arr2[i];
            System.out.print(sum+" ");
            sum=0;
        }
    }
}