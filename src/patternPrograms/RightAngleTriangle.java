package patternPrograms;
import java.util.*;

public class RightAngleTriangle {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter how many rows you want ");
		int row=sc.nextInt();
		System.out.print("Enter the value that you want to print in the pattern ");
		String valueForPattern=sc.next();
		for(int i=0;i<=row;i++)
		{
			System.out.println();
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+valueForPattern+" ");
			}
		}
	}

}
