import java.util.Scanner;

public class DigitAdder
{
	static int num, sum;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number");
		num = kb.nextInt();
		int number = num;
		sum = 0;
		sumDigits();
		System.out.println("The sum of the digits in " + number + " is " + sum);
		
	}
	
	public static void sumDigits()
	{
		while(num > 0)
		{
			sum = sum + (num%10);
			num = num / 10;
		}
	}
}