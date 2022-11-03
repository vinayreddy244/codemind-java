import java.util.*;
import java.util.Arrays;
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
        for(int i=0;i<n;i++)
        {
            arr[i]=arr[i]*arr[i];
        }
        Arrays.sort(arr);
        for(int j=0;j<n;j++)
        {
            System.out.print(arr[j]+" ");
        }
    }
}