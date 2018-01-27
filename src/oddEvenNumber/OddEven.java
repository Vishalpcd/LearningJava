package oddEvenNumber;
import java.util.*;

public class OddEven {
	public  static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int number;
		System.out.print("Enter the number ");
		number=sc.nextInt();
		if(number%2==0)
		{
			System.out.println(number+" is an even number ");
		}
		else
		{
			System.out.println(number+" is odd number ");
		}
	}

}
