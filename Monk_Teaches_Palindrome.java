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
            String reverseStr="";
            int n= sc.length();
            for (int j=n-1;j>=0;j--) 
            {
                reverseStr = reverseStr + sc.charAt(j);
            }
            if (sc.equals(reverseStr)&&(n%2==0))
            {
                System.out.println("YES EVEN");
            }
            else if(sc.equals(reverseStr)&&(n%2!=0))
            {
                System.out.println("YES ODD");
            }
            else
            {
                System.out.println("NO");
            }
            
        }
    }
}