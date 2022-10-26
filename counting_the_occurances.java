import java.util.Scanner;
class Sample
{
    public static void main(String agrs[])
    {
        Scanner s=new Scanner(System.in);
        String sc=s.nextLine();
        char ch=s.next().charAt(0);
        char characters[]=new char[sc.length()];
        characters=sc.toCharArray();
        int cnt=0;
        for(char c:characters)
        {
            if(c==ch)
            {
                cnt+=1;
            }
        }
        if(cnt>0)
        {
            System.out.println(cnt);
        }
        else
        {
            System.out.println(-1);
        }
    }
}