import java.util.Scanner;
import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String sc=s.nextLine();
        char characters[]=new char[sc.length()];
        characters=sc.toCharArray();
        int sum=0;
        for(char c:characters)
        {
            if(Character.isDigit(c))
            {
                int digit = c - '0';
                sum=sum+digit;
            }
        }
        System.out.println(sum);
    }
}