import java.util.Scanner;
class Solution 
{
    static int maxSubArray(int[] nums) 
    {
        int msf=nums[0];
        int men=0;
        for(int i=0;i<nums.length;i++)
        {
            men=men+nums[i];
            if(msf<men)
            {
                msf=men;
            }
            if(men<0)
            {
                men=0;
            }
        }
        return msf; 
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
            System.out.println(maxSubArray(arr));
        }
}