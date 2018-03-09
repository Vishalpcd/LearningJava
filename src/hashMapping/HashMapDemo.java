package hashMapping;

import java.util.HashMap;
import java.util.Scanner;
public class HashMapDemo {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter how many friends you have ");
		int number=sc.nextInt();
		String value;
		HashMap<Integer,String> hm=new HashMap<Integer,String>(number);
		for(int i=1;i<=number;i++)
		{
			System.out.print("Enter your friends name ");
			value=sc.next();
			hm.put(i, value);
		}
		for(int j=1;j<=number;j++)
		{
			System.out.println(hm.get(j)+"   ");
		}
	}

}
