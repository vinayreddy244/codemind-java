import java.util.Scanner;
import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=s.nextInt();
        }
        int n1=s.nextInt();
        int index[]=new int[n1];
        for(int j=0;j<n;j++)
        {
            index[j]=s.nextInt();
        }
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            li.add(index[i],nums[i]);
        }
        int res[]=new int[n];
        for(int i=0;i<n;i++)
        {
            res[i]=li.get(i);
            System.out.print(res[i]+" ");
        }
    }
}