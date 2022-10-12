import java.util.Scanner;
import java.lang.Math;
class Sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        double sqrt=Math.sqrt(n); 
         if((sqrt - Math.floor(sqrt)) == 0)
         {
             System.out.println("True");
         }
         else
          {
            System.out.println("False");
          }
    }
}