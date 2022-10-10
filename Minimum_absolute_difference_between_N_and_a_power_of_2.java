import java.util.*;
class GFG
{
static int minAbsDiff(int n)
{
    int left = (int)Math.pow(2, (int)(Math.log(n) /
                                Math.log(2)));
    int right = left * 2;
    return Math.min((n - left), (right - n));
}
 
public static void main(String args[])
{
    Scanner s=new Scanner(System.in);
    int n = s.nextInt();
    System.out.println(minAbsDiff(n));
}
}
 