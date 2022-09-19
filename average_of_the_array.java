import java.util.Scanner;
class Sample
{
   public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        double sum=0;
        double avg;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        avg=sum/n;
        System.out.format("%.2f",avg);
    }
}