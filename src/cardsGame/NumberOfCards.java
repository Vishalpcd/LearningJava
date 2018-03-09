package cardsGame;
import java.util.Scanner;

public class NumberOfCards {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter which type of card you have or you want get information about cards");
		String TypeOfCardYouHave=sc.next();
		TypeOfCardYouHave=TypeOfCardYouHave.toLowerCase();
		switch(TypeOfCardYouHave)
		{
		case "spades":
			System.out.println(TypeOfCardYouHave+" is in black color.There are 13 cards outof 52 cards");
			break;
		case "clubs":
			System.out.println(TypeOfCardYouHave+" is in black color.There are 13 cards outof 52 cards");
			break;
		case "diamonds":
			System.out.println(TypeOfCardYouHave+" is in red color.There are 13 cards outof 52 cards");
			break;
		case "hearts":
			System.out.println(TypeOfCardYouHave+" is in red color.There are 13 cards outof 52 cards");
			break;
		default:
			System.out.println(TypeOfCardYouHave+" is not a valid name please provide names from these names spades, hearts, diamonds and clubs");
			break;
		}
	}

}
