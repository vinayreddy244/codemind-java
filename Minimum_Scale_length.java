import java.util.Scanner;
class Sample 
{
  public static void main(String[] args) 
  {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
    int array[]=new int[n];
    for(int i=0;i<n-1;i++)
    {
        array[i]=s.nextInt();
    }
    int result = array[0];
    for(int i=1; i<array.length; i++){
      result = findGCD(array[i], result);
    }
    System.out.print(result);
  }
  static int findGCD(int a, int b){
    if(b == 0)
      return a;
    return findGCD(b, a%b);
  }

}