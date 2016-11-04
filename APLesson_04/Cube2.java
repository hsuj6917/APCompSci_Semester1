import java.util.Scanner;
public class Cube2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the length of a side:");
		double side = kb.nextDouble();
		double sa = calcSurf(side);
		print(side,sa);
	}
	
	public static double calcSurf(double Side)
	{
		double sa = 6 * (Side * Side);
		return sa;
	}
	
	public static void print(double SIDE, double surf)
	{
		System.out.printf("The surface area of a cube with side length %5.1f is %5.5f.", SIDE, surf);
	}
}