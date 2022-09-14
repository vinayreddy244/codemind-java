import java.util.Scanner;
class Sample
{
    static int reverse(int n)
        {
        int temp,r,sum=0;
           temp=n;
           while(temp!=0)
           {
               r=temp%10;
               sum=sum*10+r;
               temp=temp/10;
           }
           if(n==sum)
           {
               return 1;
           }
           else
           {
               return 0;
           }
          
       }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int c=0;
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(reverse(arr[i])==1)
            {
                c++;
            }
        }
        System.out.println(c);
  }
}