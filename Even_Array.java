import java.util.Scanner;
class Sample
{
    static boolean allEven(int[] arr)
    {
    for (int i = 0; i<arr.length; i++) 
    {
        if (arr[i] % 2 != 0)
        {
            return false;
        }
    }
    return true;
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
        boolean a=allEven(arr);
        if(a==true)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}