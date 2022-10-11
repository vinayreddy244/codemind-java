import java.util.Scanner;
import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        char c=s.charAt(0);
        if(n!=10)
        {
            System.out.println("Invalid");
        }
        else if(c=='0')
        {
            System.out.println("Invalid");
        }
        else
        {
            System.out.println("Valid");
        }
    }
}