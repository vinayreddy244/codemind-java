import java.util.Scanner;
class Main
 {
   public static void main (String[]args)
   {
      Scanner s=new Scanner(System.in);
     int num = s.nextInt();

     if (detectStrong (num))
         System.out.println ("The number"+" "+num+" is a strong number");
     else
         System.out.println ("The number"+" "+num + " is not a strong number");
   }

   // function to calculate factorial
   static int facto (int n)
   {
     int fact = 1;

     for (int i = 1; i <= n; i++)
       fact = fact * i;

     return fact;
   }

   static boolean detectStrong (int num)
   {

     int digit, sum = 0;
     int temp = num;
     boolean flag = false;

     // calculate 1! + 4! + 5!
     while (temp != 0)
       {
     	digit = temp % 10;

     	sum = sum + facto (digit);
 	    temp /= 10;
       }
     if (sum == num)
       flag = true;
     else
       flag = false;

     return flag;


   }
 }