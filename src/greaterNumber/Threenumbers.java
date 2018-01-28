package greaterNumber;
import java.util.*;

public class Threenumbers {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num1,num2,num3;
		System.out.print("Enter your first number ");
		num1=sc.nextInt();
		System.out.print("Enter your second number ");
		num2=sc.nextInt();
		System.out.print("Enter your third number ");
		num3=sc.nextInt();
		if(num1>num2&&num1>num3)
		{
			System.out.println(num1+" is  greatest number");
		}
		else if(num2>num3&&num2>num1)
		{
			System.out.println(num2+" is greatest number ");
		}
		else
		{
			System.out.println(num3+" is greatest number ");
		}
	}

}
