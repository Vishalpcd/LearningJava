package primeNumber;

import java.util.Scanner;
public class PrimeNumbersFromGivenRange {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the starting number of the range ");
		int start=sc.nextInt();
		System.out.print("Enter the ending number of the range ");
		int end=sc.nextInt();
		int flag=1;
		for(int i=start;i<=end;i++)
		{
			if(i==1)
			{
				System.out.print(" "+i);
				flag=1;
				break;
			}
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
				else
				{
					flag=0;
				}
				
				
				
			}
			if(flag==0)
			{
			System.out.print(" "+i);
			}
		}
	}

}
