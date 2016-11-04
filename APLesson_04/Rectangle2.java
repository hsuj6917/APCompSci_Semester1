import java.util.Scanner;
public class Rectangle2
{
	static double l;
	static double w;
	static double perimeter;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the length:");
		double l = kb.nextDouble();
		System.out.println("Enter the width:");
		double w = kb.nextDouble();
		double perimeter = calcPerim(l,w);
		print(l,w,perimeter);
	}
	
	public static double calcPerim(double length, double width)
	{
		double perimeter = length + length + width + width;
		return perimeter;
	}
	
	public static void print(double LENGTH, double WIDTH, double PERIM)
	{
		System.out.println("The perimeter of a rectangle with length " + LENGTH + " and width " + WIDTH + " is " + PERIM + ".");
	}
}