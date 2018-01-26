package primeNumber;
import java.util.*;

public class PrimeNumber {
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number=sc.nextInt();
		int flag=1;
		for(int i=2;i<(number/2);i++)
		{
			if(number%i==0)
			{
				flag=0;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println(number+" is a prime number");
		}
		else
		{
			System.out.println(number+" is not a prime number ");
		}
		
	}

}
