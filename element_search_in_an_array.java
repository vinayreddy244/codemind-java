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
        int z=s.nextInt();
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==z)
            {
                c++;
            }
        }
        if(c>0)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}