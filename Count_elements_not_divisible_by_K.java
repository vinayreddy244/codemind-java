import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%k!=0)
            {
                count+=1;
            }
        }
        System.out.print(count);
    }
}