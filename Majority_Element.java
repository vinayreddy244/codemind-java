import java.util.*;
class Solution 
{
    static int majorityElement(int[] nums) 
    {
        ArrayList<Integer> al=new ArrayList<>();
        int maj=0;
        HashSet<Integer> hs=new HashSet<>();
        for(int ele:nums)
        {
            al.add(ele);
            hs.add(ele);
        }
        for(Integer ele:hs)
        {
            if(Collections.frequency(al,ele)>nums.length/2)
            {
                maj=(int)ele;
                break;
            }
        }
        return maj;
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
        System.out.println(majorityElement(arr));
    }
}