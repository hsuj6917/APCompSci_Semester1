import java.util.Scanner;

public class Password
{
	static String username, password, usernameIN, passwordIN;
	static Scanner kb = new Scanner(System.in);
	public static void main(String[]args)
	{
		username = "funnybunny";
		password = "lovecarrots";
		passCheck();
	}
	public static void passCheck()
	{
		System.out.println("Enter your username.");
		usernameIN = kb.next();
		System.out.println("Enter your password");
		passwordIN = kb.next();
		
		if((usernameIN.equals(username)) && (passwordIN.equals(password))){
			System.out.println("You are granted access!");
		}
		else
		{
			if((usernameIN.equals(username)) && !(passwordIN.equals(password)))
			{
				System.out.println("Your password is incorrect!");
				passCheck();
			}
			if((!(usernameIN.equals(username)) && passwordIN.equals(password)))
			{
				System.out.println("Your username is incorrect!");
				passCheck();
			}
			else
			{
				System.out.println("Your username and password are incorrect!");
				passCheck();
			}
		}
	}
}