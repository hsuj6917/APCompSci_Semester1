import java.util.Scanner;
public class MPHRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Miles: ");
		int distance = kb.nextInt();
      
		System.out.println("Hours: ");
		int hours = kb.nextInt();
      
		System.out.println("Minutes: ");
		int minutes = kb.nextInt();
      
		double MPH = 0;
		
		MilesPerHour speedracer = new MilesPerHour(distance, hours, minutes);
		
		System.out.println(distance + " miles in " + hours + " hours, " + minutes + " minutes = " + speedracer.getMPH() + " MPH");
		
		speedracer.setValues(9999, 2, 7);
      
		System.out.println("9999 miles in 2 hours, 7 minutes = " + speedracer.getMPH() + " MPH");
	}
}