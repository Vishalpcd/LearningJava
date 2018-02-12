package armstrong;
import java.util.*;
import java.math.*;

public class ArmstrongNumber {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number ");
		int number=sc.nextInt();
		int numOfDigits=0;
		int dup=number;
		int digitConversion=number;
		int armStrongNumber=0;
		while(dup !=0)
		{
			
			digitConversion=dup%10;
			dup=dup/10;
			armStrongNumber=armStrongNumber+(digitConversion*digitConversion*digitConversion);
		}	
		if(armStrongNumber==number)
		{
			System.out.println(number+"  is an armstrong number ");
		}
		else
		{
			System.out.println(number+" is not an armstrong number ");
		}
	}

}
