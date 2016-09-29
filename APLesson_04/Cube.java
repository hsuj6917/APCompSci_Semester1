import java.util.Scanner;
public class Cube
{
	static double side;
	static double sa;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the length of a side:");
		side = kb.nextDouble();
		calcSurf();
		print();
	}
	
	public static void calcSurf()
	{
		sa = 6 * (side * side);
	}
	
	public static void print()
	{
		System.out.printf("The surface area of a cube with side length %5.1f is %5.5f.", side, sa);
	}
}