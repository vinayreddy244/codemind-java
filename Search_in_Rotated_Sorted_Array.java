import java.util.*;
class Main 
{
    static int search(int arr[], int l, int h, int key)
    {
        if (l > h)
            return -1;
 
        int mid = (l + h) / 2;
        if (arr[mid] == key)
            return mid;
        if (arr[l] <= arr[mid])
        {
            if (key >= arr[l] && key <= arr[mid])
                return search(arr, l, mid - 1, key);
            return search(arr, mid + 1, h, key);
        }
        if (key >= arr[mid] && key <= arr[h])
            return search(arr, mid + 1, h, key);
        return search(arr, l, mid - 1, key);
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int j=0;j<n;j++)
        {
            arr[j]=s.nextInt();
        }
        int key = s.nextInt();
        int i = search(arr, 0, n - 1, key);
        if (i != -1)
            System.out.println(i);
        else
            System.out.println(-1);
    }
}
 