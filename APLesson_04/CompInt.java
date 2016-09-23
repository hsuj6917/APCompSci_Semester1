import java.util.Scanner;

public class CompInt
{
	public static void main(String[]args)
	{
		CompInt interest = new CompInt();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter your loan amount:");
		double p = kb.nextDouble();
		System.out.println("Please enter the interest rate in decimal form:");
		double r = kb.nextDouble();
		System.out.println("Please enter the length of the loan in years:");
		int t = kb.nextInt();
		System.out.println("Please enter the number of times the interest is compounded per year");
		int n = kb.nextInt();
		
		double MP = interest.calcMP(p, r, t , n);
		System.out.printf("Your total monthly payment is $%7.2f.", MP);
	}
	
	public double calcMP(double pee, double are, int tee, int enn)
	{
		return (pee*(Math.pow((1 + (are/enn)), (enn*tee))))/(tee*12);
	}
}