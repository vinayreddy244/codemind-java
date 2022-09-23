import java.util.Scanner;
class Sample
{ 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine(); 
        String s1[]=s.split(":"); 
        int h=Integer.parseInt(s1[0]); 
        int m=Integer.parseInt(s1[1]); 
        float angle=(30*h) - ((float)11/2 )* m ;    
        angle=Math.abs(angle);    
        if(angle>180) 
        System.out.println(360-angle);   
        else     
        System.out.println(angle); 
        }
    }