import java.util.Scanner;
class MultiplyTwoNumbers 
{

    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);

        float first = s.nextFloat();
        float second = s.nextFloat();

        float product = first * second;

        System.out.format("%.2f",product);
    }
}