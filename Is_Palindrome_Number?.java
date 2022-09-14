import java.util.Scanner;
class Pd
{
	public static void main(String args[])	
	{
	    int n,t,s;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
	    s=palindromeOrNot(n);
	    System.out.println(s);
	}
	static int  palindromeOrNot(int num )
	{
	    int sum=0,r;
	    int t=num;
	    while(num!=0&&num<=25000)
	    {
	    r=num%10;
	    sum=(sum*10)+r;
	    num/=10;	
	    }
	  if(sum==t)
	  return 2;
	  else
	  return 1;
	}
}