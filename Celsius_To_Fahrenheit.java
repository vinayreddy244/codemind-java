import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        float cel=s.nextFloat();
        double far;
        far= ((cel*9)/5)+32;
        System.out.format("%.2f",far);
    }
}