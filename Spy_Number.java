import java.util.Scanner;  
class SpyNumberExample1   
{  
public static void main(String args[])  
{   
int num, product=1, sum=0, lastdigit;  
Scanner sc = new Scanner(System.in); 
num=sc.nextInt(); 
while(num>0)  
{  
lastdigit=num%10;  
sum=sum+lastdigit;  
product=product*lastdigit;  
num=num/10;  
}  
if(sum==product)  
System.out.println("Spy Number");  
else  
System.out.println("Not Spy Number");  
}  
}  