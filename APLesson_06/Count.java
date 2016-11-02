import java.util.Scanner;

public class Count
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number to count up to");
		int limit = kb.nextInt();
		System.out.println("Enter a number to count by");
		int step = kb.nextInt();
		
		for(int i = 1; i <= limit/step; i++)
		{
			System.out.print(i*step + "\t");
		}
	}
}