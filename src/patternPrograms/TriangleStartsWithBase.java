package patternPrograms;
import java.util.Scanner;

public class TriangleStartsWithBase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value for the pattern");
		String value=sc.next();
		System.out.println("Enter how many rows you want ");
		int rows=sc.nextInt();
		for(int row=rows;row>=1;row--)
		{
			System.out.println();
			for(int rowValue=row;rowValue>=1;rowValue--)
			{
				System.out.print(""+value);
			}
		}

	}

}
