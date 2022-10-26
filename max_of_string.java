import java.util.Scanner;
class Sample
{
    static char largest(String a, int n)
    {
        char max = 'A';
        for (int i=0; i<n; i++)   
            if (a.charAt(i) > max)
                max = a.charAt(i);   
        return max;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String sc=s.nextLine();
        char res=largest(sc,sc.length());
        System.out.println(res);
    }
}