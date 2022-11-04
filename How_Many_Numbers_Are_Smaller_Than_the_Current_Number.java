import java.util.Scanner;
import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int b[] = arr.clone(); 
		Arrays.sort(arr);
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i =0 ;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				continue;
			}
			map.put(arr[i], i);
		}
		for(int i = 0 ;i<b.length;i++)
		{
			arr[i]=map.get(b[i]);
			System.out.print(arr[i]+" ");
		}
    }
}