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
        int c=0;
        for(int i=0;i<n;i++)
        {
            String res=Integer.toString(arr[i]);
            if(res.length()%2==0)
            {
                c+=1;
            }
        }
        System.out.println(c);
    
    }
}