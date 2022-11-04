import java.util.Scanner;
import java.util.*;
import java.lang.Math;
class Sample
{
    static int maximumsubArray(int nums[])
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int temp=1;
            for(int j=i;j<nums.length;j++)
            {
                temp*=nums[j];
                max=Math.max(max,temp);
            }
        }
        return max;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println(maximumsubArray(arr));
    }
}
