import java.util.Scanner;
public class UserRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("First name: ");
		String firstName = kb.next();
      
		System.out.println("Last name: ");
		String lastName = kb.next();
      
		System.out.println("Would you like to use a public avatar? (y or n)");
		String avatar = kb.next();
      
		if(avatar.equals("y"))
		{
			System.out.println("Avatar: ");
			String avtr = kb.next();
          
			User user1 = new User(firstName, lastName, avtr);
			 System.out.println();
			System.out.println(user1);
		}
      
		else
		{
			User user1 = new User(firstName, lastName);
			System.out.println();
			System.out.println(user1);
		}
	}
}