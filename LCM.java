import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
      Scanner s=new Scanner(System.in);
    int n1 =s.nextInt();
    int n2=s.nextInt();
    int lcm;

    // maximum number between n1 and n2 is stored in lcm
    lcm = (n1 > n2) ? n1 : n2;

    // Always true
    while(true) {
      if( lcm % n1 == 0 && lcm % n2 == 0 ) {
        System.out.println(lcm);
        break;
      }
      ++lcm;
    }
  }
}