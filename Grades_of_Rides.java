import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int h=s.nextInt();
        int sp=s.nextInt();
        int sd=s.nextInt();
        if(h>50&&sp>60&&sd>100)
        {
            System.out.println(10);
        }
        else if(h>50&&sp>60&&sd<100)
        {
            System.out.println(9);
        }
        else if(h<50&&sp>60&&sd>100)
        {
            System.out.println(8);
        }
        else if(h>50&&sp<60&&sd>100)
        {
            System.out.println(7);
        }
        else if(h>50||sp>60||sd>100)
        {
            System.out.println(6);
        }
        else
        {
            System.out.println(5);
        }
    }
}