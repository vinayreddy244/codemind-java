import java.util.Scanner;  
class SumOfDigits   
{  
static int digSum(int n)  
{  
if (n == 0)  
return 0;  
return (n % 9 == 0) ? 9 : (n % 9);  
}     
public static void main (String args[])  
{  
    Scanner s=new Scanner(System.in);
    int n = s.nextInt();  
    System.out.println(digSum(n));  
}  
}