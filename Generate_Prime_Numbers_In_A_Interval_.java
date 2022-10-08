import java.util.Scanner;
class Sample
{
  public static void main (String args[])
  {
     Scanner s=new Scanner(System.in);
     int lower=s.nextInt();
     int upper=s.nextInt();
    for (int i = lower; i <= upper; i++)
      if (isPrime (i))
	  System.out.println (i);
  }

  static boolean isPrime (int n)
  {
    if (n <= 1)
        return false;
    else if (n == 2)
        return true;
    else if (n % 2 == 0)
        return false;
    for (int i = 3; i <= Math.sqrt(n); i += 2)
    {
        if (n % i == 0)
            return false;
    }
    
    return true;
  }
}