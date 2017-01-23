import java.util.*;

public class GameHealth
{
	static String[] health;
	static int HEALTHLOAD = 6;
	static int healthCount;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String turn = "";
		int damage = 0;
		int amount = 0;
		healthcount = 0;
		String[] health = new String[HEALTHLOAD.length];
		
		while(!turn.equals("Q") && healthCount > 0)
		{
			System.out.println("Your turn! Hit Enter when ready: ");
			turn = kb.next();
			damage = (int)(Math,random()*2+1);
			amount = (int)(Math.random()*6+1);
			System.out.println(takeDamage(damage,amount));
			printClip();
		}
		
		public static String takeDamage(int dmg, int amt)
		{
			if(dmg == 1)
			{
				healthCount = healthCount - amt;
				return "Taking " + amt + " damage!";
			}
			else
			{
				if(healthCount + amt < HEALTHLOAD)
				{
					healthCount = healthCount = amt;
				}
				else
				{
					healthCount = HEALTHLOAD;
				}
			}
			return "Power Up " + amt + "!";
		}
		
		public static void printClip()
		{
			String output = "Health:\t";
			for(int i = 0; i < HEALTHLOAD; i++)
			{
				if(i < healthCount)
				{
					health[i] = " @ "
				}
				else
				{
					health[i] = "[]";
				}
				output = output + health[i];
			}
			System.out.println(output);
		}
	}
}