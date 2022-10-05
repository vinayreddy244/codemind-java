import java.util.Scanner;
class Sample
{
  public static void main(String[] args) 
  {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int array[]=new int[n];
      for(int i=0;i<=n-1;i++)
      {
          array[i]=s.nextInt();
      }
    int gcd = array[0];
    for(int i=1; i<array.length; i++){
      gcd = findGCD(array[i],gcd);
    }
    System.out.println(gcd);
  }
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
}