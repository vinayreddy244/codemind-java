import java.util.Scanner;
import java.util.*;
class Sample
{
    static int largest(int[] A)
    {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : A) 
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int max = -1;
        for (Integer key : map.keySet())
        {
            if (map.get(key) == 1)
            {
                max = Math.max(key, max);
            }
            
        }
    return max;
  }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println(largest(arr));
    }
}