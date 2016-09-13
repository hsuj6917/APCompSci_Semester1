import java.util.Scanner;
import java.lang.Math;

public class MortgageCalc
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome to the Mortgage Payment Calculator. Please enter your loan amount. ");
		int P = kb.nextInt();
		System.out.println("Enter the monthly interest rate, in decimal form. ");
		double i = kb.nextDouble();
		System.out.println("Enter the length of the loan in months. ");
		int L = kb.nextInt();
		double para = 1 + i;
		double exp = L * -1;
		double pow = Math.pow(para,exp);
		double denom = 1 - pow;
		double M = (i / denom) * 100;
		System.out.printf("Your monthly payment is $%.2f.", M );
		
	}
}