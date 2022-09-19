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
        for(int i=n-1;i>=0;i--)
        {if(arr[i]%2!=0)
        {
            System.out.println(i);
            break;
            
        }
            
        }
        
    }
    
}