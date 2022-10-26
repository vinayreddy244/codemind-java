import java.util.Scanner;
import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        s.nextLine();
        for(int i=0;i<t;i++)
        {
            String sc=s.nextLine();
            boolean digitFound = false;
            char[] characters = sc.toCharArray();
            for(char c:characters)
            {
                if(Character.isDigit(c))
                {
                    digitFound = true;
                    break;
                }
                
            }
            if(digitFound)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
            
        }
    }
}