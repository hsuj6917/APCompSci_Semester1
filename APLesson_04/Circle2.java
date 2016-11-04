import java.util.Scanner;
public class Circle2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the radius of the circle:");
		double r = kb.nextDouble();
		double area = calcArea(r);
		print(r,area);
	}
	
	public static double calcArea(double radius)
	{
		double area = 3.14 * radius * radius;
		return area;
	}
	
	public static void print(double radius, double Area)
	{
		System.out.printf("The area of a circle with a radius of %5.1f is %5.5f.", radius, Area);
	}
}