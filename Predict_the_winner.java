import java.util.*;
class GFG
{
    static int decideWinner(int []a, int n)
    {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < n; i++)
        {
            if (a[i] % 4 == 0)
            count0++;
            else if (a[i] % 4 == 1)
            count1++;
            else if (a[i] % 4 == 2)
            count2++;
            else if (a[i] % 4 == 3)
            count3++;
        }
        if (count0 % 2 == 0 && count1 % 2 == 0 &&count2 % 2 == 0 && count3 == 0)
        return 1;
        else
        return 2;
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
        if (decideWinner(arr, n) == 1)
        System.out.print("X");
        else
        System.out.print("Y");
    }
}