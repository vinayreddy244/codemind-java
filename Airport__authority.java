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
        int t=s.nextInt();
        int sum=0;
        for(int j=0;j<n;j++)
        {
            if(arr[j]<=t)
            {
                sum+=1;
            }
            else
            {
                sum+=2;
            }
        }
        System.out.println(sum);
    }
}