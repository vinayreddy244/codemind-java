import java.util.Scanner;
class Sample
{
    static void leftRotate(int arr[], int k, int n)
    {
        for (int i = 0; i < k; i++)
            leftRotatebyOne(arr, n);
    }
 
    static void leftRotatebyOne(int arr[], int n)
    {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[n-1] = temp;
    }
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
        leftRotate(arr,k,n);
        for(int j=0;j<n;j++)
        {
            System.out.print(arr[j]+" ");
        }
    }
}