import java.util.Scanner;
class Sample
{
     static int findGCD(int a, int b)
  {
    while (b > 0)
    {
        int temp = b;
        b = a % b; 
        a = temp;
    }
    return a;
  }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        int res=findGCD(n1,n2);
        System.out.println(res);
    }
}