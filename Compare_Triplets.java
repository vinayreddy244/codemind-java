import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int acnt=0;
        int bcnt=0;
        int a[]=new int[4];
        int b[]=new int[4];
        for(int i=0;i<3;i++)
        {
            a[i]=s.nextInt();
        }
        for(int j=0;j<3;j++)
        {
            b[j]=s.nextInt();
        }
        for(int i=0;i<3;i++)
        {
            if(a[i]==b[i])
            {
                acnt+=0;
                bcnt+=0;
            }
            else if(a[i]<b[i])
            {
                bcnt+=1;
            }
            else
            {
                acnt+=1;
            }
        }
        System.out.print(acnt+" "+bcnt);
    }
}