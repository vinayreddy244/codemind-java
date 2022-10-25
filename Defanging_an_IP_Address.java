import java.util.Scanner;
import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String sc=s.nextLine();
        String defangIP = "";
    for(int i = 0; i < sc.length(); i++)
    {
       char c = sc.charAt(i);
       if(c == '.')
       {
           defangIP += "[.]";
       }
       else
       {
           defangIP += c;
       }
    }
    System.out.println(defangIP);
    }
}