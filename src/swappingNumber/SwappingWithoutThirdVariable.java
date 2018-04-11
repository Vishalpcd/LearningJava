package swappingNumber;
import java.util.*;
public class SwappingWithoutThirdVariable {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int number1,number2;
		System.out.print("Enter your first number ");
		number1=sc.nextInt();
		System.out.print("Enter your second  number ");
		number2=sc.nextInt();
		System.out.println(" before swapping first number is"+number1+" and second number is "+number2);
		number1=number1+number2;//adding the both values of the numbers
		number2=number1-number2;//subtracting number2=6-2 i.e number2=4
		number1=number1-number2;//number1=6-4;
		System.out.println("after swaping first number is "+number1+" and second number is "+number2);
		
	}

}
