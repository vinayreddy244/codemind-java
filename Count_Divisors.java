import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int l=s.nextInt();
        int r=s.nextInt();
        int k=s.nextInt();
        int c=0;
        for(int i=l;i<=r;i++)
        {
            if(i%k==0)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}