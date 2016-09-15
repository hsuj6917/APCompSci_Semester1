import java.util.Scanner;
import java.lang.Math;

public class LoanCalc
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome to the Mortgage Payment Calculator.\nThis might be the wrong formula but it works.\n Please enter your loan amount. ");
		int P = kb.nextInt();
		System.out.println("Enter the monthly interest rate, in decimal form. ");
		double i = kb.nextDouble();
		System.out.println("Enter the length of the loan in months. ");
		int L = kb.nextInt();
		double para = 1 + i;
		double pow = Math.pow(para,L);
		double num = i * pow;
		double den = pow - 1;
		double M = (num / den) * P;
		System.out.printf("Your monthly payment is $%.2f", M );
		
	}
}