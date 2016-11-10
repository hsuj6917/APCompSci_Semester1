import java.util.Scanner;

public class AverageDigits
{
	static int number, digits, avg;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number");
		number = kb.nextInt();
		digits = 0;
		avg = 0;
		avDigits();
		System.out.println("The average of the digits in " + number + " is " + avg);
	}
	public static void avDigits()
	{
		int num = number;
		while(num>0)
		{
			digits = digits + 1;
			avg = (num%10) + avg;
			num = num/10;
		}
		avg = avg/digits;
	}
}