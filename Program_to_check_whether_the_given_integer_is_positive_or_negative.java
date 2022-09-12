import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n<0)
        System.out.println("Negative Number");
        else
        System.out.println("Positive Number");
    }
}