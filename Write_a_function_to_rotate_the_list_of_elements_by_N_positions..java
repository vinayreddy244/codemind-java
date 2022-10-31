import java.io.*;
import java.util.*;
class GFG 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        List<Integer> my_list = new ArrayList<>(n);
        for(int i=1;i<=n;i++)
        {
            int num=s.nextInt();
            my_list.add(num);
        }
        int k=s.nextInt();
        Collections.rotate(my_list,k);
        for (int sc :my_list) 
        {
            System.out.print(sc + " ");
            
        }        

    }
}