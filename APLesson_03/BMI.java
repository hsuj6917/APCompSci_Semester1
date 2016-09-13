public class BMI
{
	public static void main(String[]args)
	{
		System.out.println("Welcome to the BMI calculator! ");
		System.out.println("How much do you weigh in lbs? ");
		int weight = keyboard.nextInt();
		System.out.println("Wow. What is your height in inches? ");
		int height = keyboard.nextInt();
		
		int n = 703 * weight;
		int d = height * height;
		int bmi = n / d;
		
		System.out.println("Your BMI is " + bmi + ". Let me connect you with a personal trainer. ");
	}
}