import java.util.Scanner;

public class GPA
{	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your grade in math");
		double math = calcPoints(kb.next());
		System.out.println("Enter your grade in physics");
		double physics = calcPoints(kb.next());
		System.out.println("Enter your grade in history");
		double history = calcPoints(kb.next());
		System.out.println("Enter your grade in biology");
		double biology = calcPoints(kb.next());
		System.out.println("Enter your grade in programming");
		double programming = calcPoints(kb.next());
		System.out.println("Enter your grade in english");
		double english = calcPoints(kb.next());
		System.out.println("Enter your grade in spanish");
		double spanish = calcPoints(kb.next());
		
		double gpa = (math + physics + biology + history + programming + english + spanish)/7;
		
		System.out.printf("Your GPA is %1.2f", gpa);
	}
	
	public static double calcPoints(String grade)
	{
		if(grade.equals("A"))
			return 4.0;
		if(grade.equals("B"))
			return 3.0;
		if(grade.equals("C"))
			return 2.0;
		if(grade.equals("D"))
			return 1.0;
		if(grade.equals("F"))
			return 0.0;
		return 0.0;
			
	}
}

