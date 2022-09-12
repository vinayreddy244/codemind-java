import java.util.Scanner;
class Sample
{
 
    public static void main(String[] args) 
    {
        int n;
        Scanner s= new Scanner(System.in);
         n=s.nextInt();
         int sum=n*(n-1)/2;
         System.out.println(sum);
    }
}

