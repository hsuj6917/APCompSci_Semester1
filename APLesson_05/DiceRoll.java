import java.util.Random;

public class DiceRoll
{
	public static void main(String[]args)
	{
		Random roll = new Random();
	
		int P = roll.nextInt(6) + 1;
		int C = roll.nextInt(6) + 1;
	
		System.out.println("You rolled a " + P);
		System.out.println("Computer rolled a " + C);
		String winner = "";
		if(rollDice(P,C))
		{
			winner = "you";
		}
		
		if(!rollDice(P,C))
		{
			winner = "not you";
		}
		
		System.out.println("The winner is " + winner);
	}
	
	public static boolean rollDice(int P, int C)
	{
		if(P > C)
		{
			return true;
		}
		
		if(P <= C)
		{
			return false;
		}
		
		return false;

	}
}