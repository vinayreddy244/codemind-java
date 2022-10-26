import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String sc=s.nextLine();
        String words[]=sc.split(" "); 
        System.out.println(words.length);
    }
}