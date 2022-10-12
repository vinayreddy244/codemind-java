import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int r;
        String sc="";
        while(n>0)
        {
            r=n%10;
            sc+=r;
            n=n/10;
            
        }
        System.out.println(sc);
    }
}