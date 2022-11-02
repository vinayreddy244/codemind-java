import java.util.*;
class GFG 
{
    static int first(int arr[], int x, int n)
    {
        int low = 0, high = n - 1, res = -1;
        while (low <= high)
        {
            int mid = (low + high) / 2;
            if (arr[mid] > x)
                high = mid - 1;
            else if (arr[mid] < x)
                low = mid + 1;
            else 
            {
                res = mid;
                high = mid - 1;
            }
        }
        return res;
    }
    static int last(int arr[], int x, int n)
    {
        int low = 0, high = n - 1, res = -1;
        while (low <= high) 
        {
            int mid = (low + high) / 2;
            if (arr[mid] > x)
                high = mid - 1;
            else if (arr[mid] < x)
                low = mid + 1;
            else 
            {
                res = mid;
                low = mid + 1;
            }
        }
        return res;
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int x = s.nextInt();
        System.out.println(first(arr, x, n)+" "+last(arr, x, n));
    }
}
 