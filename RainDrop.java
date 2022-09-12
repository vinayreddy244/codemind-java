import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int number=s.nextInt();
       String result="";
        if(number%3==0)
        {
            result+="Pling";
        }
        if (number % 5 == 0)
        {
            result+="Plang";
        }
        if (number % 7 == 0)
        {
            result+="Plong";
        }
        if (result.toString().isEmpty() )
        {
            result+=number;
            result.toString();
        }
         System.out.println(result);
    }
}
