import java.util.Scanner;

public class Adventure
{
	static String choice1, choice2, choice3;
	
	static Scanner kb = new Scanner(System.in);
	public static void main(String[]args)
	{	
		System.out.println("You are at TPHS. Do you go to the library or the gym?");
		choice1 = kb.next();
	if(choice1.equals("library"))
	{
		System.out.println("Some freshman insults you as he walks by. Do you punch or kick him?");
		choice2 = kb.next();
		String fodder = kb.nextLine();
		if(choice2.equals("punch"))
		{
			System.out.println("He blocks your punch and pins you down. Do you keep fighting or give up?");
			choice3 = kb.nextLine();
			if(choice3.equals("keep fighting"))
				System.out.println("Just when you start winning the fight, a teacher sees you. You are suspended. Your harvard acceptance letter is rescinded. \nDon't get into fights");
			else
				System.out.println("The freshman spares your life, but now the whole school thinks you are weak. Your prom date dumps you. \nDon't get into fights.");
		}
		
		else
		{
			System.out.println("Your kick sends the freshman through the ceiling. A teacher approaches. Do you run or stay?");
			choice3 = kb.next();
			if(choice3.equals("run"))
				System.out.println("You run from the scene. Another teacher catches you, and you are forced to pay for ceiling damage.\nDon't get into fights.");
			else
				System.out.println("You stay and accept responsibility. You are forced to pay for ceiling damage. \nDon't get into fights.");
		}
			
	}
	else
	{
		System.out.println("The badminton team is practicing inside the gym. Do you watch or interrupt?");
		choice2 = kb.next();
		if(choice2.equals("watch"))
		{
			System.out.println("As you watch from the bleachers, a shuttlecock flies towards your face. Do you catch or dodge?");
			choice3 = kb.next();
			if(choice3.equals("catch"))
				System.out.println("Now you have a cool souvenir! Congrats!");
			else
				System.out.println("The shuttlecock flies past you and knocks out the custodian. His body hits a button and the bleachers close. Your legs are crushed.");
		}
		else
		{
			System.out.println("You storm onto the courts. The coach yells at you to get out of the way. Ignore or tackle him?");
			choice3 = kb.next();
			if(choice3.equals("ignore"))
				System.out.println("You continue walking onto the courts. You take a shuttecock to the face.");
			else
				System.out.println("It turns out the coach is also your history teacher. You fail that class.");
		}
	}
		
	}
}