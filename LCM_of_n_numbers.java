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
    int lcm = array[0];
    int gcd = array[0];
    for(int i=1; i<array.length; i++){
      gcd = findGCD(array[i], lcm);
      lcm = (lcm*array[i])/gcd;
    }
    System.out.println(lcm);
  }
  static int findGCD(int a, int b)
  {
    if(b == 0)
      return a;
    
    return findGCD(b, a%b);
  }
}