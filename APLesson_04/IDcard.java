import java.util.Scanner;

public class IDcard
{
	public static void  main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		IDcard id = new IDcard();
		
		System.out.println("Enter your first name:");
		String first = kb.next();
		System.out.println("Enter your last name:");
		String last = kb.next();
		System.out.println("Enter your school name:");
		String fodder = kb.nextLine();
		String school = kb.nextLine();
		System.out.println("Enter the school year:");
		String year = kb.nextLine();
		System.out.println("Enter your grade level (Freshman, Sophomore...):");
		String grade = kb.next();
		System.out.println("Enter your ID number:");
		String ID = kb.next();
		
		System.out.println("   *****************************");
		id.format(school, year);
		id.format(first, last);
		id.format(ID, grade);
		System.out.println("   *****************************");
	}
	
	public void format(String entry1, String entry2)
	{
		System.out.printf("%15s %15s\n", entry1, entry2);
	}
}