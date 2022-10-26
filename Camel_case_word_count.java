import java.util.Scanner;
class CamelCase 
{
    static int countWords(String str)
{
    int count = 1;
 
    for (int i = 1; i < str.length() - 1; i++) {
        if (str.charAt(i)>=65&&str.charAt(i)<=90)
            count++;
    }
 
    return count;
}
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String sc= s.next();
        System.out.println(countWords(sc));
        
    }
}