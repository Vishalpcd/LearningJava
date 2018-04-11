package factorialPrograms;
import java.util.*;


public class FactorialOfNumber {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number ");
		int number=sc.nextInt();
		int ans=1;
		for(int i=1;i<=number;i++)
		{
			ans=ans*i;
		}
		System.out.print("The factorial of "+number+" is "+ans);
	}

}
