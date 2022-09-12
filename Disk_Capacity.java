import java.util.Scanner;
class Sample 
{
 
    public static void main(String args[]) 
    {
        Scanner s= new Scanner(System.in);
        
        int track=s.nextInt();
        int sector=s.nextInt();
        int block=s.nextInt();
        int sum=(track*sector*block)*512*2;
        System.out.println(sum);
    }
}

