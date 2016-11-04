import java.util.Scanner;
public class Average2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the first number:");
		double num1 = kb.nextDouble();
		System.out.println("Enter the second number:");
		double num2 = kb.nextDouble();
		System.out.println("Enter the third number:");
		double num3 = kb.nextDouble();
		double avg = average(num1,num2,num3);
		print(num1,num2,num3,avg);
	}
	
	public static double average(double N1, double N2, double N3)
	{
		double avg = (N1 + N2 + N3)/3;
		return avg;
	}
	
	public static void print(double n1, double n2, double n3, double average)
	{
		System.out.printf("The average of %5.1f, %5.1f, and %5.1f is %5.5f.", n1, n2, n3, average);
	}
}