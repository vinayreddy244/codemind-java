import java.util.Scanner;
import java.lang.Math;
class CheckPerfectSquareExample1  
{   
static boolean checkPerfectSquare(int number)    
{   
  double sqrt=Math.sqrt(number); 
 if((sqrt - Math.floor(sqrt)) == 0)
 {
     return true;
 }
 else
 {
     return false;
 }
}  
public static void main(String[] args)    
{   
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   for(int i=1;i<=t;i++)
   {
     int number=sc.nextInt();
     if(checkPerfectSquare(number))
     {
     System.out.println("True");
     }
     else
     {
         System.out.println("False");
     }
   }
}   
}   