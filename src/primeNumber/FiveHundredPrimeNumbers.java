package primeNumber;
import java.util.*;

public class FiveHundredPrimeNumbers {
	public static int limit;
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter how many numbers of prime number you want ");
		limit=sc.nextInt();
		System.out.print("1 2");
		for(int i=3;i<=limit;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					break;
				}
				else if(j==(i/2))
				{
						System.out.print(" "+i);
						break;
				}
			}
		}
			
			
		
		
	}
	

}
