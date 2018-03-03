package animationPrograms;

import java.util.Scanner;

//increasing the snake animation
class Increase extends Thread
{
	public String value="";
	public void run()
	{
		
		for(int i=0;i<10;i++)
		{
			
			
			System.out.print(""+value.concat("="));
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				
			}
			
			
		}
		System.out.print("");
		
	}
}

//decreasing the snake animation
/*class Decrease extends Increase implements Runnable
{
	public void run()
	{
		int k=0;
		System.out.print(""+value);
		for(int j=10;j>=0;j--)
		{
			System.out.print(""+value.substring(0, j-1));
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				
			}
			
		}
	}
}*/
public class SimpleSnakeAnimation {
	public static void main(String args[])
	{
		/*int size;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the snake");*/
		Increase in=new Increase();
		in.start();
		/*Decrease d=new Decrease();
		d.start();*/
	}

}
