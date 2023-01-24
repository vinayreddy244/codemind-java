import java.util.Scanner;
class EquilibriumPoint
{
       public static int findEquilibrium(int arr[], int n)
         {
             //add code here.
             int rightsum=0;
             int leftsum=0;
             for(int i=0;i<n;i++)
                 rightsum+=arr[i];
             for(int i=0;i<n;i++)
             {
               rightsum-=arr[i];
               if(leftsum==rightsum)
                   return i+1;
               leftsum+=arr[i];
             }
             return -1;
        }
	   public static void main(String args[]) 
       { 
			Scanner sc=new Scanner(System.in);
			int n,new_size,x[];
			n=sc.nextInt();
			x=new int[n];
			for(int i=0;i<n;i++)
			{
				x[i]=sc.nextInt();
			}  
			System.out.println(findEquilibrium(x, n));
       } 
}