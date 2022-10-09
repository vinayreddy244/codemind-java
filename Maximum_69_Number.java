import java.util.*;
import java.lang.*;
class Solution
{  
    public static int maximum69Number (int num) 
    {
        int[] arr=new int[4];
        int i=3;
        while(num!=0){
            arr[i--]=num%10;
            num/=10;
        }
        for(i=0;i<=3;i++){
            if(arr[i]==6){arr[i]=9;break;}
        }
        int ans=0,mul=1;
        for(i=3;i>=0;i--){
            ans+=(mul*arr[i]);
            mul*=10;
        }
        return ans;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(maximum69Number(n));
    }
}
