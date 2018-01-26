package coPrimeNumber;
import java.util.*;

public class CoPrimeNumber {
	
	public static void main(String args[])
	{
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number ");
		num1=sc.nextInt();
		System.out.print("Enter the second number ");
		num2=sc.nextInt();
		/*int dup;*/
		boolean flag=true;
		for(int i=2;i<(num1/2);i++)
		{
			/*dup=i;*/
			if((num1%i==0)&&(num2%i==0))
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println(num1+" and "+num2+" both are the co-prime number of each other ");
		}
		else
		{
			System.out.println(num1+" and "+num2+" are not co-prime number of each other ");
		}
	}

}
