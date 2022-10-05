import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        float far=s.nextFloat();
        float cel;
        cel=((far-32)*5)/9;
        System.out.format("%.2f",cel);
    }
}