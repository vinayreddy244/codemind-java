import java.util.Scanner;
class Sample{
    public static void decompress(int x[],int n)
    {
        int k;
        for(int i=0;i<n;i=i+2)
        {
            k=x[i];
            while(k-->0)
            {
                System.out.print(x[i+1]+" ");
            }
        }
    }
    public static void main(String args[])
    {
    Scanner s=new Scanner(System.in);
    int x[],n;
     n=s.nextInt();
     x=new int[n];
    for(int i=0;i<n;i++)
    {
     x[i]=s.nextInt();
    }
     decompress(x,n);
   }
}
    