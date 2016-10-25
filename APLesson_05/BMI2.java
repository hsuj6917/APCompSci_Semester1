import java.util.Scanner;

public class BMI2
{
	static String condition;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How much do you weigh in lbs? ");
		double weight = keyboard.nextDouble();
		System.out.println("What is your height in inches? ");
		double height = keyboard.nextDouble();
		
		double n = 703 * weight;
		double d = height * height;
		double BMI = n / d;
		
		condition = calcCondish(BMI);
		
		System.out.printf("Your BMI is: %3.1f", BMI);
		System.out.println("\nYou are " + condition);
	}
	
	public static String calcCondish(double bmi)
	{
		if(bmi<18.5)
			return "Underweight";
		if(bmi<=24.9)
			return "Normal";
		if(bmi<=29.9)
			return "Overweight";
		if(bmi<=34.9)
			return "Obese";
		if(bmi<=39.9)
			return "Very Obese";
		if(bmi>39.9)
			return "Morbidly Obese";
		return "nothing";
	}
}