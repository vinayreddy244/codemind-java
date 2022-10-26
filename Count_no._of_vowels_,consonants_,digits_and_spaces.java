import java.util.Scanner;
class Sample
{
    static void countCharacterType(String str)
    {
        int vowels = 0, consonant = 0, whitespaces = 0,digit = 0;
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if ( (ch >= 'a' && ch <= 'z') ||(ch >= 'A' && ch <= 'Z') )
            {
                ch = Character.toLowerCase(ch);
                if (ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o' || ch == 'u')
                    vowels++;
                else
                    consonant++;
            }
            else if (ch >= '0' && ch <= '9')
                digit++;
            else
                whitespaces++;
        }
          
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonant);
        System.out.println("Digits: " + digit);
        System.out.println("White spaces: " + whitespaces);
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String sc=s.nextLine();
        countCharacterType(sc);
        
    }
}