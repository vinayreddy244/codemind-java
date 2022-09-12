import java.util.Scanner;
class GFG {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int radius;
        radius=s.nextInt();
        double pi = 3.14;
        double area;
        area = pi * radius * radius;
        System.out.format("%.2f",area);
    }
}