import java.util.Scanner;
import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
            String sc=s.nextLine();
            boolean digitFound = false;
            char[] characters = sc.toCharArray();
            int ct=0;
            for(char c:characters)
            {
                if(Character.isDigit(c))
                {
                    digitFound = true;
                    ct+=1;
                }
            }
            if(ct>0)
            {
                System.out.println("Contains"+" "+ct+" "+"digit");
            }
            else
            {
                System.out.println("Doesn't contain digit");
            }
    }
}