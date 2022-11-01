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
        int evencnt=0;
        int oddcnt=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                evencnt+=1;
            }
            else
            {
                oddcnt+=1;
            }
        }
        System.out.println(evencnt+" "+oddcnt);
        
    }
}