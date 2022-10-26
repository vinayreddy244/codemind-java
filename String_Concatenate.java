import java.util.Scanner;
import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        String s2=s.nextLine();
        String s3=s1+s2;
        char[] characters = s3.toCharArray();
        Arrays.sort(characters);
        for(char c:characters)
        {
            System.out.print(c);
        }
        
    }
}