package patternPrograms;
import java.util.*;

public class RightAngleTriangleStartingFromRight {
	public static void main(String args[])
	{
		int row=10;
		for(int i=1;i<=row;i++)
		{
			System.out.println();
			for(int j=row;j>=i;j--)
			{
				System.out.print(" *");
			}
		}
	}

}
