package oldGame;

import java.util.Scanner;
import java.math.*;
import java.util.Random;
public class Old {
	public static void main(String args[])
	{
		Random rnd=new Random();
		int rndnumber=rnd.nextInt(3);
		if(rndnumber==0)
		{
			System.out.println("You are a chor ");
		}
		else if(rndnumber==1)
		{
			System.out.println("You are police ");
		}
		else if(rndnumber==2)
		{
			System.out.println("you are king ");
		}
		else
		{
			System.out.println("you are sipahi ");
		}
		
	
	}

}
