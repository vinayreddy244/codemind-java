import java.util.Scanner;
class Sample {
 
    public static void main(String[] args) 
    {
        int n1,n2,mod;
        Scanner s= new Scanner(System.in);
         n1 = s.nextInt();
         n2 = s.nextInt();
         mod=n1%n2;
 
        System.out.println(mod);
    }
}

