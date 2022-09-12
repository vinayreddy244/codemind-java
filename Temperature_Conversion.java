import java.util.Scanner;
class temperature  
 {  
   public static void main (String args[])  
    { 
        Scanner s=new Scanner(System.in);
        int Celsius;
        double Fahrenheit;  
        Celsius= s.nextInt();  
        Fahrenheit =(Celsius*1.8+32);  
        System.out.format("%.2f",Fahrenheit);  
    }
     
 }  