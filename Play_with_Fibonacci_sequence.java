import java.util.Scanner;
class Main 
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int  firstTerm = 0, secondTerm = 1;

    for (int i = 1; i <= n; i++) 
    {
      System.out.print(firstTerm + " ");
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }
  }
}