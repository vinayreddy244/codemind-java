import java.util.Scanner;
class Average {
  public static void main(String[] args) 
  {
      Scanner s=new Scanner(System.in);
    int num1 =s.nextInt();
    int num2 = s.nextInt();
    double sum = 0.0;
    double avg = 0;
    sum = num1 + num2;
    avg = sum/2;
    System.out.format("%.4f",avg );
  }
}