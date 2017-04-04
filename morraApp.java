import java.util.Scanner;
import java.util.Random;

public class morraApp
{
	public static void main(String[] args)
	{
		// setting variables
		int GameOver=6;
		int humanfingers;
		int Computerfingers;
		int sumoffingers;
		int humanscore;
		int computerscore;
		boolean playagain=false;
		boolean issumodd=false;
		boolean issumeven=false;
		String play;
		String humanname;
		String computername="x";

		Scanner key = new Scanner(System.in);
		System.out.println("Welcome, do you want to play Morra (y/n)? ");

		play=key.next();

		if (play.equalsIgnoreCase("y"))
		{
			playagain=true;
			System.out.println("You selected YES, good human yourself");
		}
		else
		{
			playagain=false;
			System.out.println("You selected NO, go away");
		}

		System.out.println("Would you like to be called Odd or Even ?");
		humanname=key.next();
		if (humanname.equalsIgnoreCase("Odd"))
		{
			computername="Even";
		}
		else if (humanname.equalsIgnoreCase("Even"))
		{
			computername="Odd";
		}
		else
		{
			System.out.println("ERROR, you did not select Odd or Even ");
		}

		while (playagain==true)
		{

			System.out.println("You are called the " + humanname + " Player");
			System.out.println("You're openenent (the computer) is called " + computername + " Player");

			System.out.println("Please enter the amount of fingers you would like (1-10)?");
			humanfingers=key.nextInt();
			System.out.println("You selected " + humanfingers + " fingers");


			System.out.println("");
			Random randomGenerator = new Random();
			Computerfingers = randomGenerator.nextInt(10);

			System.out.println("");
			System.out.println("Computer selected " + Computerfingers + " fingers");
			sumoffingers=humanfingers+Computerfingers;

			System.out.println("");
			System.out.println("Total number of fingers: " + sumoffingers + " fingers");

			if (sumoffingers%2>0)
			{
				System.out.println("");
				System.out.println("ANSWER IS ODD - ODD PLAYER WINS");
				System.out.println("");

			}
			else
			{
				System.out.println("");
				System.out.println("ANSWER IS EVEN - EVEN PLAYER WINS");
				System.out.println("");
			}



			System.out.println("Would you like to play again (y/n)?");
			play=key.next();

			if (play.equalsIgnoreCase("y"))
			{
				playagain=true;
				System.out.println("You selected YES, good human yourself");
			}
			else
			{
				playagain=false;
				System.out.println("You selected NO, go away");
			}
		}
	}
}