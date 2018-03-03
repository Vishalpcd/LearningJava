package mathProblem;
import java.util.Scanner;

public class Percentage {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your total marks ");
		int marks=sc.nextInt();
		System.out.print("Enter the total marks of the subjects ");
		int total=sc.nextInt();
		double percentage=((marks*100)/total);
		System.out.print("Your percantage "+percentage);
	}

}
