import java.util.Scanner;
class subtract_product_and_sum
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(subtractProductAndSum(n));
    }
    static int subtractProductAndSum(int n)
    {
        int product = 1 , sum = 0;
        while(n > 0)
        {
            product *= (n % 10);
            sum += (n % 10);
            n /= 10;
        }
        return product - sum;
    }
}
