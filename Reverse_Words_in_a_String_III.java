import java.util.Scanner;
class StringFormatter
{
    static String reverseWord(String str)
    {
        String words[]=str.split(" ");  
        String reverseWord="";
        for(String w:words)
        {
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            reverseWord+=sb.toString()+" ";
            
        }
        return reverseWord.trim();
        
    }  
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        String sc=s.nextLine();
        System.out.println(reverseWord(sc));
    }  
}  