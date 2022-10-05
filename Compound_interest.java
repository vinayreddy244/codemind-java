import java.io.*;
import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        double p=s.nextInt();
        double r=s.nextInt();
        double t=s.nextInt();
        double c;
        c=p*(Math.pow((1 + r / 100),t));
        System.out.format("%.2f",c);
    }
}