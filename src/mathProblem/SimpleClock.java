package mathProblem;
import java.util.Scanner;

public class SimpleClock {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter at which number hour hand is locating ");
		int hourHand=sc.nextInt();
		System.out.print("Enter minute hand value ");
		int minuteHand=sc.nextInt();
		
		float value=(((60*hourHand)+minuteHand))/60;
		System.out.print(""+value);
		float degreehourHand=(30)*(((60*hourHand)+minuteHand)/60);
		System.out.print(""+degreehourHand);
		
		
		
	}

}
